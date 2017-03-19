<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/ShSite/css/bootstrap.css">
 <link rel="stylesheet" href="/ShSite/css/bootstrapValidator.css"/>
<link rel="stylesheet" type="text/css" href="/ShSite/css/bootstrap-theme.css">
<link rel="stylesheet" type="text/css" href="/ShSite/css/site.css">
<script src="/ShSite/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="/ShSite/js/bootstrap.js"></script>
<script type="text/javascript" src="../dist/js/bootstrapValidator.js"></script>
<title>校园二手交易系统</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	     <%@ include file="catalogue.jsp" %>
	    <!-- 主框架 -->
		<div class="container col-lg-10">
			 <h2>登录</h2>
		<p>
		    请输入您的用户名和密码. <a href="/ShSite/Account/Register">注册</a> 如果您现在还没有账号
		</p>
		<form name='f' action='/ShSite/j_spring_security_check' method='POST'>
			 <div>
		        <fieldset>
		            <legend>账号信息</legend>
		            <div class="editor-label"><label for="j_username">用户名</label></div>
	                <div class="editor-field">
	                	<input data-val="true" data-val-required="User name 字段是必需的。" id="j_username" name="j_username" type="text" value="" />
	                	<span class="field-validation-valid"></span>
	           		</div>
	          		<div class="editor-label"><label for="j_password">密码：</label></div>
	                <div class="editor-field">
	                	<input data-val="true" data-val-required="Password 字段是必需的。" id="j_password" name="j_password" type="password" />
	                	<span class="field-validation-valid" ></span>
	                </div>
	            	<div class="editor-label">
	                	<input  type="checkbox" value="true" />
	               	    <label for="RememberMe">Remember me?</label>
	           		</div>
	           		<p><input name="submit"  class="btn btn-primary" type="submit" value="登录"/></p>
		        </fieldset>
    		</div>
		</form>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>