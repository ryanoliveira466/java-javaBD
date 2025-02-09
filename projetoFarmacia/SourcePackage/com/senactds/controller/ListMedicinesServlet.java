/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.senactds.controller;

import com.senactds.DAO.FindMedicine;
import com.senactds.model.Medicines;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

public class ListMedicinesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Acessando o método DAO para obter a listagem de itens do banco de dados
        FindMedicine op = new FindMedicine();
        
        //Criamos um objeto de lista para listagme de dados do banco
        List<Medicines> lista = op.findAll();

        
        //Setamos o nome desta lsita de dados, para ser enviada por método post,para a jsp
        request.setAttribute("listaRemedios", lista);
        
        //Chamamos a jsp para apresentação dos dados da listagem na tela
        RequestDispatcher dispatcher = request.getRequestDispatcher("listagemTodosRemedios.jsp");
        dispatcher.forward(request, response);

    }

}
