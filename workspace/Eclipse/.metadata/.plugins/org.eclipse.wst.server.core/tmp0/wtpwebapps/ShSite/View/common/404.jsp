<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
  <link rel="stylesheet" type="text/css" href="/ShSite/css/bootstrap.css">
<link rel="stylesheet" href="/ShSite/css/bootstrapValidator.css"/>
<link rel="stylesheet" type="text/css" href="/ShSite/css/bootstrap-theme.css">
<script src="/ShSite/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="/ShSite/js/bootstrap.js"	type="text/javascript"></script>
<script type="text/javascript" src="/ShSite/js/bootstrapValidator.js"></script>
<link rel="stylesheet" type="text/css" href="/ShSite/css/site.css">
</head>
  <body> 	
  	<div class="row">
  	<%@ include file="../eheader.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <%@ include file="../catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
			<h3></h3>
			<div class="">
    			<h4>Http Status:404</h4>
			    <p>您可能输入了<em>错误的访问地址 </em></p>
			   <p> 请 <strong>检查地址 </strong> 然后 重试!</p>
			   <p> 您可以选择访问我们的<a href="/ShSite/index"><em>主页</em></a></p>
    		</div>
		</div>
	</div>
	</div>
	<%@ include file="../footer.jsp" %>
  </body>
</html>
