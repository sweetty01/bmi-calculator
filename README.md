# BMI Calculator App
This is a simple BMI (Body Mass Index) Calculator web application implemented using Open Liberty, HttpServlet, and Tailwind CSS. The application allows users to calculate their BMI by providing their weight and height in any of the supported units. It also saves the calculated BMI in a database.

## Technologies Used
- [Open Liberty](https://openliberty.io): An open-source Java EE application server that provides a lightweight and fast runtime for developing web applications.
- [HttpServlet](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html): A Java class that extends the javax.servlet.GenericServlet class and provides methods for handling HTTP requests and generating responses.
- [Tailwind CSS](https://tailwindcss.com): A popular CSS framework that provides a set of pre-designed UI components and utilities for building responsive and modern user interfaces.

## Features
- Users can input their weight and height in any of the given units to calculate their BMI.
- The calculated BMI is displayed with a corresponding BMI category (e.g., Underweight, Normal, Overweight, etc.) according to the BMI classification.
- Save the calculated BMI on a database.

## Getting Started

Follow these steps to set up and run the BMI Calculator app on your local environment:

1. Clone the repository: Clone the BMI Calculator app repository to your local machine using Git or by downloading the ZIP file.
2. Setting up environment: Create a bmi.properties file at src/webapp/META-INF/ and paste your mongoDB password.
```
pass=yourmongodbpassword
```
3. Build and run the app: Navigate to the project directory and run the following commands in the terminal:
```
mvn liberty:dev
```

## Acknowledgements

- [Open Liberty Guides](https://openliberty.io/guides/)
- [Tailwind CSS docs](https://tailwindcss.com/docs/installation)
