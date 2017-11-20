<%@ page import="bullGame.service.UserService" %>
<%@ page import="java.util.List" %>
<%@ page import="bullGame.model.Users" %><%--
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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />

    <link rel="stylesheet" href="../css/AccCss.css">


</head>
<body>




<div class="container">
    <div class="row">

        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal">
                <span class="heading">АВТОРИЗАЦИЯ</span>
                <div class="form-group">
                    <input type="email" class="form-control" id="inputEmail" placeholder="E-mail">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group help">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    <i class="fa fa-lock"></i>
                    <a href="#" class="fa fa-question-circle"></a>
                </div>
                <div class="form-group">
                    <div class="main-checkbox">
                        <input type="checkbox" value="none" id="checkbox1" name="check"/>
                        <label for="checkbox1"></label>
                    </div>
                    <span class="text">Запомнить</span>
                    <button type="submit" class="btn btn-default">ВХОД</button>
                </div>
            </form>
        </div>

    </div><!-- /.row -->
</div><!-- /.container -->



<%--<div class="modal-dialog">--%>
    <%--<div class="loginmodal-container">--%>
        <%--<h4>Введите логин и пароль</h4><br>--%>
        <%--<form>--%>
            <%--<input type="text" name="login" placeholder="Логин">--%>
            <%--<input type="text" name="password" placeholder="Пароль">--%>
            <%--<input class="btn btn-success" type="submit" value="Войти">--%>
            <%--<%--%>
<%--//                if (UserService.findAllUsers().isEmpty()) {--%>
<%--//                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("showResult.jsp");--%>
<%--//                    requestDispatcher.forward(request, response);--%>
<%--//                }--%>
                <%--String login = request.getParameter("login");--%>
                <%--String password = request.getParameter("password");--%>
                <%--if (login != null && password == null) {--%>
            <%--%>--%>
            <%--<h4 style="color:#ff0000">Введите пароль</h4>--%>
            <%--<%--%>
            <%--} else if (password != null) {--%>
                <%--List<Users> usersList = UserService.findAllUsers();--%>
                <%--for (Users user : usersList) {--%>
                    <%--if (user.getLogin().equals(login) && user.getPassword().equals(password)) {--%>
                        <%--session.setAttribute("user", user);--%>
                        <%--RequestDispatcher requestDispatcher = request.getRequestDispatcher("showResult.jsp");--%>
                        <%--requestDispatcher.forward(request, response);--%>
                    <%--}--%>
                <%--}--%>
            <%--%><h4 style="color:#ff0000">Неверное имя пользователя или пароль</h4><%--%>
            <%--}--%>
        <%--%>--%>
        <%--</form>--%>

        <%--<div class="login-help">--%>
            <%--<a href="#">Регистрация</a>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<%--</div>--%>

<%--</form>--%>
</body>
</html>
