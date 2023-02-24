<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
    <style>
        h1{
            text-align: center;
        }
        form{
            margin: auto;
            text-align: center;
            display: flex;
            flex-direction: column;
            width: 200px;
            border: 1px solid;
            padding: 10px;
        }
        button{
           margin: auto;
           width: 100px;
        }
        a{
            text-decoration: none;
            color: black;
        }

    </style>
</head>
<body>

    <button>
        <a href="/">
            Go to home
        </a>
       </button>
    <h1>Add Student</h1>
    <form:form action="student" method="POST" modelAttribute="student">
        <form:input type="number" placeholder="roll no" path="roll"/><br>
        <form:input type="text" placeholder="name" path="name"/><br>
        <form:input type="text" placeholder="address" path="address"/><br>
        <form:button>add</form:button>
    </form:form>

</body>
</html>