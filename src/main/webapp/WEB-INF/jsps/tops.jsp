<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Student</title>
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
h2>span{
    text-align: center;
    color: red;
}
h1{
    text-align: center;
    color:cyan;
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
<h1>Top Students are as follows</h1>

<h2>student name <span>${top1.name}</span></h2>
<h2>student roll <span>${top1.roll}</span></h2>
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
            ${top1.semester1.math}
        </td>
        <td>
            ${top1.semester1.english}
        </td>
        <td>
            ${top1.semester1.science}
        </td>

    </tr>
    <tr>
        <td>
            2
        </td>
        <td>
            ${top1.semester2.math}
        </td>
        <td>
            ${top1.semester2.english}
        </td>
        <td>
            ${top1.semester2.science}
        </td>

    </tr>

</table>

<h2>student name <span>${top2.name}</span></h2>
<h2>student roll <span>${top2.roll}</span></h2>
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
            ${top2.semester1.math}
        </td>
        <td>
            ${top2.semester1.english}
        </td>
        <td>
            ${top2.semester1.science}
        </td>

    </tr>
    <tr>
        <td>
            2
        </td>
        <td>
            ${top2.semester2.math}
        </td>
        <td>
            ${top2.semester2.english}
        </td>
        <td>
            ${top2.semester2.science}
        </td>

    </tr>

</table>



</body>
</html>