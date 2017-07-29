
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Shopper | Đặt hàng thành công</title>
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
         <h2>Đặt hàng thành công !!.</h2>
         <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
