<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/ShSite/css/bootstrap.css">
<link rel="stylesheet" href="/ShSite/css/bootstrapValidator.css"/>
<link rel="stylesheet" type="text/css" href="/ShSite/css/bootstrap-theme.css">
<script src="/ShSite/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="/ShSite/js/bootstrap.js"	type="text/javascript"></script>
<script type="text/javascript" src="/ShSite/js/bootstrapValidator.js"></script>
<link rel="stylesheet" type="text/css" href="/ShSite/css/site.css">
<link href="/ShSite/css/carousel.css" rel="stylesheet">
<title>校园二手交易系统</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <%@ include file="catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
			<h3></h3>
			<!-- 个人信息 -->
			<div class="row" style="height:250px;margin-top:20px;">
				<div class="col-md-3">
					<img alt="头像" style="width:200px;height:200px;" src="/ShSite/headportraits/${sessionScope.user.getShUserId()}.jpg"/>
				</div>
				<div class="col-md-5" style="font-size:18px; line-height:24px;">
					<p style="width:350px;"><span style="font-size:35px;"><strong>${sessionScope.user.getShUserName()}</strong></span>
						 <c:if test="${sessionScope.user.getGender()==0}">
			       		 <span style="float:right">男</span>
						</c:if>
						 <c:if test="${sessionScope.user.getGender()==1}">
				       		 <span style="float:right">女</span>
						</c:if>
					</p>
					 <p>联系方式：${sessionScope.user.getPhone()}</p>
					 <p>交易地址：${sessionScope.user.getAddress()}</p>
					 <p>个人介绍：</p>
					 <div style="margin-top:10px;">
					 <textarea readonly="readonly" style="vertical-align: middle;width:450px;height:100px;border:1px solid;">${sessionScope.user.getIntroduce()}</textarea>
					 </div>
				</div>
				<div class="col-md-2">
				   	<p><a href="/ShSite/Account/PersonInfoUpdate/${sessionScope.user.getShUserId()}"><button type="button" class="btn btn-sm btn-info">编辑个人信息</button></p></a>
				</div>
			</div>
			<!-- 我发布的商品 -->
			<div>
				<p><button type="button" class="btn btn-sm btn-primary">我发布的商品</button></p>
				<div style="height:20px"></div>
				<div class="row">
				<c:forEach items="${publishgoods}" var="good">
				 	<div class="col-md-2">
		  			<a href="/ShSite/Account/GoodDeal?id=${good.getGood().getGoodId()}">
				   	<img style="width:200px;height:200px;" alt="${good.getGood().getGoodName()}" src="/ShSite/goodimages/${good.getGood().getGoodId()}.jpg"/>
			        <div class="goodbottom">
			         <span class="namespan">${good.getGood().getGoodName()}</span>
			         <p>
			         <span>¥${good.getGood().getGoodPrice()}</span> 
			         <span>评论${good.getCommentCount()}</span>
			         <span>收藏${good.getCollectCount()}</span>
			         </p>
		        	</div>
				 	</a>
				 </div>
			 </c:forEach>
				</div>
			</div>
			<!-- 我的收藏 -->
			<div>
				 <p><button type="button" class="btn btn-sm btn-primary">我的收藏</button></p>
				 <div style="height:20px"></div>
				 <div class="row">
					<c:forEach items="${collectgoods}" var="good">
				 	<div class="col-md-2">
		  			<a href="/ShSite/Good/Details?id=${good.getGood().getGoodId()}">
				   	<img style="width:200px;height:200px;" alt="${good.getGood().getGoodName()}" src="/ShSite/goodimages/${good.getGood().getGoodId()}.jpg"/>
			        <div class="goodbottom">
			         <span class="namespan">${good.getGood().getGoodName()}</span>
			         <p>
			         <span>¥${good.getGood().getGoodPrice()}</span> 
			         <span>评论${good.getCommentCount()}</span>
			         <span>收藏${good.getCollectCount()}</span>
			         </p>
		        	</div>
				 	</a>
					 </div>
				 </c:forEach>
				 </div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>