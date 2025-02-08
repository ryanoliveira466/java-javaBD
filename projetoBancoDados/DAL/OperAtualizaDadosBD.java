 
package DAL;

import Controller.CadastroUsuarioController;
import Controller.UsuarioController;
import Model.CadastroEquipamentosModel;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 
public class OperAtualizaDadosBD {
    
      public void atualizarRegistro(UsuarioModel usuarioAtualizado){
        
        String sql = "update TB_USERS set USER_NAME=?, EMAIL=?, LOGIN=?, PERFIL_USER=? where ID_USER = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, usuarioAtualizado.getUsername());
            pst.setString(2, usuarioAtualizado.getEmail());
            pst.setString(3, usuarioAtualizado.getLogin());
            pst.setString(4, usuarioAtualizado.getPerfil());
            pst.setString(5, usuarioAtualizado.getId());
            pst.executeUpdate();
            System.out.println("O registro foi ***ALTERADO*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: atualizarRegistro");
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
      
      
      
      
      
      
      
      
      
      
      
      
     ///Método para 'TelaCadastroUsuario'
      public void atualizaRegistroCadastroUsuario(CadastroUsuarioModel usuarioAtualizado){
        
        String sql = "update TB_CLIENTES set NOME_CLIENTE=?, CEP_CLIENTE=?, ENDERECO_CLIENTE=?, FONE_CLIENTE=?, EMAIL_CLIENTE=? where ID_CLIENTE = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, usuarioAtualizado.getNome());
            pst.setString(2, usuarioAtualizado.getCep());
            pst.setString(3, usuarioAtualizado.getEndereco());
            pst.setString(4, usuarioAtualizado.getFone());
            pst.setString(5, usuarioAtualizado.getEmail());
            pst.setString(6, usuarioAtualizado.getId());
            pst.executeUpdate();
            System.out.println("O registro foi ***ALTERADO/TelaCadastroUsuario*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: atualizarRegistro");
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
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
       ///Método para EQUIPAMENTOS
      public void atualizaRegistroEquipamentos(CadastroEquipamentosModel usuarioAtualizado){
        
        String sql = "update TB_ORDSERV set EQUIPAMENTO=?, DEFEITO=?, SERVICO=?, TECNICO=?, VALOR=?, ID_CLIENTE=?, NOME_CLIENTE=?, NOME_TECNICO=?, FINALIZADO=? where ID_ORDSERV = ?";
        PreparedStatement pst = null;
        Connection connection = null;
        
          CadastroUsuarioController cliente = new CadastroUsuarioController();
        CadastroUsuarioModel clientePorId = cliente.buscarPorIdRegistroCadastroController(usuarioAtualizado.getCliente());
        String nomeCliente =  clientePorId.getNome();
        
        UsuarioController tecnico = new UsuarioController();
        UsuarioModel usuarioPorId = tecnico.buscarPorIdRegistroController(usuarioAtualizado.getTecnico());
        String nomeTecnico =  usuarioPorId.getUsername();
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, usuarioAtualizado.getEquipamento());
            pst.setString(2, usuarioAtualizado.getDefeito());
            pst.setString(3, usuarioAtualizado.getServico());
            pst.setInt(4, Integer.parseInt(usuarioAtualizado.getTecnico()));
            pst.setString(5, usuarioAtualizado.getValor());
            pst.setInt(6, Integer.parseInt(usuarioAtualizado.getCliente()));
            pst.setString(7, nomeCliente);
            pst.setString(8, nomeTecnico);
            pst.setString(9, usuarioAtualizado.getFinalizado());
            pst.setString(10, usuarioAtualizado.getId());
            pst.executeUpdate();
            System.out.println("O registro foi ***ALTERADO/EQUIPAMENTOS*** com sucesso!");
            
        }
        
          catch (org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
            e.printStackTrace();
            String mensagem = "ID não encontrado no sistema!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
        
        catch (java.sql.SQLDataException e){
            e.printStackTrace();
            String mensagem = "Por favor, verifique os dados número/caractere!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
        
        catch (java.lang.NumberFormatException e){
            e.printStackTrace();
            String mensagem = "Por favor, verifique os dados número/caractere!";
            JOptionPane.showMessageDialog(null, mensagem);
        }
        
        
        
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: atualizaRegistroEquipamentos");
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
