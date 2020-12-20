package com.example.RakiServlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Raki", value = "/Raki")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "This is my first servlet <p> <p> I am really proud of my self :)";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (int i = 0; i < 5; i++) {
            out.println("<h1>" + message + "</h1>");
        }

        out.println("</body></html>");
    }

    public void destroy() {
    }
}