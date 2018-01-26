<html>
<head>
<title>user.login.page</title>
</head>
<body><h1><h1><div><p>${message}</p></div></h1></body>
<body><h1><h1><div ><p style="color:red;">${message}</p></div></h1></body>
<body>
<form action="login_user" method="post">
<label>Username</label><input type="text" name="username" required="required" >
<label>Password</label><input type="password" name="password">
<input type="submit" value="Login"></nbsp>or
<a href="register">Register</a>
</form>
</body>
</html>