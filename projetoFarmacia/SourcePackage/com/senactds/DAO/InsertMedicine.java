 
package com.senactds.DAO;
 
import com.senactds.model.Medicines;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class InsertMedicine {
    
    public void insertNewMedicine(Medicines newMedicine){
        
        String sql = "insert into MEDICINES (SUPPLIER, MEDICINENAME, MEDICINETYPE, BATCHNUMBER, DATERECEIPT, VALIDITY) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1,  newMedicine.getSupplier());
            pst.setString(2,  newMedicine.getMedicineName());
            pst.setString(3,  newMedicine.getMedicineType());
            pst.setLong(4,  newMedicine.getBatchNumber());
            pst.setDate(5, java.sql.Date.valueOf(newMedicine.getDateReceipt()));
            pst.setDate(6, java.sql.Date.valueOf(newMedicine.getValidity()));
            pst.executeUpdate();
            System.out.println("O registro foi inserido com sucesso!");
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: inserirRegistro");
        } finally {
            //Exemplo: agradece pela execução e diz: tchau!
            
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
        }
    }
    
}
