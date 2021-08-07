<%-- 
    Document   : Home
    Created on : Feb 27, 2021, 9:09:44 AM
    Author     : mynameis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>

        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/trangchu.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    </head>
    <body>
        <!--Header-->
        <header>
            <div class="container">
                <div class="menu">
                    <div class="row" style="height: 100px">
                        <div class="col-md-4 text-left bg-info ">
                            <p class="my-md-4 text-light text-center">
                                <a href="login.jsp" style="font-family: monospace;color:#ffffff;text-decoration: none"><i class="fas fa-user-cog"></i>   Admin</a>


                            </p>

                        </div>
                        <div class="col-md-4 text-center bg-info">
                            <h2 class="my-md-3 site-title text-center">Online Store</h2>
                        </div>
                        <div class="col-md-4  bg-info">
                            <p class="my-md-4 header-links text-center">
                                <a href="login.jsp" style="font-family: monospace;color:#ffffff;text-decoration: none"><i class="far fa-user-circle"></i> Sign in</h6>|</a>
                                <a href="signup.jsp"style="font-family: monospace;color:#ffffff;text-decoration: none">Sign up <i class="fas fa-user-plus"></i></a>

                            </p>
                            <p class="my-md-4 header-links text-center text-light">
                                <i class="fa fa-phone mr-2"></i>SĐT +0966773851
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

                        <form class="form-inline my-2 my-lg-0" action="search" method="get">
                            <input class="form-control mr-sm-2" name="search" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>

                        </form>
                       

                        <a class="nav-link text-dark" href="myorder"><i class="fas fa-shopping-cart"></i></a>







                    </div>
                </nav>

            </div>


        </header>

        <!-- main contain product-->
        <main>
            <div class="container">
                <div class="logo-brand" style="margin-bottom: 20px">
                    <div id="demo" class="carousel slide" data-ride="carousel">

                        <div class="carousel-inner text-center bg-secondary">
                            <div class="carousel-item active">
                                <img src="image/iphone.png" alt="iphone" width="50%" height="400">
                            </div>
                            <div class="carousel-item">
                                <img src="image/samsung.png" alt="oppop" width="50%" height="400">

                            </div>
                            <div class="carousel-item">
                                <img src="image/oppo.png" alt="samsung" width="50%" height="400">
                            </div>
                        </div>

                        <!-- Left and right controls -->
                        <a class="carousel-control-next" href="#demo" data-slide="next">
                            <span class="carousel-control-next-icon"></span>
                        </a>
                        <a class="carousel-control-prev" href="#demo" data-slide="prev">
                            <span class="carousel-control-prev-icon"></span>
                        </a>

                    </div>
                </div>


            </div>
            <div class="container"style="margin-top: 20px">
                <div class="list-product bg-info">
                    <div class="row">

                        <div class="col-sm-4 lg-2">
                            <div class="card">
                                <img class="card-img-center" src="image/iphone1.PNG" alt="Card image" style="width:100%;height: 200px">
                                <div class="card-body">
                                    <h4 class="card-title text-dark">Iphone xs max</h4>
                                    <p class="card-text text-dark">dep meli</p>
                                    <a href="listPro?ctid=1" class="btn btn-primary">10$</a>
                                    <a href="#" class="btn btn-primary">gio hang</a>

                                </div>
                            </div>
                        </div>

                        <div class="col-sm-4 lg-2">
                            <div class="card">
                                <img class="card-img-center" src="image/op1.PNG" alt="Card image" style="width:100%;height: 200px">
                                <div class="card-body">
                                    <h4 class="card-title text-dark">OPPO</h4>
                                    <p class="card-text text-dark">chup sieu net</p>
                                    <a href="#" class="btn btn-primary">5$</a>
                                    <a href="#" class="btn btn-primary">gio hang</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-4 lg-2">
                            <div class="card">
                                <img class="card-img-center" src="image/op3.PNG" alt="Card image" style="width:100%;height: 200px">
                                <div class="card-body">
                                    <h4 class="card-title text-dark">OPPO sena</h4>
                                    <p class="card-text text-dark">chup me li</p>
                                    <a href="#" class="btn btn-primary">7</a>
                                    <a href="#" class="btn btn-primary">gio hang</a>

                                </div>
                            </div>
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
                                                            My shop is one of the best shop in viet nam.So many product that is luxury where is export from Americe and China

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
