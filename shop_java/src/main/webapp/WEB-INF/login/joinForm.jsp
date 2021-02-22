<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles this template -->
<link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">
<script type="text/javascript">
	function goLoginForm(){
		location.href="login.do";
		alert("과연?");
	}
</script>
</head>
<body>
<header>
		<jsp:include page="/resources/header.jsp"></jsp:include>
</header>
	
	<div class="container">
		<div style="color: gray;">회원가입</div>
		<div class="row">
			<div>
				<form method="post" action="../login/JoinPro.jsp" name="userInfo"
					onsubmit="return checkValue()">
					<table>
						<tr>
							<td>아이디</td>
							<td><input type="text" name="id" maxlength="50"> <input
								type="button" value="중복확인"></td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td><input type="text" name="pwd" maxlength="50"></td>
						</tr>
						<tr>
							<td>비밀번호 확인</td>
							<td><input type="pwd" name="pwdcheck" maxlength="50">
							</td>
						</tr>
						<tr>
							<td>성별</td>
							<td><input type="radio" name="gender" value="남" checked>남
								<input type="radio" name="gender" value="여" checked>여</td>
						</tr>
						<tr>
							<td>생일</td>
							<td><input type="text" name="birth" maxlength="4"
								placeholder="년" size="6"> <select name="birthmm">
									<option value="">월</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
							</select> <input type="text" name="birthdd" maxlength="2" placeholder="일"
								size="4"></td>
						</tr>
						<tr>
							<td><input type="submit" value="가입"></td>
							<td><input type="button" value="취소" onclick="goLoginForm()">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
<footer>
		<jsp:include page="/resources/footer.jsp"/>
	</footer>
	<script src="resources/vendor/jquery/jquery.min.js"></script>
<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>

</html>