<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    table 
{border:  1px solid;
    margin: auto;
    
}
h2{
    text-align: center;
}
</style>
</head>
<body>

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
            ${data.semister1.math}
        </td>
        <td>
            ${data.semister1.english}
        </td>
        <td>
            ${data.semister1.science}
        </td>

    </tr>
    <tr>
        <td>
            2
        </td>
        <td>
            ${data.semister2.math}
        </td>
        <td>
            ${data.semister2.english}
        </td>
        <td>
            ${data.semister2.science}
        </td>

    </tr>

</table>



</body>
</html>