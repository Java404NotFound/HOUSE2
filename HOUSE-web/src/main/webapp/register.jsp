<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>青鸟租房 - 用户注册</title>
<style type="text/css">
body{
	width: 600px;
	margin: 90px auto;
}
.top_left{
	width: 180px;
	float: left;
	font-size: 20px;
	font-weight: bolder;
	text-align: center;
	padding: 15px 0px 15px 0px;
}
.top_right{
	width: 250px;
	float: left;
	font-size: 20px;
	font-weight: bolder;
	text-align: center;
	background-color: #0099CC;
	color: #FFFFFF;
	padding: 15px 0px 15px 0px;
}
.board{
	background-color: #F0F5F8;
	padding-top: 35px;
	width: 600px;
	margin-top: -8px;
}
.submit{
	background-image: url("/house/image/btn_bg.gif");
	background-size: 125px 36px;
	width: 125px;
	height: 36px;
	background-repeat: no-repeat;
	border: 0px solid #47A8F1;
	color: #FFFFFF;
	font-weight: bolder;
}
</style>
<script type="text/javascript" src="/house/js/Base64.js"></script>
<script type="text/javascript">
	function ck(){
		var name = document.getElementById('userName').value;
		var pwd = document.getElementById('password').value;
		var cPwd = document.getElementById('ConfirmPWD').value;
		if(trim(name) == '' || name == null){
			alert("请输入用户名!");
			return false;
		}else if(trim(pwd) == '' || pwd == null){
			alert("请输入密码!");
			return false;
		}else if(trim(cPwd) == '' || cPwd == null){
			alert("请输入确认密码!");
			return false;
		}else if(pwd != cPwd){
			alert("两次输入的密码不一致!");
			return false;
		}else{
			return true;
		}
	}
	function trim(obj) {
	    return obj.replace(/(^\s*)|(\s*$)/g, '');
	}
</script>
</head>
<body>
	<div class="top_left">新用户注册</div>
	<div class="top_right">填写个人信息</div>
	<hr style="height: 3px;clear: left;background-color: #0099CC;">
	<div class="board">
	<form action="UserAction_register.action" method="post" onsubmit="return ck()" name="user">
		<table width="600px">
			<tr height="40px">
				<td width="150px" align="right">用 户 名：</td>
				<td><input type="text" id="userName" name="user.username" size="40px"/>&nbsp;<span style="color: #D269FC;">*</span></td>
			</tr>
			<tr height="40px">
				<td align="right">密&nbsp;&nbsp;码：</td>
				<td><input type="password" id="password" name="user.password" size="40px" />&nbsp;<span style="color: #D269FC;">*</span></td>
			</tr>
			<tr height="40px">
				<td align="right">确认密码：</td>
				<td><input type="password" id="ConfirmPWD" name="ConfirmPWD" size="40px"  />&nbsp;<span style="color: #D269FC;">*</span></td>
			</tr>
			<tr height="40px">
				<td align="right">电&nbsp;&nbsp;话：</td>
				<td><input type="text" id="phone" name="user.telephone" size="40px"/></td>
			</tr>
			<tr height="40px">
				<td align="right">用户姓名：</td>
				<td><input type="text" id="realName" name="user.realname" size="40px"/></td>
			</tr>
			<tr height="80px">
				<td colspan="2" align="center"><input type="submit" value="立即注册" class="submit"/></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>


