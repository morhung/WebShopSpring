
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog</title>
        <link href="<c:url value="/resources/css/animate.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/font-awesome.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/prettyPhoto.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/price-range.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/responsive.css" />" rel="stylesheet">
        
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/resources/js/gmaps.js"/>"></script>
        <script src="<c:url value="/resources/js/html5shiv.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery.prettyPhoto.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery.scollUp.min.js"/>"></script>
        <script src="<c:url value="/resources/js/main.js"/>"></script>
        <script src="<c:url value="/resources/js/price-range.js"/>"></script>
    </head>
    <body>
        <jsp:include page = "header.jsp"></jsp:include>
       
            <section>
                <div class="container">
                    <div class="row">
                   
                        <div class="col-sm-9">
                            <div class="blog-post-area">
                                <h2 class="title text-center">Latest From our Blog</h2>
                                <div class="single-blog-post">
                                    <h3>Girls Pink T Shirt arrived in store</h3>
                                    <div class="post-meta">
                                        <ul>
                                            <li><i class="fa fa-user"></i> Mac Doe</li>
                                            <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                            <li><i class="fa fa-calendar"></i> DEC 5, 2013</li>
                                        </ul>
                                        <span>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star-half-o"></i>
                                        </span>
                                    </div>
                                    <a href="">
                                        <img src="../../WebShopSpring/resources/images/blog/blog-one.jpg" alt="">
                                    </a>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                    <a  class="btn btn-primary" href="">Read More</a>
                                </div>
                                <div class="single-blog-post">
                                    <h3>Girls Pink T Shirt arrived in store</h3>
                                    <div class="post-meta">
                                        <ul>
                                            <li><i class="fa fa-user"></i> Mac Doe</li>
                                            <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                            <li><i class="fa fa-calendar"></i> DEC 5, 2013</li>
                                        </ul>
                                        <span>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star-half-o"></i>
                                        </span>
                                    </div>
                                    <a href="">
                                        <img src="../../WebShopSpring/resources/images/blog/blog-two.jpg" alt="">
                                    </a>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                    <a  class="btn btn-primary" href="">Read More</a>
                                </div>
                                <div class="single-blog-post">
                                    <h3>Girls Pink T Shirt arrived in store</h3>
                                    <div class="post-meta">
                                        <ul>
                                            <li><i class="fa fa-user"></i> Mac Doe</li>
                                            <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                            <li><i class="fa fa-calendar"></i> DEC 5, 2013</li>
                                        </ul>
                                        <span>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star-half-o"></i>
                                        </span>
                                    </div>
                                    <a href="">
                                        <img src="../../WebShopSpring/resources/images/blog/blog-three.jpg" alt="">
                                    </a>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                    <a  class="btn btn-primary" href="">Read More</a>
                                </div>
                                <div class="pagination-area">
                                    <ul class="pagination">
                                        <li><a href="" class="active">1</a></li>
                                        <li><a href="">2</a></li>
                                        <li><a href="">3</a></li>
                                        <li><a href=""><i class="fa fa-angle-double-right"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
