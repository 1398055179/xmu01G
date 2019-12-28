<%--
  Created by IntelliJ IDEA.
  User: 本帝
  Date: 2019/12/24
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${UserLiset}

<div>
    <table>
        <tr>
            <td>名字</td>
            <td>年龄</td>
        </tr>
        <tbody id="tb">

        </tbody>
    </table>
</div>
<a id="AllUser" href="#">显示清楚</a>

</body>
</html>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#AllUser").click(function () {
            $.ajax({
                url:"${pageContext.request.contextPath}/date-AllUser",
                success:function (data) {
                    var html = "";
                    for(var i = 0 ; i < data.length ; i++){
                        html += "<tr>"+
                            "<td>"+data[i].name+"</td>"+
                            "<td>"+data[i].age+"</td></tr>"
                    }
                    $("#tb").html(html);
                    console.log(data);
                }
            })
        })
    })
</script>