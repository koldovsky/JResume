<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html/>
<html>
<head>
    <title>Sign in</title>
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="css/lib/bootstrap/bootstrap.css">
</head>
<body>
<div class="wrapper">
  <form class="form-signin" method="post" name="loginForm">
    <h2 class="form-signin-heading">Please sign in</h2>
    <hr class="colorgraph">
    <div class="input-group">
      <span class="input-group-addon">
        <i class="glyphicon glyphicon-user"></i>
      </span> 
      <input class="form-control" placeholder="E-mail" name="email" type="text" autofocus required>
    </div>
    <div class="input-group">
      <span class="input-group-addon">
        <i class="glyphicon glyphicon-lock"></i>
      </span> 
      <input class="form-control" placeholder="Password" name="password" type="password" required>
    </div>
    <label class="checkbox">
      <input type="checkbox" value="remember-me" name="rememberMe"> Remember me
    </label>
    <button class="loginbtn btn btn-lg btn-success btn-block" type="submit">Sign in</button>
    <a class="register-suggestion" href="">Don't have an account? Sign up now.</a>
  </form>
</div>
</body>
</html>