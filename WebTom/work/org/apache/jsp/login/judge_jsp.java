/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-09-19 06:21:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts2.components.Else;
import com.UserInfo;
import com.UserBaseUtil;

public final class judge_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Judge</title>\r\n");
      out.write("    <script src=\"http://cdn.jquerytools.org/1.2.7/full/jquery.tools.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("\t");
      com.error.LoginError loginError = null;
      synchronized (session) {
        loginError = (com.error.LoginError) _jspx_page_context.getAttribute("loginError", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (loginError == null){
          loginError = new com.error.LoginError();
          _jspx_page_context.setAttribute("loginError", loginError, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
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
      out.write("\t\r\n");
      out.write("\t");

		String userName = (String)request.getParameter("login");
		String password = (String)request.getParameter("password");
		//UserBaseUtil ubu = new ubu();
		UserBaseUtil ubu = new UserBaseUtil();
		if ( !ubu.checkUserName(userName)  )
		{
			
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("loginError"), "message", "Sorry, the user name is not correct.", null, null, false);
      out.write("\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("           \t\t\twindow.location.href=\"LoginError.jsp\"; \r\n");
      out.write("    \t\t\t</script> \r\n");
      out.write("\t\t\t");

		}
		else if ( !ubu.checkPassword(userName, password))
		{
			
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("loginError"), "message", "Sorry, your password is wrong.", null, null, false);
      out.write("\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("           \t\t\twindow.location.href=\"LoginError.jsp\"; \r\n");
      out.write("    \t\t\t</script> \r\n");
      out.write("\t\t\t");

		}else{
			session.setAttribute("USER_NAME", userName);
			
      out.write("\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("       \t\t\t\twindow.location.href=\"../man/index.jsp\"; \r\n");
      out.write("\t\t\t\t</script> \r\n");
      out.write("\t\t\t");

		}
	
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body  >\r\n");
      out.write("    \r\n");
      out.write("    <!-- BackGround -->\r\n");
      out.write("    <div  style=\"width:100%;height:100%;position:fixed;z-index:-1;top:0px;left:0px;\">\r\n");
      out.write("\t\t<img src=\"images/blurred.jpg\" width=\"100%\" height=\"100%\" >\r\n");
      out.write("\t</div> \r\n");
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
