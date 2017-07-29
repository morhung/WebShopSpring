
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cart</title>
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
                            <li class="active">Shopping Cart</li>
                        </ol>
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
            </div>
        </section> <!--/#cart_items-->

        <section id="do_action">
            <div class="container">
                <div class="heading">
                    <h3>What would you like to do next?</h3>
                    <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="chose_area">
                            <ul class="user_option">
                                <li>
                                    <input type="checkbox">
                                    <label>Use Coupon Code</label>
                                </li>
                                <li>
                                    <input type="checkbox">
                                    <label>Use Gift Voucher</label>
                                </li>
                                <li>
                                    <input type="checkbox">
                                    <label>Estimate Shipping & Taxes</label>
                                </li>
                            </ul>
                            <ul class="user_info">
                                <li class="single_field">
                                    <label>Country:</label>
                                    <select>
                                        <option>United States</option>
                                        <option>Bangladesh</option>
                                        <option>UK</option>
                                        <option>India</option>
                                        <option>Pakistan</option>
                                        <option>Ucrane</option>
                                        <option>Canada</option>
                                        <option>Dubai</option>
                                    </select>

                                </li>
                                <li class="single_field">
                                    <label>Region / State:</label>
                                    <select>
                                        <option>Select</option>
                                        <option>Dhaka</option>
                                        <option>London</option>
                                        <option>Dillih</option>
                                        <option>Lahore</option>
                                        <option>Alaska</option>
                                        <option>Canada</option>
                                        <option>Dubai</option>
                                    </select>

                                </li>
                                <li class="single_field zip-field">
                                    <label>Zip Code:</label>
                                    <input type="text">
                                </li>
                            </ul>
                            <a class="btn btn-default update" href="">Get Quotes</a>
                            <a class="btn btn-default check_out" href="">Continue</a>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="total_area">
                            <ul>
                                <li>Cart Sub Total <span>$</span></li>
                                <li>Eco Tax <span>$2</span></li>
                                <li>Shipping Cost <span>Free</span></li>
                                <li>Total <span>$61</span></li>
                            </ul>
                            <a class="btn btn-default update" href="">Update</a>
                            <a class="btn btn-default check_out" href="">Check Out</a>
                        </div>
                    </div>
                </div>
            </div>
        </section><!--/#do_action-->

        <jsp:include page = "footer.jsp"></jsp:include>
    </body>
</html>
