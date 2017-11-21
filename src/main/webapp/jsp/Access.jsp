<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 23.04.2016
  Time: 19:04
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
    <style type="text/css">
        ${demo.css}
    </style>
</head>

<body >
<%--<form action="servlet-parameters" method="GET">--%>
    <div class="container">
        <div class="row">

            <div class="col-md-offset-3 col-md-6">
                <form class="form-horizontal" action="servlet-parameters" method="GET">
                    <span class="heading">АВТОРИЗАЦИЯ</span>
                    <div class="form-group">
                        <input type="text" class="form-control" id="inputLogin" placeholder="Login" name="inputLogin">
                        <i class="fa fa-user"></i>
                    </div>
                    <div class="form-group help">
                        <input type="password" class="form-control" id="inputPassword" placeholder="Password" name="inputPassword">
                        <i class="fa fa-lock"></i>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-default">Вход</button>

                        <%--<button type="submit" class="btn btn-default">Регистрация</button>--%>
                    </div>
                </form>
            </div>

        </div><!-- /.row -->
    </div><!-- /.container -->
<%--</form>--%>
</body>
</html>
