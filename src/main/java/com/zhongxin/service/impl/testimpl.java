package com.zhongxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhongxin.mapper.AuthorityMapper;
import com.zhongxin.pojo.Authority;
import com.zhongxin.pojo.AuthorityExample;
import com.zhongxin.pojo.AuthorityExample.Criteria;
import com.zhongxin.service.test;
@Service
public class testimpl implements test {
	
	@Autowired
	private AuthorityMapper authorityMapper;

	@Override
	public List<Authority> getAllAuthority() {
		AuthorityExample example = new AuthorityExample();
		Criteria criteria = example.createCriteria();
		criteria.andAuthorityIdIsNotNull();
		List<Authority> selectByExample = authorityMapper.selectByExample(example);
		return selectByExample;
	}

}
