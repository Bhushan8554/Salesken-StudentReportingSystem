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
            color: aliceblue;
        }
        body{
            background-color:cornflowerblue ;
        }
        form{
            margin: auto;
            text-align: center;
            display: flex;
            flex-direction: column;
            width: 200px;
            border: 1px solid;
            padding: 20px;
            border-radius: 10px;
            background-color: aquamarine;
        }
        input{
            padding: 5px;
            border-radius: 5px;
        }
        button{
            width: 150px;
            background-color:blue;
            color: aliceblue;
            margin: auto;
            padding: 10px;
        }
        a{
            text-decoration: none;
            color: aliceblue;
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

        <form:input type="number" placeholder="Sem1 math" path="semester1.math"/><br>
        <form:input type="number" placeholder="Sem1 english" path="semester1.english"/><br>
        <form:input type="number" placeholder="Sem1 science" path="semester1.science"/><br>

        <form:input type="number" placeholder="Sem2 math" path="semester2.math"/><br>
        <form:input type="number" placeholder="Sem2 english" path="semester2.english"/><br>
        <form:input type="number" placeholder="Sem2 science" path="semester2.science"/><br>
        <form:button>add</form:button>
    </form:form>

</body>
</html>