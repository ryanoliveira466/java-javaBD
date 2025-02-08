 
package DAL;

import Model.CadastroEquipamentosModel;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

 
public class OperListaDadosBD {
    
     public ArrayList<UsuarioModel> listarRegistrosBD(){
        
         
         
        String sql = " select * from TB_USERS";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<UsuarioModel> listaUsuarios = null;
        UsuarioModel usuario = null;
        
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs != null){
                listaUsuarios = new ArrayList<UsuarioModel>();
                while(rs.next()){
                usuario = new UsuarioModel();
                usuario.setId(rs.getString("ID_USER"));
                usuario.setUsername(rs.getString("USER_NAME"));
                usuario.setEmail(rs.getString("EMAIL"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setPassword(rs.getString("PASSWORD"));
                usuario.setPerfil(rs.getString("PERFIL_USER"));
                listaUsuarios.add(usuario);
            }
                
                
                
            }
             
            
            System.out.println("Registros ***LISTADOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: listarRegistros");
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
            
            return listaUsuarios;
            
        }
        
        
    
    
}
     
     
     
     
     
     
     
     ///TelaCadastroCliente
     public ArrayList<CadastroUsuarioModel> listarRegistrosCadastroUsuarioBD(){
        
         
         
        String sql = " select * from TB_CLIENTES";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<CadastroUsuarioModel> listaUsuarios = null;
        CadastroUsuarioModel usuario = null;
        
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs != null){
                listaUsuarios = new ArrayList<CadastroUsuarioModel>();
                while(rs.next()){
                usuario = new CadastroUsuarioModel();
                usuario.setId(rs.getString("ID_CLIENTE"));
                usuario.setNome(rs.getString("NOME_CLIENTE"));
                usuario.setCep(rs.getString("CEP_CLIENTE"));
                usuario.setEndereco(rs.getString("ENDERECO_CLIENTE"));
                usuario.setFone(rs.getString("FONE_CLIENTE"));
                usuario.setEmail(rs.getString("EMAIL_CLIENTE"));
                listaUsuarios.add(usuario);
            }
                
                
                
            }
             
            
            System.out.println("Registros ***LISTADOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: listarRegistros");
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
            
            return listaUsuarios;
            
        }
        
        
    
    
}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
        ///Equipamentos
     public ArrayList<CadastroEquipamentosModel> listarRegistrosEquipamentosBD(){
        
         
         
        String sql = " select * from TB_ORDSERV";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        ArrayList<CadastroEquipamentosModel> listaUsuarios = null;
        CadastroEquipamentosModel usuario = null;
        
        
        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs != null){
                listaUsuarios = new ArrayList<CadastroEquipamentosModel>();
                while(rs.next()){
                usuario = new CadastroEquipamentosModel();
                usuario.setId(rs.getString("ID_ORDSERV"));
                usuario.setData(rs.getString("DATA_ORDSERV"));
                usuario.setEquipamento(rs.getString("EQUIPAMENTO"));
                usuario.setDefeito(rs.getString("DEFEITO"));
                usuario.setServico(rs.getString("SERVICO"));
                usuario.setTecnico(rs.getString("TECNICO"));
                usuario.setValor(rs.getString("VALOR"));
                usuario.setCliente(rs.getString("ID_CLIENTE"));
                usuario.setNomeCliente(rs.getString("NOME_CLIENTE"));
                usuario.setNomeTecnico(rs.getString("NOME_TECNICO"));
                usuario.setFinalizado(rs.getString("FINALIZADO"));
                listaUsuarios.add(usuario);
            }
                
                
                
            }
             
            
            System.out.println("Registros ***LISTADOS/EQUIPAMENTOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: listarRegistros/EQUIPAMENTOS");
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
            
            return listaUsuarios;
            
        }
        
        
    
    
}
     
}
