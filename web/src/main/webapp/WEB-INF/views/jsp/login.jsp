<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html/>
<html>
<head>
    <title>Sign in</title>
    <jsp:include page="generic.jsp"/>
    <script src="resources/js/lib/jquery-validate/jquery.validate.js"></script>
    <link rel="stylesheet" href="resources/css/login.css">
    <script src="resources/js/login.js"></script>
</head>
<body class="login-body">
<div class="wrapper">
  <form class="login-form form-signin" action="j_spring_security_check" method="POST" role="form">
    <h3 class="form-signin-heading">Please sign in</h3>
    <hr class="colorgraph">
    <c:if test="${not empty error}">
      <div class="error alert alert-danger fade in">
        <strong>Error! </strong>${error}
      </div>
    </c:if>
    <div class="input-group">
      <span class="input-group-addon">
        <i class="glyphicon glyphicon-user"></i>
      </span> 
      <input id= "email" class="form-control" placeholder="E-mail" name="username" type="text" rel="popover">
    </div>
    <div class="input-group">
      <span class="input-group-addon">
        <i class="glyphicon glyphicon-lock"></i>
      </span>
      <input id= "password" class="form-control" placeholder="Password" name="password" type="password">
    </div>
    <label class="checkbox">
      <input type="checkbox" name="remember-me"/> Remember me
    </label>
    <button class="loginbtn btn btn-lg btn-success btn-block" type="submit">Sign in</button>
    <a class="register-suggestion" href="register">Don't have an account? Sign up now.</a>
  </form>
</div>
</body>
</html>