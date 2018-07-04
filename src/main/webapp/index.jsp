<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setCharacterEncoding("utf-8");
%>
<html>
<head>
	<script src="<%=basePath%>resources/script/jquery/jquery-3.3.1.min.js"></script>
</head>
<body>
	<h2>Hello World!</h2>
	<button onclick="requestJson()">发送Json请求</button><br />
	<script>
	function requestJson() {
		 /* var user = {
				"id":1,
				"userName":"张三",
				"employId": "20180315245",
				"departmentId":"20315"
			}; */
	    $.ajax({
	        type : "post",
	        url : "${pageContext.request.contextPath}/backuser/add",
	        contentType : "application/json;charset=utf-8",
	        //数据格式是json串,传进一个person
	        data : '{"id":1,"userName" : "张三","employId" : "20180315245","departmentId":"20315"}',
			//data : user,
	        success:function(data){
	            console.log("服务器处理后的用户名是:" + data.code);
	            console.log("服务器处理后的性别是:" + data.message);
	        }

	    });
	}
	</script>
</body>
</html>
