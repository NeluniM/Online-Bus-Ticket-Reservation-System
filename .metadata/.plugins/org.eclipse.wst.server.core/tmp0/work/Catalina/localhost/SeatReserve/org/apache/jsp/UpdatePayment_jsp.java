/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-19 12:40:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdatePayment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("		* {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html, body {\r\n");
      out.write("    height: 100%; /* Ensure the body takes full viewport height */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    line-height: 1.6;\r\n");
      out.write("    background-color: #f4f4f4;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Container */\r\n");
      out.write(".container {\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    max-width: 1200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Header Styles */\r\n");
      out.write("header {\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 10px 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    z-index: 10;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header h1 {\r\n");
      out.write("    float: left;\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header nav ul {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    float: right;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header nav ul li {\r\n");
      out.write("    display: inline;\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header nav ul li a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header nav ul li a:hover {\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("		\r\n");
      out.write("       /* Hero Section Styles */\r\n");
      out.write(".hero {\r\n");
      out.write("    background: url('css/Bus.jpg') no-repeat center center/cover;\r\n");
      out.write("    min-height: 100vh; /* Ensure the hero section covers full viewport height */\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero h2 {\r\n");
      out.write("    font-size: 3rem;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero p {\r\n");
      out.write("    font-size: 1.2rem;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero .btn {\r\n");
      out.write("    background-color: #ff6b6b;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero .btn:hover {\r\n");
      out.write("    background-color: #ff4a4a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Booking Form Section */\r\n");
      out.write("#booking-form {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    padding: 30px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    min-height: calc(100vh - 60px); /* Ensures form section covers remaining viewport height */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#booking-form h3 {\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    font-size: 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group {\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group input,\r\n");
      out.write("button {\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    max-width: 300px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.btn {\r\n");
      out.write("    background-color: #ff6b6b;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.btn:hover {\r\n");
      out.write("    background-color: #ff4a4a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Login and Registration Section Styles */\r\n");
      out.write(".login-section {\r\n");
      out.write("    background: url('css/Bus.jpg') no-repeat center center/cover;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    min-height: 100vh; /* Ensure login and registration sections take full viewport height */\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: white;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section::before {\r\n");
      out.write("    content: '';\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color: rgba(0, 0, 0, 0.5); /* Overlay for better text readability */\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section h2,\r\n");
      out.write(".login-section form,\r\n");
      out.write(".login-section p {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    z-index: 2; /* Ensure the content is above the overlay */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section h2 {\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    font-size: 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section form {\r\n");
      out.write("    max-width: 400px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    background: rgba(255, 255, 255, 0.8);\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section .form-group {\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section .form-group label {\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section .form-group input,\r\n");
      out.write(".login-section .form-group textarea {\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    font-size: 1rem;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section .form-group textarea {\r\n");
      out.write("    resize: none; /* Disable textarea resizing */\r\n");
      out.write("    height: 150px; /* Set a specific height for feedback text area */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section button.btn {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    background-color: #ff6b6b;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    font-size: 1.1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section button.btn:hover {\r\n");
      out.write("    background-color: #ff4a4a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section p {\r\n");
      out.write("    margin-top: 15px;\r\n");
      out.write("    font-size: 0.9rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section p a {\r\n");
      out.write("    color: #ff6b6b;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-section p a:hover {\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("/* Footer Section */\r\n");
      out.write("footer {\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    bottom: 0;\r\n");
      out.write("    z-index: 10;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer p {\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer .social-links {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer .social-links li {\r\n");
      out.write("    margin: 0 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer .social-links li a {\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer .social-links li a:hover {\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive Design */\r\n");
      out.write("@media (max-width: 768px) {\r\n");
      out.write("    header h1 {\r\n");
      out.write("        float: none;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header nav ul {\r\n");
      out.write("        float: none;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header nav ul li {\r\n");
      out.write("        display: block;\r\n");
      out.write("        margin: 10px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .hero h2 {\r\n");
      out.write("        font-size: 2rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .hero p {\r\n");
      out.write("        font-size: 1rem;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-section form {\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("    \r\n");
      out.write("    </style>\r\n");
      out.write("    <title>SeatReserve | Update Payment</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>SeatReserve</h1>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"homepage.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"log.jsp\">Book a Ticket</a></li>\r\n");
      out.write("                    <li><a href=\"feedback.jsp\">Feedback</a></li>\r\n");
      out.write("                    <li><a href=\"aboutus.jsp\">About Us</a></li>\r\n");
      out.write("                    <li><a href=\"contactus.jsp\">Contact</a></li>\r\n");
      out.write("                    <li><a href=\"logoutServlet\">Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    ");

    String pid = request.getParameter("pid");
    String passenger_name = request.getParameter("passenger_name");
    String card_number = request.getParameter("card_number");
    String CVV_code = request.getParameter("CVV_code");
    String expire_date = request.getParameter("expire_date");
    String email = request.getParameter("email");
    String payment_amount = request.getParameter("payment_amount");
    
      out.write("\r\n");
      out.write("	<section class=\"login-section\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("    <h2>Update Payment Details</h2>\r\n");
      out.write("    <form action=\"UpdatePayServlet\" method=\"post\">\r\n");
      out.write("        <!-- Card_holder Information -->\r\n");
      out.write("        <div class=\"form-group\"><label for=\"passengerName\">ID:</label>\r\n");
      out.write("        <input type=\"text\" id=\"pid\" name=\"pid\" value=\"");
      out.print( pid );
      out.write("\" required readonly></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\"><label for=\"passengerName\">Passenger Name:</label>\r\n");
      out.write("        <input type=\"text\" id=\"passengerName\" name=\"passengerName\" value=\"");
      out.print( passenger_name );
      out.write("\" required></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\"><label for=\"email\">Email:</label>\r\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}\" value=\"");
      out.print( email );
      out.write("\" required></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\"><!-- Card Details -->\r\n");
      out.write("        <label for=\"cardNumber\">Card Number:</label>\r\n");
      out.write("        <input type=\"text\" id=\"cardNumber\" name=\"cardNumber\" pattern=\"\\d{13,19}\" title=\"Card number must be between 13 and 19 digits\" value=\"");
      out.print( card_number );
      out.write("\" required></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\"><label for=\"cvv\">CVV:</label>\r\n");
      out.write("        <input type=\"text\" id=\"cvv\" name=\"cvv\" pattern=\"\\d{3,4}\" title=\"CVV must be 3 or 4 digits\" value=\"");
      out.print( CVV_code );
      out.write("\" required></div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\"><label for=\"expiryDate\">Expiry Date (MM/YY):</label>\r\n");
      out.write("        <input type=\"text\" id=\"expiryDate\" name=\"expiryDate\" value=\"");
      out.print( expire_date );
      out.write("\" pattern=\"(0[1-9]|1[0-2])\\/[0-9]{2}\" title=\"Enter a valid date in MM/YY format\" placeholder=\"MM/YY\" required></div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\"><label for=\"paymentAmount\">Payment Amount:</label>\r\n");
      out.write("        <input type=\"text\" id=\"paymentAmount\" name=\"paymentAmount\" value=\"");
      out.print( payment_amount );
      out.write("\" placeholder=\"LKR/Rs.\" required></div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- Submit Button (Updated) -->\r\n");
      out.write("        <button type=\"submit\" name= \"submit\" class=\"btn\" value=\"Update Payment Details\">Update Payment Details</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("	</section>\r\n");
      out.write("    	<footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p>&copy; 2024 SeatReserve. All rights reserved.</p>\r\n");
      out.write("            <ul class=\"social-links\">\r\n");
      out.write("                <li><a href=\"#\">Facebook</a></li>\r\n");
      out.write("                <li><a href=\"#\">Twitter</a></li>\r\n");
      out.write("                <li><a href=\"#\">Instagram</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
