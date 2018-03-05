<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <%@include file="/common/head.jsp" %>
    <script>
        function doSwitch(id){
            var o = document.getElementById(id);
            if (o){
                if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
            }
        }
    </script>
</head>
<BODY>
<h1>aaa....</h1>
</BODY>
</html>
