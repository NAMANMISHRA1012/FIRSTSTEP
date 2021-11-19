<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RECENT</title>
</head>
<body>

<div>
<form action="adduser" method="post">
<h2>Enter Employee Details</h2>
<p>User ID : <input type="text" placeholder="User ID" name="userId"></p>
<p>User Name : <input type="text" placeholder="User Name" name="userName"></p>
<p>Email : <input type="email" placeholder="Email" name="email"></p>
<p>Password : <input type="password" placeholder="password" name="passWord"></p>
<button type="submit">Save Employee</button>
</form>
</div>



<div>
<form action="loginpage" method = "get">
<h2>  LOGIN YOUR DETAILS</h2>
Name : <input type="text" name="userName">
<button type="submit">Enter</button>
</form>








</div>

<div>
<form action="user/{userId}" method="get">
<h2>Enter Employee Details</h2>
<p>User ID : <input type="text" placeholder="User ID" name="userId"></p>
<button type="submit">Save Employee</button>
</form>
</div>

<div>
<form action="users" method="get">
<h2>Get Employee Details</h2>

<button type="submit">Enter</button>
</form>
</div>







</body>
</html>