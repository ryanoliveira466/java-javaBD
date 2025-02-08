 
package Model;

import DAL.OperAtualizaDadosBD;
import DAL.OperBuscaUsuarioID;
import DAL.OperExcluiDadosBD;
import DAL.OperFiltroDadosBD;
import DAL.OperInsereRegistroBD;
import DAL.OperListaDadosBD;
import DAL.OperResetaSenhaDadosBD;
import java.util.ArrayList;

 
public class CadastroUsuarioModel {
    
    private String id;
    private String nome;
    private String cep;
    private String endereco;
    private String fone;
    private String email;
    
    
    public CadastroUsuarioModel(){
        
    }

    public CadastroUsuarioModel(String id, String nome, String cep, String endereco, String fone, String email) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
        this.fone = fone;
        this.email = email;
    }
    
     public CadastroUsuarioModel(String nome, String cep, String endereco, String fone, String email) {
        this.nome = nome;
        this.cep = cep;
        this.endereco = endereco;
        this.fone = fone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void insereRegistroCadastroUsuarioModel(String nome, String cep, String endereco, String fone, String email){
        CadastroUsuarioModel op = new CadastroUsuarioModel(nome, cep, endereco, fone, email);
        OperInsereRegistroBD oper = new OperInsereRegistroBD();
        oper.inserirRegistroCadastroUsuario(op);
               
        
    }
    
    
    
    public void atualizaRegistroCadastroUsuarioModel(String id, String nome, String cep, String endereco, String fone, String email){
        CadastroUsuarioModel op = new CadastroUsuarioModel(id, nome, cep, endereco, fone, email);
        OperAtualizaDadosBD oper = new OperAtualizaDadosBD();
        oper.atualizaRegistroCadastroUsuario(op);
               
        
    }
    
    public void excluiRegistroCadastroUsuarioModel(String id){
         
        OperExcluiDadosBD oper = new OperExcluiDadosBD();
        oper.excluirRegistroCadastroUsuario(id);
    }
    
    
    public ArrayList<CadastroUsuarioModel> listarRegistrosCadastroUsuarioModel() {
        OperListaDadosBD op = new OperListaDadosBD();
        return op.listarRegistrosCadastroUsuarioBD();
    }
    
    public CadastroUsuarioModel buscarPorIdRegistroCadastroModel(String id){
        OperBuscaUsuarioID op = new OperBuscaUsuarioID();
        return op.buscarPorIdRegistroCadastroCliente(id);
                
    }
    
    
    public ArrayList<CadastroUsuarioModel> filtrarRegistrosCadastroModel(String nome) {
        OperFiltroDadosBD op = new OperFiltroDadosBD();
        return op.filtrarRegistrosBDCadastro(nome);
    }
    
    
    
    
    
    
    
}
