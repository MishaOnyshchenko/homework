package com.studentsList.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        req.setAttribute("name", "studlist");
//        req.getRequestDispatcher("students.jsp").forward(req, resp);
//
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//
//        req.setAttribute("name", "I'v got you " + name + " " + surname);
        req.getRequestDispatcher("students.jsp").forward(req, resp);

    }
}