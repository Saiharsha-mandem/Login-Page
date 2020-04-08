
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sample login page using java,maven and springboot</title>
    <link rel="stylesheet" href="css/index_page_style.css">
  </head>
  <body>
  <form method="post" action="server">
    <table>
      <tr class="red"><td colspan="2">${index}</td></tr>
      <tr>
        <td>Username: </td><td><input type="text" name="username"></td>
      </tr>

      <tr>
        <td>Password: </td><td><input type="password" name="password"></td>
      </tr>

      <tr>
        <td><input id="submit" type="submit"></td><td><input id="reset" type="reset"></td>
      </tr>
    </table>

  </form>
  </body>
</html>
