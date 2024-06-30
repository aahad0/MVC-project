<%-- 
    Document   : Indexdemo
    Created on : 10-Jun-2024, 4:27:27 PM
    Author     : abdul
--%>
<%@page session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LOGIN FORM</h1>
        <form action="/MVCproject/fc/?type=models&page=Login" method="POST">
            <br><input type="text" String name = "email" placeholder="Email Id"/><br>
            <br><input type='password' name="password" placeholder="password"/><br>
            <br><input type="submit" value="Login"/>
        </form>
        <h1>REGISTRATION FORM</h1>
        <form action="/MVCproject/fc/?type=models&page=Registration" method="POST">
            <br><input type="text" String name = "email" placeholder="Email Id"/><br>
            <br><input type="password" name="password" placeholder="password"/><br>
            <br><input type="text" String name = "fname" placeholder="First Name"/><br>
            <br><input type="text" String name = "lname" placeholder="Last Name"/><br>
            <br><input type="date" name="dob"/><br><br>
            <label>GENDER<input type="radio" name="gender" value="male"/> Male
                <input type="radio" name="gender" value="female"/>/Female</label><br>
            <br><input type="submit" value="Register"/>
        </form>
    </body>
</html>
