<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세</title>
<link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles this template -->
<link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">
</head>
<body>
<h1> 제품 상세</h1>
<h3> 제품 이름]</h3>
<table id="product_table">
	<tr>그림</tr>
	<tr>
		<td>제품 상세</td>
	</tr>
	<tr>
		<td>가격</td>
	</tr>
</table>
<table id=product_price>
	
</table>

<footer>
		<jsp:include page="/resources/footer.jsp"/>
	</footer>
	<script src="resources/vendor/jquery/jquery.min.js"></script>
<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>