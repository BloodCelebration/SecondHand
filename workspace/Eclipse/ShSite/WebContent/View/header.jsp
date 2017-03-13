<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="/ShSite/css/bootstrap.min.css"/>
	<!-- 可选的Bootstrap主题文件（一般不用引入） -->
	<link rel="stylesheet" href="/ShSite/bootstrap-theme.min.css"/>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="/ShSite/js/jquery-1.10.2.min.js"></script>
	<script src="/ShSite/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="/ShSite/css/site.css"/>
</head>
<body>
	  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
      	
      	 <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/">商品中心</a>
        </div>
      	
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/">商品发布</a>
        </div>
        
         <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/">公告中心</a>
        </div>
        
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/">用户管理</a>
        </div>
        
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/">商品管理</a>
        </div>
        
        
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
          	   <!-- 如果已经授权则显示退出链接 -->
            <security:authorize access="isAuthenticated()">
            	<li><img alt="头像" height="50" width="40" src="/ShSite/headportraits/<security:authentication property="name"/>.jpg"/></li>
            	<li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               		<security:authentication property="name"/> 
               		 <span class="caret"></span>
                </a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="#">个人中心</a></li>
                  <li><a href="#">我要发布</a></li>
                  <li><a href="#">我的收藏</a></li>
                  <li><a href="/ShSite/Account/LogOut">退出登录</a></li>
                </ul>
              </li>
            </security:authorize>
            <!-- 不具有 Admin,User的权限则显示登录链接-->
           <security:authorize ifNotGranted="Admin,User">
           		<li><a href="/ShSite/Account/LogOn">登录</a></li>
           		<li><a href="/ShSite/Account/Register">注册</a></li>
           </security:authorize>
          </ul>
        </div>
      </div>
    </nav>
</body>
</html>