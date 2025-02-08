   
package DAL;

import Model.CadastroEquipamentosModel;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
public class OperFiltroDadosBD {
    
 

 
    
     public ArrayList<UsuarioModel> filtrarRegistrosBD(String nome){
        
         
         
        String sql = " select * from TB_USERS where USER_NAME like '%" + nome + "%' order by USER_NAME";
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
             
            
            System.out.println("Registros ***FILTRADOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: filtrarRegistros");
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
     
     
     
     
     
     
     
     
     
     
     
     
     //////////////////////////////
     public ArrayList<CadastroUsuarioModel> filtrarRegistrosBDCadastro(String nome){
        
         
         
        String sql = " select * from TB_CLIENTES where NOME_CLIENTE like '%" + nome + "%' order by NOME_CLIENTE";
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
             
            
            System.out.println("Registros ***FILTRADOS/Cadastro*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: filtrarRegistrosCadastro");
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     ////Equipamentos
     
      public ArrayList<CadastroEquipamentosModel> filtrarRegistrosEquipamentos(String nome){
        
         
         
        String sql = " select * from TB_ORDSERV where NOME_TECNICO like '%" + nome + "%' order by NOME_TECNICO";
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
                listaUsuarios.add(usuario);
            }
                
                
                
            }
             
            
            System.out.println("Registros ***FILTRADOS/EQUIPAMENTOS*** com sucesso!");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO: DAL: filtrarRegistros");
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
    
    
 
