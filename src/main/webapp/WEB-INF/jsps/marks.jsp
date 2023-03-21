<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body{
        background-color: cornflowerblue;
        
        color: aliceblue;
    }
    h1{
        text-align: center;
    }
    h2{
        border: 1px solid black;
        border-radius: 10px;
        background-color: aquamarine;
        color: blue;
        width: 150px;
        margin: auto;
        padding: 10px;
        text-align: center;
    }
    a{
        text-decoration: none;
        color: aliceblue;
    }
    .btn{
        
        background-color: blue;
        color: wheat;
    }
    
</style>
</head>
<body>
    <button class="btn">
        <a href="/">
            Go to home
        </a>
</button>
<h1>Average of all class in a subject</h1>

<h2>
    ${marks}
</h2>


</body>
</html>