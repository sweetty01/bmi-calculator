<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>BMI Calculator</title>
    <script src="https://cdn.tailwindcss.com"></script>
  </head>
  <body>
    <div class="flex flex-col items-center justify-center h-[100vh] bg-gradient-to-r from-indigo-200 via-red-200 to-yellow-100">
      <div class="bg-white rounded-xl p-10 bg-clip-padding backdrop-filter bg-white bg-opacity-30 backdrop-blur-md flex flex-col justify-center items-center">
        <p>The bmi value is <%= request.getAttribute("message") %></p>
      <p>You are <%= request.getAttribute("mess") %></p>
        </div>
    </div>
</body>
</html>

    
