 
package DAL;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class OperExcluiDadosBD {
    
    
    //3. Método de exclusão de registros (delete)  
    
    public void excluirRegistro(String idUser){
        
        String sql = "delete from TB_USERS where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, idUser);
            pst.executeUpdate();
            System.out.println("O registro foi ***EXCLUÍDO*** com sucesso!");
            
        } catch (org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Não foi possível deletar essa linha, pois o elemento está sendo referenciado em outra tabela");
        }
        
        
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: excluirRegistro");
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
    
    
    
    
    
    
    
    
    
    
    
    
    ////TelaCadastroUsuário
    
     public void excluirRegistroCadastroUsuario(String id){
        
        String sql = "delete from TB_CLIENTES where ID_CLIENTE = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, id);
            pst.executeUpdate();
            System.out.println("O registro foi ***EXCLUÍDO/TelaCadastroUsuario*** com sucesso!");
            
        } 
        
        
        
        catch (org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Não foi possível deletar essa linha, pois o elemento está sendo referenciado em outra tabela");
        }
        
        
        
        
        
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: excluirRegistro");
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        ////Equipamentos
    
     public void excluirRegistroCadastroEquipamentos(String id){
        
        String sql = "delete from TB_ORDSERV where ID_ORDSERV = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, id);
            pst.executeUpdate();
            System.out.println("O registro foi ***EXCLUÍDO/EQUIPAMENTOS*** com sucesso!");
            
         
            
        } 
        
        
        catch (org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Não foi possível deletar essa linha, pois o elemento está sendo referenciado em outra tabela");
        }
        
        
        
        
        
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: excluirRegistroCadastroEquipamentos");
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
