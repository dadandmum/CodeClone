/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-09-12 07:52:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.User;

public final class userNotExsit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>NINA Theme â Free HTML theme</title>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"http://cdn.jquerytools.org/1.2.7/full/jquery.tools.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("   <!-- <link rel=\"stylesheet\" href=\"reset.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styl.css\" type=\"text/css\"> --> \r\n");
      out.write("        \r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,400,600,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t#back {\r\n");
      out.write("\tfont-family:Times, Georgia, serif;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tfont-size: 115%;\r\n");
      out.write("\ttop: 100px;\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("\theight: 46px;\r\n");
      out.write("\t/*background: url('img/menu_cut.jpg') no-repeat scroll right;*/\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #back ul li {\r\n");
      out.write("\t/*float: left;*/\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #back ul li a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tcolor : white;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\tfont-size: 40px;\r\n");
      out.write("\tletter-spacing: 2px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 25px 65px 25px 18px;\r\n");
      out.write("\tbackground-color: rgba(255,255,255,0.45);\r\n");
      out.write("\t\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #back ul li a:hover {\r\n");
      out.write("\tbackground-color: rgba(255,255,255,0.65);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #back ul li a.active {\r\n");
      out.write("\tbackground: none;\r\n");
      out.write("\tcolor: rgb(200,200,245);\r\n");
      out.write("\tfilter:alpha(opacity=90); \r\n");
      out.write("\t-moz-opacity:0.9; \r\n");
      out.write("\topacity:0.9;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #context {\r\n");
      out.write("\tfont-family:Georgia, serif;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50px;\r\n");
      out.write("\tleft: 250px;\r\n");
      out.write("\tbuttom: 200px;\r\n");
      out.write("\tright: 100px;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\t/*background: url('img/menu_cut.jpg') no-repeat scroll right;*/\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      com.UserBase user = null;
      synchronized (session) {
        user = (com.UserBase) _jspx_page_context.getAttribute("user", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (user == null){
          user = new com.UserBase();
          _jspx_page_context.setAttribute("user", user, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"div#back ul li\").hover(function(){\r\n");
      out.write("\t\t\t$(this).animate({width:'+=30px',left:'-=15px'}, 500);\r\n");
      out.write("\t\t}, function(){\r\n");
      out.write("\t\t\t$(this).animate({width:'-=30px',left:'+=15px'},500);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body  >\r\n");
      out.write("    \r\n");
      out.write("    <!-- BackGround -->\r\n");
      out.write("    <div  style=\"width:100%;height:100%;position:fixed;z-index:-1;top:0px;left:0px;\">\r\n");
      out.write("\t\t<img src=\"images/blurred.jpg\" width=\"100%\" height=\"100%\" >\r\n");
      out.write("\t</div> \r\n");
      out.write("    <!-- *********  Header  ********** -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("        <div id=\"header_in\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"back\">\r\n");
      out.write("         <ul>\r\n");
      out.write("            <li><a href=\"login/index.jsp\" >Back</a></li>          \r\n");
      out.write("         </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"tips\">\r\n");
      out.write("    \t<p id = \"context\">\r\n");
      out.write("    \t\tThe user name you require is not exist!\r\n");
      out.write("    \t</p>\r\n");
      out.write("    </div>\r\n");
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
