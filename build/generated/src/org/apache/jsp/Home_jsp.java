package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/trangchu.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Header-->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <div class=\"row\" style=\"height: 100px\">\n");
      out.write("                        <div class=\"col-md-4 text-left bg-info \">\n");
      out.write("                            <p class=\"my-md-4 text-light text-center\">\n");
      out.write("                                <a href=\"login.jsp\" style=\"font-family: monospace;color:#ffffff;text-decoration: none\"><i class=\"fas fa-user-cog\"></i>   Admin</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 text-center bg-info\">\n");
      out.write("                            <h2 class=\"my-md-3 site-title text-center\">Online Store</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4  bg-info\">\n");
      out.write("                            <p class=\"my-md-4 header-links text-center\">\n");
      out.write("                                <a href=\"login.jsp\" style=\"font-family: monospace;color:#ffffff;text-decoration: none\"><i class=\"far fa-user-circle\"></i> Sign in</h6>|</a>\n");
      out.write("                                <a href=\"signup.jsp\"style=\"font-family: monospace;color:#ffffff;text-decoration: none\">Sign up <i class=\"fas fa-user-plus\"></i></a>\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                            <p class=\"my-md-4 header-links text-center text-light\">\n");
      out.write("                                <i class=\"fa fa-phone mr-2\"></i>SĐT +0966773851\n");
      out.write("                            </p>\n");
      out.write("\n");
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
      out.write("                        <form class=\"form-inline my-2 my-lg-0\" action=\"search\" method=\"get\">\n");
      out.write("                            <input class=\"form-control mr-sm-2\" name=\"search\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <a class=\"nav-link text-dark\" href=\"myorder\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- main contain product-->\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"logo-brand\" style=\"margin-bottom: 20px\">\n");
      out.write("                    <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("                        <div class=\"carousel-inner text-center bg-secondary\">\n");
      out.write("                            <div class=\"carousel-item active\">\n");
      out.write("                                <img src=\"image/iphone.png\" alt=\"iphone\" width=\"50%\" height=\"400\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item\">\n");
      out.write("                                <img src=\"image/samsung.png\" alt=\"oppop\" width=\"50%\" height=\"400\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item\">\n");
      out.write("                                <img src=\"image/oppo.png\" alt=\"samsung\" width=\"50%\" height=\"400\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Left and right controls -->\n");
      out.write("                        <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("                            <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("                            <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\"style=\"margin-top: 20px\">\n");
      out.write("                <div class=\"list-product bg-info\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-4 lg-2\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <img class=\"card-img-center\" src=\"image/iphone1.PNG\" alt=\"Card image\" style=\"width:100%;height: 200px\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4 class=\"card-title text-dark\">Iphone xs max</h4>\n");
      out.write("                                    <p class=\"card-text text-dark\">dep meli</p>\n");
      out.write("                                    <a href=\"listPro?ctid=1\" class=\"btn btn-primary\">10$</a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">gio hang</a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-4 lg-2\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <img class=\"card-img-center\" src=\"image/op1.PNG\" alt=\"Card image\" style=\"width:100%;height: 200px\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4 class=\"card-title text-dark\">OPPO</h4>\n");
      out.write("                                    <p class=\"card-text text-dark\">chup sieu net</p>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">5$</a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">gio hang</a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4 lg-2\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <img class=\"card-img-center\" src=\"image/op3.PNG\" alt=\"Card image\" style=\"width:100%;height: 200px\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h4 class=\"card-title text-dark\">OPPO sena</h4>\n");
      out.write("                                    <p class=\"card-text text-dark\">chup me li</p>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">7</a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">gio hang</a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        <div class=\"container footer\">\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer class=\"text-light\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\" style=\"padding-top: 20px;\">\n");
      out.write("                        <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                            <h5>About</h5>\n");
      out.write("                            <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                            <p class=\"mb-0\">\n");
      out.write("                                                            My shop is one of the best shop in viet nam.So many product that is luxury where is export from Americe and China\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                            <h5>Informations</h5>\n");
      out.write("                            <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                            <ul class=\"list-unstyled\">\n");
      out.write("\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Trung Tam Tro Giup</a></li>\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Tu Van Khach Hang</a></li>\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Cham Soc Khach Hang</a></li>\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Cham Soc Bao Hanh</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                            <h5>Others links</h5>\n");
      out.write("                            <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                            <ul class=\"list-unstyled\">\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Giới Thiệu 1</a></li>\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Điều Khoản Bảo Mật</a></li>\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\">Liên Hệ Truyền Thông</a></li>\n");
      out.write("                                <li><a href=\"\" style=\"font-size: 15px\"></a></li>\n");
      out.write("\n");
      out.write("                                <\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                            <h5>Contact</h5>\n");
      out.write("                            <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                            <ul class=\"list-unstyled\">\n");
      out.write("                                <li><i class=\"fa fa-home mr-2\"></i> My Shop</li>\n");
      out.write("                                <li><i class=\"fa fa-envelope mr-2\"></i> ngocquang2000fpt@gmail.com</li>\n");
      out.write("                                <li><i class=\"fa fa-phone mr-2\"></i> +0966773851</li>\n");
      out.write("                                <li><i class=\"fa fa-print mr-2\"></i> +https://www.facebook.com/</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
