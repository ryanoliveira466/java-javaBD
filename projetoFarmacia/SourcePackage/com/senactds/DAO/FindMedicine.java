 
package com.senactds.DAO;

import com.senactds.model.Medicines;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;


 
public class FindMedicine {
    
    
      public ArrayList<Medicines> findAll(){
        
         
         
        String sql = " select * from MEDICINES";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<Medicines> listMedicines = null;
        Medicines remedy = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs != null){
                listMedicines = new ArrayList<Medicines>();
                while(rs.next()){
                remedy = new Medicines();
                remedy.setId(rs.getLong("ID")); // OU String
                remedy.setSupplier(rs.getString("SUPPLIER"));
                remedy.setMedicineName(rs.getString("MEDICINENAME"));
                remedy.setMedicineType(rs.getString("MEDICINETYPE"));
                remedy.setBatchNumber(rs.getLong("BATCHNUMBER"));
                remedy.setDateReceipt(LocalDate.parse(rs.getString("DATERECEIPT")));
                remedy.setValidity(LocalDate.parse(rs.getString("VALIDITY")));
                listMedicines.add(remedy);
            }
                
                
                
            }
             
            
            System.out.println("Registros ***LISTADOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: FindMedicine");
        } finally {
            
            try {
                if(pst != null){
                    pst.close();;
                }
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }
            
            //Exemplo: desligamos o telefone
            try {
                if (connection != null){
                    connection.close();
                }
                
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }
            
            return listMedicines;
            
        }
        
        
    
    
}
      
      
      
      //BY ID
      
      
      
      public String findById(String id){
          
        long idLong = Long.parseLong(id);
           
        String sql = "SELECT * FROM MEDICINES WHERE ID = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        String nameMedicine = null; 
        
        
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setLong(1, idLong);
            rs = pst.executeQuery();
            
            //rs != null
            if(rs != null && rs.next()){
                nameMedicine = rs.getString("MEDICINENAME");     
            }
             
            
            System.out.println("Registros ***NOME ENCONTRADO/FINDBYID*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: FindMedicine/BYID");
        } finally {
            
            try {
                if(pst != null){
                    pst.close();;
                }
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }
            
            //Exemplo: desligamos o telefone
            try {
                if (connection != null){
                    connection.close();
                }
                
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }
            
            return nameMedicine;
            
        }
          
      }
      
      
      
      
    
        /////  
      }
     
    
    

