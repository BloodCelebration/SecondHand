<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
      	
      	 <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/index">主页</a>
        </div>
      	
      	 <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/Good">商品中心</a>
        </div>
      	
      	 <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/Announcement">公告中心</a>
        </div>
      	
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/Good/Publish">商品发布</a>
        </div>
        
        <!-- 只有管理员权限才能够看到这两个入口 -->
        <security:authorize access="hasRole('Admin')">
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/UserManager">用户管理</a>
        </div>
        
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/GoodManager">商品管理</a>
         </div>
         
          <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/ShSite/Announcement/Manager">公告管理</a>
         </div>
         
         </security:authorize>
        
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
          	<!-- 搜索框 -->
	          <li>
	           	<form class="navbar-form" style="margin-top:2px;" role="search" action="/ShSite/Good/Search" method="post">
		        <div class="form-group" >
		            <input type="text" name="key" class="form-control" placeholder="请输入你想搜索的二货" style="width:400px;"/>
		         </div>
		            <button type="submit" class="btn btn-success navbar-btn">搜索</button>
		        </form>
		      </li>
		    
          	   <!-- 如果已经授权则显示退出链接 -->
            <security:authorize access="isAuthenticated()">
            	<li><img alt="头像" style="width:50px;height:50px;" src="/ShSite/headportraits/${sessionScope.user.getShUserId()}.jpg"/></li>
            	<li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               		<security:authentication property="name"/> 
               		 <span class="caret"></span>
                </a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="/ShSite/Account/PersonCenter/${sessionScope.user.getShUserId()}">个人中心</a></li>
                  <li><a href="/ShSite/Good/Publish">我要发布</a></li>
                  <li><a href="/ShSite/Account/CollectCenter/${sessionScope.user.getShUserId()}">我的收藏</a></li>
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