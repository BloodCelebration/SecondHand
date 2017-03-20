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
<title>校园二手交易系统</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <%@ include file="catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
			 <%@ include file="announcecarousel.jsp" %>
			 <div id="homeannouce">
			     <!--  
				  <h3 style="color: red;">公告栏</h3>
			      <ul style="margin-left:20px">
			       <c:forEach items="${announcements}" var="announcement">
			         	<li><p><strong>${announcement.getAnnounceTitle()}</strong>
					           <u>${announcement.getAnnoContent()}</u>
					           <em>${announcement.getAnnoTime()}</em>
			         	 </p>
			          	</li>
					</c:forEach>
				 </ul>
				 -->
				<div class="row">		      
				        <c:forEach items="${announcements}" var="announcement">
							<div class="col-lg-3">
				         		<p><strong>${announcement.getAnnounceTitle()}</strong></p>
					            <p><u>${announcement.getAnnoContent()}</u></p>
					            <p><em>${announcement.getAnnoTime()}</em></p>
				          	<p><a class="btn btn-info" href="#" role="button">详细&raquo;</a></p>
				       		</div>
						</c:forEach>
				</div>	
		      </div>
		      <div class="goods">
		      	  <c:forEach items="${goods}" var="good">
					<div>
		  				<a href="/ShSite/Good/Details?id=${good.getGoodId()}">
		   				 <img alt="${good.getGoodName()}" src="/ShSite/${good.getImageUrl()}"/>
	               		 <span>${good.getGoodName()}</span>
		 				</a>
				    </div>
				</c:forEach>
		      </div>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>