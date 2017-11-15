<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
	<script type="text/javascript" src="/plugins/js/jquery-1.9.1.min.js"></script>
</head>
<body>
<form id="userForm" action="/user/login.do" method="post">
	用户名：<input type="text" name="userName"/>
	密  码：<input type="password" name="pwd"/>
	<br>
	<button type="button" onclick="login()">登录 </button>
</form>
</body>

<script>
	function login() {
		$.ajax({
			type:'post',
			url:$('#userForm').attr('action'),
			data:$('#userForm').serialize(),
			dataType:'json',
			success:function(data) {
				if(data.status == 1){
					alert("登录成功");
					location.href = 'success.do';
				}else{
				    alert("用户名或密码错误!");
				}
			}
		});
    }
</script>
</html>