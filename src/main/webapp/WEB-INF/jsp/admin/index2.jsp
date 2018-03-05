<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<%@include file="/common/head.jsp" %>
	<%@include file="/common/showMessage.jsp" %>
	<script>
        function doSwitch(id){
            var o = document.getElementById(id);
            if (o){
                if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
            }
        }
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
		<td width="172" valign="top" align="center">
			<p>&nbsp;</p>
			<table align="center">
				<tr>
					<td width=''>
						<font color='red'>当前用户：${sessionScope.userNo}</font>
					</td>
				</tr>
				<tr>
					<td width='150'><a href="user/toListMyFwxx">管理我的租房信息</a></td>
				</tr>
				<tr>
					<td width='100'><a href="houseInfo/toAddHouseInfo">发布租房信息</a></td>
				</tr>

				<tr>
					<td width='100'><a href="user/logout">[注销]</a></td>
				</tr>
			</table>
		</td>
		<td width="35" background="images/layout_24.gif">&nbsp;</td>
		<td width="495" align="center"><br/>
			<f:form action="houseInfo/list" modelAttribute="houseInfo">
				<div style="text-align:left;width:88%;">
					<f:input path="title"/>
					<input type="hidden" value="2" name="forward"/>
					<input type="submit" value="查询" class="btn">&nbsp;<span onclick="doSwitch('advSearch');" style="cursor:hand;color:blue;">高级搜索</span>
				</div>
				<table width="88%;" id="advSearch" style="border:solid 0px #000;display:none;">
					<tr>
						<td>房屋类型：</td>
						<td>
							<f:select path="houseType">
								<f:option value="">--请选择--</f:option>
								<f:options items="${houseTypeList}" itemLabel="typeName" itemValue="typeId"></f:options>
							</f:select>
						</td>
					</tr>
					<tr>
						<td>租金：</td>
						<td><input type="text" style="width:80px;" value="">至<input type="text" style="width:80px;" value="">元/月</td>
					</tr>
					<tr>
						<td colspan='3'><hr/></td>
					</tr>

				</table>

				<table width="88%" cellspacing="0">
					<tr>
						<td width='250' class="table_title">标题</td>
						<td width='90' align='center' class="table_title">月租金</td>
						<td align='center' class="table_title">发布日期</td>
					</tr>

					<c:forEach items="${houseInfoList}" var="v">
						<tr>
							<td><a href='houseInfo/loadHouseInfo?houseId=${v.houseId}'>${v.title}</a></td>
							<td align='center' style='height:30px;'>${v.money}</td>
							<td align='center'><fmt:formatDate value="${v.showtime}" type="Date" pattern="yyyy-MM-dd"/></td>
						</tr>
					</c:forEach>

					<tr>
						<td colspan='3'><hr/></td>
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
