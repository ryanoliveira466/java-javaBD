 
package DAL;

import Controller.CadastroUsuarioController;
import Controller.UsuarioController;
import Model.CadastroEquipamentosModel;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class OperInsereRegistroBD {
    
    public void inserirRegistro(UsuarioModel novoUsuario){
        
        String sql = "insert into TB_USERS (USER_NAME, EMAIL, LOGIN, PASSWORD, PERFIL_USER) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, novoUsuario.getUsername());
            pst.setString(2, novoUsuario.getEmail());
            pst.setString(3, novoUsuario.getLogin());
            pst.setString(4, novoUsuario.getPassword());
            pst.setString(5, novoUsuario.getPerfil());
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /// Para o novo banco de dados da npva tela 'TelaCadastroUsuario'
    
    public void inserirRegistroCadastroUsuario(CadastroUsuarioModel novoUsuario){
        
        String sql = "insert into TB_CLIENTES (NOME_CLIENTE, CEP_CLIENTE, ENDERECO_CLIENTE, FONE_CLIENTE, EMAIL_CLIENTE) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        Connection connection = null;
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, novoUsuario.getNome());
            pst.setString(2, novoUsuario.getCep());
            pst.setString(3, novoUsuario.getEndereco());
            pst.setString(4, novoUsuario.getFone());
            pst.setString(5, novoUsuario.getEmail());
            pst.executeUpdate();
            System.out.println("O registro **TelaCadastroUsuario** foi inserido com sucesso!");
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: inserirRegistroCadastroUsuario");
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
    
    
    
    
    
    
    
    
    
    
    ///Equipamentos
    
      /// Para o novo banco de dados da npva tela 'inserirRegistroEquipamentos'
    
    public void inserirRegistroEquipamentos(CadastroEquipamentosModel novoUsuario){
        
        String sql = "insert into TB_ORDSERV (EQUIPAMENTO, DEFEITO, SERVICO, TECNICO, VALOR, ID_CLIENTE, NOME_CLIENTE, NOME_TECNICO,FINALIZADO) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement pst = null;
        Connection connection = null;
        
        CadastroUsuarioController cliente = new CadastroUsuarioController();
        CadastroUsuarioModel clientePorId = cliente.buscarPorIdRegistroCadastroController(novoUsuario.getCliente());
        String nomeCliente =  clientePorId.getNome();
        
        UsuarioController tecnico = new UsuarioController();
        UsuarioModel usuarioPorId = tecnico.buscarPorIdRegistroController(novoUsuario.getTecnico());
        String nomeTecnico =  usuarioPorId.getUsername();
        
        
        
         
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, novoUsuario.getEquipamento());
            pst.setString(2, novoUsuario.getDefeito());
            pst.setString(3, novoUsuario.getServico());
            pst.setInt(4, Integer.parseInt(novoUsuario.getTecnico()));
            pst.setString(5, novoUsuario.getValor());
            pst.setInt(6, Integer.parseInt(novoUsuario.getCliente()));
            pst.setString(7, nomeCliente);
            pst.setString(8, nomeTecnico);
            pst.setString(9, "NÃO");
            pst.executeUpdate();
            System.out.println("O registro **EQUIPAMENTOS** foi inserido com sucesso!");
            
            
            
            
            
            
        } catch (org.apache.derby.shared.common.error.DerbySQLIntegrityConstraintViolationException e){
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
            System.out.println("ERRO: DAL: inserirRegistroEquipamentos");
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
