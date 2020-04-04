<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style>
        table {
            font-family: "Century Gothic", sans-serif;
            border-collapse: collapse;
            width: 100%;
        }


        td, th {
            border: 1px solid #4000ff;
            text-align: center;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #00ffff;
        }
    </style>
</head>
<body>

<h2>Top 5 Deadliest Virus</h2>

<table style="width:100%">
    <colgorup>
        <col span="1" style="width: 10%;">
        <col span="1" style="width: 40%;">
        <col span="1" style="width: 30%;">
        <col span="1" style="width: 10%;">
        <col span="1" style="width: 10%;">
    </colgorup>

    <tr>

        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Incubation (Days)</th>
        <th>Mortality Rate (%)</th>
    </tr>
    <c:forEach var="listitem" items="${virus}">
        <tr>

            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.incubation}</td>
            <td>${listitem.mortalityrate}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>