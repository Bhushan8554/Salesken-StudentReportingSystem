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

        <form:input type="number" placeholder="Sem1 math" path="semister1.math"/><br>
        <form:input type="number" placeholder="Sem1 english" path="semister1.english"/><br>
        <form:input type="number" placeholder="Sem1 science" path="semister1.science"/><br>

        <form:input type="number" placeholder="Sem2 math" path="semister2.math"/><br>
        <form:input type="number" placeholder="Sem2 english" path="semister2.english"/><br>
        <form:input type="number" placeholder="Sem2 science" path="semister2.science"/><br>
        <form:button>add</form:button>
    </form:form>

</body>
</html>