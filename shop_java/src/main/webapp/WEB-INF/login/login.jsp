<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles this template -->
<link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">
</head>
<body>
	<header>
		<jsp:include page="/resources/header.jsp"></jsp:include>
	</header>

	<div id="login_wrapper" style="margin: 10px;">
		<img src="http://ung6039.cafe24.com/img/login.png">
		<form action="login1.do">
			<input type="text" name="id" title="아이디 입력" /> <br /> <input
				type="text" name="pwd" title="패스워드 입력" /> <br /> <input
				type="submit" value="입력">
		</form>
	</div>
		<jsp:include page="/resources/footer.jsp"/>
	<script src="resources/vendor/jquery/jquery.min.js"></script>
<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>