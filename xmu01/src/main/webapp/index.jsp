<%--
  Created by IntelliJ IDEA.
  User: 本帝
  Date: 2019/12/24
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="DindAllUser">查看数据</a>

    <div>
        <form method="post" action="AddUser">
            姓名：<input type="text" name="name"/>
            年龄：<input type="text" name="age"/>
                  <input type="submit" value="提交"/>
        </form>
    </div>
</body>
</html>
