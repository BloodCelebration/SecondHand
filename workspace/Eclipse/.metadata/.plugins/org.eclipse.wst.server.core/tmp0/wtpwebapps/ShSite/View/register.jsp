<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
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
		  <h3>用户注册8</h3>
		  <form 	  method="post" action="/ShSite/Account/Register" enctype="multipart/form-data"
		  			  id="defaultForm" class="form-horizontal"
                      data-bv-message="This value is not valid"
                      data-bv-feedbackicons-valid="glyphicon glyphicon-ok"
                      data-bv-feedbackicons-invalid="glyphicon glyphicon-remove"
                      data-bv-feedbackicons-validating="glyphicon glyphicon-refresh">
                    <div class="form-group">
                        <label class="col-lg-3 control-label">用户名</label>
                        <div class="col-lg-5">
                            <input path="shUserName" type="text" class="form-control" name="ShUserName"
                                   data-bv-message="用户名无效"
                                   required data-bv-notempty-message="用户名不能为空"
                                   data-bv-stringlength="true" data-bv-stringlength-min="5" data-bv-stringlength-max="20" data-bv-stringlength-message="用户名必须保证在5到20个字符"
                                   data-bv-different="true" data-bv-different-field="Password" data-bv-different-message="用户名不能够与密码相同"
                           			/>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-lg-3 control-label">密码</label>
                        <div class="col-lg-5">
                            <input path="Password" type="password" class="form-control" name="Password"
                                   required data-bv-notempty-message="密码不能够为空"
                                   data-bv-stringlength="true" data-bv-stringlength-min="8" data-bv-stringlength-max="20" data-bv-stringlength-message="密码必须保证在8到20个字符"
                                   data-bv-identical="true" data-bv-identical-field="confirmPassword" data-bv-identical-message="密码必须一致"
                                   data-bv-different="true" data-bv-different-field="ShUserName" data-bv-different-message="密码不能够与用户名相同"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-3 control-label">确认密码</label>
                        <div class="col-lg-5">
                            <input type="password" class="form-control" name="confirmPassword"
                                   required data-bv-notempty-message="确认密码不能够为空"
                                   data-bv-identical="true" data-bv-identical-field="Password" data-bv-identical-message="密码必须一致"
                                   data-bv-different="true" data-bv-different-field="ShUserName" data-bv-different-message="密码不能够与用户名相同"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-lg-3 control-label">性别</label>
                        <div class="col-lg-5">
                            <div class="radio">
                                <label>
                                    <input path="Gender" type="radio" name="Gender" value="0" required data-bv-notempty-message="The gender is required" /> 男
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input path="Gender" type="radio" name="Gender" value="1" /> 女
                                </label>
                            </div>
                        </div>
                    </div>
					 <div class="form-group">
                        <label class="col-lg-3 control-label">联系电话</label>
                        <div class="col-lg-5">
                            <input path="Phone" type="text" class="form-control" name="Phone"
                              data-bv-stringlength="true" data-bv-stringlength-min="5" data-bv-stringlength-max="20" data-bv-stringlength-message="联系电话必须保证在5到15个字符"
                             required data-bv-notempty-message="联系电话不能够为空" /> 
                        </div>
                    </div>
                    
                     <div class="form-group">
                        <label class="col-lg-3 control-label">地址</label>
                        <div class="col-lg-5">
                            <input path="Address" type="text" class="form-control" name="Address"
                             required data-bv-notempty-message="地址不能够为空"/> 
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-lg-3 control-label">头像</label>
                        <div class="col-lg-5">
                            <input  type="file" class="form-control" name="ImgFile"
                             required data-bv-notempty-message="头像不能够为空"/> 
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-lg-3 control-label">个人介绍</label>
                        <div class="col-lg-5">
                            <textarea name="Introduce" style="height:100px;width:400px;" type="text" class="form-control"
                            		 required data-bv-notempty-message="个人介绍不能够为空"></textarea>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="col-lg-9 col-lg-offset-3">
                            <button type="submit" class="btn btn-primary">确认注册</button>
                        </div>
                    </div>
                </form>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
<script type="text/javascript">
$(document).ready(function() {
    $('#defaultForm').bootstrapValidator();
});
</script>
</html>