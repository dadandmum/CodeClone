/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-09-18 13:51:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.man;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Show</title>\r\n");
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
      out.write("\t#menu {\r\n");
      out.write("\tfont-family: Georgia, serif;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50px;\r\n");
      out.write("\tleft: -20px;\r\n");
      out.write("\tfont-size: 115%;\r\n");
      out.write("\t/*background: url('img/menu_cut.jpg') no-repeat scroll right;*/\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #menu ul li {\r\n");
      out.write("\t/*float: left;*/\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #menu ul li a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #101115;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 29px 40px 0 40px;\r\n");
      out.write("\theight: 46px;\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tfilter:alpha(opacity=50); \r\n");
      out.write("\t-moz-opacity:0.5; \r\n");
      out.write("\topacity:0.5;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #menu ul li a:hover {\r\n");
      out.write("\tbackground-color: #f3f3f3;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #menu ul li a.active {\r\n");
      out.write("\tbackground: none;\r\n");
      out.write("\tcolor: rgb(200,200,245);\r\n");
      out.write("\tfilter:alpha(opacity=90); \r\n");
      out.write("\t-moz-opacity:0.9; \r\n");
      out.write("\topacity:0.9;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #context {\r\n");
      out.write("\tfont-family:'trebuchet MS', 'Lucida Sans', Arial;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50px;\r\n");
      out.write("\tleft: 300px;\r\n");
      out.write("\tbuttom: 200px;\r\n");
      out.write("\tright: 100px;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\t/*background: url('img/menu_cut.jpg') no-repeat scroll right;*/\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #gravatar{\r\n");
      out.write("\t\tfont-family:'trebuchet MS', 'Lucida Sans', Arial;\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop: 50px;\r\n");
      out.write("\t\tleft: 700px;\r\n");
      out.write("\t\twidth: 200px;\r\n");
      out.write("\t\theight: 200px;\r\n");
      out.write("\t\tfont-size: 100%;\r\n");
      out.write("\t\t/*background: url('img/menu_cut.jpg') no-repeat scroll right;*/\r\n");
      out.write("\t\tmargin-right: 0px;\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\tborder-style: solid;\r\n");
      out.write(" \t\tborder-color: rgba(255,255,255,0.35);\r\n");
      out.write("  \t\tborder-width: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("\t/*info table------------------------------------------------------------*/\r\n");
      out.write("\t.info-table\r\n");
      out.write("\t{\r\n");
      out.write("\t  width: 500px;\r\n");
      out.write("\t  float:left;\r\n");
      out.write("\t  margin: 0 auto;\r\n");
      out.write("\t  border-collapse: separate;\r\n");
      out.write("\t  border-spacing: 0;\r\n");
      out.write("\t  text-shadow: 0 1px 0 #fff;\r\n");
      out.write("\t  color: rgba(50,50,50,1.0);\r\n");
      out.write("\t  background: rgba(200,200,200,0.8);\r\n");
      out.write("\t  }\r\n");
      out.write("\t\r\n");
      out.write("\t.info-table td\r\n");
      out.write("\t{\r\n");
      out.write("\t  height: 40px;\r\n");
      out.write("\t  line-height: 40px;\r\n");
      out.write("\t  padding: 0 20px;\r\n");
      out.write("\t  border-bottom: 1px solid #cdcdcd;\r\n");
      out.write("\t  box-shadow: 0 1px 0 white;\r\n");
      out.write("\t  -moz-box-shadow: 0 1px 0 white;\r\n");
      out.write("\t  -webkit-box-shadow: 0 1px 0 white;\r\n");
      out.write("\t  white-space: nowrap;\r\n");
      out.write("\t  text-align: center;\r\n");
      out.write("\t  \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Body*/\r\n");
      out.write("\t.info-table tbody td\r\n");
      out.write("\t{\r\n");
      out.write("\t  text-align: center;\r\n");
      out.write("\t  font: normal 20px Georgia , Verdana, Arial, Helvetica;\r\n");
      out.write("\t  width: 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.info-table td:nth-child(1)\r\n");
      out.write("\t{\r\n");
      out.write("\t  background: rgba(150,150,150,0);\r\n");
      out.write("\t  width: 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.info-table td:nth-child(2)\r\n");
      out.write("\t{\r\n");
      out.write("\t  background: #e7f3d4;\r\n");
      out.write("\t  background: rgba(225,225,225,0.35);\r\n");
      out.write("\t  width: 150px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t.info-table tr:nth-child(even){\r\n");
      out.write("\t  \tbackground: rgba(255,220,220,0.5);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.info-table tr:nth-child(odd){\r\n");
      out.write("\t  \tbackground: rgba(220,220,255,0.5);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.info-table tr:hover\r\n");
      out.write("\t{\r\n");
      out.write("\t  background: rgba(255,255,255,0.3);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* manage button ----------------------------------------------------------------------*/\r\n");
      out.write("    .info #manage input[type=button] {\r\n");
      out.write("    /* Width and position */\r\n");
      out.write("    width: 140px;\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    padding: 4px 2px;\r\n");
      out.write("    margin: 5px 20px 0px 20px ;\r\n");
      out.write("    \r\n");
      out.write("    /* Styles */\r\n");
      out.write("    border: 1px solid #0273dd; /* Fallback */\r\n");
      out.write("    border: 1px solid rgba(0,0,0,0.4);\r\n");
      out.write("    box-shadow:\r\n");
      out.write("        inset 0 1px 0 rgba(255,255,255,0.3),\r\n");
      out.write("        inset 0 10px 10px rgba(255,255,255,0.1);\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    background: rgba(100,100,255,0.5);\r\n");
      out.write("    cursor:pointer;\r\n");
      out.write("  \r\n");
      out.write("    /* Font styles */\r\n");
      out.write("    font-family: 'trebuchet MS', 'Lucida Sans', Arial;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 200;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    text-shadow: 0 -1px 0 rgba(100,100,100,0.5);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.info #manage input[type=button]:hover { \r\n");
      out.write("\t    box-shadow: inset 0 1px 0 rgba(255,255,255,0.6);\r\n");
      out.write("\t}\r\n");
      out.write("\t/* end manage button ---------------------------------------------------------*/   \r\n");
      out.write("\t\r\n");
      out.write("\t    \r\n");
      out.write("    .blue-back{\r\n");
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
      out.write("\t    text-decoration: blink\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back-text{\r\n");
      out.write("\t    padding-top:5px;\r\n");
      out.write("\t    display:block;\r\n");
      out.write("\t    font-family: 'trebuchet MS', 'Lucida Sans', Arial;\r\n");
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
      out.write("\t    padding-right:630px;\r\n");
      out.write("\t    -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2);\r\n");
      out.write("\t    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2);\r\n");
      out.write("\t    box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 3px rgba(0,0,0,0.2);\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:hover .blue-back-text{\r\n");
      out.write("\t    text-shadow:0px 1px 1px #5d81ab;\r\n");
      out.write("\t    color:#fff;\r\n");
      out.write("\t}\r\n");
      out.write("\t.blue-back:hover .blue-back-slide-text{\r\n");
      out.write("\t    width:550px;\r\n");
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
      out.write("\t</style>\r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"div#menu ul li\").hover(function(){\r\n");
      out.write("\t\t\t$(this).animate({left:'+=25px'}, 500);\r\n");
      out.write("\t\t}, function(){\r\n");
      out.write("\t\t\t$(this).animate({left:'-=25px'},500);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tvar animateTime = 500;\r\n");
      out.write("\t\t$(\".blue-back\").each(function(index,element){\r\n");
      out.write("\t\t\t$(this)\r\n");
      out.write("\t\t\t.animate({opacity:'1.0'},index*animateTime/2)\r\n");
      out.write("\t\t\t.animate({opacity:'0.05'},animateTime/2)\r\n");
      out.write("\t\t\t.animate({opacity:'1.0'},animateTime/2);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t\t<img src=\"img/bgimg.jpg\" width=\"100%\" height=\"100%\" >\r\n");
      out.write("\t</div> \r\n");
      out.write("    <!-- *********  Header  ********** -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("        <div id=\"header_in\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"menu\">\r\n");
      out.write("         <ul>\r\n");
      out.write("            <li><a href=\"../man/index.jsp\" >Home</a></li>\r\n");
      out.write("            <li><a href=\"../man/info.jsp\">Information</a></li>\r\n");
      out.write("            <li><a href=\"../man/record.jsp\">Record</a></li>\r\n");
      out.write("            <li><a href=\"../man/show.jsp\" class=\"active\" >Show</a></li>    \r\n");
      out.write("         </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"context\" class = \"info\">\r\n");
      out.write("    \r\n");
      out.write("\t\t<div class=\"button-wrapper\">\r\n");
      out.write("\t\t\t<a href=\"../man/map.jsp\" class=\"blue-back\">\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-text\">Map</span> \r\n");
      out.write("\t\t\t\t<span class=\"blue-back-slide-text\">See your records on map!</span>\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-icon-right\"><span></span></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<a href=\"../man/image.jsp\" class=\"blue-back\">\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-text\">Pictures</span> \r\n");
      out.write("\t\t\t\t<span class=\"blue-back-slide-text\">See your pictures here!</span>\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-icon-right\"><span></span></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<a href=\"../man/humidity.jsp\" class=\"blue-back\">\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-text\">Humidity</span> \r\n");
      out.write("\t\t\t\t<span class=\"blue-back-slide-text\">Your records about humidity!</span>\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-icon-right\"><span></span></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<a href=\"../man/wifi.jsp\" class=\"blue-back\">\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-text\">WIFI</span> \r\n");
      out.write("\t\t\t\t<span class=\"blue-back-slide-text\">See your records about WIFI!</span>\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-icon-right\"><span></span></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<a href=\"../man/illumination.jsp\" class=\"blue-back\">\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-text\">Illumination</span> \r\n");
      out.write("\t\t\t\t<span class=\"blue-back-slide-text\">Your records about illumination!</span>\r\n");
      out.write("\t\t\t\t<span class=\"blue-back-icon-right\"><span></span></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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