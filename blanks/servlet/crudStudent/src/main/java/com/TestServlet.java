package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


@WebServlet("/")
public class  TestServlet extends HttpServlet {

    ArrayList<String> names = new ArrayList<>(Arrays.asList("Alexey", "Boris", "Victor", "Gleb", "Denis", "Emelya"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("names", names);

        if(req.getParameter("submit")!= null && req.getParameter("submit").equals("add")){
            addStudent(req);
            req.getRequestDispatcher("hello.jsp").forward(req, resp);
        }
        else if(req.getParameter("submit")!= null && req.getParameter("submit").equals("delete")){
            deleteStudent(req);
            req.getRequestDispatcher("hello.jsp").forward(req, resp);
        }

        else if(req.getParameter("submit")!= null && req.getParameter("submit").equals("send")){
            redirect(req, resp);
        }

        else{
            req.getRequestDispatcher("hello.jsp").forward(req, resp);
        }
    }


    private void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/bye.jsp");
        System.out.println("Go to bye");
    }

    private void addStudent(HttpServletRequest req) {
            names.add(req.getParameter("addName"));
    }

    private void deleteStudent(HttpServletRequest req) {
        names.remove(req.getParameter("delName"));
    }
}
