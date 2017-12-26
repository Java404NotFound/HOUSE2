package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>青鸟租房 - 用户登录</title>\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"images/logo.gif\" /></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"regLogin\" class=\"wrap\">\r\n");
      out.write("\t<div class=\"dialog\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<h4>用户登录</h4>\r\n");
      out.write("\t\t\t<form action=\"login.action\" method=\"post\">\r\n");
      out.write("\t\t\t<input type='hidden' name='action' value='login'/>\r\n");
      out.write("\t\t\t\t<div class=\"infos\">\r\n");
      out.write("\t\t\t\t\t<table class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">用 户 名：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"name\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">密　　码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" class=\"text\" name=\"password\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">验 证 码：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text verycode\" name=\"veryCode\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div class=\"buttons\"><input type=\"submit\" name=\"submit\" value=\"立即登录\" /></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\" class=\"wrap\">\r\n");
      out.write("\t<dl>\r\n");
      out.write("    \t<dt>青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号</dt>\r\n");
      out.write("        <dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
