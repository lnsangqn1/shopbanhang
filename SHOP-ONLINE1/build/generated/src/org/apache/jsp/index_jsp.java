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
import dao.CategoryDAO;
import model.Cart;
import model.ProductBean;
import dao.ProductDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/WEB-INF/header_tag.jsp");
    _jspx_dependants.add("/WEB-INF/banner_tag.jsp");
    _jspx_dependants.add("/WEB-INF/content_tag.jsp");
    _jspx_dependants.add("/WEB-INF/products_tag.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/head_tag.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Index", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--header-->\r\n");
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
      out.write("\r\n");
      out.write("        <!--banner-->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!--banner-->\n");
      out.write("<div class=\"banner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <section class=\"rw-wrapper\">\n");
      out.write("            <h1 class=\"rw-sentence\">\n");
      out.write("                <span>Fashion &amp; Beauty</span>\n");
      out.write("                <div class=\"rw-words rw-words-1\">\n");
      out.write("                    <span>Beautiful Designs</span>\n");
      out.write("                    <span>Sed ut perspiciatis</span>\n");
      out.write("                    <span> Totam rem aperiam</span>\n");
      out.write("                    <span>Nemo enim ipsam</span>\n");
      out.write("                    <span>Temporibus autem</span>\n");
      out.write("                    <span>intelligent systems</span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"rw-words rw-words-2\">\n");
      out.write("                    <span>We denounce with right</span>\n");
      out.write("                    <span>But in certain circum</span>\n");
      out.write("                    <span>Sed ut perspiciatis unde</span>\n");
      out.write("                    <span>There are many variation</span>\n");
      out.write("                    <span>The generated Lorem Ipsum</span>\n");
      out.write("                    <span>Excepteur sint occaecat</span>\n");
      out.write("                </div>\n");
      out.write("            </h1>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("        <!--content-->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"content-top\">\n");
      out.write("            <div class=\"col-md-6 col-md\">\n");
      out.write("                <div class=\"col-1\">\n");
      out.write("                    <a href=\"product.jsp?category=wdresses\" class=\"b-link-stroke b-animate-go  thickbox\">\n");
      out.write("                        <img src=\"images/pi.jpg\" class=\"img-responsive\" alt=\"\"/><div class=\"b-wrapper1 long-img\"><p class=\"b-animate b-from-right    b-delay03 \">Lorem ipsum</p><label class=\"b-animate b-from-right    b-delay03 \"></label><h3 class=\"b-animate b-from-left    b-delay03 \">Trendy</h3></div></a>\n");
      out.write("\n");
      out.write("                    <!---<a href=\"single.jsp\"><img src=\"images/pi.jpg\" class=\"img-responsive\" alt=\"\"></a>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                    <span>Hot Deal</span>\n");
      out.write("                    <h2><a href=\"product.jsp?category=wdresses\">Luxurious &amp; Trendy</a></h2>\n");
      out.write("                    <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years</p>\n");
      out.write("                    <a href=\"product.jsp?category=wdresses\" class=\"buy-now\">Buy Now</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 col-md1\">\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <a href=\"product.jsp?category=mclothes\"><img src=\"images/pi1.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"col-pic\">\n");
      out.write("                            <p>Lorem Ipsum</p>\n");
      out.write("                            <label></label>\n");
      out.write("                            <h5>For Men</h5>\n");
      out.write("                        </div></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <a href=\"product.jsp?category=mja_co\"><img src=\"images/pi2.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"col-pic\">\n");
      out.write("                            <p>Lorem Ipsum</p>\n");
      out.write("                            <label></label>\n");
      out.write("                            <h5>For Kids</h5>\n");
      out.write("                        </div></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <a href=\"product.jsp?category=wclothes\"><img src=\"images/pi3.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        <div class=\"col-pic\">\n");
      out.write("                            <p>Lorem Ipsum</p>\n");
      out.write("                            <label></label>\n");
      out.write("                            <h5>For Women</h5>\n");
      out.write("                        </div></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("        </div>\n");
      out.write("\r\n");
      out.write("        <!--products-->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 ProductDAO dao = new ProductDAO();
CategoryDAO catd = new CategoryDAO();

      out.write("\n");
      out.write("<div class=\"content-mid\">\n");
      out.write("    <h3>Trending Items</h3>\n");
      out.write("    <label class=\"line\"></label>\n");
      out.write("    <div class=\"mid-popular\">\n");
      out.write("        ");
 for (ProductBean b : dao.getProductTop()) {
      out.write("\n");
      out.write("        <div class=\"col-md-4 item-grid1 simpleCart_shelfItem\">\n");
      out.write("            <div class=\" mid-pop\">\n");
      out.write("                <div class=\"pro-img\">\n");
      out.write("                    <img src=\"");
      out.print(b.getProductImage());
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                    <div class=\"zoom-icon \">\n");
      out.write("                        <a class=\"picture\" href=\"");
      out.print(b.getProductImage());
      out.write("\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\n");
      out.write("                        <a href=\"single.jsp?ProductId=");
      out.print(b.getProductId());
      out.write("\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mid-1\">\n");
      out.write("                    <div class=\"women\">\n");
      out.write("                        <div class=\"women-top\">\n");
      out.write("                            <span>");
      out.print(catd.getCategoryName(b.getCategoryId()));
      out.write("</span>\n");
      out.write("                            <h6><a href=\"single.jsp?ProductId=");
      out.print(b.getProductId());
      out.write('"');
      out.write('>');
      out.print(b.getProductName());
      out.write("</a></h6>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"img item_add\">\n");
      out.write("                            <a href=\"ProcessCart?command=plus&ProductId=");
      out.print(b.getProductId());
      out.write("\"><img src=\"images/ca.png\" alt=\"\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mid-2\">\n");
      out.write("                        <p ><label>$");
      out.print(b.getProductPrice());
      out.write("</label></p>\n");
      out.write("                        <div class=\"block\">\n");
      out.write("                            <div class=\"starbox small ghosting\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"clearfix\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("     \r\n");
      out.write("        <!--//products-->\r\n");
      out.write("        <!--brand-->\r\n");
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
      out.write("\r\n");
      out.write("        <!--//brand-->\r\n");
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
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
