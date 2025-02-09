 
package com.senactds.DAO;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcludeMedicine {
    
    public void excludeMedicine(String id){
        
        String sql = "delete from MEDICINES where ID = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, id);
            pst.executeUpdate();
            System.out.println("Register exclude with sucess!");
            
        } catch (org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Error while exclude register");
        }
        
        
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR: DAL: excludeMedicine");
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
        }
        
    }
    
}
