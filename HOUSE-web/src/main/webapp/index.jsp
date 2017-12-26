<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>青鸟租房</title>

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
<style type="text/css">
body {
	width: 1200px;
	margin: 0px auto;
}

.logo {
	background-image: url("image/logo.gif");
	background-size: 193px 74px;
	width: 500px;
	height: 74px;
	background-repeat: no-repeat;
	float: left;
}

.login_sub {
	background-color: #68A54C;
	border: 1px solid #A9A9A9;
	height: 30px;
	margin: 0px 4px 0px 4px;
	color: #ffffff;
	float: left;
}

.search {
	width: 1160px;
	margin: 0px auto;
	text-align: left;
	border: 1px solid #848484;
}

.search_sub {
	background-color: #5E77AA;
	border: 1px solid #5E77AA;
	height: 24px;
	margin-left: 25px;
	color: #ffffff;
}

.house_info {
	width: 1160px;
	height: 380px;
	margin: 15px 5px;
	padding: 15px 0px 0px 15px;
}

.house_pic {
	width: 104px;
	height: 79px;
	float: left;
	border: 1px solid #848484;
}

.depict {
	width: 760px;
	height: 50px;
	margin: 15px 20px;
	float: left;
}

.operate {
	width: 210px;
	float: left;
	margin: 25px 0px 55px 0px;
}

.page {
	width: 1000px;
	margin: 0px auto;
	height: 40px;
	background-color: #F8F8F8;
	text-align: center;
	padding-top: 14px;
}

.a_color {
	background-color: #B9DBFF;
	border: 1px solid #B9DBFF;
	height: 20px;
	margin: 0px 3px;
	color: #4776A5;
	font-weight: bolder;
	padding: 6px 10px;
}
</style>


<script type="text/javascript">
	$(function() {
		$("#district").change(function() {
			var did = $("#district").val();
			$.post("HouseAction_getStreetListByDid.action", {
				"districtId" : did
			}, function(data) {
				$("#street").html(data);
			});
		});

	});
</script>
<script type="text/javascript">
	function ck() {
		var name = document.getElementById('userName').value;
		var pwd = document.getElementById('password').value;
		if (name == '' || name == null) {
			alert("请输入用户名!");
			return false;
		} else if (pwd == '' || pwd == null) {
			alert("请输入密码!");
			return false;
		} else {
			$.post("UserAction_login.action", {
				"user.username" : name,
				"user.password" : pwd
			}, function(data) {
				alert(data);
				if (data == 'false') {
					alert("用户名或密码错误");
				} else {
					$("#td11111").html("");
					$("#td11111").html(data);
					$("#addhouse").css("display", "block");
				}
			});
		}
	}
	function subhouseOAFrom() {
		$("#houseOA").get(0).submit();
	}
	function subhouseOAFrom2(val) {
		$("#currentPage").val(val)
		$("#houseOA").get(0).submit();
	}
</script>
</head>
<body>
	<!-- 登录 -->
	<div class="logo"></div>
	<div id="div1">
		<form action="" method="post" name="User">
			<table style="padding: 22px 0px;">
				<tr>
					<c:if test="${Users==null}">
						<td id="td11111">用户名: <input type="text" id="userName" />
							密码:<input type="password" id="password" /> <input type="button"
							onclick="ck()" id="login" value="登录" class="login_sub"
							style="width: 60px;" />
						</td>
					</c:if>
					<c:if test="${Users!=null}">
						<td id="td11111">${Users.username}欢迎你</td>
					</c:if>
					<td><a href="register.jsp"><input type="button" value="注册"
							class="login_sub" style="width: 60px;" /></a> <a href="addHouse.jsp"><input
							id="addhouse"  type="button" value="发布房屋信息" class="login_sub" 
							 style="width: 110px; display: none;" /></a></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- 房屋信息搜索栏 -->
	<div class="search">
		<form action="HouseAction_index.action" method="post" name="houseOA"
			id="houseOA">
			<table width="1160px">
				<tr height="30px">
					<th width="405px">&nbsp;房屋信息</th>
					<th width="155px">价格</th>
					<th width="265px">房屋位置</th>
					<th width="155px">房型</th>
					<th width="155px">面积</th>
				</tr>
				<tr height="40px" valign="top">
					<td>&nbsp;标题： <input type="hidden" name="currentPage"
						id="currentPage" value="1"> <c:if
							test="${houseOA.title !='%%' }">
							<input type="text" id="title" name="houseOA.title"
								value="${houseOA.title}" />
						</c:if> <c:if test="${houseOA.title =='%%' }">
							<input type="text" id="title" name="houseOA.title" />
						</c:if><input type="button" onclick="subhouseOAFrom()" value="搜索房屋"
						class="search_sub" /></td>
					<td><select name="houseOA.maxPrice"
						onchange="subhouseOAFrom()">
							<c:if test="${houseOA.maxPrice == 300000000}">
								<option selected="selected" value="">不限</option>
							</c:if>
							<c:if test="${houseOA.maxPrice != 300000000}">
								<option value="">不限</option>
							</c:if>
							<c:if test="${houseOA.maxPrice==1000 }">
								<option value="1000" selected="selected">0-1000</option>
							</c:if>
							<c:if test="${houseOA.maxPrice!=1000 }">
								<option value="1000">0-1000</option>
							</c:if>
							<c:if test="${houseOA.maxPrice==2000 }">
								<option value="2000" selected="selected">1000-2000</option>
							</c:if>
							<c:if test="${houseOA.maxPrice!=2000 }">
								<option value="2000">1000-2000</option>
							</c:if>
							<c:if test="${houseOA.maxPrice==3000 }">
								<option value="3000" selected="selected">2000-3000</option>
							</c:if>
							<c:if test="${houseOA.maxPrice!=3000 }">
								<option value="3000">2000-3000</option>
							</c:if>
					</select></td>
					<td><select name="district" id="district">
							<option selected="selected" value="">城区不限</option>
							<c:forEach items="${districtList}" var="districtList">
								<c:if test="${district == districtList.id}">
									<option selected="selected" value="${districtList.id}">${districtList.name}</option>
								</c:if>
								<c:if test="${district != districtList.id}">
									<option value="${districtList.id}">${districtList.name}</option>
								</c:if>
							</c:forEach>
					</select> <select name="houseOA.streetId" id="street"
						onchange="subhouseOAFrom()">
							<option value="">街道不限</option>
							<c:forEach items="${streetList}" var="street">
								<c:if test="${houseOA.streetId == street.id}">
									<option selected="selected" value="${street.id}">${street.name}</option>
								</c:if>
								<c:if test="${houseOA.streetId != street.id}">
									<option value="${street.id}">${street.name}</option>
								</c:if>
							</c:forEach>
					</select></td>
					<td><select name="houseOA.typeId" onchange="subhouseOAFrom()">
							<c:if test="${houseOA.typeId=='%%'}">
								<option selected="selected" value="">房型不限</option>
							</c:if>
							<c:if test="${houseOA.typeId!='%%'}">
								<option value="">房型不限</option>
							</c:if>
							<c:forEach items="${typeList}" var="typeList">
								<c:if test="${houseOA.typeId==typeList.id}">
									<option selected="selected" value="${typeList.id}">${typeList.name}</option>
								</c:if>
								<c:if test="${houseOA.typeId!=typeList.id}">
									<option value="${typeList.id}">${typeList.name}</option>
								</c:if>
							</c:forEach>
					</select></td>
					<td><select name="houseOA.maxFloorage"
						onchange="subhouseOAFrom()">
							<c:if test="${houseOA.maxFloorage == 300000000}">
								<option selected="selected" value="">不限</option>
							</c:if>
							<c:if test="${houseOA.maxFloorage != 300000000}">
								<option value="">不限</option>
							</c:if>
							<c:if test="${houseOA.maxFloorage==100 }">
								<option value="100" selected="selected">0-100</option>
							</c:if>
							<c:if test="${houseOA.maxFloorage!=100 }">
								<option value="100">0-100</option>
							</c:if>
							<c:if test="${houseOA.maxFloorage==200 }">
								<option value="200" selected="selected">100-200</option>
							</c:if>
							<c:if test="${houseOA.maxFloorage!=200 }">
								<option value="200">100-200</option>
							</c:if>
							<c:if test="${houseOA.maxFloorage==300 }">
								<option value="300" selected="selected">200-300</option>
							</c:if>
							<c:if test="${houseOA.maxPrice!=300 }">
								<option value="300">200-300</option>
							</c:if>
					</select></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- 房屋信息 -->
	<div class="house_info">
		<c:forEach items="${housePage.list}" var="house">
			<div class="house_pic">
				<img src="image/${house.image}" width="100px" height="75px"
					style="margin: 2px 2px;" />
			</div>
			<div class="depict">
				<a href="#">${house.title}</a><br /> <span>区:
					${house.floorage}平</span><br /> <span>联系方式: ${house.contact}</span><br />
			</div>
			<div class="operate">
				<a href="HouseAction_woqunimade.action?hid=${house.id}"><input
					type="button" id="upd" value="修改" class="login_sub"
					style="width: 60px; margin-right: 70px;" /></a> <a href="#"><input
					type="button" id="del" value="删除" class="login_sub"
					style="width: 60px;" /></a>
			</div>
			<hr style="clear: left; margin-bottom: 30px;">
		</c:forEach>
	</div>

	<!--分页 -->
	<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		<ul class="pagination" style="text-align: center; margin-top: 10px;">

			<!-- 上一页 -->
			<c:if test="${housePage.currentPage==1 }">
				<li class="disabled"><a href="javascript:void(0);"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
				</a></li>
			</c:if>
			<c:if test="${housePage.currentPage!=1 }">
				<li><a
					href="javascript:subhouseOAFrom2(${housePage.currentPage-1})"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
				</a></li>
			</c:if>


			<!-- 显示每一页 -->
			<c:forEach begin="1" end="${housePage.totalPage }" var="page">
				<!-- 判断是否是当前页 -->
				<c:if test="${page==housePage.currentPage }">
					<li class="active"><a href="javascript:void(0);">${page}</a></li>
				</c:if>
				<c:if test="${page!=housePage.currentPage }">
					<li><a href="javascript:subhouseOAFrom2(${page})">${page}</a></li>
				</c:if>
			</c:forEach>
			<!-- 下一页 -->
			<c:if test="${housePage.currentPage==housePage.totalPage }">
				<li class="disabled"><a href="javascript:void(0);"> <span
						aria-hidden="true">&raquo;</span>
				</a></li>
			</c:if>
			<c:if test="${housePage.currentPage!=housePage.totalPage }">
				<li><a
					href="javascript:subhouseOAFrom2(${housePage.currentPage+1})"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</c:if>
		</ul>
	</div>
	<hr width="1160px" style="margin-top: 20px;">
	<div style="color: #848484; font-size: 12px; float: left;">青鸟租房
		&copy; 2010 北大青鸟 京ICP证1000001号</div>
	<div style="color: #848484; font-size: 12px; float: right;">关于我们
		· 联系方式 · 意见反馈 · 帮助中心</div>
</body>
</html>