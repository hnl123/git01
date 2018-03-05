<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<%@include file="/common/head.jsp" %>
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
			<form>
				<table align="center">
					<tr>
						<td colspan="2">帐号：</td>
					</tr>
					<tr>
						<td colspan="2"><input type="text" style="width: 100px;"></td>
					</tr>
					<tr>
						<td colspan="2">密码：</td>
					</tr>
					<tr>
						<td colspan="2"><input type="password" style="width: 100px;"></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="登陆" class='btn'>
							<input type="reset" value="重置" class='btn'>
						</td>
					</tr>
					<tr>
						<td><a href="reg.jsp">注册用户</a></td>
					</tr>
				</table>
			</form>
		</td>
		<td width="35" background="images/layout_24.gif">&nbsp;</td>
		<td width="495" align="center">
			<table width="450">
				<tr>
					<td id=listTitle>${houseInfo.title}</td>
				</tr>
				<tr>
					<td id=listTitle1><hr/></td>
				</tr>
				<tr>
					<td><strong>地址：</strong>${houseInfo.address}</td>
				</tr>
				<tr>
					<td><strong>租金：</strong>${houseInfo.money}</td>
				</tr>
				<tr>
					<td><strong>联系人：</strong>${houseInfo.linkman}</td>
				</tr>
				<tr>
					<td><strong>联系电话：</strong>${houseInfo.phone}</td>
				</tr>
				<tr>
					<td><strong>房屋类型：</strong>
						<c:if test="${houseInfo.houseType==2}">一室一厅</c:if>
						<c:if test="${houseInfo.houseType==3}">两室一厅</c:if>
						<c:if test="${houseInfo.houseType==4}">两室两厅</c:if>
						<c:if test="${houseInfo.houseType==5}">三室一厅</c:if>
						<c:if test="${houseInfo.houseType==6}">三室两厅</c:if>
					</td>
				</tr>
				<tr>
					<td>
						<strong>装修情况：</strong>

						<c:if test="${houseInfo.zxqk==1}">毛坯房</c:if>
						<c:if test="${houseInfo.zxqk==2}">简单装修</c:if>
						<c:if test="${houseInfo.zxqk==3}">精装修</c:if>
						<c:if test="${houseInfo.zxqk==4}">精装修</c:if>

					</td>
				</tr>
				<tr>
					<td><strong>所在楼层：</strong>

						<c:if test="${houseInfo.szlc==1}">一层</c:if>
						<c:if test="${houseInfo.szlc==2}">二层</c:if>
						<c:if test="${houseInfo.szlc==3}">三层</c:if>
						<c:if test="${houseInfo.szlc==4}">四层~六层</c:if>
						<c:if test="${houseInfo.szlc==5}">七层~以上</c:if>
					</td>
				</tr>
				<tr>
					<td>
						<strong>房屋朝向：</strong>

						<c:if test="${houseInfo.fwcx==1}">东</c:if>
						<c:if test="${houseInfo.fwcx==2}">南</c:if>
						<c:if test="${houseInfo.fwcx==3}">西</c:if>
						<c:if test="${houseInfo.fwcx==4}">北</c:if>
						<c:if test="${houseInfo.fwcx==5}">东西</c:if>
						<c:if test="${houseInfo.fwcx==6}">南北</c:if>
					</td>
				</tr>
				<tr>
					<td><strong>发布时间：</strong> <fmt:formatDate value="${houseInfo.showtime}" type="Date" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<td><hr></td>
				</tr>
				<tr>
					<td>
						<!-- 文本域中的内容是有格式的，必须要用pre标签 -->
						<pre>${houseInfo.remark}</pre>
					</td>
				</tr>
				<tr>
					<td><input type="button" value="后退" class="btn" onclick="javascript:history.back();"></td>
				</tr>
			</table>
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
