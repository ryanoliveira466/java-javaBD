 
package Model;

import DAL.OperAtualizaDadosBD;
import DAL.OperBuscaUsuarioID;
import DAL.OperExcluiDadosBD;
import DAL.OperFiltroDadosBD;
import DAL.OperInsereRegistroBD;
import DAL.OperListaDadosBD;
import java.util.ArrayList;

 
public class CadastroEquipamentosModel {

    private String id;
    private String data;
    private String equipamento;
    private String defeito;
    private String servico;
    private String tecnico;
    private String valor;
    private String cliente;
    private String nomeCliente;
    private String nomeTecnico;
    private String finalizado;
    
    public CadastroEquipamentosModel() {
         
    }
    
    
    
    
    
    public CadastroEquipamentosModel(String id, String data, String equipamento, String defeito, String servico, String tecnico, String valor, String cliente, String nomeCliente, String nomeTecnico, String finalizado) {
        this.id = id;
        this.data = data;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servico = servico;
        this.tecnico = tecnico;
        this.valor = valor;
        this.cliente = cliente;
        this.nomeCliente = nomeCliente;
        this.nomeTecnico = nomeTecnico;
        this.finalizado = finalizado;
       
    }
    

    public CadastroEquipamentosModel(String id, String data, String equipamento, String defeito, String servico, String tecnico, String valor, String cliente) {
        this.id = id;
        this.data = data;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servico = servico;
        this.tecnico = tecnico;
        this.valor = valor;
        this.cliente = cliente;
       
    }
    
    public CadastroEquipamentosModel(String equipamento, String defeito, String servico, String tecnico, String valor, String cliente){
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servico = servico;
        this.tecnico = tecnico;
        this.valor = valor;
        this.cliente = cliente;
    }
    
    public CadastroEquipamentosModel(String id, String equipamento, String defeito, String servico, String tecnico, String valor, String cliente, String finalizado,String extraParamm){
        this.id = id;
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servico = servico;
        this.tecnico = tecnico;
        this.valor = valor;
        this.cliente = cliente;
        this.finalizado = finalizado;
       
    }
    
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }
  
    
    public void insereEquipamentoCadastroEquipamentosModel(String equipamento,String defeito,String servico,String tecnico,String valor, String cliente){
        CadastroEquipamentosModel op = new CadastroEquipamentosModel(equipamento, defeito, servico, tecnico, valor, cliente);
        OperInsereRegistroBD oper = new OperInsereRegistroBD();
        oper.inserirRegistroEquipamentos(op);
    }
    
    
    public CadastroEquipamentosModel buscarPorIdCadastroEquipamentosModel(String id){
        OperBuscaUsuarioID op = new OperBuscaUsuarioID();
        return op.buscarPorIdCadastroEquipamentos(id);
                
    }
    
    
    public ArrayList<CadastroEquipamentosModel> listarRegistrosCadastroEquipamentosModel(){
        OperListaDadosBD op = new OperListaDadosBD();
        return op.listarRegistrosEquipamentosBD();
                
    }
    
    public void excluiRegistroCadastroEquipamentosModel(String id){
        OperExcluiDadosBD oper = new OperExcluiDadosBD();
        oper.excluirRegistroCadastroEquipamentos(id);
    }
    
    public void atualizaRegistroCadastroEquipamentosModel(String id,String equipamento, String defeito, String servico, String tecnico, String valor, String cliente, String finalizado){
        CadastroEquipamentosModel op = new CadastroEquipamentosModel(id, equipamento, defeito, servico, tecnico, valor, cliente, finalizado, null);
        OperAtualizaDadosBD oper = new OperAtualizaDadosBD();
        oper.atualizaRegistroEquipamentos(op);
    }
    
     public ArrayList<CadastroEquipamentosModel> filtrarRegistrosCadastroEquipamentosModel(String nome) {

        OperFiltroDadosBD op = new OperFiltroDadosBD();
        return op.filtrarRegistrosEquipamentos(nome);

    }
    
    
    
    
    
    
    
}
