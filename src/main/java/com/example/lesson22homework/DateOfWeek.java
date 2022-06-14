package com.example.lesson22homework;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@WebServlet(name = "Lesson22HM1", value = "/homeworkEx1")
public class DateOfWeek extends HttpServlet {


    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("date");

        LocalDate date = LocalDate.parse(name);
        DayOfWeek day = date.getDayOfWeek();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + day + "</h1>");
        out.println("</body></html>");


    }

    public void destroy() {
    }
}
