<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
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
	<%@ include file="../header.jsp" %>
	<div class="row" id="main">         
		<!-- 商品导航 -->
	    <%@ include file="../catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
		    <h3>公告栏</h3>
			 <c:forEach items="${announcements}" var="announcement">
			 <div class="alert alert-info"  style="margin:5px">
			<ul style="list-style-type:none;">
				<li><strong class="text-danger">${announcement.getAnnounceTitle()}:</strong>
				${fn:length(announcement.getAnnoContent())>20?fn:substring(announcement.getAnnoContent(),0,19):announcement.getAnnoContent()}
			    ${fn:length(announcement.getAnnoContent())>20?'...':'' }
				<em class="text-danger">${announcement.getAnnoTime()}s</em>
				<a class="btn btn-info pull-right" href="/ShSite/Announcement/Details?id=${announcement.getAnnouncementId()}" 
				   style="margin-top:-8px;"	role="button" >详细</a>
				</li>
			</ul>
		     </div>
		 </c:forEach>
	</div>
	</div>
	<%@ include file="../footer.jsp" %>
</body>
</html>