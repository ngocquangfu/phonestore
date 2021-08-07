package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ProductDetail;

public final class ProductDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Details</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/proDetail.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"js/slider.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--Header-->\n");
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
      out.write("                                <a href=\"signup.jsp\" style=\"font-family: monospace;color:#ffffff\">Sign up <i class=\"fas fa-user-plus\"></i></a>\n");
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
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"wrapper row\">\n");
      out.write("                            ");

                                if (request.getAttribute("product") != null) {
                                    ProductDetail p = (ProductDetail) request.getAttribute("product");
                                    String name = p.getName();
                                    String hdh = p.getHdh();
                                    double price = p.getPrice();
                                    String made = p.getMade();
                                    String ram = p.getRam();
                                    String image = p.getImage();


                            
      out.write("\n");
      out.write("                            <div class=\"preview col-md-6\">\n");
      out.write("\n");
      out.write("                                <div class=\"preview-pic tab-content\" >\n");
      out.write("                                    <div >\n");
      out.write("                                        <img src=\"\" id=\"image\" height=\"400px\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <ul class=\"preview-thumbnail nav nav-tabs\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"details col-md-6 text-dark\" style=\"font-family: monospace\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <h3 class=\"product-title\">Product Name:");
      out.print(name);
      out.write("</h3>\n");
      out.write("                                <div class=\"rating\">\n");
      out.write("                                    <div class=\"stars\">\n");
      out.write("                                        <h5>Ram:");
      out.print(ram);
      out.write("GB </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <p class=\"product-description\"><h5>Hệ Điều Hành :");
      out.print(hdh);
      out.write("</h5>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5>Made in:");
      out.print(made);
      out.write("</h5>\n");
      out.write("                                        <h5 class=\"prices\">Current price: <span>");
      out.print(price);
      out.write("$</span></h5>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <h5>Quantity: </h5>\n");
      out.write("                                    <div class=\"col-sm4 row text-right\" style=\"margin-left: 0px\">\n");
      out.write("                                        <button onclick=\"quantity(false)\"><i class=\"fas fa-minus\" ></i></button>\n");
      out.write("                                       \n");
      out.write("                                            \n");
      out.write("                                            <input min=\"0\" type=\"number\" name=\"quantity\" id=\"num\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 50px;text-align: center;height: 30px\">\n");
      out.write("                                        \n");
      out.write("                                        <button onclick=\"quantity(true)\"><i class=\"fas fa-plus\"></i></a></button>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"action\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-success\">\n");
      out.write("                                        <a href=\"cart?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&&quantity=1\"style=\"color:#ffffff;text-decoration: none\" id=\"sender\">\n");
      out.write("                                            <i class=\"fas fa-shopping-cart\"></i> Add Cart\n");
      out.write("                                        </a>\n");
      out.write("                                    </button>\n");
      out.write("\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-info\">Buy</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <div class=\"container footer\">\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer class=\"text-light\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\" style=\"padding-top: 20px;\">\n");
      out.write("                        <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                            <h5>About</h5>\n");
      out.write("                            <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                            <p class=\"mb-0\">\n");
      out.write("                                Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.\n");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a class=\"nav-link text-dark\" href=\"login.jsp\"><i class=\"fas fa-shopping-cart\"></i></a>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <li class=\"active\">\n");
          out.write("                                            <a data-target=\"#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-toggle=\"tab\" >\n");
          out.write("                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"onclick=\"zoomout(this)\"/>\n");
          out.write("                                            </a></li>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
