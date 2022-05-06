<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<style type="text/css">
	h3{ text-align: center;}
	li{ list-style-type: none;}
	#join{
			width:800px;
			margin:0 auto; /*가운데 정렬*/
			border-top: solid 2px red;
			border-bottom: solid 2px red;
			padding:30px;
		}
	.cols li{ display :inline-block; }
	#signupbutton{
			 display:block;
			
			margin: 0 auto;
		}
	</style>

</head>
<body>

<%@include file = "../header.jsp" %>
<div class="container">
	<h3> 회원가입 페이지 </h3>
	<form id="signupform" action="../signup" method="post">
		<ul id="join"> <!-- 전체 -->
			<li><!-- 행[tr] -->
				<ul class="cols">
					<li class="col1"> 아이디 : </li> <!-- 열 [ td ] -->
					<li class="col2"> <input type="text" id="mid" name="mid" placeholder="user id"> </li><!-- 열 [ td ] -->
					<li><span id="idcheck"></span> </li>
				</ul>
			</li>
			<li>
				<ul class="cols">
					<li class="col1"> 비밀번호 : </li> 
					<li class="col2"> <input type="password" id="mpassword" name="mpassword" placeholder="user password"> </li>
				</ul>
			</li>
			<li>
				<ul class="cols">
					<li class="col1">비밀번호 확인 : </li>
					<li class="col2"><input type="password" id="mpasswordcheck" placeholder="password check"></li>
					<li><span id="passwordcheck"></span></li>
				</ul>
			</li>
			<li>
				<ul class="cols">
					<li class="col1">이름 : </li>
					<li class="col2"><input type="text" id="mname" name="mname" placeholder="user name"></li>
					<li><span id="namecheck"></span></li>
				</ul>
			</li>
			<li>
				<ul class="cols">
					<li class="col1">연락처 : </li>
					<li class="col2"><input type="text" id="mphone" name="mphone" placeholder="user phone"></li>
					<li><span id="phonecheck"></span></li>
				</ul>
			</li>
			<li>
				<ul class="cols">
					<li class="col1">이메일 : </li>
					<li class="col2"><input type="text" id="memail" name="memail" placeholder="user email">
									@
									<input type="text" id="memailaddress" name="memailaddress" >
			
									<select id="emailselect">
										<option value="">직접입력</option>
										<option value="naver.com"> naver.com </option>
										<option value="nate.com"> nate.com </option>
										<option value="daum.com"> daum.com </option>
									</select>
					</li>
					<li><span id="emailcheck"></span></li>
				</ul>
			</li>
			<li>
				<ul class="cols">
					<li class="col1">
						<input type="text" id="sample4_postcode"  name="address1" placeholder="우편번호">
						<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기">
					</li>
					<li class="col2">
						<input type="text" id="sample4_roadAddress" name="address2" placeholder="도로명주소">
						<input type="text" id="sample4_jibunAddress" name="address3" placeholder="지번주소">
						<span id="guide" style="color:#999;display:none"></span>
						<input type="text" id="sample4_detailAddress" name="address4"  placeholder="상세주소">
						<!-- <input type="text" id="sample4_extraAddress" placeholder="참고항목"> -->
					</li>
					<li><span id="addresscheck"></span></li>
				</ul>
			</li>
		</ul>
		<button id="signupbutton" onclick="signup()" type="button">가입하기</button>
	</form>
</div>

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="../js/signup.js" type="text/javascript"></script>
<%@include file = "../footer.jsp" %>

</body>
</html>