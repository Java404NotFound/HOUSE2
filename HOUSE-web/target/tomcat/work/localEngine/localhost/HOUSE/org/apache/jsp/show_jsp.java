package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>青鸟租房 - 首页</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"images/logo.gif\" /></div>\r\n");
      out.write("\t<div class=\"search1\">\r\n");
      out.write("\t\t <form method=\"get\">\r\n");
      out.write("\t\t\t<input class=\"text\" type=\"text\" name=\"keywords\" />\r\n");
      out.write("\t\t\t<label class=\"ui-green\"><input type=\"button\" name=\"search\" value=\"搜索房屋\" /></label>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"navbar\" class=\"wrap\">\r\n");
      out.write("\t<dl class=\"search clearfix\">\r\n");
      out.write("\t\t<dt>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"bold\">房屋信息</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t包含关键字：<input type=\"text\" class=\"text\" name=\"keywords\" />\r\n");
      out.write("\t\t\t\t\t<label class=\"ui-blue\"><input type=\"button\" name=\"search\" value=\"搜索房屋\" /></label>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</dt>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<dd>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"first\">\r\n");
      out.write("\t\t\t\t\t价格\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span id=\"s-price-o\" class=\"selector w\">\r\n");
      out.write("\t\t\t\t\t\t不限\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">100元以下</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">100元—200元</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">200元以上</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</dd>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<dd>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"first\">房型</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span id=\"s-style-o\" class=\"selector w\">\r\n");
      out.write("\t\t\t\t\t\t不限\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">一居室</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">两居室</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">天安门</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</dd>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<dd>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"first\">面积</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span id=\"s-area-o\" class=\"selector w\">\r\n");
      out.write("\t\t\t\t\t\t不限\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">40以下</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">40—500</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">500元以上</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</dd>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<dd>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"first\">更新时间</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<span id=\"s-update-o\" class=\"selector w\">\r\n");
      out.write("\t\t\t\t\t\t不限\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">今天</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">一周内</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">一世纪内</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</dd>\t\r\n");
      out.write("\t</dl>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"position\" class=\"wrap\">当前位置：青鸟租房网 - 浏览房源</div>\r\n");
      out.write("<div id=\"view\" class=\"main wrap\">\r\n");
      out.write("\t<div class=\"intro\">\r\n");
      out.write("\t\t<div class=\"lefter\">\r\n");
      out.write("\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\t\t<div class=\"subinfo\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.bugdate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t\t<div class=\"houseinfo\">\r\n");
      out.write("\t\t\t\t<p>户　　型：<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.type.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("\t\t\t\t<p>面　　积：<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.floorage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("m<sup>2</sup></span></p>\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>位　　置：<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.street.district.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('区');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.street.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("\t\t\t\t<p>联系方式：<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.contact }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"side\">\r\n");
      out.write("\t\t\t<p><a href=\"#\" class=\"bold\">北京青鸟房地产经纪公司</a></p>\r\n");
      out.write("\t\t\t<p>资质证书：有</p>\r\n");
      out.write("\t\t\t<p>内部编号：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.user.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t<p>联 系 人：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.user.username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t<p>联系电话：<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.user.telephone }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("\t\t\t<p>手机号码：<span>暂无</span></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t<div class=\"introduction\">\r\n");
      out.write("\t\t\t<h2><span><strong>房源详细信息</strong></span></h2>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ result.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t</div>\r\n");
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
