package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <div class=\"row\" style=\"margin-left: 0px;margin-right: 0px;height: 100px\">\n");
      out.write("                        <div class=\"col-md-4 text-left bg-info \">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 text-center bg-info\">\n");
      out.write("                            <h2 class=\"my-md-3 site-title text-center\">Online Store</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4  bg-info\">\n");
      out.write("                            <p class=\"my-md-4 header-links text-center\">\n");
      out.write("                                <a href=\"login.jsp\" style=\"font-family: monospace;color:#ffffff\" text-light><i class=\"far fa-user-circle\"></i> Sign in|</a>\n");
      out.write("                                <a href=\"#\" style=\"font-family: monospace;color:#ffffff\">Sign up <i class=\"fas fa-user-plus\"></i></a>\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-xl navbar-light bg-light\">\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse position-sticky\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"listPro?ctid=1\">Iphone</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"listPro?ctid=3\">SamSung</a>\n");
      out.write("                            </li><li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"listPro?ctid=2\">Oppo</a>\n");
      out.write("                            </li><li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-dark\" href=\"#\">Vinsmart</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc==null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <a class=\"nav-link text-dark\" href=\"login.jsp\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
      out.write("                        </c:if>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"wrapper fadeInDown\"style=\"background: #bfbfbf\">\n");
      out.write("                    <div id=\"formContent\"style=\"margin-top: 20px;margin-bottom: 20px\">\n");
      out.write("                        <!-- Tabs Titles -->\n");
      out.write("\n");
      out.write("                        <!-- Icon -->\n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"fadeIn first\">\n");
      out.write("                            <h4 style=\"font-family: cursive;color: #660066\">Login</h4>\n");
      out.write("                            <img src=\"image/login.png\" id=\"icon\" alt=\"User Icon\" />\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            Cookie[] listCookie = request.getCookies();
                            String user = "";
                            String pass = "";
                            String rem = "";
                            int i = 0;

                            if (listCookie != null) {
                                while (i < listCookie.length) {
                                    if (listCookie[i].getName().equals("user")) {
                                        user = listCookie[i].getValue();
                                    }
                                    if (listCookie[i].getName().equals("pass")) {
                                        pass = listCookie[i].getValue();
                                    }
                                    if (listCookie[i].getName().equals("rem")) {
                                        rem = listCookie[i].getValue();
                                    }
                                    i++;
                                }
                            }


                        
      out.write("\n");
      out.write("                        <!-- Login Form -->\n");
      out.write("                        <form action=\"login\" method=\"post\">\n");
      out.write("                            <input type=\"text\" id=\"username\" class=\"fadeIn second\" name=\"username\" value=\"");
      out.print(user);
      out.write("\" placeholder=\"Enter your username\">\n");
      out.write("\n");
      out.write("                            <input type=\"password\" id=\"password\" class=\"fadeIn third\" name=\"password\" value=\"");
      out.print(pass);
      out.write("\"placeholder=\"Enter your password\">\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" id=\"rem\" class=\"fadeIn fourth\" name=\"remember\" value=\"ON\" ");
      out.print( "ON".equals(rem.trim()) ? "checked='checked'" : "");
      out.write("> Remember password\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" class=\"fadeIn five\" value=\"Log In\">\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Remind Passowrd -->\n");
      out.write("                        <div id=\"formFooter\">\n");
      out.write("                            <a class=\"underlineHover\" href=\"#\">Forgot Password?</a><br>\n");
      out.write("                            <h6>Bạn chưa có tài khoản\n");
      out.write("                                <a href=\"signup.jsp\">Sign up</a>\n");
      out.write("                            </h6>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <footer class=\"text-light container\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\" id=\"footer-color\"style=\"padding-top: 20px;\">\n");
      out.write("                    <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                        <h5>About</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <p class=\"mb-0\">\n");
      out.write("                            My shop is one of the best shop in viet nam.So many product that is luxury where is export from Americe and China\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Informations</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Trung tâm trợ giúp</a></li>\n");
      out.write("                            <li><a href=\"\">Tư Vấn Khách Hàng</a></li>\n");
      out.write("                            <li><a href=\"\">Chăm sóc khách hàng</a></li>\n");
      out.write("                            <li><a href=\"\">Chăm sóc bảo hành</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                        <h5>Others links</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"\">Giới Thiệu 1</a></li>\n");
      out.write("                            <li><a href=\"\">Điều Khoản Bảo mật 2</a></li>\n");
      out.write("                            <li><a href=\"\">Liên Hệ truyền Thông</a></li>\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                        <h5>Contact</h5>\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><i class=\"fa fa-home mr-2\"></i> My Shop</li>\n");
      out.write("                            <li><i class=\"fa fa-envelope mr-2\"></i> ngocquang2000fpt@gmail.com</li>\n");
      out.write("                            <li><i class=\"fa fa-phone mr-2\"></i> +0966773851</li>\n");
      out.write("                            <li><i class=\"fa fa-print mr-2\"></i> +https://www.facebook.com/</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
