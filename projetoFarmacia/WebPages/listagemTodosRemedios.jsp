<%-- 
    Document   : listagemTodosRemedios
    Created on : 17 de dez. de 2024, 10:01:25
    Author     : Aluno
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de todos os remédios existentes</title>
         <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f7f6;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        table {
            width: 80%;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
        }

        th, td {
            padding: 12px 20px;
            text-align: left;
            font-size: 14px;
        }

        th {
            background-color: #3aafa9;
            color: #fff;
            font-size: 16px;
        }

        td {
            background-color: #f9f9f9;
        }

        tr:nth-child(even) td {
            background-color: #f1f1f1;
        }

        tr:hover td {
            background-color: #e2f7f1;
        }

        a {
            display: table-cell;
            color: #d9534f;
            text-decoration: none;
            font-weight: bold;
            
        }

        a:hover {
            color: #c9302c;
            text-decoration: underline;
        }

        .return-link {
            font-size: 16px;
            color: #337ab7;
            text-decoration: none;
            font-weight: bold;
            margin-top: 20px;
            display: inline-block;
        }

        .return-link:hover {
            color: #23527c;
        }
        /* Form button */
form input[type="submit"] {     
    color: #fff;
    background-color: #007BFF;
    border: none;
    padding: 12px 24px;
    border-radius: 5px;
    cursor: pointer;
    transition: all 0.3s ease-in-out;
    display: inline-block;
    margin-left: 5px;
    font-weight: bold;
}

form input[type="submit"]:hover {
    background-color: #0056b3;
    transform: scale(1.05);
}

form {
    margin-top: 20px;
}

.buttons{
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    flex-direction: column-reverse;
}

    </style>
    </head>
    <body>
        
        
        <table>
            
            <tr>
            <th>ID</th>
            <th>SUPPLIER</th>
            <th>MEDICINE NAME</th>
            <th>MEDICINE TYPE</th>
            <th>BATCH NUMBER</th>
            <th>DATE RECEIPT</th>
            <th>VALIDITY</th>
            <th>REMOVER</th>
            </tr>
            
            
            <c:forEach var="remedio" items="${listaRemedios}">
            <tr>
                <td>${remedio.getId()}</td>
                <td>${remedio.getSupplier()}</td>
                <td>${remedio.getMedicineName()}</td>
                <td>${remedio.getMedicineType()}</td>
                <td>${remedio.getBatchNumber()}</td>
                <td>${remedio.getDateReceipt()}</td>
                <td>${remedio.getValidity()}</td>
                <td><a href="removemedicineservlet?id=${remedio.getId()}">Excluir registro</td>
            </tr>
            </c:forEach>
            
        </table>
        
        <br />
        
        <div class='buttons'> 
        <a href="index.html">Retornar</a> <br />
        <form action="listmedicinesservlet" method="post">
                <input type="submit" value="Atualizar" name="Atualizar"> <br />
            </form>
        </div>
        
    </body>
</html>
