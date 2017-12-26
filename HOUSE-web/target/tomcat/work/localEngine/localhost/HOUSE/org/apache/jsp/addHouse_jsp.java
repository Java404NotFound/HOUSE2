package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addHouse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>添加租房信息</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\twidth: 800px;\r\n");
      out.write("\tmargin: 10px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top_left {\r\n");
      out.write("\twidth: 180px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 15px 0px 15px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top_right {\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: #0099CC;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tpadding: 15px 0px 15px 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".board {\r\n");
      out.write("\tbackground-color: #F0F5F8;\r\n");
      out.write("\tpadding-top: 35px;\r\n");
      out.write("\twidth: 800px;\r\n");
      out.write("\tmargin-top: -8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit {\r\n");
      out.write("\tbackground-image: url(\"/house/image/btn_bg.gif\");\r\n");
      out.write("\tbackground-size: 125px 36px;\r\n");
      out.write("\twidth: 125px;\r\n");
      out.write("\theight: 36px;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tborder: 0px solid #47A8F1;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\tmargin-left: 90px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.11.3.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$.post(\"TypeAction_findTypeList.action\", function(data) {\r\n");
      out.write("\t\t\t$(\"#type\").html(data);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$.post(\"DistrictAction_findDistrictList.action\", function(data) {\r\n");
      out.write("\t\t\t$(\"#district\").html(data);\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#district\").change(function() {\r\n");
      out.write("\t\t\tvar did = $(\"#district\").val();\r\n");
      out.write("\t\t\t$.post(\"HouseAction_getStreetListByDid.action\", {\r\n");
      out.write("\t\t\t\t\"districtId\" : did\r\n");
      out.write("\t\t\t}, function(data) {\r\n");
      out.write("\t\t\t\t$(\"#street\").html(\"\");\r\n");
      out.write("\t\t\t\t$(\"#street\").html(data);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#upload\").change(function() {\r\n");
      out.write("\t\t\tvar objUrl = getObjectURL(this.files[0]);\r\n");
      out.write("\t\t\tconsole.log(\"objUrl = \" + objUrl);\r\n");
      out.write("\t\t\tif (objUrl) {\r\n");
      out.write("\t\t\t\t$(\"#img\").attr(\"src\", objUrl);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction getObjectURL(file) {\r\n");
      out.write("\t\t\tvar url = null;\r\n");
      out.write("\t\t\tif (window.createObjectURL != undefined) { // basic\r\n");
      out.write("\t\t\t\turl = window.createObjectURL(file);\r\n");
      out.write("\t\t\t} else if (window.URL != undefined) { // mozilla(firefox)\r\n");
      out.write("\t\t\t\turl = window.URL.createObjectURL(file);\r\n");
      out.write("\t\t\t} else if (window.webkitURL != undefined) { // webkit or chrome\r\n");
      out.write("\t\t\t\turl = window.webkitURL.createObjectURL(file);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn url;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction subaddHouse() {\r\n");
      out.write("\t\t$(\"#addHouse\").get(0).submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top_left\">新房屋信息发布</div>\r\n");
      out.write("\t<div class=\"top_right\">填写房屋信息</div>\r\n");
      out.write("\t<hr style=\"height: 3px; clear: left; background-color: #0099CC;\">\r\n");
      out.write("\t<div class=\"board\">\r\n");
      out.write("\t\t<form action=\"HouseAction_addHouse.action\" method=\"post\"\r\n");
      out.write("\t\t\tenctype=\"multipart/form-data\" id=\"addHouse\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" width=\"150px\">标&nbsp;&nbsp;&nbsp;题：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"title\" name=\"house.title\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45px\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">户&nbsp;&nbsp;&nbsp;型：</td>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"type\" id=\"type\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">面&nbsp;&nbsp;&nbsp;积：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"area\" name=\"house.floorage\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45px\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">价&nbsp;&nbsp;&nbsp;格：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"price\" name=\"house.price\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45px\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">房产证日期：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"date\" class=\"form-control\" name=\"bugdate\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45px\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">位&nbsp;&nbsp;&nbsp;置：</td>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"district\" id=\"district\">\r\n");
      out.write("\t\t\t\t\t</select> <select name=\"street\" id=\"street\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>街道不限</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">上 传 图 片:</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"file\" id=\"upload\" name=\"upload\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">图 片 标 题：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"photoTitle\" name=\"picture.title\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45px\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">已上传图片：</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"tdd22\"><img id=\"img\" src=\"house/image/noimage.jpg\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"171px\" height=\"151px\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">联 系 方 式：</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"telephone\" name=\"house.contact\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"45px\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">详 细 信 息：</td>\r\n");
      out.write("\t\t\t\t\t<td><textarea rows=\"6\" cols=\"39\" name=\"house.description\"></textarea></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"80px\">\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"submit\" value=\"立即发布\" onclick=\"subaddHouse()\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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
}
