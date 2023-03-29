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
    String statement="";
    String button="";
    String statement1 ="";
    String button1="";
   // String statement2 ="";
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
    if(bmi<18.5)
    {
      status ="Underweight";
      statement="Focus on eating whole, nutrient-dense foods that are high in calories such as nuts, seeds, nut butter, avocados, cheese, whole milk, meat, fish, and eggs. Avoid processed foods, sugary drinks, and excessive amounts of saturated and trans fats.";
      statement1="To gain weight, you need to consume more calories than you burn. You can do this by gradually increasing your calorie intake by 300-500 calories per day, depending on your current weight and activity level.";
      button="Eat a balanced diet";
      button1="Increase calorie intake";
      request.setAttribute("bmi", bmi);
      request.setAttribute("status", status);
      request.setAttribute("statement", statement);
      request.setAttribute("button", button);
      request.setAttribute("statement1", statement1);
      request.setAttribute("button1", button1);
      request.getRequestDispatcher("result.jsp").forward(request, response); 
    }
    else if(bmi>=18.5 && bmi<24.9 )
    {
      status="Normal";
      statement="Eating a balanced diet that is rich in nutrient-dense foods such as fruits, vegetables, whole grains, lean proteins, and healthy fats is important for overall health and maintaining a healthy weight. Focus on consuming a variety of foods and avoiding processed foods and excessive amounts of sugar and unhealthy fats.";
      statement1="Regular physical activity is important for maintaining a healthy weight and overall health. Aim for at least 150 minutes of moderate-intensity exercise or 75 minutes of vigorous-intensity exercise per week.";
      button="Continue to eat a balanced diet ";
      button1="Stay active";
      //statement2="Congratulations..You have Normal BMI.\n Here are some of the measures.";
      request.setAttribute("bmi", bmi);
      request.setAttribute("status", status);
      //request.setAttribute("statement2", statement2);
      request.setAttribute("statement", statement);
      request.setAttribute("button", button);
      request.setAttribute("statement1", statement1);
      request.setAttribute("button1", button1);
      request.getRequestDispatcher("result.jsp").forward(request, response);  
    }
    else if(bmi>=25 && bmi<29.9)
    {
      status="Overweight";
      statement="Focus on eating whole, nutrient-dense foods such as fruits, vegetables, lean proteins, and whole grains. Avoid processed foods, sugary drinks, and excessive amounts of saturated and trans fats.";
      statement1="Lack of sleep can contribute to weight gain. Aim for 7-8 hours of sleep per night.";
      button="Eat a balanced diet ";
      button1="Get enough sleep";
      request.setAttribute("bmi", bmi);
      request.setAttribute("status", status);
      request.setAttribute("statement", statement);
      request.setAttribute("button", button);
      request.setAttribute("statement1", statement1);
      request.setAttribute("button1", button1);
      request.getRequestDispatcher("result.jsp").forward(request, response);
    }
    else{
      status ="Obesity";
      request.setAttribute("bmi", bmi);
      request.setAttribute("status", status);
      statement="To lose weight, you need to create a calorie deficit by consuming fewer calories than you burn. You can do this by reducing your daily calorie intake by 500-1000 calories, depending on your current weight and activity level.";
      statement1="Focus on eating whole, nutrient-dense foods such as fruits, vegetables, lean proteins, and whole grains. Avoid processed foods, sugary drinks, and excessive amounts of saturated and trans fats.";
      button="Start with a calorie deficit";
      button1="Eat a balanced diet";
      request.setAttribute("bmi", bmi);
      request.setAttribute("status", status);
      request.setAttribute("statement", statement);
      request.setAttribute("button", button);
      request.setAttribute("statement1", statement1);
      request.setAttribute("button1", button1);
      request.getRequestDispatcher("result.jsp").forward(request, response);
    }
    }
  }