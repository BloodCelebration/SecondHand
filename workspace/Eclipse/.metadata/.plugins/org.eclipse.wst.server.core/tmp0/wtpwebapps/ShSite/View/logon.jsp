<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/ShSite/css/site.css"/>
<style type="text/css">
	/* Form styles */
legend
{
	padding: 10px;
	font-weight: bold;
}

fieldset
{
	border: #9b9993 1px solid;
	padding: 0 10px;
	margin-bottom: 10px;
	clear: left;
}

div.editor-field
{
	margin-bottom: 10px;
}

input[type=text], input[type=password], select
{
	border: 1px solid #8A8575;
	width: 300px;
}
</style>
<title>校园二手交易系统</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="row" id="main">
		<!-- 商品导航 -->
	    <div class="col-lg-2">
	    	<ul style="list-style-type:none">
	    	<c:forEach items="${goodTypes}" var="goodType">
			<li><a href="Good/Browse?type=${goodType.getGoodTypeId()}">
			<strong>${goodType.getGoodTypeName()}</strong>
			</a></li>
			</c:forEach>
			</ul>
	    </div>
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