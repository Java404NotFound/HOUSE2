package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>青鸟租房 - 首页</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\t\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"images/logo.gif\" /></div>\r\n");
      out.write("\t<div class=\"login\"><a href=\"register.jsp\">注册</a>&nbsp;<a href=\"login.jsp\">登录</a></div>\r\n");
      out.write("\t<div class=\"search\">\r\n");
      out.write("\t\t<input class=\"text\" type=\"text\" name=\"keywords\" />\r\n");
      out.write("\t\t<label class=\"ui-green\"><input type=\"button\" name=\"search\" value=\"搜索房屋\" /></label>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("<div class=\"main wrap\">\r\n");
      out.write("\t<table class=\"house-list\">\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("  \t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"pager\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li class=\"current\"><a href=\"index.action?pageIndex=1\">首页</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"index.action?pageIndex=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageIndex <= 1?1:pageIndex-1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">上一页</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"index.action?pageIndex=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageIndex >= pageCount?pageCount:pageIndex+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">下一页</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"index.action?pageIndex=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">末页</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<span class=\"total\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageIndex }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("页</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\" class=\"wrap\">\r\n");
      out.write("\t<dl>\r\n");
      out.write("    \t<dt>青鸟租房 &copy; 2010 北大青鸟 京ICP证1000001号</dt>\r\n");
      out.write("        <dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /result.jsp(105,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.result ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\r\n");
        out.write("\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /result.jsp(106,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/result.jsp(106,1) '${requestScope.result}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.result}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /result.jsp(106,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("house");
    // /result.jsp(106,1) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /result.jsp(107,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count%2 != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td class=\"house-thumb\"><span><a href=\"show.action?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"><img src=\"images/thumb_house.gif\" /></a></span></td>\r\n");
        out.write("\t\t\t<td>\r\n");
        out.write("\t\t\t\t<dl>\r\n");
        out.write("\t\t\t\t\t<dt><a href=\"show.action?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></dt>\r\n");
        out.write("\t\t\t\t\t<dd>\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.district.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('区');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.floorage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("平米<br />\r\n");
        out.write("\t\t\t\t\t\t联系方式：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.contact }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\t\r\n");
        out.write("\t\t\t\t\t</dd>\r\n");
        out.write("\t\t\t\t</dl>\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td class=\"house-type\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.type.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t<td class=\"house-price\"><span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.price }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>元/月</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /result.jsp(123,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count%2 == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<tr class=\"odd\">\r\n");
        out.write("\t\t\t<td class=\"house-thumb\"><span><a href=\"show.action?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"><img src=\"images/thumb_house.gif\" /></a></span></td>\r\n");
        out.write("\t\t\t<td>\r\n");
        out.write("\t\t\t\t<dl>\r\n");
        out.write("\t\t\t\t\t<dt><a href=\"show.action?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></dt>\r\n");
        out.write("\t\t\t\t\t<dd>\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.district.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('区');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.street.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.floorage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("平米<br />\r\n");
        out.write("\t\t\t\t\t\t联系方式：");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.contact }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</dd>\r\n");
        out.write("\t\t\t\t</dl>\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t<td class=\"house-type\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.type.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t<td class=\"house-price\"><span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${house.price }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>元/月</td>\r\n");
        out.write("\t\t</tr> \r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /result.jsp(142,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty requestScope.result}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t<tr>");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("</tr> \r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /result.jsp(143,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue(new String("无租房信息"));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
