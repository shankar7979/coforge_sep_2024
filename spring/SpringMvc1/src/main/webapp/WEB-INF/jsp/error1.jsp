<html>
<head>
<style>
  .style1{
    border:solid blue;
    padding:30px;
    width:30%;
    margin-left:300pt;
    margin-top:40pt;
    color:red;

  }
  </style>
  </head>
  <%@ page isELIgnored="false" %>
  <%@ page isErrorPage="true" %>

  <body>
    <div class="style1">
     Error is <%=exception.getMessage()%>

    </div>
    <div style="width:30%;margin-left:300pt;margin-top:40pt;font-weight:bold">
       <a href="welcome">Back</a>
    <div>

  </body>
  </html>