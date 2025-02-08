package Controller;

import Model.UsuarioModel;
import java.util.ArrayList;

public class UsuarioController {

    public ArrayList<UsuarioModel> listarRegistrosController() {

        UsuarioModel op = new UsuarioModel();
        {
            return op.listarRegistrosModel();

        }
        
        }
        
        
         

    public ArrayList<UsuarioModel> filtrarRegistrosController(String nome) {

        UsuarioModel op = new UsuarioModel();
        {
            return op.filtrarRegistrosModel(nome);

        }

    }
    
    //Método que vai enviar as informações recebidas da tela de interface gráfica 
    //para o método de inserir registro contido no model.
    
    public void insereRegistroController(String username, String email, String login, String password, String perfil){
        UsuarioModel novoUsuario = new UsuarioModel(username, email, perfil, login, password);
        novoUsuario.inserirRegistroModel(novoUsuario);
    }
    
    //Método no controller que obtenha a informação do ID para a exclusão
    public void excluirRegistroController(String idUser){
        UsuarioModel op = new UsuarioModel();
        op.excluirRegistroModel(idUser);
    }
    
    //Método no controller que obtenha as informações atualizadas | UPDATE
    public void atualizarRegistroController(String idUser, String username, String email, String login, String perfil){
        UsuarioModel usuarioAtualizado = new UsuarioModel(idUser, username, email, login, null, perfil);
        usuarioAtualizado.atualizarRegistroModel(usuarioAtualizado);
        
    }
    
    public void resetarSenhaRegistroController(String id){
        UsuarioModel op = new UsuarioModel();
        op.resetarSenhaRegistroModel(id);
    }
    
    public UsuarioModel buscarPorIdRegistroController(String id){
        UsuarioModel op = new UsuarioModel();
        return op.buscarPorIdRegistroModel(id);
    }
    
     
    
    

}
