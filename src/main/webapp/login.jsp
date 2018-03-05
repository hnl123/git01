<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <%@include file="/common/head.jsp" %>

</head>
<BODY>
<form id="myform" method="post" action="">
    <p>
        <label for="myname">用户名：</label>
        <!-- id和name最好同时写上 -->
        <input id="myname" name="myname" class="required" />
    </p>
    <p>
        <label for="email">E-Mail：</label>
        <input id="email" name="email" class="required email" />
    </p>
    <p>
        <label for="password">登陆密码：</label>
        <input id="password" name="password" type="password"
               class="{required:true,minlength:5}" />
    </p>
    <p>
        <label for="confirm_password">确认密码：</label>
        <input id="confirm_password" name="confirm_password" type="password"
               class="{required:true,minlength:5,equalTo:'#password'}" />
    </p>
    <p>
        <label for="confirm_password">性别：</label>
        <!-- 表示必须选中一个 -->
        <input  type="radio" id="gender_male" value="m" name="gender" class="{required:true}" />
        <input  type="radio" id="gender_female" value="f" name="gender"/>
    </p>
    <p>
        <label for="confirm_password">爱好：</label>
        <!-- checkbox的minlength表示必须选中的最小个数,maxlength表示最大的选中个数,rangelength:[2,3]表示选中个数区间  -->
        <input type="checkbox" id="spam_email" value="email" name="spam[]" class="{required:true, minlength:2}" />
        <input type="checkbox" id="spam_phone" value="phone" name="spam[]" />
        <input type="checkbox" id="spam_mail" value="mail" name="spam[]" />
    </p>
    <p>
        <label for="confirm_password">城市：</label>
        <select id="jungle" name="jungle" title="Please select something!" class="{required:true}">
            <option value=""></option>
            <option value="1">厦门</option>
            <option value="2">泉州</option>
            <option value="3">Oi</option>
        </select>
    </p>
    <p>
        <input class="submit" type="submit" value="立即注册" />
    </p>
</form>
</BODY>
</html>
