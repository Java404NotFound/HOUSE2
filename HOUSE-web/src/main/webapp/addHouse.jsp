<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加租房信息</title>
<style type="text/css">
body {
	width: 800px;
	margin: 10px auto;
}

.top_left {
	width: 180px;
	float: left;
	font-size: 20px;
	font-weight: bolder;
	text-align: center;
	padding: 15px 0px 15px 0px;
}

.top_right {
	width: 250px;
	float: left;
	font-size: 20px;
	font-weight: bolder;
	text-align: center;
	background-color: #0099CC;
	color: #FFFFFF;
	padding: 15px 0px 15px 0px;
}

.board {
	background-color: #F0F5F8;
	padding-top: 35px;
	width: 800px;
	margin-top: -8px;
}

.submit {
	background-image: url("/house/image/btn_bg.gif");
	background-size: 125px 36px;
	width: 125px;
	height: 36px;
	background-repeat: no-repeat;
	border: 0px solid #47A8F1;
	color: #FFFFFF;
	font-weight: bolder;
}

table {
	width: 600px;
	margin-left: 90px;
}
</style>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css"
	type="text/css" />
<script
	src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"
	type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/style.css"
	type="text/css" />
<script type="text/javascript">
	$(function() {
		$.post("TypeAction_findTypeList.action", function(data) {
			$("#type").html(data);
		});
		$.post("DistrictAction_findDistrictList.action", function(data) {
			$("#district").html(data);
		});

		$("#district").change(function() {
			var did = $("#district").val();
			$.post("HouseAction_getStreetListByDid.action", {
				"districtId" : did
			}, function(data) {
				$("#street").html("");
				$("#street").html(data);
			});
		});
		$("#upload").change(function() {
			var objUrl = getObjectURL(this.files[0]);
			console.log("objUrl = " + objUrl);
			if (objUrl) {
				$("#img").attr("src", objUrl);
			}
		});
		function getObjectURL(file) {
			var url = null;
			if (window.createObjectURL != undefined) { // basic
				url = window.createObjectURL(file);
			} else if (window.URL != undefined) { // mozilla(firefox)
				url = window.URL.createObjectURL(file);
			} else if (window.webkitURL != undefined) { // webkit or chrome
				url = window.webkitURL.createObjectURL(file);
			}
			return url;
		}

	});
	function subaddHouse() {
		$("#addHouse").get(0).submit();
	}
</script>
</head>
<body>
	<div class="top_left">新房屋信息发布</div>
	<div class="top_right">填写房屋信息</div>
	<hr style="height: 3px; clear: left; background-color: #0099CC;">
	<div class="board">
		<form action="HouseAction_addHouse.action" method="post"
			enctype="multipart/form-data" id="addHouse">
			<table>
				<tr height="40px">
					<td align="right" width="150px">标&nbsp;&nbsp;&nbsp;题：</td>
					<td><input type="text" id="title" name="house.title"
						size="45px" /></td>
				</tr>
				<tr height="40px">
					<td align="right">户&nbsp;&nbsp;&nbsp;型：</td>
					<td><select name="type" id="type">

					</select></td>
				</tr>
				<tr height="40px">
					<td align="right">面&nbsp;&nbsp;&nbsp;积：</td>
					<td><input type="text" id="area" name="house.floorage"
						size="45px" /></td>
				</tr>
				<tr height="40px">
					<td align="right">价&nbsp;&nbsp;&nbsp;格：</td>
					<td><input type="text" id="price" name="house.price"
						size="45px" /></td>
				</tr>
				<tr height="40px">
					<td align="right">房产证日期：</td>
					<td><input type="date" class="form-control" name="bugdate"
						size="45px"></td>
				</tr>
				<tr height="40px">
					<td align="right">位&nbsp;&nbsp;&nbsp;置：</td>
					<td><select name="district" id="district">
					</select> <select name="street" id="street">
							<option>街道不限</option>
					</select></td>
				</tr>
				<tr height="40px">
					<td align="right">上 传 图 片:</td>
					<td><input type="file" id="upload" name="upload" value="" /></td>
				</tr>
				<tr height="40px">
					<td align="right">图 片 标 题：</td>
					<td><input type="text" id="photoTitle" name="picture.title"
						size="45px" /></td>
				</tr>
				<tr>
					<td align="right">已上传图片：</td>
					<td id="tdd22"><img id="img" src="house/image/noimage.jpg"
						width="171px" height="151px"></td>
				</tr>
				<tr height="40px">
					<td align="right">联 系 方 式：</td>
					<td><input type="text" id="telephone" name="house.contact"
						size="45px" /></td>
				</tr>
				<tr height="40px">
					<td align="right">详 细 信 息：</td>
					<td><textarea rows="6" cols="39" name="house.description"></textarea></td>
				</tr>
				<tr height="80px">
					<td colspan="2" align="center"><input type="button"
						class="submit" value="立即发布" onclick="subaddHouse()" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>