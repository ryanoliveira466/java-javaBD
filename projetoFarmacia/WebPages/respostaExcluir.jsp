<%-- 
    Document   : respostaExcluir
    Created on : 30 de jan. de 2025, 10:59:38
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            h1 {
    font-family: 'Arial', sans-serif;
    color: #4CAF50; /* Green */
    text-align: center;
    font-size: 2.5rem;
    margin-top: 20px;
    
}

h2 {
    font-family: 'Arial', sans-serif;
    color: #FF6347; /* Tomato red */
    text-align: center;
    font-size: 2rem;
    margin-top: 10px;
    font-weight: bold;
}

a {
    display: inline-block;
    margin-top: 10px;
    text-align: center;
    font-size: 1.2rem;
    padding: 10px 20px;
    text-decoration: none;
    background-color: #3498db; /* Blue */
    color: white;
    border-radius: 5px;
    transition: background-color 0.3s ease, transform 0.3s ease;
    font-family: 'Arial', sans-serif;
}

a:hover {
    background-color: #2980b9; /* Darker blue on hover */
    transform: scale(1.05);
}

br {
    margin-bottom: 15px;
}
/* Form button */
form input[type="submit"] {
    font-size: 1.2em;
    color: #fff;
    background-color: #007BFF;
    border: none;
    padding: 12px 24px;
    border-radius: 5px;
    cursor: pointer;
    transition: all 0.3s ease-in-out;
    width: 150px;
    display: inline-block;
}

form input[type="submit"]:hover {
    background-color: #0056b3;
    transform: scale(1.05);
}

form {
    margin-top: 20px;
}

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso!</title>
    </head>
    <body>
        <h1>Medicamento ${nomeRemedio} foi removido no banco de dados com sucesso!</h1> <br />
        <h2>Parabéns!</h2> <br />
        <a href="paginaCadastro.html">Retornar</a> <br />
        <form action="listmedicinesservlet" method="post">
                <input type="submit" value="Listar" name="Listar"> <br />
            </form>
    </body>
</html>
