<%--
  Created by IntelliJ IDEA.
  User: Макс
  Date: 20.11.2017
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="../styleCSS/RegCss.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" />
</head>
<body>
<div class="p-x-1 p-y-3">
    <form class="card card-block m-x-auto bg-faded form-width">
        <legend class="m-b-1 text-xs-center">Регистрация</legend>
        <div class="form-group input-group">
 <span class="has-float-label">
 <input class="form-control" id="first" type="text" placeholder="Имя"/>
 <label for="first">Имя</label>
 </span>
            <span class="has-float-label">
 <input class="form-control" id="last" type="text" placeholder="Фамилия"/>
 <label for="last">Фамилия</label>
 </span>
        </div>
        <div class="form-group input-group">
            <span class="input-group-addon">@</span>
            <span class="has-float-label">
 <input class="form-control" id="email" type="email" placeholder="name@example.com"/>
 <label for="email">E-mail</label>
 </span>
        </div>
        <div class="form-group has-float-label">
            <input class="form-control" id="password" type="password" placeholder="••••••••"/>
            <label for="password">Пароль</label>
        </div>
        <div class="form-group has-float-label">
            <input class="form-control" id="password" type="password" placeholder="••••••••"/>
            <label for="password">Пароль повторно</label>
        </div>
        <div class="form-group has-float-label">
            <select class="form-control custom-select" id="country">
                <option selected>Россия</option>
                <option>Казахстан</option>
                <option>Белоруссия</option>
            </select>
            <label for="country">Страна</label>
        </div>
        <div class="form-group">
            <label class="custom-control custom-checkbox">
                <input class="custom-control-input" type="checkbox"/>
                <span class="custom-control-indicator"></span>
                <span class="custom-control-description">Получать новости</span>
            </label>
        </div>
        <div class="text-xs-center">
            <button class="btn btn-block btn-primary" type="submit">Регистрация</button>
        </div>
    </form>
</div>
</body>
</html>
