<%--
  Created by IntelliJ IDEA.
  User: Макс
  Date: 20.11.2017
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Авторизация</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>

    <link rel="stylesheet" href="../css/AccCss.css">


</head>
<body>


<div class="container">
    <div class="row">

        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal">
                <span class="heading">РЕГИСТРАЦИЯ</span>
                <div class="form-group">
                    <input type="text" class="form-control" id="inputName" placeholder="Name">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" id="inputSurname" placeholder="Surname">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" id="inputLogin" placeholder="Login">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group help">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    <i class="fa fa-lock"></i>
                </div>
                <div class="form-group help">
                    <input type="password" class="form-control" id="inputConfPassword" placeholder="Confirm password">
                    <i class="fa fa-lock"></i>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-default">Регистрация</button>
                    <button type="submit" class="btn btn-default" href="Access.jsp">Отмена</button>
                </div>
            </form>
        </div>

    </div>
</div>

</body>
</html>
