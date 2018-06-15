<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>众信--欢迎登录</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<form action="">
	<table>
		<thead><tr>
			<td>账户登录</td><td>扫码登录</td>
		</tr></thead>
		<tbody>
			<tr>
				<td>账号</td><td><input type="text" id="loginName"></td>
			</tr>
			<tr>
				<td>密码</td><td><input type="password" id="password"></td>
			</tr>
			<tr>
				<td colspan="2"><a href="#">忘记密码</a></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<input type="button" value="登录" id="login">
				</td>
				
			</tr>
			<tr>
				<td colspan="2"><a href="#">立即注册</a></td>
			</tr>
		</tfoot>
	</table>	
		
	</form>
</body>
	<script type="text/javascript">
	$("#login").click(function(){
		var loginName = $("#loginName").val();
		var password = $("#password").val();
		var json = {
	        	"loginName" : loginName ,
	        	"password" : password 
	        }
		$.ajax({  
	        type:"post",  
	        url:"${pageContext.request.contextPath}/login/user",  
	        dataType:"json",
	        contentType:"application/json;charset=utf-8",
	        data:JSON.stringify(json),
	        error:function(data){  
	            alert("请求失败，网络异常")   
	        },  
	        success:function(data){  
	            
	        }  
	    });	
	});
	 
	</script>
</html>