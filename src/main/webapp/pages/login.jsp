<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>User Login</title>
    <link rel="stylesheet" href="Login,Register.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="../CSS/Login,Register.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <div class="container">
        <div class="image">
            <img src="../Image/FormImage.png" alt="Login Image">
        </div>
        <div class="form-container">
            <div class="title">Login</div>
            <form action="${pageContext.request.contextPath}/registerServlet" method="post">
                <div class="user-details">
                    <div class="logininput">
                        <i class="fas fa-envelope"></i>
                        <input type="email" name="email" placeholder="Enter your email" required>
                    </div>
                    <div class="logininput">
                        <i class="fas fa-lock"></i>
                        <input type="password" name="password" placeholder="Enter your password" required>
                    </div>
                    <div class="forgot-password">
                        <a href="#">Forgot password?</a>
                    </div>
                    <div class="button input-box">
                        <input type="submit" value="Submit">
                    </div>
                    <div class="text sign-up-text">
                        Don't have an account? <a href="Register.html">Register now</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>

</html>
    