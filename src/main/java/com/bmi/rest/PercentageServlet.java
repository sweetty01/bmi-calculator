package com.bmi.rest;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class PercentageServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int maths = Integer.parseInt(request.getParameter("maths"));
    int science = Integer.parseInt(request.getParameter("science"));
    int english = Integer.parseInt(request.getParameter("english"));

    double percentage = ((maths + science + english) / 3.0);

    response.setContentType("text/html");
    response.getWriter().println("<html><body><h1>Percentage: " + percentage + "%</h1></body></html>");
  }
}
