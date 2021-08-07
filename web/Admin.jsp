<%-- 
    Document   : BuyProductDetail
    Created on : Mar 17, 2021, 7:08:25 PM
    Author     : mynameis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy Product</title>
        <link rel="stylesheet" href="css/buypro.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=RocknRoll+One&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

    </head>
    <body>

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

        <div class="main">
            <div class="container">
                <section class="jumbotron text-center">
                    <div class="container">
                        <h1 class="jumbotron-heading">ADMIN MANAGE</h1>


                        <form class="form-inline my-2 my-lg-0" action="deletePro" method="get" style="padding-left: 370px">
                            <input class="form-control mr-sm-2" name="proid" type="search" placeholder="Enter ProductID" aria-label="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Delete</button>




                        </form>

                    </div>
                </section>
            </div>
            <div class="container">
                <section>

                    <div class="row">

                        <div class="col-lg-8 mb-4">

                            <div class="card wish-list pb-1">
                                <div class="card-body">




                                    <div class="row">
                                        <form action="addpro" method="get">
                                            <div class="col-lg-6">

                                                <div class="md-form md-outline mb-0" style="width: 400px">
                                                    Product Name
                                                    <input type="text" name="proname" class="form-control mb-0 mb-lg-2">
                                                    Made In

                                                    <input type="text" name="madein" class="form-control mb-0 mb-lg-2">
                                                    Ram Space
                                                    <input type="text" name="ram" class="form-control mb-0 mb-lg-2">
                                                    Open system :
                                                   <select class="form-select" aria-label="Default select example" name="os">
                                                        <option selected value="0">IOS</option>
                                                        <option value="1">ANDROID</option>
                                                        
                                                    </select>
                                                    <br>
                                                   
                                                    <div class="md-form md-outline" style="padding-top  :20px;padding-bottom:20px ">
                                                        Brand :
                                                        <select class="form-select" aria-label="Default select example" name="brand">
                                                            <option selected value="0">Iphone</option>
                                                            <option value="1">Sam Sung</option>
                                                            <option value="2">Oppo</option>
                                                          
                                                        </select>
                                                    </div>





                                                </div>
                                                <div class="md-form md-outline mb-0"style="width: 400px">
                                                    <label for="firstName">Price</label>
                                                    <input type="number" name="price" class="form-control mb-0 mb-lg-2">

                                                </div>

                                                


                                                <div class="md-form md-outline" style="padding-top  :20px;padding-bottom:20px ">
                                                    <select class="form-select" aria-label="Default select example" name="bank">
                                                        <option selected value="0">Xanh</option>
                                                        <option value="1">Đen</option>
                                                        <option value="2">Trắng</option>
                                                        <option value="3">Hồng</option>
                                                    </select>
                                                </div>
                                                <div class="md-form md-outline"style="width: 400px">
                                                    <label for="form76">Desciption</label>
                                                    <textarea id="form76" name="note" class="md-textarea form-control" rows="4"></textarea>

                                                </div>
                                                <div class="md-form md-outline  text-center"id="button-complete">
                                                    <button class="btn btn-lg btn-block btn-success text-uppercase text-center"style="margin-top:20px" type="submit">ADD Product</button>

                                                </div>
                                            </div>

                                        </form>




                                    </div>
                                </div>
                            </div>
                            <!-- Card -->
                        </div>

                        <div class="col-lg-4">

                            <!-- Card -->
                            <div class="card mb-4">
                                <div class="card-body">

                                    <img src="image/admin.PNG" alt="Admin"width="150px">

                                </div>
                            </div>



                        </div>

                </section>

            </div>

        </div>
        <!-- Footer -->
        <footer class="text-light container" >
            <div class="container">
                <div class="row" id="footer-color">
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
                            <li><a href="">Trung tâm trợ giúp</a></li>
                            <li><a href="">Tư Vấn Khách Hàng</a></li>
                            <li><a href="">Chăm sóc khách hàng</a></li>
                            <li><a href="">Chăm sóc bảo hành</a></li>
                        </ul>
                    </div>

                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
                        <h5>Others links</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><a href="">Giới Thiệu 1</a></li>
                            <li><a href="">Điều Khoản Bảo mật 2</a></li>
                            <li><a href="">Liên Hệ truyền Thông</a></li>
                            <li><a href="">Link 4</a></li>
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





    </body>
</html>
