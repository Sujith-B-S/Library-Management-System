/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-12-02 11:13:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Admin Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("	body {\r\n");
      out.write("		margin: 0;\r\n");
      out.write("		padding: 0;\r\n");
      out.write("		font-family: sans-serif;\r\n");
      out.write("		background-color: rgb(199, 206, 206);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	h1 {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		margin-top: 20px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.container {\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		width: 30%;\r\n");
      out.write("		padding: 40px;\r\n");
      out.write("		margin: 50px auto;\r\n");
      out.write("		border: 1px solid black;\r\n");
      out.write("		border-radius: 20px;\r\n");
      out.write("		box-shadow: 10px 10px 5px grey;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.login-form {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("		align-items: center; /* Centers the content horizontally */\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.inp {\r\n");
      out.write("		width: 100%; /* Full width input */\r\n");
      out.write("		padding: 10px;\r\n");
      out.write("		margin-bottom: 20px;\r\n");
      out.write("		border: 1px solid slategrey;\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("		font-size: 18px;\r\n");
      out.write("		background-color: azure;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.inp:focus {\r\n");
      out.write("		border-color: aqua;\r\n");
      out.write("		outline: none;\r\n");
      out.write("		box-shadow: 0 0 8px rgba(0, 123, 255, 0.5);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.sub {\r\n");
      out.write("		padding: 10px;\r\n");
      out.write("		font-size: 16px;\r\n");
      out.write("		font-weight: 400;\r\n");
      out.write("		background-color: black;\r\n");
      out.write("		color: rgb(255, 252, 252);\r\n");
      out.write("		border: none;\r\n");
      out.write("		border-radius: 15px;\r\n");
      out.write("		width: 120px; /* Fixed button width */\r\n");
      out.write("		cursor: pointer;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.sub:hover {\r\n");
      out.write("		background-color: #333; /* Slight hover effect */\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.register-link {\r\n");
      out.write("		margin-top: 15px;\r\n");
      out.write("		font-size: 14px;\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		color: blue;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.register-link:hover {\r\n");
      out.write("		text-decoration: underline;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>Admin Login</h1>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<form action=\"Login\" class=\"login-form\">\r\n");
      out.write("			<input type=\"email\" name=\"email\" required=\"required\" placeholder=\"Email\" class=\"inp\">\r\n");
      out.write("			<input type=\"password\" name=\"pwd\" required=\"required\" placeholder=\"Password\" class=\"inp\">\r\n");
      out.write("			<input type=\"submit\" value=\"Login\" class=\"sub\">\r\n");
      out.write("			<a href=\"Register.jsp\" class=\"register-link\">Register here</a>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
