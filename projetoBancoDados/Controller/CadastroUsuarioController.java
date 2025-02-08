 
package Controller;

import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.util.ArrayList;

 
public class CadastroUsuarioController {
    
    public void insereRegistroCadastroUsuarioController(String nome, String cep, String endereco, String fone, String email){
        CadastroUsuarioModel op = new CadastroUsuarioModel();
        op.insereRegistroCadastroUsuarioModel(nome, cep, endereco, fone, email);
        
    }
    
    public void atualizaRegistroCadastroUsuarioController(String id,String nome, String cep, String endereco, String fone, String email){
        CadastroUsuarioModel op = new CadastroUsuarioModel();
        op.atualizaRegistroCadastroUsuarioModel(id, nome, cep, endereco, fone, email);
    }
    
    public void excluiRegistroCadastroUsuarioController(String id){
        CadastroUsuarioModel op = new CadastroUsuarioModel();
        op.excluiRegistroCadastroUsuarioModel(id);
    }
    
    public ArrayList<CadastroUsuarioModel> listarRegistrosCadastroUsuarioController() {

        CadastroUsuarioModel op = new CadastroUsuarioModel();
        {
            return op.listarRegistrosCadastroUsuarioModel();

        }
        
        }
    
     public CadastroUsuarioModel buscarPorIdRegistroCadastroController(String id){
        CadastroUsuarioModel op = new CadastroUsuarioModel();
        return op.buscarPorIdRegistroCadastroModel(id);
    }
     
     public ArrayList<CadastroUsuarioModel> filtrarRegistrosCadastroController(String nome) {

        CadastroUsuarioModel op = new CadastroUsuarioModel();
        {
            return op.filtrarRegistrosCadastroModel(nome);

        }

    }
    
    
}
