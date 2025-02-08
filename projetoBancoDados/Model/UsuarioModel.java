package Model;

import DAL.OperAtualizaDadosBD;
import DAL.OperBuscaUsuarioID;
import DAL.OperExcluiDadosBD;
import DAL.OperFiltroDadosBD;
import DAL.OperInsereRegistroBD;
import DAL.OperListaDadosBD;
import DAL.OperResetaSenhaDadosBD;
import java.util.ArrayList;

public class UsuarioModel extends LoginModel {

    //Atributos que definem o cadastro do usuário
    private String id;
    private String username;
    private String email;
    private String perfil;
    

    // Métodos construtores
    public UsuarioModel() {
    }
    
   

    //Construtor utilizado para listagem de dados contidos no banco
    public UsuarioModel(String id, String username, String email, String login, String password, String perfil) {
        super(login, password);
        this.id = id;
        this.username = username;
        this.email = email;
        this.perfil = perfil;
       
    }

    //Construtor utilizado para inserir novo registro no banco de dados
    public UsuarioModel(String username, String email, String perfil, String login, String password) {
        super(login, password);
        this.username = username;
        this.email = email;
        this.perfil = perfil;
    }

    //Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    //Listagem de todos os dados
    public ArrayList<UsuarioModel> listarRegistrosModel() {
        OperListaDadosBD op = new OperListaDadosBD();
        return op.listarRegistrosBD();
    }

    //Filragem de todos os dados
    public ArrayList<UsuarioModel> filtrarRegistrosModel(String nome) {
        OperFiltroDadosBD op = new OperFiltroDadosBD();
        return op.filtrarRegistrosBD(nome);
    }
    
    //Inserção de um novo registro no banco // Model
    public void inserirRegistroModel(UsuarioModel novoUsuario) { 
        OperInsereRegistroBD op = new OperInsereRegistroBD();
        op.inserirRegistro(novoUsuario);
    }
    
    //Envio da informação para o DAL para exclusão de registro
    public void excluirRegistroModel (String idUser){
        OperExcluiDadosBD op = new OperExcluiDadosBD();
        op.excluirRegistro(idUser);
    }
    
    //UPDATE - recebe o objeto com as informações atualizadas e envia para o banco de dados
    public void atualizarRegistroModel(UsuarioModel usuarioAtualizado){
        OperAtualizaDadosBD op = new OperAtualizaDadosBD();
        op.atualizarRegistro(usuarioAtualizado);
        
        
        
    }
    
    //Resetar senha 
    public void resetarSenhaRegistroModel(String id){
        OperResetaSenhaDadosBD op = new OperResetaSenhaDadosBD();
        op.resetaSenhaRegistro(id);
                
    }
    
    //Busca usuário por ID 
    public UsuarioModel buscarPorIdRegistroModel(String id){
        OperBuscaUsuarioID op = new OperBuscaUsuarioID();
        return op.buscarPorIdRegistro(id);
                
    }

}
