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
	<%@ include file="../header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <%@ include file="../catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
			
			<!-- 商品信息 -->
			<div class="row" style="height:250px;margin-top:20px;">
				<div class="col-md-3">
					 	<img style="width:220px;height:200px;" 
					 	alt="${good.getGoodName()}" src="/ShSite/goodimages/${good.getGoodId()}.jpg"/>
				</div>
				<div class="col-md-4" style="font-size:18px; line-height:24px;">
		         <h2>${good.getGoodName()}</h2>
		         <p style="color:#F00">¥${good.getGoodPrice()}</p> 
		         <p>卖家：${good.getShuser().getShUserName()}</p>
		         <p>联系方式：${good.getShuser().getPhone()}</p>
		         <p>交易地址：${good.getShuser().getAddress()}</p>
				</div>
			</div>
			
			<div style="border: 1px solid #8A8575;width:600px;">
			<strong>商品描述</strong>
			<p>${good.getDescription()}</p>
			</div>
			
			<div style="border: 1px solid #8A8575;width:600px;margin-top:20px;">
				<h2>留言板：</h2>
				<div>
					<img alt="头像" height="50" width="50"
					 src="/ShSite/headportraits/${sessionScope.user.getShUserId()}.jpg"/>
					<textarea style="width:450px;" placeholder="请留言"></textarea>
					<button type="button" class="btn btn-sm btn-info">发表评论</button>
				</div>
				<c:forEach items="comments" var="comment">
					
				</c:forEach>
			
			</div>
			
		</div>
	</div>
	<%@ include file="../footer.jsp" %>
</body>
</html>