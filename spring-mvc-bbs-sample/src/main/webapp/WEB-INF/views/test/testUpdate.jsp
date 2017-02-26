<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Update Form</title>
<link rel="stylesheet" type="text/css" href="../resources/css/common/jquery-ui.css">
<script src="../resources/js/common/jquery-1.8.2.min.js"></script>
<script src="../resources/js/common/jquery.form.js"></script>
<script src="../resources/js/common/jquery-ui.min.js"></script>
<script>


$(document).ready(function(){
	var availableTags = [
		"ActionScript",
		"AppleScript",
		"Asp",
		"BASIC",
		"C",
		"C++",
		"Clojure",
		"COBOL",
		"ColdFusion",
		"Erlang",
		"Fortran",
		"Groovy",
		"Haskell",
		"Java",
		"JavaScript",
		"Lisp",
		"Perl",
		"PHP",
		"Python",
		"Ruby",
		"Scala",
		"Scheme",
		"홍길동",
		"사쿠라"
	];
	$( "#autocomplete1" ).autocomplete({
		source: availableTags,
		select: function( event, ui ) {
			console.log("ui : " + ui);
			$("#autocomplete1").css('background-color', 'red');
		}
	});
	$( "#autocomplete2" ).autocomplete({
		source: availableTags,
		select: function( event, ui ) {
			console.log("ui : " + ui);
			$("#autocomplete2").css('background-color', 'red');
		}
	});
	
	var downKeyEvent = $.Event("keydown");
    downKeyEvent.keyCode = $.ui.keyCode.DOWN;  // event for pressing "down" key

    var enterKeyEvent = $.Event("keydown");
    enterKeyEvent.keyCode = $.ui.keyCode.ENTER;  // event for pressing "enter" key

    $("#autocomplete1").val("${test.primaryContact}"); // enter text to trigger autocomplete
    $("#autocomplete1").trigger(downKeyEvent);  // First downkey invokes search
    $("#autocomplete1").trigger(downKeyEvent);  // Second downkey highlights first item
    $("#autocomplete1").trigger(enterKeyEvent); // Enter key selects highlighted item 

    $("#autocomplete2").val("${test.deputy}"); // enter text to trigger autocomplete
    $("#autocomplete2").trigger(downKeyEvent);  // First downkey invokes search
    $("#autocomplete2").trigger(downKeyEvent);  // Second downkey highlights first item
    $("#autocomplete2").trigger(enterKeyEvent); // Enter key selects highlighted item 
	
});
</script>
</head>
<body>
	<table>
	 <tr>
		 <th>API 명</th>
		 <td><input type="text" value="${test.apiMethodName}"></td>
	 </tr>
	 <tr>
		 <th>IP</th>
		 <td><input type="text" value="${test.aclIp}"></td>
	 </tr>
	 <tr>
		 <th>담당자</th>
		 <td><input id="autocomplete1" name="autocomplete1" type="text" value="${test.primaryContact}"></td>
	 </tr>
	 <tr>
		 <th>부담당자</th>
		 <td><input id="autocomplete2" name="autocomplete2" type="text" value="${test.deputy}"></td>
	 </tr>
	  <tr>
		 <th>&nbsp;</th>
		 <td><button type="button" id="testIp-btn">수정</button></td>
	 </tr>
	</table>
</body>
</html>