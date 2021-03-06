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
	<%@ include file="../header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <%@ include file="../catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
		<h3></h3>
		<div class="table-responsive">
            <table class="table table-bordered" style="width:1100px;">
             <thead>
			    <tr>
			    	<th>编号</th>
			        <th>用户名</th>
			        <th>性别</th>
			        <th>地址</th>
			        <th>联系电话</th>
			        <th>用户操作</th>
			    </tr>
		     </thead>
		    <c:forEach items="${users}" var="user">
		    <tr>
		        <td>${user.getShUserId()}</td>
		        <td>${user.getShUserName()}</td>
		        <c:if test="${user.getGender()==0}">
		       		 <td>男</td>
				</c:if>
				 <c:if test="${user.getGender()==1}">
		       		 <td>女</td>
				</c:if>
		        <td>${user.getAddress()}</td>
		        <td>${user.getPhone()}</td>
		        <td>
		        	<a href="/ShSite/UserManager/Details?id=${user.getShUserId()}">详情</a>
		        	<a href="/ShSite/UserManager/Edit?id=${user.getShUserId()}">编辑</a>
		        	<a href="/ShSite/UserManager/Delete?id=${user.getShUserId()}">删除</a>
		        </td>
		   	 </tr>
			</c:forEach>
   		 </table>
   		 </div>
		</div>
	</div>
	<%@ include file="../footer.jsp" %>
</body>
</html>