<%@page language="java" %>
<html>
    <head>
        <title>Show Result</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
    <!--<h2>Result is: <%= session.getAttribute("result") %> </h2>-->
    <!--session object is given by the JSP page this is the in-built object such as request, response, etc-->

    <!--using JSTL-->
    <h2>Result is: ${result} </h2>
    </body>
</html>