<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Report</title>
<style>
table ,td,th,tr {
    border:  1px solid black;
    margin: auto;
    padding: 10px;
    background-color: aquamarine;
}
body{
        background-color:cornflowerblue;
    }
th{
    background-color: aqua;
    color: red;

}
h2{
    text-align: center;
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
    <button class="btn">
        <a href="/">
            Go to home
        </a>
</button>
<h2>student name ${data.name}</h2>
<h2>student roll ${data.roll}</h2>
<table>
    <tr>
        <th>
            sem no
        </th>
        <th>
            math
        </th>
        <th>
            english
        </th>
        <th>
            science
        </th>
    </tr>
    <tr>
        <td>
            1
        </td>
        <td>
            ${data.semester1.math}
        </td>
        <td>
            ${data.semester1.english}
        </td>
        <td>
            ${data.semester1.science}
        </td>

    </tr>
    <tr>
        <td>
            2
        </td>
        <td>
            ${data.semester2.math}
        </td>
        <td>
            ${data.semester2.english}
        </td>
        <td>
            ${data.semester2.science}
        </td>

    </tr>

</table>



</body>
</html>