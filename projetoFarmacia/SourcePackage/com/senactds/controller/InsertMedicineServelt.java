package com.senactds.controller;

import com.senactds.DAO.InsertMedicine;
import com.senactds.model.Medicines;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;

public class InsertMedicineServelt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Recebendo as informações da página HTML e efetuando o tratamento dos dados
        String nomeForn = request.getParameter("nomeFornecedor");
        String nomeMedic = request.getParameter("nomeMedicamento");
        String tipoMedic = request.getParameter("tipoMedicamento");
        Long numeroLote = Long.parseLong(request.getParameter("numLote"));
        LocalDate dataReceb = LocalDate.parse(request.getParameter("dataRecebimento"));
        LocalDate dataVal = LocalDate.parse(request.getParameter("dataValidade"));

        //        System.out.println("Dados Recebidos: ");
        //        System.out.println(nomeForn);
        //        System.out.println(nomeMedic);
        //        System.out.println(tipoMedic);
        //        System.out.println(numeroLote);
        //        System.out.println(dataReceb);
        //        System.out.println(dataVal);
        // Instanciar os objetos (encapsular os dados) e posteriormente, enviar para o banco de dados;
        Medicines novoItem = new Medicines(nomeForn, nomeMedic, tipoMedic, numeroLote, dataReceb, dataVal);
        InsertMedicine save = new InsertMedicine();
        save.insertNewMedicine(novoItem);

//        PrintWriter out = response.getWriter();
//        out.println("<html><body><h1>Dados recebidos com sucesso!</h1></body></html>");


//Setando um nome para uma variável interna da servlet para que seja 
//enviada para a próxima página
request.setAttribute("nomeRemedio", nomeMedic);




//Enviar informações para a próxima página
        RequestDispatcher dispatcher = request.getRequestDispatcher("respostaSucesso.jsp");
        dispatcher.forward(request, response);

    }

}
