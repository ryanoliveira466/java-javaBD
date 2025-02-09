/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestesOperacionais;

import com.senactds.DAO.ConnectionFactory;
import com.senactds.DAO.FindMedicine;
import com.senactds.DAO.InsertMedicine;
import com.senactds.model.Medicines;
import java.net.ConnectException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class operacao {

    public static void main(String[] args) {

        ArrayList<Medicines> listagem = new ArrayList<Medicines>();
        FindMedicine lista = new FindMedicine();
        listagem = lista.findAll();
        
        for(Medicines listagem1 : listagem){
            System.out.println("ID: " + listagem1.getId());
            System.out.println("Nome: " + listagem1.getMedicineName());
            System.out.println("Validade: " + listagem1.getValidity());
        }

    }

}

////        ConnectionFactory op = new ConnectionFactory();
////        op.getConnection();
//
//        LocalDate recebimento = LocalDate.of(2024, 12, 10);
//        LocalDate validade = LocalDate.of(2025, 06, 10);
//        Medicines novo = new Medicines("Sandoz", "Aspirina", "Dor de Cabeça", Long.parseLong("502030"), recebimento, validade);
//
//        
//        InsertMedicine save = new InsertMedicine();
//        save.insertNewMedicine(novo);
