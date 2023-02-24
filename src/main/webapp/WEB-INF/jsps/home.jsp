<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    .head{
        text-align: center;
    }
    .options{
        width: 400px;
        margin: auto;
        text-align: left;
        display: flex;
        flex-direction: column;
        gap: 10px;
        border: 1px solid ;
        padding: 15px;
    }
    .options>button{
        width: 200px;
    }.options>form{
        margin-bottom: 15px ;
    }
</style>
</head>
<body>

    <h1 class="head">
        Welcome to Student Reporting System
    </h1>
    
    <div class="options">
        <button>
            <a href="/student">Add Student</a>
        </button><br>
        
       <form action="/report" method="post">
            <input type="number" placeholder="Roll no" name="studentRoll">
            <input type="submit" value="See report of Student">
       </form>
       <form action="/avg" method="post">
        <input type="number" placeholder="Semister no" name="sem">
        <input type="submit" value="% of class">
       </form>
       <form action="marks" method="post">
       
        <select name="sub" id="sub">
            <option value="english">english</option>
            <option value="math">math</option>
            <option value="science">science</option>
           
          </select>
        <input type="submit" value="Avg per subject">
       </form>
    
       <button>
        Top 2 Student
       </button>
    
    
    
    </div>

</body>
</html>