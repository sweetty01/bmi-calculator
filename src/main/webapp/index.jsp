<!DOCTYPE html>
<html>
  <head>
    <title>BMI Calculator</title>
  </head>
  <body>
    <h1>BMI CALCULATOR</h1>
    <form action="bmi" method="post">
      <label>Height:</label>
      <input type="number" name="height">
      <select name="heightUnit" id="height">
        <option value="cm">cm</option>
        <option value="foot">foot</option>
        <option value="inch">inch</option>
        <option value="metre">metre</option>
      </select><br>
      <label>Weight:</label>
      <input type="number" name="weight">
      <select name="weightUnit" id="weight">
      <option value="kg">kg</option>
      <option value="lbs">lbs</option></select><br>
      <input type="submit" value="Calculate Bmi">

    </form>
  </body>
</html>
