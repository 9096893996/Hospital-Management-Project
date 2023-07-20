<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
 <%@include file="all_js_css.jsp" %>
</head>
<body>
  <h2>Login</h2>
  <div class="login-form">
    <form action="login" method="get">
      <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required>
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
      </div>
      <div class="form-group">
        <label>User Type</label>
        <div class="switch-label">
          <input type="radio" id="doctor" name="user-type" value="doctor" checked>
        
          <label for="doctor">Doctor</label>
        </div>
        <div class="switch-label">
          <input type="radio" id="receptionist" name="user-type" value="receptionist">
          <label for="receptionist">Receptionist</label>
        </div>
      </div>
         <div class="form-submit">
        <input type="submit" value="Login">
        <input type="button" onclick="registerPage.jsp" value="Register">
      </div>
      
    </form>
    
 
        
    </form>
  </div>
</body>
</html>