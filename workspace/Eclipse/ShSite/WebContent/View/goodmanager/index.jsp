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
		<div class="table-responsive">
			<a href="/ShSite/GoodManager/Create"><button type="button"  style="font-size:20px;" class="btn btn-xs btn-link">新增商品</button></a>
            <table class="table table-bordered" style="width:1100px;">
             <thead>
			    <tr>
			    	<th>商品编号</th>
			    	<th>商品名称</th>
			        <th>发布用户</th>
			        <th>商品类型</th>
			        <th>商品价格</th>
			        <th>交易状态</th>
			        <th>操作</th>
			    </tr>
		     </thead>
		    <c:forEach items="${goods}" var="good">
		    <tr>
		        <td>${good.getGoodId()}</td>
		        <td>${good.getGoodName()}</td>
		        <td>${good.getShuser().getShUserName()}</td>
		        <td>${good.getGoodtype().getGoodTypeName()}</td>
		        <td>${good.getGoodPrice()}</td>
		         <c:if test="${good.getIsSell()==0}">
		       		 <td>未售</td>
				</c:if>
				 <c:if test="${good.getIsSell()==1}">
		       		 <td>已售</td>
				</c:if>
		        <td>
		        	<a href="/ShSite/GoodManager/Details?id=${good.getGoodId()}">详情</a>
		        	<a href="/ShSite/GoodManager/Edit?id=${good.getGoodId()}">编辑</a>
		        	<a href="/ShSite/GoodManager/Delete?id=${good.getGoodId()}">删除</a>
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