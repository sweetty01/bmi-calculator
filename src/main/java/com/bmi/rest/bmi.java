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
    String status = "";
    if(heightUnit.equals("cm")){
      heightFactor=0.01;
    }
    else if (heightUnit.equals("foot"))
    {
      heightFactor =0.3048;
    }
    else if (heightUnit.equals("inch"))
    {
      heightFactor =0.0254;
    }
    else{
      heightFactor=1;
    }

    if(weightUnit.equals("lbs")){
      weightFactor=0.453592;
    }
    else{
      weightFactor=1.0;
    }
    double bmi = (weight*weightFactor ) / (height * height*heightFactor*heightFactor);

    if(bmi< 16)
    {
      status ="Severe Thinness";
    }
    else if(bmi>=16 && bmi<17 )
    {
      status="Moderate Thinness";
    }
    else if(bmi>=17 && bmi<18.5)
    {
      status="Mild Thinness";
    }
    else if(bmi>=18.5 && bmi<25 )
    {
      status="Normal";
    }
    else if(bmi>=25 && bmi<30)
    {
      status="Overweight";
    }
    else if(bmi>=30 && bmi<35 )
    {
      status="Obese Class I ";
    }
    else if(bmi>=35 && bmi<40)
    {
      status="Obese Class II";
    }
    else{
      status ="Obese Class III";
    }
    request.setAttribute("message", bmi);
    request.setAttribute("mess", status);
    request.getRequestDispatcher("result.jsp").forward(request, response);
    
    }
  }