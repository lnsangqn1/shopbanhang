<%-- 
    Document   : product_single_tag
    Created on : Dec 14, 2018, 3:39:38 PM
    Author     : Sinh
--%>
<%@page import="model.Cart"%>
<%@page import="model.ProductBean"%>
<%@page import="dao.ProductDAO"%>
<%
    ProductDAO productDao = new ProductDAO();
    ProductBean b = new ProductBean();
    String ProductId = "";
    if (request.getParameter("ProductId") != null) {
        ProductId = request.getParameter("ProductId");
        b = productDao.getProductById(Integer.parseInt(ProductId));
    }    
%>
<div class="single">

    <div class="container">
        <div class="col-md-9">
            <div class="col-md-5 grid">		
                <div class="flexslider">
                    <ul class="slides">
                        <li data-thumb="<%=b.getProductImage()%>">
                            <div class="thumb-image"> <img src="<%=b.getProductImage()%>" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="<%=b.getProductImage2()%>">
                            <div class="thumb-image"> <img src="<%=b.getProductImage2()%>" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="<%=b.getProductImage3()%>">
                            <div class="thumb-image"> <img src="<%=b.getProductImage3()%>" data-imagezoom="true" class="img-responsive"> </div>
                        </li> 
                    </ul>
                </div>
            </div>	

<div class="col-md-7 single-top-in">
    <div class="span_2_of_a1 simpleCart_shelfItem">
        <h3><%= b.getProductName()%></h3>
        <p class="in-para"> <%= b.getProductMore()%></p>
        <div class="price_single">
            <span class="reducedfrom item_price">$<%= b.getProductPrice()%></span>
            <a href="#">click for offer</a>
            <div class="clearfix"></div>
        </div>
        <h4 class="quick">Quick Overview:</h4>
        <p class="quick_desc"><%= b.getProductOverview()%></p>
        <div class="wish-list">
            <ul>
                <li class="wish"><a href="#"><span class="glyphicon glyphicon-check" aria-hidden="true"></span>Add to Wishlist</a></li>
                <li class="compare"><a href="#"><span class="glyphicon glyphicon-resize-horizontal" aria-hidden="true"></span>Add to Compare</a></li>
            </ul>
        </div>

        <div class="quantity"> 
            <div class="quantity-select">                           
                <div class="entry value-minus">&nbsp;</div>
                <div class="entry value"><span>1</span></div>
                <div class="entry value-plus active">&nbsp;</div>
            </div>
        </div>
        <!--quantity-->
        <script>
            $('.value-plus').on('click', function () {
                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) + 1;
                divUpd.text(newVal);
            });

            $('.value-minus').on('click', function () {
                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) - 1;
                if (newVal >= 1)
                    divUpd.text(newVal);
            });
        </script>
        <!--quantity-->
        <a href="ProcessCart?command=plus&ProductId=<%=b.getProductId()%>" class="add-to item_add hvr-skew-backward">Add to cart</a>
        <div class="clearfix"> </div>
    </div>

</div>
<div class="clearfix"> </div>
<!---->
<div class="tab-head">
    <nav class="nav-sidebar">
        <ul class="nav tabs">
            <li class="active"><a href="#tab1" data-toggle="tab">Product Description</a></li>
            <li class=""><a href="#tab2" data-toggle="tab">Additional Information</a></li> 
            <li class=""><a href="#tab3" data-toggle="tab">Reviews</a></li>  
        </ul>
    </nav>
    <div class="tab-content one">
        <div class="tab-pane active text-style" id="tab1">
            <div class="facts">
                <p ><%= b.getProductDescription()%></p>
                <ul>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Research</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Design and Development</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Porting and Optimization</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>System integration</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Verification, Validation and Testing</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Maintenance and Support</li>
                </ul>         
            </div>

        </div>
        <div class="tab-pane text-style" id="tab2">

            <div class="facts">									
                <p > Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections </p>
                <ul >
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Multimedia Systems</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Digital media adapters</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Set top boxes for HDTV and IPTV Player  </li>
                </ul>
            </div>	

        </div>
        <div class="tab-pane text-style" id="tab3">

            <div class="facts">
                <p > There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined </p>
                <ul>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Research</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Design and Development</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Porting and Optimization</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>System integration</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Verification, Validation and Testing</li>
                    <li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Maintenance and Support</li>
                </ul>     
            </div>	

        </div>

    </div>
    <div class="clearfix"></div>
</div>
<!---->	
</div>
<!----->

<div class="col-md-3 product-bottom product-at">