/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jay;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nguye
 */
public class ArithmeticCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/jsp/arithmeticcalculator.jsp").forward(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            String operand = req.getParameter("button");
            String number1 = req.getParameter("number1");
            String number2 = req.getParameter("number2");
            int result = 0;

            if (number1 == "" && number2 == "") {
                req.setAttribute("exceptionMessage", "Result: ---");
                getServletContext().getRequestDispatcher("/WEB-INF/jsp/arithmeticcalculator.jsp").forward(req, res);
                return;
            }
            if (number1 == "" || number2 == "") {
                req.setAttribute("exceptionMessage", "Result: invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/jsp/arithmeticcalculator.jsp").forward(req, res);
                return;
            }
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            switch (operand) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;

            }
            req.setAttribute("result", "Result: " + result);
            getServletContext().getRequestDispatcher("/WEB-INF/jsp/arithmeticcalculator.jsp").forward(req, res);
        } catch (NumberFormatException e) {
            req.setAttribute("result", "Result: invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/jsp/arithmeticcalculator.jsp").forward(req, res);
        }
    }

}
