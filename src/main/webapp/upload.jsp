<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <%@include file="/common/head.jsp" %>

</head>
<BODY>

<form action="uploads/toUpload" method="post" enctype="multipart/form-data">
<input type="file" name="img"/>
    <input type="submit"/>
</form>
</BODY>
</html>
