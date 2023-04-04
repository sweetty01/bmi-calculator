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
        <h1 class="text-7xl my-10">BMI CALCULATOR</h1>
        <form action="bmi" method="post">
          <label>Height:</label>
          <input type="text" name="height">
          <select class="mb-5" name="heightUnit" id="height">
            <option value="cm">cm</option>
            <option value="foot">foot</option>
            <option value="inch">inch</option>
            <option value="metre">metre</option>
          </select><br>
          <label>Weight:</label>
          <input type="text" name="weight">
          <select class="mb-5" name="weightUnit" id="weight">
          <option value="kg">kg</option>
          <option value="lbs">lbs</option></select><br>
          <input class="w-full bg-sky-400 rounded-xl text-white py-2" type="submit" value="Calculate BMI"
          <form action="result.jsp" method="post">
            <!-- your form inputs here -->
          </form>
    </form>
    </div>
  </div>
  </body>
</html>