<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>保存信息</h1>
<s:form action="User_update"  method="POST">
    <table border="1" width="400">
        <tr>
            <td>id</td>
            <td><s:textfield name="uid"/> </td>
        </tr>
        <tr>
            <td>名称</td>
            <td><s:textfield name="username"/> </td>
        </tr>
        <tr>
            <td>描述</td>
            <td><s:textfield name="password"/> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="保存"></td>
        </tr>
    </table>
</s:form>
</body>
</html>
