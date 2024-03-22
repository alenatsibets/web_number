<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Number</title>
  <style>
    body {
      font-family: Georgia, sans-serif;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background-color: #5fafb2;
    }

    .container {
      text-align: center;
      border: 2px solid #ccc;
      border-radius: 10px;
      padding: 20px;
      background-color: #fff;
    }
    input {
      font-family: Georgia, sans-serif;
      font-size: 20px;
    }
  </style>
</head>
<body>
<br/>
<div class="container">
  <h1>Enter the number</h1>
  <form action="controller">
    <input type="text" name="num" value="1"/>
    <hr/>
    <input type="submit" name="sub" value="Push"/>
  </form>
  ${login_msg}
</div>
</body>
</html>