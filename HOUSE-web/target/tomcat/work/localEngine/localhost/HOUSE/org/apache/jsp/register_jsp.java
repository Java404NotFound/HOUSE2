package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>青鸟租房 - 用户注册</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\tmargin: 90px auto;\r\n");
      out.write("}\r\n");
      out.write(".top_left{\r\n");
      out.write("\twidth: 180px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 15px 0px 15px 0px;\r\n");
      out.write("}\r\n");
      out.write(".top_right{\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: #0099CC;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tpadding: 15px 0px 15px 0px;\r\n");
      out.write("}\r\n");
      out.write(".board{\r\n");
      out.write("\tbackground-color: #F0F5F8;\r\n");
      out.write("\tpadding-top: 35px;\r\n");
      out.write("\twidth: 600px;\r\n");
      out.write("\tmargin-top: -8px;\r\n");
      out.write("}\r\n");
      out.write(".submit{\r\n");
      out.write("\tbackground-image: url(\"/house/image/btn_bg.gif\");\r\n");
      out.write("\tbackground-size: 125px 36px;\r\n");
      out.write("\twidth: 125px;\r\n");
      out.write("\theight: 36px;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tborder: 0px solid #47A8F1;\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("\tfont-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/house/js/Base64.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction ck(){\r\n");
      out.write("\t\tvar name = document.getElementById('userName').value;\r\n");
      out.write("\t\tvar pwd = document.getElementById('password').value;\r\n");
      out.write("\t\tvar cPwd = document.getElementById('ConfirmPWD').value;\r\n");
      out.write("\t\tif(trim(name) == '' || name == null){\r\n");
      out.write("\t\t\talert(\"请输入用户名!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(trim(pwd) == '' || pwd == null){\r\n");
      out.write("\t\t\talert(\"请输入密码!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(trim(cPwd) == '' || cPwd == null){\r\n");
      out.write("\t\t\talert(\"请输入确认密码!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(pwd != cPwd){\r\n");
      out.write("\t\t\talert(\"两次输入的密码不一致!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction trim(obj) {\r\n");
      out.write("\t    return obj.replace(/(^\\s*)|(\\s*$)/g, '');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top_left\">新用户注册</div>\r\n");
      out.write("\t<div class=\"top_right\">填写个人信息</div>\r\n");
      out.write("\t<hr style=\"height: 3px;clear: left;background-color: #0099CC;\">\r\n");
      out.write("\t<div class=\"board\">\r\n");
      out.write("\t<form action=\"UserAction_register.action\" method=\"post\" onsubmit=\"return ck()\" name=\"user\">\r\n");
      out.write("\t\t<table width=\"600px\">\r\n");
      out.write("\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t<td width=\"150px\" align=\"right\">用 户 名：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"userName\" name=\"user.username\" size=\"40px\"/>&nbsp;<span style=\"color: #D269FC;\">*</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">密&nbsp;&nbsp;码：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"password\" name=\"user.password\" size=\"40px\" />&nbsp;<span style=\"color: #D269FC;\">*</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">确认密码：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" id=\"ConfirmPWD\" name=\"ConfirmPWD\" size=\"40px\"  />&nbsp;<span style=\"color: #D269FC;\">*</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">电&nbsp;&nbsp;话：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"phone\" name=\"user.telephone\" size=\"40px\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"40px\">\r\n");
      out.write("\t\t\t\t<td align=\"right\">用户姓名：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" id=\"realName\" name=\"user.realname\" size=\"40px\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr height=\"80px\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"立即注册\" class=\"submit\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
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
