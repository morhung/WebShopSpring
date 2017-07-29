
<%@page import="model.UserInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Shopper | Thanh toán</title>
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

            <section id="cart_items">
                <div class="container">
                    <div class="breadcrumbs">
                        <ol class="breadcrumb">
                            <li><a href="#">Home</a></li>
                            <li class="active">Check out</li>
                        </ol>
                    </div><!--/breadcrums-->
                    <div class="review-payment">
                        <h2>Review & Payment</h2>
                    </div>

                    <div class="table-responsive cart_info">
                        <table class="table table-condensed">
                            <thead>
                                <tr class="cart_menu">
                                    <td class="image">Item</td>
                                    <td class="description"></td>
                                    <td class="price">Price</td>
                                    <td class="quantity">Quantity</td>
                                    <td class="total">Total</td>
                                    <td></td>
                                </tr>
                            </thead>
                        <c:forEach var="item" items="${sessionScope.cart}">
                            <tbody>

                                <tr>
                                    <td class="cart_product">
                                        <a href=""><img src="${item.product.productImage}" alt=""></a>
                                    </td>
                                    <td class="cart_description">
                                        <h4><a href="">${item.product.productName}</a></h4>
                                        <p>${item.product.productID}</p>
                                    </td>
                                    <td class="cart_price">
                                        <p>$${item.product.productPrice}</p>
                                    </td>
                                    <td class="cart_quantity">
                                        <div class="cart_quantity_button">
                                            <a class="cart_quantity_up" href=""> + </a>
                                            <input class="cart_quantity_input" type="text" name="quantity" value="${item.soLuong}" autocomplete="off" size="2">
                                            <a class="cart_quantity_down" href=""> - </a>
                                        </div>
                                    </td>
                                    <td class="cart_total">
                                        <p class="cart_total_price">$${item.totalPrice}</p>
                                    </td>
                                    <td class="cart_delete">
                                        <a class="cart_quantity_delete" href="${pageContext.request.contextPath}/oder/cart/remove/${item.product.productID}"><i class="fa fa-times"></i></a>
                                    </td>
                                </tr>


                            </tbody>
                        </c:forEach>
                    </table>
                </div>  
                <div class="payment-options">
                    <span>
                        <label><input type="checkbox"> Direct Bank Transfer</label>
                    </span>
                    <span>
                        <label><input type="checkbox"> Check Payment</label>
                    </span>
                    <span>
                        <label><input type="checkbox"> Paypal</label>
                    </span>
                </div>


                <div class="shopper-informations">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="shopper-info">
                                <p>Address:</p>
                                <form action="${pageContext.request.contextPath}/checkout/ok" method="post">
                                    <input type="text" placeholder="Adress" name="address">
                                    <button type="submit" class="btn btn-default">Thanh toan</button>
                                </form>
                               
<!--                                <a class="btn btn-primary" type="submit" href="${pageContext.request.contextPath}/checkout/ok">Thanh toán</a>
                                -->
                            </div>
                        </div>
                        				
                    </div>
                </div>

            </div>
        </section> <!--/#cart_items-->
        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
