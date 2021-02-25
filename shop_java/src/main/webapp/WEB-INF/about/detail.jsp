<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles this template -->
<link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">
</head>
<body>
<header>
<jsp:include page="/resources/header.jsp" />	
</header>
	<div class="container">
		<div class="row">
			<jsp:include page="/resources/category.jsp"></jsp:include>
			<div class="col-lg-9">
				<div>
					<h1>상세페이지</h1>
					<img src="http://ung6039.cdn3.cafe24.com/${img }+.jpg">
				</div>
				<div>회원 가입</div>
			</div>
		</div>
	</div>
	
<footer>
</footer>
<jsp:include page="/resources/footer.jsp"></jsp:include>
</body>
<script src="resources/vendor/jquery/jquery.min.js"></script>
<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</html>