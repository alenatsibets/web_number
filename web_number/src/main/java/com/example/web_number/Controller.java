package com.example.web_number;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = {"/controller", "*.do"})
public class Controller extends HttpServlet {
    private static final Logger logger = Logger.getLogger(String.valueOf(Controller.class));
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String strNum = request.getParameter("num");
        try {
            int resNum = 2 * Integer.parseInt(strNum);
            request.setAttribute("result", resNum);
            request.getRequestDispatcher("pages/main.jsp").forward(request, response);
            logger.info("Result: " + resNum);
        } catch (NumberFormatException e) {
            request.setAttribute("login_msg", "incorrect value");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
            logger.info(e.getMessage() + " Incorrect value: " + strNum);
        }
    }

    public void destroy() {
    }
}