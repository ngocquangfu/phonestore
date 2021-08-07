<%-- 
    Document   : ProductDetail
    Created on : Mar 13, 2021, 3:44:20 PM
    Author     : mynameis
--%>

<%@page import="model.ProductDetail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Details</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/proDetail.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

        <script src="js/slider.js"></script>
    </head>
    <body>
        <!--Header-->
        <header>
            <div class="container">
                <div class="menu">
                    <div class="row" style="margin-left: 0px;margin-right: 0px;height: 100px">
                        <div class="col-md-4 text-left bg-info ">

                        </div>
                        <div class="col-md-4 text-center bg-info">
                            <h2 class="my-md-3 site-title text-center">Online Store</h2>
                        </div>
                        <div class="col-md-4  bg-info">
                            <p class="my-md-4 header-links text-center">
                                <a href="login.jsp" style="font-family: monospace;color:#ffffff" text-light><i class="far fa-user-circle"></i> Sign in|</a>
                                <a href="signup.jsp" style="font-family: monospace;color:#ffffff">Sign up <i class="fas fa-user-plus"></i></a>

                            </p>
                        </div>

                    </div> 
                </div>

            </div>


            <div class="container">

                <nav class="navbar navbar-expand-xl navbar-light bg-light">

                    <div class="collapse navbar-collapse position-sticky" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto">

                            <li class="nav-item active">
                                <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="listPro?ctid=1">Iphone</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-dark" href="listPro?ctid=3">SamSung</a>
                            </li><li class="nav-item">
                                <a class="nav-link text-dark" href="listPro?ctid=2">Oppo</a>
                            </li><li class="nav-item">
                                <a class="nav-link text-dark" href="#">Vinsmart</a>
                            </li>



                        </ul>

                        <form class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>

                        </form>
                        <c:if test="${sessionScope.acc==null}">
                            <a class="nav-link text-dark" href="login.jsp"><i class="fas fa-shopping-cart"></i></a>
                            </c:if>

                    </div>
                </nav>

            </div>
        </header>


        <main>

            <div class="container">
                <div class="card">
                    <div class="container-fluid">
                        <div class="wrapper row">
                            <%
                                if (request.getAttribute("product") != null) {
                                    ProductDetail p = (ProductDetail) request.getAttribute("product");
                                    String name = p.getName();
                                    String hdh = p.getHdh();
                                    double price = p.getPrice();
                                    String made = p.getMade();
                                    String ram = p.getRam();
                                    String image = p.getImage();


                            %>
                            <div class="preview col-md-6">

                                <div class="preview-pic tab-content" >
                                    <div >
                                        <img src="" id="image" height="400px" >
                                    </div>
                                </div>


                                <ul class="preview-thumbnail nav nav-tabs">
                                    <c:forEach items="${prodetail}" var="p">
                                        <li class="active">
                                            <a data-target="#${p.id}" data-toggle="tab" >
                                                <img src="${p.image}"onclick="zoomout(this)"/>
                                            </a></li>
                                        </c:forEach>




                                </ul>


                            </div>
                            <div class="details col-md-6 text-dark" style="font-family: monospace">



                                <h3 class="product-title">Product Name:<%=name%></h3>
                                <div class="rating">
                                    <div class="stars">
                                        <h5>Ram:<%=ram%>GB </h5>
                                    </div>
                                    <div>
                                        <p class="product-description"><h5>Hệ Điều Hành :<%=hdh%></h5>

                                    </div>
                                    <div>
                                        <h5>Made in:<%=made%></h5>
                                        <h5 class="prices">Current price: <span><%=price%>$</span></h5>

                                    </div>



                                    <h5>Quantity: </h5>
                                    <div class="col-sm4 row text-right" style="margin-left: 0px">
                                         <button onclick="quantity(false)"><i class="fas fa-minus" ></i></button>
                                       
                                            
                                            <input min="0" type="number" name="quantity" id="num" readonly value="${quantity}" style="width: 50px;text-align: center;height: 30px">
                                        
                                        <button onclick="quantity(true)"><i class="fas fa-plus"></i></a></button>
                                    </div>
                                    




                                </div>
                                <div class="action">
                                    <button type="button" class="btn btn-success">
                                        <a href="cart?pid=${id}&quantity=1"style="color:#ffffff;text-decoration: none" id="sender">
                                            <i class="fas fa-shopping-cart"></i> Add Cart
                                        </a>
                                    </button>

                                    


                                </div>


                            </div>
                            <%
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>

        </main>

        <div class="container footer">
            <!-- Footer -->
            <footer class="text-light">
                <div class="container">
                    <div class="row" style="padding-top: 20px;">
                        <div class="col-md-3 col-lg-4 col-xl-3">
                            <h5>About</h5>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <p class="mb-0">
                                
                                Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.
                            </p>
                        </div>

                        <div class="col-md-2 col-lg-2 col-xl-2 mx-auto">
                            <h5>Informations</h5>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <ul class="list-unstyled">

                                <li><a href="" style="font-size: 15px">Trung Tam Tro Giup</a></li>
                                <li><a href="" style="font-size: 15px">Tu Van Khach Hang</a></li>
                                <li><a href="" style="font-size: 15px">Cham Soc Khach Hang</a></li>
                                <li><a href="" style="font-size: 15px">Cham Soc Bao Hanh</a></li>

                            </ul>
                        </div>

                        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
                            <h5>Others links</h5>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <ul class="list-unstyled">
                                <li><a href="" style="font-size: 15px">Giới Thiệu 1</a></li>
                                <li><a href="" style="font-size: 15px">Điều Khoản Bảo Mật</a></li>
                                <li><a href="" style="font-size: 15px">Liên Hệ Truyền Thông</a></li>
                                <li><a href="" style="font-size: 15px"></a></li>

                                <
                            </ul>
                        </div>

                        <div class="col-md-4 col-lg-3 col-xl-3">
                            <h5>Contact</h5>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-home mr-2"></i> My Shop</li>
                                <li><i class="fa fa-envelope mr-2"></i> ngocquang2000fpt@gmail.com</li>
                                <li><i class="fa fa-phone mr-2"></i> +0966773851</li>
                                <li><i class="fa fa-print mr-2"></i> +https://www.facebook.com/</li>
                            </ul>
                        </div>

                    </div>
                </div>
            </footer>



        </div>


    </body>

</html>
