package com.example.lesson22homework;

import java.io.*;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Lesson22HM", value = "/homework")
public class HelloServlet extends HttpServlet {
Date date;

    public void init() {
        date = new Date();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + date + "</h1>");
        out.println("</body></html>");



       // RequestDispatcher dispatcher = request.getRequestDispatcher("dateOfWeek.jsp");
        //dispatcher.forward(request, response);
    }

    public void destroy() {
    }
}