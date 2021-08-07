<%-- 
    Document   : signup
    Created on : Mar 10, 2021, 10:37:58 PM
    Author     : mynameis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <link rel="stylesheet" href="css/login.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">


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
            <div class="container" >
                <div class="wrapper fadeInDown"style="background: #bfbfbf">
                    <div id="formContent"style="margin-top: 20px;margin-bottom: 20px">
                        <!-- Tabs Titles -->

                        <!-- Icon -->
                        <div>

                        </div>
                        <div class="fadeIn first">
                            <h4 style="font-family: cursive;color: #660066">Sign Up</h4>
                            <img src="image/login.png" id="icon" alt="User Icon" />
                        </div>
                        
                        <!-- Login Form -->
                        <form action="signup" method="get">
                            <input type="text" id="username" class="fadeIn second" name="username"  placeholder="Enter your username">
                            <input type="text" id="username" class="fadeIn five" name="phone" placeholder="Enter your phone">

                            <input type="password" id="password" class="fadeIn third" name="password" placeholder="Enter your password">
                            <input type="password" id="cfpaword" class="fadeIn four" name="cfpassword" placeholder="Enter your cf password">

                                   
                            

                            <input type="submit" class="fadeIn five" value="Sign up">
                        </form>

                        <!-- Remind Passowrd -->
                        <div id="formFooter">
                            <a class="underlineHover" href="#">Forgot Password?</a><br>
                            <h6>Bạn đã có tài khoản
                                <a href="login.jsp">Login</a>
                            </h6>
                        </div>

                    </div>
                </div>

            </div>
        </main>

        <footer class="text-light container" >
            <div class="container">
                <div class="row" id="footer-color"style="padding-top: 20px;">
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
