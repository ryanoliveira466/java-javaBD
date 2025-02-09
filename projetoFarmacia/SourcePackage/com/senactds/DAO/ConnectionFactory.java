 
package com.senactds.DAO;
 
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
       //Método para conexão da aplicação junto ao banco de dados.
     //1. Utilizar o driver de conexão
     //2. Apontar a aplicação para conexão ao banco de dados
     //3. Definição do usuário > acesso aos dados do banco
     //4. Definiçaõ da senha > acesso aos dados do banco
        
    
    public Connection getConnection(){
        
        
         Connection conn = null;
         String className = "org.apache.derby.jdbc.ClientDriver";
         String url = "jdbc:derby://localhost:1527/projetoFarmaciaDB";
         String user = "root";
         String password = "123";
         
         try {
            Class.forName(className);
            conn = DriverManager.getConnection(url, user, password);
             System.out.println("Conexão realizada com sucesso");
         } catch (ClassNotFoundException e){
                 System.out.println("Erro na digitação do className!");
                 
         }catch(java.sql.SQLNonTransientConnectionException e){
             System.out.println("Erro na digitação da URL, user ou password");
                   
                         
                     
            
        } catch (Exception e) {
             System.out.println("Erro ao realizar a conexão");
             e.printStackTrace();
        }
          
         return conn;
    
}
    
}
