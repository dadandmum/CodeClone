/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-09-14 03:31:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.User;

public final class RegisterError_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"refresh\" content=\"7;url=../login/registers.jsp\">\r\n");
      out.write("    <title>User Not Exist</title>\r\n");
      out.write("    \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n");
      out.write("        <meta name=\"description\" content=\"Animated Buttons with CSS3\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"css3, transitions, button, animation, hover, effect, icon, call-to-action, active\" />\r\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css' />\r\n");
      out.write("    <script src=\"http://cdn.jquerytools.org/1.2.7/full/jquery.tools.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery2.js\"></script>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,400,600,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t.blue-back{\r\n");
      out.write("\t    background:#28b6c0;\r\n");
      out.write("\t    background:-webkit-gradient(linear,left top,left bottom,color-stop(#80a9da,0),color-stop(#6f97c5,1));\r\n");
      out.write("\t    background:-webkit-linear-gradient(top, #80a9da 0%, #6f97c5 100%);\r\n");
      out.write("\t    background:-moz-linear-gradient(top, #28b6c0 0%, #28b6c0 100%);\r\n");
      out.write("\t    background:-o-linear-gradient(top, #80a9da 0%, #6f97c5 100%);\r\n");
      out.write("\t    background:linear-gradient(top, #80a9da 0%, #6f97c5 100%);\r\n");
      out.write("\t    filter:progid:DXImageTransform.Microsoft.gradient( startColorstr='#80a9da', endColorstr='#6f97c5',GradientType=0 );\r\n");
      out.write("\t    padding-left:20px;\r\n");
      out.write("\t    padding-right:80px;\r\n");
      out.write("\t    height:75px;\r\n");
      out.write("\t    display:inline-block;\r\n");
      out.write("\t    position:relative;\r\n");
      out.write("\t    border:1px solid #5d81ab;\r\n");
      out.write("\t    -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2), 0px 0px 0px 4px rgba(188,188,188,0.5);\r\n");
      out.write("\t    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2), 0px 0px 0px 4px rgba(188,188,188,0.5);\r\n");
      out.write("\t    box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2), 0px 0px 0px 4px rgba(188,188,188,0.5);\r\n");
      out.write("\t    -webkit-border-radius:10px;\r\n");
      out.write("\t    -moz-border-radius:10px;\r\n");
      out.write("\t    border-radius:10px;\r\n");
      out.write("\t    float:left;\r\n");
      out.write("\t    clear:both;\r\n");
      out.write("\t    margin:10px 0px;\r\n");
      out.write("\t    overflow:hidden;\r\n");
      out.write("\t    -webkit-transition:all 0.3s linear;\r\n");
      out.write("\t    -moz-transition:all 0.3s linear;\r\n");
      out.write("\t    -o-transition:all 0.3s linear;\r\n");
      out.write("\t    transition:all 0.3s linear;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back-text{\r\n");
      out.write("\t    padding-top:5px;\r\n");
      out.write("\t    display:block;\r\n");
      out.write("\t    font-family: 'Ubuntu', 'Lato', sans-serif;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tfont-weight: 700;\r\n");
      out.write("\t    font-size:45px;\r\n");
      out.write("\t    white-space:nowrap;\r\n");
      out.write("\t    text-shadow:0px 1px 1px rgba(255,255,255,0.3);\r\n");
      out.write("\t    color:#fff;\r\n");
      out.write("\t    -webkit-transition:all 0.2s linear;\r\n");
      out.write("\t    -moz-transition:all 0.2s linear;\r\n");
      out.write("\t    -o-transition:all 0.2s linear;\r\n");
      out.write("\t    transition:all 0.2s linear;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back-slide-text{\r\n");
      out.write("\t    position:absolute;\r\n");
      out.write("\t    height:100%;\r\n");
      out.write("\t    top:0px;\r\n");
      out.write("\t    right:52px;\r\n");
      out.write("\t    width:0px;\r\n");
      out.write("\t    background:#63707e;\r\n");
      out.write("\t    text-shadow:0px -1px 1px #363f49;\r\n");
      out.write("\t    color:#bbbbbb;\r\n");
      out.write("\t    font-family: 'Ubuntu', 'Lato', sans-serif;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tfont-weight: 700;\r\n");
      out.write("\t    font-size:35px;\r\n");
      out.write("\t    white-space:nowrap;\r\n");
      out.write("\t    text-transform:uppercase;\r\n");
      out.write("\t    text-align:left;\r\n");
      out.write("\t    text-indent:10px;\r\n");
      out.write("\t    overflow:hidden;\r\n");
      out.write("\t    line-height:65px;\r\n");
      out.write("\t    -webkit-box-shadow:-1px 0px 1px rgba(255,255,255,0.4), 1px 1px 2px rgba(0,0,0,0.2) inset;\r\n");
      out.write("\t    -moz-box-shadow:-1px 0px 1px rgba(255,255,255,0.4), 1px 1px 2px rgba(0,0,0,0.2) inset;\r\n");
      out.write("\t    box-shadow:-1px 0px 1px rgba(255,255,255,0.4), 1px 1px 2px rgba(0,0,0,0.2) inset;\r\n");
      out.write("\t    -webkit-transition:width 0.3s linear;\r\n");
      out.write("\t    -moz-transition:width 0.3s linear;\r\n");
      out.write("\t    -o-transition:width 0.3s linear;\r\n");
      out.write("\t    transition:width 0.3s linear;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back-icon-right{\r\n");
      out.write("\t    position:absolute;\r\n");
      out.write("\t    right:0px;\r\n");
      out.write("\t    top:0px;\r\n");
      out.write("\t    height:100%;\r\n");
      out.write("\t    width:52px;\r\n");
      out.write("\t    border-left:1px solid #5d81ab;\r\n");
      out.write("\t    -webkit-box-shadow:1px 0px 1px rgba(255,255,255,0.4) inset;\r\n");
      out.write("\t    -moz-box-shadow:1px 0px 1px rgba(255,255,255,0.4) inset;\r\n");
      out.write("\t    box-shadow:1px 0px 1px rgba(255,255,255,0.4) inset;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back-icon-right span{\r\n");
      out.write("\t    width:38px;\r\n");
      out.write("\t    height:38px;\r\n");
      out.write("\t    opacity:0.7;\r\n");
      out.write("\t    position:absolute;\r\n");
      out.write("\t    left:50%;\r\n");
      out.write("\t    top:50%;\r\n");
      out.write("\t    margin:-20px 0px 0px -20px;\r\n");
      out.write("\t    background:transparent url(../images/arrow_right.png) no-repeat 50% 55%;\r\n");
      out.write("\t    -webkit-transition:all 0.3s linear;\r\n");
      out.write("\t    -moz-transition:all 0.3s linear;\r\n");
      out.write("\t    -o-transition:all 0.3s linear;\r\n");
      out.write("\t    transition:all 0.3s linear;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:hover{\r\n");
      out.write("\t    padding-right:310px;\r\n");
      out.write("\t    -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2);\r\n");
      out.write("\t    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2);\r\n");
      out.write("\t    box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2);\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:hover .blue-back-text{\r\n");
      out.write("\t    text-shadow:0px 1px 1px #5d81ab;\r\n");
      out.write("\t    color:#fff;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:hover .blue-back-slide-text{\r\n");
      out.write("\t    width:230px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:hover .blue-back-icon-right span{\r\n");
      out.write("\t    opacity:1;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:active{\r\n");
      out.write("\t    position:relative;\r\n");
      out.write("\t    top:1px;\r\n");
      out.write("\t    background:#5d81ab;\r\n");
      out.write("\t    -webkit-box-shadow:1px 1px 2px rgba(0,0,0,0.4) inset;\r\n");
      out.write("\t    -moz-box-shadow:1px 1px 2px rgba(0,0,0,0.4) inset;\r\n");
      out.write("\t    box-shadow:1px 1px 2px rgba(0,0,0,0.4) inset;\r\n");
      out.write("\t    border-color:#80a9da;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t#back {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop:10px;\r\n");
      out.write("\t\tright:20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#tips{\r\n");
      out.write("\t    background: rgba(220,220,255,0.35);\r\n");
      out.write("\t   \r\n");
      out.write("\t    padding-left:40px;\r\n");
      out.write("\t    padding-right:40px;\r\n");
      out.write("\t    padding-top:0px;\r\n");
      out.write("\t    padding-button:50px;\r\n");
      out.write("\t    height:auto;\r\n");
      out.write("\t    display:inline-block;\r\n");
      out.write("\t    position:relative;\r\n");
      out.write("\t    top:200px;\r\n");
      out.write("\t    \r\n");
      out.write("\t    border:1px solid #5d81ab; \r\n");
      out.write("\t    -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.2) inset, 1px 1px 3px rgba(0,0,0,0.2), 0px 0px 0px 4px rgba(188,188,188,0.5);\r\n");
      out.write("\t    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.2) inset, 1px 1px 3px rgba(0,0,0,0.2), 0px 0px 0px 4px rgba(188,188,188,0.5);\r\n");
      out.write("\t    box-shadow:0px 1px 1px rgba(255,255,255,0.2) inset, 1px 1px 3px rgba(0,0,0,0.2), 0px 0px 0px 4px rgba(188,188,188,0.5);\r\n");
      out.write("\t    -webkit-border-radius:20px;\r\n");
      out.write("\t    -moz-border-radius:20px;\r\n");
      out.write("\t    border-radius:10px;\r\n");
      out.write("\t    \r\n");
      out.write("\t    clear:both;\r\n");
      out.write("\t    -webkit-transition:all 0.3s linear;\r\n");
      out.write("\t    -moz-transition:all 0.3s linear;\r\n");
      out.write("\t    -o-transition:all 0.3s linear;\r\n");
      out.write("\t    transition:all 0.3s linear;\r\n");
      out.write("\t}\r\n");
      out.write("\t#tips #context{\r\n");
      out.write("\t    position:relative;\r\n");
      out.write("\t    padding-top:0px;\r\n");
      out.write("\t    display:block;\r\n");
      out.write("\t    font-size:55px;\r\n");
      out.write("\t    font-weight:600;\r\n");
      out.write("\t    white-space:nowrap;\r\n");
      out.write("\t    text-shadow:0px 1px 1px rgba(255,255,255,0.3);\r\n");
      out.write("\t    color:#fff;\r\n");
      out.write("\t    -webkit-transition:all 0.2s linear;\r\n");
      out.write("\t    -moz-transition:all 0.2s linear;\r\n");
      out.write("\t    -o-transition:all 0.2s linear;\r\n");
      out.write("\t    transition:all 0.2s linear;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#tips\").hide().show(333);\r\n");
      out.write("\t\t$(\"#context\").hide().show(333);\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");

		String message = request.getParameter("errorMessage");
	
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body  >\r\n");
      out.write("    \r\n");
      out.write("    <!-- BackGround -->\r\n");
      out.write("    <div  style=\"width:100%;height:100%;position:fixed;z-index:-1;top:0px;left:0px;\">\r\n");
      out.write("\t\t<img src=\"../bgp.jpg\" width=\"100%\" height=\"100%\" >\r\n");
      out.write("\t</div> \r\n");
      out.write("    <!-- *********  Header  ********** -->\r\n");
      out.write("     <div id = \"back\">\r\n");
      out.write("     <div class=\"content\" >\r\n");
      out.write("\t\t\t\t<div class=\"button-wrapper\">\r\n");
      out.write("\t\t\t\t\t<a href=\"../login/register.jsp\" class=\"blue-back\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"blue-back-text\">Back</span> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"blue-back-slide-text\">Register</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"blue-back-icon-right\"><span></span></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <body>\r\n");
      out.write("    <div id=\"tips\">\r\n");
      out.write("    \t<p id = \"context\">\r\n");
      out.write("\t\t\t");
      out.print(message);
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
