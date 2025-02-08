 package DAL;

import Model.LoginModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class OperValidaLoginBD {
    
    public Boolean validaLogin(LoginModel dadosUsuarioSenha){
        
        Boolean contem = null;
        
        String sql = " select * from TB_USERS where LOGIN = ? and PASSWORD = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, dadosUsuarioSenha.getLogin());
            pst.setString(2, dadosUsuarioSenha.getPassword());
            rs = pst.executeQuery();
             if(rs.next()){
                 System.out.println("Login e senha encontrados!");
                 contem = true;
             }
             
             else{
                 System.out.println("Login e senha NÃO encontrados!");
                 contem = false;
             }
            
            System.out.println("Registros ***FILTRADOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: validaLogin");
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
        
        return contem;
         
    }
    
}
