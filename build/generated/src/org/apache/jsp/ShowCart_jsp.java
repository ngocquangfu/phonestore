package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add cart</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/addcart.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"js/slider.js\"></script>\n");
      out.write("\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <section class=\"jumbotron text-center\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1 class=\"jumbotron-heading\">E-COMMERCE CART</h1>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container mb-4\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"table table-striped table-\">\n");
      out.write("                            <thead >\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">ID</th>\n");
      out.write("                                    <th scope=\"col\">Image</th>\n");
      out.write("                                    <th scope=\"col\">Product</th>\n");
      out.write("                                    <th scope=\"col\">Quantity</th>\n");
      out.write("                                    <th scope=\"col\" class=\"text-right\">Price</th>\n");
      out.write("                                    <th class=\"text-right\">Delete</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody style=\"width:100%\">\n");
      out.write("                                ");
int t=1;
      out.write("\n");
      out.write("                                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myorder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("m");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                <tr style=\"width:100%\">\n");
            out.write("                                    \n");
            out.write("                                        <td>");
            out.print(t++);
            out.write("</td>\n");
            out.write("                                        <td><img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" height=\"50px\" width=\"50px\"/> </td>\n");
            out.write("                                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td>\n");
            out.write("                                             <button class=\"subBtn\"><i class=\"fas fa-minus\" ></i></button>\n");
            out.write("                                       \n");
            out.write("                                            \n");
            out.write("                                                <input min=\"0\" type=\"number\"id=\"number\" name=\"quantity\" class=\"num\" readonly value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" style=\"width: 50px;text-align: center;height: 30px\">\n");
            out.write("                                        \n");
            out.write("                                        <button class=\"addBtn\"><i class=\"fas fa-plus\"></i></a></button>\n");
            out.write("                                        </td>\n");
            out.write("                                        <td class=\"text-right\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                        <td class=\"text-right\"><button class=\"btn btn-sm btn-danger text-light\"><a href=\"delete?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&oid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"><i class=\"fa fa-trash\"></i></a> </button> </td>\n");
            out.write("                                   \n");
            out.write("                                    \n");
            out.write("                                </tr>\n");
            out.write("                                ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    \n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td>Sub-Total</td>\n");
      out.write("                                    <td class=\"text-right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    \n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td>Shipping</td>\n");
      out.write("                                    <td class=\"text-right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ship}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("$</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td><strong>Total</strong></td>\n");
      out.write("                                    <td class=\"text-right\"><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${all}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col mb-2\">\n");
      out.write("                    <div class=\"row text-center\">\n");
      out.write("                        <div class=\"col-sm-12  col-md-12 text-center\"style=\"text-align: center\">\n");
      out.write("                            <button class=\"btn btn-lg btn-block btn-success \"style=\"width: 300px\"><a href=\"Home.jsp\">hello</a></button>\n");
      out.write("                            <button class=\"btn btn-lg btn-block btn-success text-uppercase\"style=\"width: 300px\"><a href=\"\"></a>Buy</button>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("                            <h5 >Contact</h5>\n");
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
        out.write("                        ");
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
}
