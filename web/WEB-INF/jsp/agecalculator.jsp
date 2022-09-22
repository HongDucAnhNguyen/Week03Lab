<%-- 
    Document   : agecalculator
    Created on : 21-Sep-2022, 5:26:53 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week03 Lab</title>
    </head>
    <body>
        <form method="POST" action="">
            <h1>
                Age Calculator
            </h1>
            <label>Enter your age</label>
            <input type="text" name="age">
            <br>
            <button>Age next birthday</button>
        </form>
        <p>${result}</p>
        <p>${exceptionMessage}</p>
        <a href="/age/arithmetic">Arithmetic Calculator</a>
    </body>
</html>



