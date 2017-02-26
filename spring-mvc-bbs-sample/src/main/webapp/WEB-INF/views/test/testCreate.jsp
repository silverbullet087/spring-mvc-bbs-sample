<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Create</title>
<script src="../resources/js/common/jquery-1.8.2.min.js"></script>
<script src="../resources/js/common/jquery.form.js"></script>
<script>
$(document).ready(function(){
	var roleInput = {
			ajaxSubmit : function() {
				var options = {
					url : '/test/create',
					type : "POST",
					dataType : "text",
					success : function(json) {
						callbackFn(json);
					},
					error : function(err) {
						alert("error!!!");
					}
				};
				$("#testIpform").ajaxSubmit(options);
			}
		};
		
	
	
    $("#testIp").click(function(){
        if($(this).val() == '<spring:message code="test.ip.info" />'){
        	$(this).val(""); 	
        }
    });
    
    $("#testIp-btn").click(function(){
    	roleInput.ajaxSubmit();
    });
});

function callbackFn(response){
	alert("성공!!!");
	$("#testIpform").html(response);
}
</script>
</head>
<body>
	<form id="testIpform" class="testIpform">
		<textarea  id="testIp" name="testIp" style="width: 500px;"><spring:message code="test.ip.info" /></textarea>
		<button type="button" id="testIp-btn">Click Me!</button>
	</form>
</body>
</html>