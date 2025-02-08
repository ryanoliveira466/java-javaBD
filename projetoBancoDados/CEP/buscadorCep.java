 
package CEP;

 
import View.TelaOperCadastroClientes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class buscadorCep {

    static String webService = "http://viacep.com.br/ws/";  //EndereÃ§o viacep
    static String webremnant = "/json";                     //tipo de retorno
    static int codigoSucesso = 200;                         //CÃ³digo Sucesso conexÃ£o

    public static String encontraCep(String cep) {

        //Montagem da URL de chamada
        String urlChamada = webService + cep + webremnant;
        String dados = "";
        String jsonEmString = "";
        String enderecoParaBanco = "";
         

        try {

            //Objeto para instanciar uma URL
            URL url = new URL(urlChamada);

            //Realiza a conexÃ£o com o site
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            //Se a conexÃ£o for bem sucedida, segue o processamento normalmente.
            //Caso contrÃ¡rio, exibe a informaÃ§Ã£o do tipo de problema de conexÃ£o. 0
            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("Erro conexÃ£o!" + conexao.getResponseMessage());    
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            //Streaming: tecnologia de transmissÃ£o de dados pela internet
            //BufferReader: classe que realiza a armazenagem destes dados, em um ponteiro para posterior operaÃ§Ã£o
            //InputStreamReader: classe para realizar a leitura destes valores vindos do servidor (json, video)
            //getInputStream: retorna as informaÃ§Ãµes enviadas pelo servidor

            //Transformar o arquivo json em um arquivo de dados String
            while ((dados = resposta.readLine()) != null) {
                jsonEmString += dados;
            }

            System.out.println("String Json: " + jsonEmString);
                      
            //Transformar um json
            JSONObject obj = new JSONObject(jsonEmString);
            System.out.println(obj);
            
            String estado = obj.getString("estado").toString();
            System.out.println("Estado: "+ estado);
            
            String cidade = obj.getString("localidade").toString(); 
            System.out.println("Cidade: " + cidade);
            
            String rua = obj.getString("logradouro").toString(); 
            System.out.println("Rua: " + rua);
            
            String bairro = obj.getString("bairro").toString(); 
            System.out.println("Bairro: " + bairro);
            
            enderecoParaBanco = rua + " ," + bairro + " ," + cidade + " ," + estado;
            System.out.println("Endereço para o banco" + enderecoParaBanco);
            
             
            
             

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return enderecoParaBanco;

    }
    
     

}