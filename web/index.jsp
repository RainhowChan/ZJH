<%--
  Created by IntelliJ IDEA.
  User: RainhowChan
  Date: 2017/9/26
  Time: 1:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>夜，如此迷离</title>
    <style>
      .container {
        width: 70%;
        border:1px solid #ccc;
        margin:40px auto;
      }
    </style>
  </head>
  <body>
  <div class="container">
    <form action="${pageContext.request.contextPath}/items/register" method="post">
      <label for="id">编号</label>
      <input type="number" name="deptno" id="id"><br/>
      <label for="dept">部门</label>
      <input type="text" name="dname" id="dept"><br/>
      <label for="location">地区</label>
      <input type="text" name="loc" id="location"><br/>
      <input type="submit" value="提交">
    </form>
  </div>
  </body>
</html>
