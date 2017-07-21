<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       -----    spring-boot  index1   -----
       <br/>
       <a href="http://www.baidu.com" target="_blank">hello</a>
       <br/>
       <button onclick="test();">please</button>
     <script type="text/javascript">
       function test() {
    	   alert("<%=request.getContextPath()%>/hello/chaojing");
      	   window.location.href = "<%=request.getContextPath()%>/hello/chaojing";
       }
     </script>
</body>
</html>
