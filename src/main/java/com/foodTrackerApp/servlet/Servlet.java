package com.foodTrackerApp.servlet;

import com.foodTrackerApp.command.Command;
import com.foodTrackerApp.command.factory.CommandFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();
        Command command = CommandFactory.getInstance().getCommand(path);
        if (command != null) {
            String jspPage = CommandFactory.getInstance().getCommand(path).execute(request);
            request.getRequestDispatcher("/WEB-INF" + jspPage).forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
        }
    }
}
