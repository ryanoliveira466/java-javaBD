 
package Model;

import DAL.OperValidaLoginBD;

 
public class LoginModel {
    
    //classe padrão de como os dados de login serão computados
    //Definidos os atributos da classe
    private String login;
    private String password;
    
    //Métodos construtores da classe
    public LoginModel() {
    }
    
    
     public LoginModel(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    
    
    
    //Métodos getters e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    //Método para envio do objeto para o banco de dados
    //para validação de usuário e senha
    
    public Boolean validaDadosLoginBD(LoginModel dadosUsuarioSenha){
        
        Boolean contem = null;
        OperValidaLoginBD op = new OperValidaLoginBD();
        contem = op.validaLogin(dadosUsuarioSenha);
        return contem;
    }
    
     
    

         

     
    
}
