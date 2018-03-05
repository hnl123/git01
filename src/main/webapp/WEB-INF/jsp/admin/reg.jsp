<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<%@include file="/common/head.jsp" %>
	<script type="text/javascript">
        $(function () {
			$("#submit").click(function () {
                if($("#userNo").val()=="") {
                    alert("用户帐号不能为空！");
                    return false;
                }else if($("#pwd").val()=="") {
                    alert("用户密码不能为空！");
                    return false;
                }else if($("#pwds").val()=="") {
                    alert("确认密码不能为空！");
                    return false;
                }else {
                    if ($("#pwd").val() != $("#pwds").val()) {
                        alert("两次密码输入不一样！请重新输入！");
                        return false;
                    }
                }
            });
        });
	</script>
</head>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="5"><img src="images/top.jpg" width="780" height="213"></td>
	</tr>
	<tr>
		<td colspan="5"><img src="images/middle1.jpg" width="780" height="47"></td>
	</tr>
	<tr>
		<td width="38" background="images/middle2.jpg">&nbsp;</td>
		<td width="172">
			<table align="center">
				<tr>
					<td><a href="houseInfo/toListHouseInfo">返回首页</a></td>
				</tr>
			</table>
		</td>
		<td width="35" background="images/layout_24.gif">&nbsp;</td>
		<td width="495">
			<f:form action="user/doReg" modelAttribute="user" method="post">
				<table align="center">
					<tr>
						<td>用户注册：</td>
						<td></td>
					</tr>
					<tr>
						<td colspan="2"><hr/></td>
					</tr>
					<tr>
						<td>帐号：</td>
						<td><f:input path="userNo" cssStyle="..." id="userNo"/></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><f:password path="userPwd" cssStyle="..." id="pwd"/></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input type="password" style="width:180px;" id="pwds"></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="注册" class="btn" id="submit">&nbsp;&nbsp;
							<input type="reset" value="重置" class="btn">
						</td>
					</tr>
				</table>
			</f:form>
		</td>
		<td width="40" background="images/middle4.jpg">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="5"><img src="images/bottom.jpg" width="780" height="82"></td>
	</tr>
</table>
<P align="center">2007 Beijing Aptech Beida Jade Bird Information Technology Co.,Ltd 版权所有</P>
<br/>
</BODY>
</html>
