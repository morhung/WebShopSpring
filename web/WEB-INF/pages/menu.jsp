
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
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
        <div class="col-sm-3">
            <div class="left-sidebar">
   
                <div class="brands_products"><!--brands_products-->
                    <h2>Category</h2>
                    <div class="brands-name">
                        <ul class="nav nav-pills nav-stacked">
                            <c:forEach var="item" items="${listCategory}">
                                <li><a href="${pageContext.request.contextPath}/product/list?categoryID=${item.categoryID}"> ${item.categoryName}</a></li>
              
                            </c:forEach>
                        </ul>
                    </div>
                </div><!--/brands_products-->

<!--                <div class="price-range">price-range
                    <h2>Price Range</h2>
                    <div class="well text-center">
                        <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                        <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                    </div>
                </div>/price-range-->

                <div class="shipping text-center"><!--shipping-->
                    <img src="../../WebShopSpring/resources/images/home/shipping.jpg" alt="" />
                </div><!--/shipping-->

            </div>
        </div>

    </body>
</html>
