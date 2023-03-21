package com.bmi.rest;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class bmi extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    double weight = Double.parseDouble(request.getParameter("weight"));
		double height = Double.parseDouble(request.getParameter("height"));
    String heightUnit = request.getParameter("heightUnit");
    String weightUnit = request.getParameter("weightUnit");
    double heightFactor=1.0;
    double weightFactor =1.0;
    if(heightUnit == "cm"){
      heightFactor=1/100;
    }
    else if (heightUnit== "feet")
    {
      heightFactor =0.3048;
    }
    else if (heightUnit=="inch")
    {
      heightFactor =0.0254;
    }
    else{
      heightFactor=1;
    }

    if(weightUnit == "lbs"){
      weightFactor=0.453592;
    }
    else{
      weightFactor=1;
    }



    double bmi = (weight*weightFactor ) / (height * height*heightFactor*heightFactor);

    response.setContentType("text/html");
    response.getWriter().println("<html><body><h1>bmi " + bmi + "%</h1></body></html>");
  }
}