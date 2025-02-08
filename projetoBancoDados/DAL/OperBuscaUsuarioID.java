package DAL;

import Model.CadastroEquipamentosModel;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OperBuscaUsuarioID {

    public UsuarioModel buscarPorIdRegistro(String id) {

        String sql = "select * from TB_USERS where ID_USER =" + id + "";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        UsuarioModel usuarioPorId = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String nome = null;
            String email = null;
            String login = null;
            String password = null;
            String perfil = null;

            while (rs.next()) {
                nome = rs.getString(2);
                email = rs.getString(3);
                login = rs.getString(4);
                password = rs.getString(5);
                perfil = rs.getString(6);
            }

            usuarioPorId = new UsuarioModel(id, nome, email, login, password, perfil);

            System.out.println("Registros ***BUSCADO POR ID*** com sucesso!");
            
        

        }
        
        catch (java.sql.SQLSyntaxErrorException e) {
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Por favor, somente números");
        }
        
        catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERRO: DAL: OperBuscaUsuarioID/buscarPorIdRegistro");
        } finally {

            try {
                if (pst != null) {
                    pst.close();;
                }
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }

            //Exemplo: desligamos o telefone
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }

        }
        
         return usuarioPorId;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////////////////////////
    
    public CadastroUsuarioModel buscarPorIdRegistroCadastroCliente(String id) {

        String sql = "select * from TB_CLIENTES where ID_CLIENTE =" + id + "";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        CadastroUsuarioModel usuarioPorId = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String nome = null;
            String cep = null;
            String endereco = null;
            String fone = null;
            String email = null;

            while (rs.next()) {
                nome = rs.getString(2);
                cep = rs.getString(3);
                endereco = rs.getString(4);
                fone = rs.getString(5);
                email = rs.getString(6);
            }

            usuarioPorId = new CadastroUsuarioModel(id, nome, cep, endereco, fone, email);

            System.out.println("Registros ***BUSCADO POR ID/CadastroCliente*** com sucesso!");
            
        

        }
        
        catch (java.sql.SQLSyntaxErrorException e) {
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Por favor, somente números");
        }
        
        catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERRO: DAL: OperBuscaUsuarioID/buscarPorIdRegistroCadastroCliente");
        } finally {

            try {
                if (pst != null) {
                    pst.close();;
                }
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }

            //Exemplo: desligamos o telefone
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }

        }
        
         return usuarioPorId;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    //////////////////////////////////////////Equipamentos
    
    public CadastroEquipamentosModel buscarPorIdCadastroEquipamentos(String id) {

        String sql = "select * from TB_ORDSERV where ID_ORDSERV =" + id + "";
        PreparedStatement pst = null;
        Connection connection = null;
        ResultSet rs = null;
        CadastroEquipamentosModel usuarioPorId = null;

        try {
            connection = new ConnectionFactory().getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String data = null;
            String equipamento = null;
            String defeito = null;
            String servico = null;
            String tecnico = null;
            String valor = null;
            String cliente = null;
            String nomeCliente = null;
            String nomeTecnico = null;
            String finalizado = null;

            while (rs.next()) {
                data = rs.getString(2);
                equipamento = rs.getString(3);
                defeito = rs.getString(4);
                servico = rs.getString(5);
                tecnico = rs.getString(6);
                valor = rs.getString(7);
                cliente = rs.getString(8);
                nomeCliente = rs.getString(9);
                nomeTecnico = rs.getString(10);
                finalizado = rs.getString(11);
            }

            usuarioPorId = new CadastroEquipamentosModel(id, data, equipamento, defeito, servico, tecnico, valor, cliente, nomeCliente, nomeTecnico, finalizado);

            System.out.println("Registros ***BUSCADO POR ID/EQUIPAMENTOS*** com sucesso!");
            
        

        }
        
        catch (java.sql.SQLSyntaxErrorException e) {
            
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Por favor, somente números");

        }
        
        catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("ERRO: DAL: OperBuscaUsuarioID/buscarPorIdCadastroEquipamentos");
        } finally {

            try {
                if (pst != null) {
                    pst.close();;
                }
            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }

            //Exemplo: desligamos o telefone
            try {
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException SqlException) {
                SqlException.printStackTrace();
            }

        }
        
         return usuarioPorId;

    }

}
