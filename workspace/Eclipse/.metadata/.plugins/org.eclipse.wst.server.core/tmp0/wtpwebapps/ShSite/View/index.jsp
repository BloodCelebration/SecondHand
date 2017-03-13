<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/site.css"/>
<title>校园二手交易系统</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <div class="col-lg-2">
	    	<ul style="list-style-type:none">
	    	<c:forEach items="${goodTypes}" var="goodType">
			<li><a href="/Good/Browse?type=${goodType.getGoodTypeId()}">
			<strong>${goodType.getGoodTypeName()}</strong>
			</a></li>
			</c:forEach>
			</ul>
	    </div>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
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
		   				 <img alt="${good.getGoodName()}" src="/ShSite/goodimages/三星.jpg"/>
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