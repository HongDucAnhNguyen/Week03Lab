<%-- 
    Document   : arithmeticcalculator
    Created on : 21-Sep-2022, 7:48:31 PM
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
                Arithmetic Calculator
            </h1>
            <label>First:</label>
            <input type="text" name="number1">
            <br>
            <label>Second</label>
            <input type="text" name="number2">
            <br>
            <button name="+">+</button>
            <button name="-">-</button>
            <button name="*">*</button>
            <button name="%">%</button>
        </form>
        <p>${result}</p>
        <p>${exceptionMessage}</p>
        <a href="/age">Age Calculator</a>
    </body>
</html>
