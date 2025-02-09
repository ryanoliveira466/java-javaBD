/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.senactds.controller;

import com.senactds.DAO.ExcludeMedicine;
import com.senactds.DAO.FindMedicine;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
public class RemoveMedicineServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Capturar o valor do ID
        String id = request.getParameter("id");
        System.out.println("ID Recebido: " + id);

        String nomeMedic;
        FindMedicine oper = new FindMedicine();
        nomeMedic = oper.findById(id);

        request.setAttribute("nomeRemedio", nomeMedic);

        //Remover o item do banco de dados...
        //Acessar um método disponível no pacote DAO para a remoção do registro no BD
        ExcludeMedicine op = new ExcludeMedicine();
        op.excludeMedicine(id);

        //request.setAttribute("nomeRemedio", nomeMedic);
        //Redirecionar para uma página que dê o retorno da exclusão...
        //Chamamos a jsp para apresentação dos dados da listagem na tela
        RequestDispatcher dispatcher = request.getRequestDispatcher("respostaExcluir.jsp");
        dispatcher.forward(request, response);

    }

}
