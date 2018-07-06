package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/bye", name = "Bye")
public class Bye extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello at bye!");
        String sos = req.getParameter("print");
        System.out.println("print: " + req.getParameter("print"));

        req.setAttribute("sos", sos);
        System.out.println("send: " + req.getParameter("send"));

        req.getRequestDispatcher("bye.jsp").forward(req, resp);
    }
}
