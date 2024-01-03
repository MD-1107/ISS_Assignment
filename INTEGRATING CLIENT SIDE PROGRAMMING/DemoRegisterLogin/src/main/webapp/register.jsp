<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
 <%--- <script src="script.js"></script>--%>
 <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<form id="form" name="registerForm" action="Register" method="post">

<div class="input-control">
<label for="name">Name</label>
<input type="text" id="name" name="name"/> 
<br/> <br/>
<div class="error"></div>
</div>

<div class="input-control">
<label for="email">Email</label>
<input type="email" id="email" name="email"/>
<br/> <br/>
<div class="error"></div>
</div>


<div class="input-control">
<label for="contact">Contact Number</label>
<input type="text" id="contact" name="contact"/> 
<br/> <br/>
<div class="error"></div>
</div>


<div class="input-control">
<label for="password">Password</label>
<input type="password" id="password" name="password"/> 
<br/> <br/>
<div class="error"></div>
</div>

<div class="input-control">
<label for="password2">Password again</label>
<input type="password" id="password2" name="password2"/> 
<br/> <br/>
<div class="error"></div>
</div>

<div class="input-control">
<label for="gender">Gender</label>
<input type="radio" id="gender" name="gender"/> Male<input type="radio" name="gender">Female<input type="radio" name="gender">Others
<br/> <br/>
<div class="error"></div>
</div>

<div class="input-control">
<label for="city">City</label>
<select name="city" id="city">
          <option> Select City </option>
          <option> Delhi </option>
          <option> Mumbai </option>
          <option> Pune </option>
          <option> Bengalore </option>
</select>
<br/> <br/>
<div class="error"></div>
</div>

<div class="input-control">
    <input type="submit" value="Register" />
<div class="error"></div>
</div>
</form>
</div>
</body>
</html>