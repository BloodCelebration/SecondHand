/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2017-03-28 12:17:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class personinfoupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/View/header.jsp", Long.valueOf(1490619923839L));
    _jspx_dependants.put("/View/footer.jsp", Long.valueOf(1489593003484L));
    _jspx_dependants.put("/View/catalogue.jsp", Long.valueOf(1490097106780L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fifNotGranted;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fifNotGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fifNotGranted.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/ShSite/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/ShSite/css/bootstrapValidator.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/ShSite/css/bootstrap-theme.css\">\r\n");
      out.write("<script src=\"/ShSite/js/jquery-1.10.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/ShSite/js/bootstrap.js\"\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ShSite/js/bootstrapValidator.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/ShSite/css/site.css\">\r\n");
      out.write("<title>校园二手交易系统</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("      \t\r\n");
      out.write("      \t <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/index\">主页</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      \t\r\n");
      out.write("      \t <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/Good\">商品中心</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      \t\r\n");
      out.write("      \t <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/Announcement\">公告中心</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      \t\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/Good/Publish\">商品发布</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- 只有管理员权限才能够看到这两个入口 -->\r\n");
      out.write("        ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("          \t<!-- 搜索框 -->\r\n");
      out.write("          \t<!--  \r\n");
      out.write("\t            <li>\r\n");
      out.write("\t           \t<form  class=\"navbar-form\" role=\"search\">\r\n");
      out.write("\t\t        <div class=\"form-group\" >\r\n");
      out.write("\t\t            <input type=\"text\" class=\"form-control\" placeholder=\"请输入你想搜索的二货\">\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t         <button type=\"submit\" class=\"btn btn-default navbar-btn\">搜索</button>\r\n");
      out.write("\t\t        </form>\r\n");
      out.write("\t\t        </li>\r\n");
      out.write("\t\t    -->    \r\n");
      out.write("          \t   <!-- 如果已经授权则显示退出链接 -->\r\n");
      out.write("            ");
      if (_jspx_meth_security_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <!-- 不具有 Admin,User的权限则显示登录链接-->\r\n");
      out.write("           ");
      if (_jspx_meth_security_005fauthorize_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write(" </nav>");
      out.write("\r\n");
      out.write("\t<div class=\"row\" id=\"main\">\r\n");
      out.write("\t\t<!-- 商品导航 -->\r\n");
      out.write("\t     ");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!-- 商品导航 -->\r\n");
      out.write("<div class=\"col-lg-2\">\r\n");
      out.write("\t<ul id=\"catalogueul\">\r\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t    <!-- 主框架 -->\r\n");
      out.write("\t\t<div class=\"container col-lg-10\">\r\n");
      out.write("\t\t  <form \t  method=\"post\" action=\"/ShSite/Account/Register\" enctype=\"multipart/form-data\"\r\n");
      out.write("\t\t  \t\t\t  id=\"defaultForm\" class=\"form-horizontal\"\r\n");
      out.write("                      data-bv-message=\"This value is not valid\"\r\n");
      out.write("                      data-bv-feedbackicons-valid=\"glyphicon glyphicon-ok\"\r\n");
      out.write("                      data-bv-feedbackicons-invalid=\"glyphicon glyphicon-remove\"\r\n");
      out.write("                      data-bv-feedbackicons-validating=\"glyphicon glyphicon-refresh\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">用户名</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <input path=\"shUserName\" type=\"text\" class=\"form-control\" name=\"ShUserName\"\r\n");
      out.write("                                   data-bv-message=\"用户名无效\"\r\n");
      out.write("                                   required data-bv-notempty-message=\"用户名不能为空\"\r\n");
      out.write("                                   data-bv-stringlength=\"true\" data-bv-stringlength-min=\"5\" data-bv-stringlength-max=\"20\" data-bv-stringlength-message=\"用户名必须保证在5到20个字符\"\r\n");
      out.write("                                   data-bv-different=\"true\" data-bv-different-field=\"Password\" data-bv-different-message=\"用户名不能够与密码相同\"\r\n");
      out.write("                           \t\t\t/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">密码</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <input path=\"Password\" type=\"password\" class=\"form-control\" name=\"Password\"\r\n");
      out.write("                                   required data-bv-notempty-message=\"密码不能够为空\"\r\n");
      out.write("                                   data-bv-stringlength=\"true\" data-bv-stringlength-min=\"8\" data-bv-stringlength-max=\"20\" data-bv-stringlength-message=\"密码必须保证在8到20个字符\"\r\n");
      out.write("                                   data-bv-identical=\"true\" data-bv-identical-field=\"confirmPassword\" data-bv-identical-message=\"密码必须一致\"\r\n");
      out.write("                                   data-bv-different=\"true\" data-bv-different-field=\"ShUserName\" data-bv-different-message=\"密码不能够与用户名相同\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">确认密码</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" name=\"confirmPassword\"\r\n");
      out.write("                                   required data-bv-notempty-message=\"确认密码不能够为空\"\r\n");
      out.write("                                   data-bv-identical=\"true\" data-bv-identical-field=\"Password\" data-bv-identical-message=\"密码必须一致\"\r\n");
      out.write("                                   data-bv-different=\"true\" data-bv-different-field=\"ShUserName\" data-bv-different-message=\"密码不能够与用户名相同\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">性别</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <div class=\"radio\">\r\n");
      out.write("                                <label>\r\n");
      out.write("                                    <input path=\"Gender\" type=\"radio\" name=\"Gender\" value=\"0\" required data-bv-notempty-message=\"The gender is required\" /> 男\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"radio\">\r\n");
      out.write("                                <label>\r\n");
      out.write("                                    <input path=\"Gender\" type=\"radio\" name=\"gender\" value=\"1\" /> 女\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">联系电话</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <input path=\"Phone\" type=\"text\" class=\"form-control\" name=\"Phone\"\r\n");
      out.write("                              data-bv-stringlength=\"true\" data-bv-stringlength-min=\"5\" data-bv-stringlength-max=\"20\" data-bv-stringlength-message=\"联系电话必须保证在5到15个字符\"\r\n");
      out.write("                             required data-bv-notempty-message=\"联系电话不能够为空\" /> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">地址</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <input path=\"Address\" type=\"text\" class=\"form-control\" name=\"Address\"\r\n");
      out.write("                             required data-bv-notempty-message=\"地址不能够为空\"/> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">头像</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <input  type=\"file\" class=\"form-control\" name=\"ImgFile\"\r\n");
      out.write("                             required data-bv-notempty-message=\"头像不能够为空\"/> \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-3 control-label\">个人介绍</label>\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <textarea name=\"Introduce\" style=\"height:100px;width:400px;\" type=\"text\" class=\"form-control\"\r\n");
      out.write("                            \t\t required data-bv-notempty-message=\"个人介绍不能够为空\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-lg-9 col-lg-offset-3\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">确认注册</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("        built with <a href=\"http://spring.io/\">spring mvc</a>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $('#defaultForm').bootstrapValidator();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f0.setParent(null);
    // /View/header.jsp(48,8) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('Admin')");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/UserManager\">用户管理</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/GoodManager\">商品管理</a>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"/ShSite/Announcement/Manager\">公告管理</a>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         ");
    }
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f1.setParent(null);
    // /View/header.jsp(95,12) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f1.setAccess("isAuthenticated()");
    int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("            \t<li><img alt=\"头像\" height=\"50\" width=\"40\" src=\"/ShSite/headportraits/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getShUserId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(".jpg\"/></li>\r\n");
      out.write("            \t<li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               \t\t");
      if (_jspx_meth_security_005fauthentication_005f0(_jspx_th_security_005fauthorize_005f1, _jspx_page_context))
        return true;
      out.write(" \r\n");
      out.write("               \t\t <span class=\"caret\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                  <li><a href=\"/ShSite/Account/PersonCenter/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getShUserId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">个人中心</a></li>\r\n");
      out.write("                  <li><a href=\"/ShSite/Good/Publish\">我要发布</a></li>\r\n");
      out.write("                  <li><a href=\"/ShSite/Account/CollectCenter/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.getShUserId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">我的收藏</a></li>\r\n");
      out.write("                  <li><a href=\"/ShSite/Account/LogOut\">退出登录</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("            ");
    }
    if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
    return false;
  }

  private boolean _jspx_meth_security_005fauthentication_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f1);
    // /View/header.jsp(99,17) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setProperty("name");
    int _jspx_eval_security_005fauthentication_005f0 = _jspx_th_security_005fauthentication_005f0.doStartTag();
    if (_jspx_th_security_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fifNotGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f2.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f2.setParent(null);
    // /View/header.jsp(111,11) name = ifNotGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f2.setIfNotGranted("Admin,User");
    int _jspx_eval_security_005fauthorize_005f2 = _jspx_th_security_005fauthorize_005f2.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("           \t\t<li><a href=\"/ShSite/Account/LogOn\">登录</a></li>\r\n");
      out.write("           \t\t<li><a href=\"/ShSite/Account/Register\">注册</a></li>\r\n");
      out.write("           ");
    }
    if (_jspx_th_security_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fifNotGranted.reuse(_jspx_th_security_005fauthorize_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005fifNotGranted.reuse(_jspx_th_security_005fauthorize_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /View/catalogue.jsp(7,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/View/catalogue.jsp(7,5) '${goodTypes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${goodTypes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /View/catalogue.jsp(7,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("goodType");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<li><a href=\"/ShSite/Good/Browse?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodType.getGoodTypeId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t<strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodType.getGoodTypeName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</strong>\r\n");
          out.write("\t\t</a></li>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}