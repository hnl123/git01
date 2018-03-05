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
					<td width='100'><a>发布租房信息</a></td>
				</tr>
				<tr>
					<td width='100'><a href="user/toIndex2">返回首页</a></td>
				</tr>
				<tr>
					<td width='100'><a href="user/logout">[注销]</a></td>
				</tr>
				<tr>
					<td>
						<a href="i18n/toZh">toZh</a>&nbsp;&nbsp;<a href="i18n/toUs">toUs</a>
					</td>
				</tr>
			</table>
		</td>
		<td width="35" background="images/layout_24.gif">&nbsp;</td>
		<td width="495" align="center">
			<f:form action="houseInfo/addHouseInfo" modelAttribute="houseInfo" method="post">
				<table>
					<tr>
						<td colspan="2">发布租房信息：</td>
					</tr>
					<tr>
						<td colspan="2"><hr/></td>
					</tr>
					<tr>
						<td><strong><t:message code="title.label"/>：</strong></td>
						<td><f:input path="title" cssStyle="..."/><span class="required">*</span></td>
					</tr>
					<tr>
						<td><strong><t:message code="address.label"/>：</strong></td>
						<td><f:input path="address" cssStyle="..."/><span class="required">*</span></td>
					</tr>
					<tr>
						<td><strong>租金：</strong></td>
						<td><f:input path="money" cssStyle="..."/><span class="required">*</span></td>
					</tr>
					<tr>
						<td><strong>联系人：</strong></td>
						<td><f:input path="linkman" cssStyle="..."/><span class="required">*</span></td>
					</tr>
					<tr>
						<td><strong>联系电话：</strong></td>
						<td><f:input path="phone" cssStyle="..."/><span class="required">*</span></td>
					</tr>
					<tr>
						<td><strong>房屋类型：</strong></td>
						<td>
							<f:select path="houseType" cssStyle='width:180px;'>
								<f:option value="">--请选择--</f:option>
								<f:options items="${houseTypeList}" itemLabel="typeName" itemValue="typeId"></f:options>
							</f:select>
						</td>
					</tr>
					<tr>
						<td><strong>装修情况：</strong></td>
						<td>
							<f:select path="zxqk" cssStyle='width:180px;'>
								<f:option value="">--请选择--</f:option>
								<f:option value="1">毛坯房</f:option>
								<f:option value="2">简单装修</f:option>
								<f:option value="3">精装修</f:option>
								<f:option value="4">精装修</f:option>
							</f:select>
						</td>
					</tr>
					<tr>
						<td><strong>所在楼层：</strong></td>
						<td>
							<f:select path="szlc" cssStyle='width:180px;'>
								<f:option value=''>--请选择--</f:option>
								<f:option value='1'>一层</f:option>
								<f:option value='2'>二层</f:option>
								<f:option value='3'>三层</f:option>
								<f:option value='4'>四层~六层</f:option>
								<f:option value='5'>七层~以上</f:option>
							</f:select>
						</td>
					</tr>
					<tr>
						<td><strong>房屋朝向：</strong></td>
						<td>
							<f:select path="fwcx" style='width:180px;' class='' onchange=''>
								<f:option value=''>--请选择--</f:option>
								<f:option value='1'>东 </f:option>
								<f:option value='2'>南</f:option>
								<f:option value='3'>西 </f:option>
								<f:option value='4'>北</f:option>
								<f:option value='5'>东西</f:option>
								<f:option value='6'>南北</f:option>
							</f:select>
						</td>
					</tr>
					<tr>
						<td><strong>备注：</strong></td>
						<td><f:textarea path="remark" rows="5" cols="30"/></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="hidden" name="userEmp" value="${sessionScope.user.userId}"/>

							<div align="center"><input type="submit" value="提交" class="btn"></div>
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
