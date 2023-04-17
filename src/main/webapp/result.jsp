<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>BMI Calculator</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
      .collapsible {
        background-color: #777;
        color:black;
        cursor: pointer;
        padding: 18px;
        width: 100%;
        border: black;
        text-align: left;
        outline: black;
        font-size: 15px;
        }

      .active, .collapsible:hover {
          background-color: #dad1da;
        }
      .content {
          padding: 0 18px;
          display: none;
          overflow: hidden;
          background-color: #f1f1f1;
        }
    </style>
  </head>
  <body>
    <div class="flex flex-col items-center justify-center h-[100vh] bg-gradient-to-r from-indigo-200 via-red-200 to-yellow-100">
      <div class="bg-white rounded-xl p-10 bg-clip-padding backdrop-filter bg-white bg-opacity-30 backdrop-blur-md flex flex-col justify-center items-center w-11/12 lg:w-1/3">
        <p class=" text-5xl font-bold">Your BMI is <%= request.getAttribute("bmi") %></p>
        <p class="text-xl mt-5"><%= request.getAttribute("status") %></p>
        <button type="button" class="collapsible text-center"> <%=request.getAttribute("button") %></button>
        <div class="content"> 
          <p> <%= request.getAttribute("statement") %></p>
          <br>
        </div>
        <button type="button" class="collapsible text-center"> <%=request.getAttribute("button1") %></button>
        <div class="content">
          <p> <%= request.getAttribute("statement1") %></p>
        </div>
        <script>
          var coll = document.getElementsByClassName("collapsible");
          var i;
          for (i = 0; i < coll.length; i++) {
            coll[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var content = this.nextElementSibling;
            if (content.style.display === "block") {
              content.style.display = "none";
            } else {
              content.style.display = "block";
            }
          });
        }
      </script>    
      </div>
    </div>
</body>
</html>