package com.jay;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nguye
 */
public class AgeCalcultorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/jsp/agecalculator.jsp").forward(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String age = req.getParameter("age");

        if (age.equals("") || age == null) {
            req.setAttribute("exceptionMessage", "you must enter your age");
            getServletContext().getRequestDispatcher("/WEB-INF/jsp/agecalculator.jsp").forward(req, res);
            return;
        }

        int ageNextYear = Integer.parseInt(age) + 1;
        req.setAttribute("result", "your age next birthday will be " + ageNextYear);
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/agecalculator.jsp").forward(req, res);
    }
}
