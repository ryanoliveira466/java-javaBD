/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ryan Oliveira
 */
public class OperResetaSenhaDadosBD {
    
    public void resetaSenhaRegistro(String id){
        
        String sql = "update TB_USERS set PASSWORD = ? where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, "123456");
            pst.setString(2, id);
            pst.executeUpdate();
            System.out.println("A senha foi ***RESETADA*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: OperResetaSenhaDadosBD/resetaSenha");
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
