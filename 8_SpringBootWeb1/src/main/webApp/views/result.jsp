<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Welcome!!!</h2>

        <p> ${alien} </p>  <!-- Another way =>   <%= session.getAttribute("result") %>    -->

        <p> Welcome to the ${course} World </p>

    </body>

</html>