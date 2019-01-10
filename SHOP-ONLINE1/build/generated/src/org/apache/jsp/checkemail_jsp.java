package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.Item;
import model.Cart;
import model.CategoryBean;
import dao.CategoryDAO;
import model.ProfileBean;

public final class checkemail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/header_tag.jsp");
    _jspx_dependants.add("/WEB-INF/brand_tag.jsp");
    _jspx_dependants.add("/WEB-INF/footer_tag.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/head_tag.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("CheckOut", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ProfileBean profileBean = (ProfileBean) session.getAttribute("user");
    CategoryDAO cat = new CategoryDAO();
    Cart cart = (Cart) session.getAttribute("cart");
    if (cart == null) {
        cart = new Cart();
        session.setAttribute("cart", cart);
    }

      out.write("\n");
      out.write("<!--header-->\n");
      out.write("<div class=\"header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\" logo\">\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"></a>\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"header-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-5 col-md-offset-2  header-login\">\n");
      out.write("                ");

                    if (session.getAttribute("user") == null) {
                
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"checkout.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <ul >\n");
      out.write("                    <li><a href=\"#\">Hello: ");
      out.print( profileBean.getName());
      out.write("</a></li>\n");
      out.write("                    <li><a href=\"ProcessLogout\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-5 header-social\">\t\t\n");
      out.write("                <ul >\n");
      out.write("                    <li><a href=\"#\"><i></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"ic1\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"ic2\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"ic3\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"ic4\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"head-top\">\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-8 col-md-offset-2 h_menu4\">\n");
      out.write("                <nav class=\"navbar nav_bottom\" role=\"navigation\">\n");
      out.write("\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header nav_2\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                    </div> \n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("                        <ul class=\"nav navbar-nav nav_1\">\n");
      out.write("                            <li><a class=\"color\" href=\"index.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"dropdown mega-dropdown active\">\n");
      out.write("                                <a class=\"color1\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Women<span class=\"caret\"></span></a>\t\t\t\t\n");
      out.write("                                <div class=\"dropdown-menu \" style=\"width: 33.7em;\">\n");
      out.write("                                    <div class=\"menu-top\">\n");
      out.write("                                        <div class=\"col1\">\n");
      out.write("                                            <div class=\"h_nav\">\n");
      out.write("                                                <h4>Category</h4>\n");
      out.write("                                                ");
for (CategoryBean cb : cat.getListCategory("women")) {
      out.write("\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"product.jsp?category=");
      out.print(cb.getCategoryId());
      out.write('"');
      out.write('>');
      out.print(cb.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                                </ul>\t\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </div>\t\t\t\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col1 col5\">\n");
      out.write("                                            <img src=\"images/me.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>                  \n");
      out.write("                                </div>\t\t\t\t\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown mega-dropdown active\">\n");
      out.write("                                <a class=\"color2\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Men<span class=\"caret\"></span></a>\t\t\t\t\n");
      out.write("                                <div class=\"dropdown-menu \" style=\"width: 33.7em;\">\n");
      out.write("                                    <div class=\"menu-top\">\n");
      out.write("                                        <div class=\"col1\">\n");
      out.write("                                            <div class=\"h_nav\">\n");
      out.write("                                                <h4>Category</h4>\n");
      out.write("                                                ");
for (CategoryBean cb : cat.getListCategory("men")) {
      out.write("\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"product.jsp?category=");
      out.print(cb.getCategoryId());
      out.write('"');
      out.write('>');
      out.print(cb.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                                </ul>\t\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </div>\t\t\t\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col1 col5\">\n");
      out.write("                                            <img src=\"images/me1.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>                  \n");
      out.write("                                </div>\t\t\t\t\n");
      out.write("                            </li>\n");
      out.write("                            <li><a class=\"color3\" href=\"product.jsp\">Sale</a></li>\n");
      out.write("                            <li><a class=\"color4\" href=\"404.jsp\">About</a></li>\n");
      out.write("                            <li><a class=\"color5\" href=\"typo.jsp\">Short Codes</a></li>\n");
      out.write("                            <li ><a class=\"color6\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2 search-right\">\n");
      out.write("                <ul class=\"heart\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"wishlist.jsp\" >\n");
      out.write("                            <span class=\"glyphicon glyphicon-heart\" aria-hidden=\"true\"></span>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li><a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><i class=\"glyphicon glyphicon-search\"> </i></a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"cart box_1\">\n");
      out.write("                    <a href=\"checkout.jsp\">\n");
      out.write("                        <h3> <div class=\"total\">\n");
      out.write("                                <span>$");
      out.print(cart.total());
      out.write("</span></div>\n");
      out.write("                            <img src=\"images/cart.png\" alt=\"\"/></h3>\n");
      out.write("                    </a>\n");
      out.write("                    <p><a href=\"checkout.jsp\" class=\"simpleCart_empty\">View Cart</a></p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("                <!----->\n");
      out.write("\n");
      out.write("                <!---pop-up-box---->\t\t\t\t\t  \n");
      out.write("                <link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("                <script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("                <!---//pop-up-box---->\n");
      out.write("                <div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("                    <form action=\"ProcessSearch\" name=\"search\" method=\"GET\">\n");
      out.write("                    <div class=\"search-top\">\n");
      out.write("                        <div class=\"login-search\">\n");
      out.write("                            <input type=\"submit\" value=\"\">\n");
      out.write("                            <input type=\"text\" value=\"Search..\" name=\"searchInput\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                        this.value = 'Search..';\n");
      out.write("                                    }\">\t\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <p>Shopin</p>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <script>\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        $('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("                            type: 'inline',\n");
      out.write("                            fixedContentPos: false,\n");
      out.write("                            fixedBgPos: true,\n");
      out.write("                            overflowY: 'auto',\n");
      out.write("                            closeBtnInside: true,\n");
      out.write("                            preloader: false,\n");
      out.write("                            midClick: true,\n");
      out.write("                            removalDelay: 300,\n");
      out.write("                            mainClass: 'my-mfp-zoom-in'\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                </script>\t\t\n");
      out.write("                <!----->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("        </div>\t\n");
      out.write("    </div>\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"banner-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Checkout</h1>\n");
      out.write("                <em></em>\n");
      out.write("                <h2><a href=\"index.jsp\">Home</a><label>/</label>Checkout</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <form name=\"checkout\" method=\"post\" action=\"ProcessCheckEmail\">\n");
      out.write("                    <div class=\"col-md-6 login-do\">\n");
      out.write("                        <p style=\"color:Tomato;\">Check in your email to receive a confirmation code from the system<p>\n");
      out.write("                            <div class=\"alert-danger\">\n");
      out.write("                           ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                            <br>\n");
      out.write("                        <span>Verification *</span>\n");
      out.write("                        <div class=\"login-mail\">\n");
      out.write("                            <input type=\"text\" required=\"\" placeholder=\"Input Verification\" name=\"randomcode\">\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <label class=\"hvr-skew-backward\">\n");
      out.write("                            <input type=\"submit\" value=\"Accept\">\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"brand\">\n");
      out.write("    <div class=\"col-md-3 brand-grid\">\n");
      out.write("        <img src=\"images/ic.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3 brand-grid\">\n");
      out.write("        <img src=\"images/ic1.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3 brand-grid\">\n");
      out.write("        <img src=\"images/ic2.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3 brand-grid\">\n");
      out.write("        <img src=\"images/ic3.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clearfix\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--//content-->\n");
      out.write("<!--//footer-->\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"footer-middle\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/log.png\" alt=\"\"></a>\n");
      out.write("                <p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\n");
      out.write("                <h6>Information</h6>\n");
      out.write("                <ul class=\" in\">\n");
      out.write("                    <li><a href=\"404.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"#\">Returns</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Site Map</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"in in1\">\n");
      out.write("                    <li><a href=\"#\">Order History</a></li>\n");
      out.write("                    <li><a href=\"wishlist.jsp\">Wish List</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\n");
      out.write("                <h6>Tags</h6>\n");
      out.write("                <ul class=\"tag-in\">\n");
      out.write("                    <li><a href=\"#\">Lorem</a></li>\n");
      out.write("                    <li><a href=\"#\">Sed</a></li>\n");
      out.write("                    <li><a href=\"#\">Ipsum</a></li>\n");
      out.write("                    <li><a href=\"#\">Contrary</a></li>\n");
      out.write("                    <li><a href=\"#\">Chunk</a></li>\n");
      out.write("                    <li><a href=\"#\">Amet</a></li>\n");
      out.write("                    <li><a href=\"#\">Omnis</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 footer-middle-in\">\n");
      out.write("                <h6>Newsletter</h6>\n");
      out.write("                <span>Sign up for News Letter</span>\n");
      out.write("                <form>\n");
      out.write("                    <input type=\"text\" value=\"Enter your E-mail\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                this.value = 'Enter your E-mail';\n");
      out.write("                            }\">\n");
      out.write("                    <input type=\"submit\" value=\"Subscribe\">\t\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ul class=\"footer-bottom-top\">\n");
      out.write("                <li><a href=\"#\"><img src=\"images/f1.png\" class=\"img-responsive\" alt=\"\"></a></li>\n");
      out.write("                <li><a href=\"#\"><img src=\"images/f2.png\" class=\"img-responsive\" alt=\"\"></a></li>\n");
      out.write("                <li><a href=\"#\"><img src=\"images/f3.png\" class=\"img-responsive\" alt=\"\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <p class=\"footer-class\">&copy; 2016 Shopin. All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--//footer-->\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--light-box-files -->\n");
      out.write("<script src=\"js/jquery.chocolat.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\n");
      out.write("<!--light-box-files -->\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("                        $(function () {\n");
      out.write("                            $('a.picture').Chocolat();\n");
      out.write("                        });\n");
      out.write("</script>\n");
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
