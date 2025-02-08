 
package Controller;

import Model.LoginModel;
import View.TelaAplicacao;
import View.TelaLogin;
import javax.swing.JOptionPane;

 
public class LoginControler {
    
    public void validaLoginController(String login, String password){
        
        
        //Instanciando um objeto do tipo LoginModel
        Boolean contem = null;
        LoginModel dadosUsuarioSenha = new LoginModel(login,password);
        contem = dadosUsuarioSenha.validaDadosLoginBD(dadosUsuarioSenha);
        
        if(contem){
            TelaAplicacao tela = new TelaAplicacao();
            tela.setVisible(true);
             
        }
        
        else{
            String mensagem = "Usuário e senha inválidos";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
    
}
