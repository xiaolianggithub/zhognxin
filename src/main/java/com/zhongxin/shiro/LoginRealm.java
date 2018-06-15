package com.zhongxin.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhongxin.mapper.UserMapper;
import com.zhongxin.pojo.User;
import com.zhongxin.pojo.UserExample;
import com.zhongxin.pojo.UserExample.Criteria;

public class LoginRealm extends AuthorizingRealm{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken mytoken = (UsernamePasswordToken)arg0;
		String username = mytoken.getUsername();
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andLoginNameEqualTo(username);
		List<User> selectByExample = userMapper.selectByExample(userExample);
		User user = null;
		if(selectByExample.size() == 0) {
			return null;
		}else if(selectByExample.size() >= 2) {
			return null;
		}else {
			user = selectByExample.get(0);
		}		
		AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
		return info;
	}
	
	
}
