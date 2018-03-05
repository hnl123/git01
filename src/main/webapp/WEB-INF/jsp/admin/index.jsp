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

	<script type="text/javascript">
		$(function () {
            $("#submit").click(function () {
                var houseInfo = {};
                houseInfo.title=$("#title").val();
                $.ajax({
                    type:'POST',
                    url:'houseInfo/list2Json',
                    data:houseInfo,
                    dataType:'json',
//					contextType:'application/json',
                    success:function(data) {
                        alert(data);
                        var list = eval(data);
                        alert(list);
                    },
                    error:function(data) {
                        alert("error")
                    }
                });
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
		<td width="172" valign="top" align="center">
			<p>&nbsp;</p>
			<f:form  action="user/login" modelAttribute="user">
				<table align="center">
					<tr>
						<td colspan="2">帐号：</td>
					</tr>
					<tr>
						<td colspan="2"><f:input path="userNo" cssStyle="..."/></td>
					</tr>
					<tr>
						<td colspan="2">密码：</td>
					</tr>
					<tr>
						<td colspan="2"><f:password path="userPwd" cssStyle="..."/></td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="登陆" class='btn'>
							<input type="reset" value="重置" class='btn'>
						</td>
					</tr>
					<tr>
						<td><a href="user/toAddUser">注册用户</a></td>
					</tr>
				</table>
			</f:form>
		</td>
		<td width="35" background="images/layout_24.gif">&nbsp;</td>
		<td width="495" align="center"><br/>
			<f:form action="houseInfo/list" modelAttribute="houseInfo" id="form">
				<div style="text-align:left;width:88%;">
					<f:input path="title" id="title"/>
					<input type="hidden" name="forward" value="1"/>
					<input type="submit" value="查询" id="submit1" class="btn">&nbsp;<span onclick="doSwitch('advSearch');" style="cursor:hand;color:blue;">高级搜索</span>
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
						<td><f:input path="startMoney" cssStyle="..."/>至<f:input path="endMoney" cssStyle="..."/>元/月</td>
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
						<td id="title1"><a href='houseInfo/loadHouseInfo?houseId=${v.houseId}'>${v.title}</a></td>
						<td id="money" align='center' style='height:30px;'>${v.money}</td>
						<td id="showtime" align='center'><fmt:formatDate value="${v.showtime}" type="Date" pattern="yyyy-MM-dd"/></td>
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
