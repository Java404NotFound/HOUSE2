package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>青鸟租房 -修改房屋信息</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"images/logo.gif\" /></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"regLogin\" class=\"wrap\">\r\n");
      out.write("\t<div class=\"dialog\">\r\n");
      out.write("\t\t<dl class=\"clearfix\">\r\n");
      out.write("\t\t\t<dt>房屋信息修改</dt>\r\n");
      out.write("\t\t\t<dd class=\"past\">修改房屋信息</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<form action=\"/HouseRent/UpdateServlet?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"infos\">\r\n");
      out.write("\t\t\t\t\t<table class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">标　　题：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">户　　型：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select class=\"text\" name=\"type_id\"><option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.type.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.type.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">面　　积：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"floorage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.floorage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">价　　格：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.price }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">位　　置：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>区：<select  class=\"text\" name=\"district_id\"><option >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.district.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</option></select>\r\n");
      out.write("                            \t街：<select  class=\"text\" name=\"street_id\"><option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</option></select>\r\n");
      out.write("                            </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">联系方式：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"contact\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.contact }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"field\">详细信息：</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><textarea name=\"description\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div class=\"buttons\"><input type=\"submit\" name=\"submit\" value=\"立即修改\" /></div>\r\n");
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
