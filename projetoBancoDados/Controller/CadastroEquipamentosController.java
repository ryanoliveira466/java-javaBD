package Controller;

import Model.CadastroEquipamentosModel;
import java.util.ArrayList;

public class CadastroEquipamentosController {

    public void insereEquipamentoCadastroEquipamentosController(String equipamento, String defeito, String servico, String tecnico, String valor, String cliente) {
        CadastroEquipamentosModel op = new CadastroEquipamentosModel();
        op.insereEquipamentoCadastroEquipamentosModel(equipamento, defeito, servico, tecnico, valor, cliente);

    }

    public CadastroEquipamentosModel buscarPorIdCadastroEquipamentosController(String id) {
        CadastroEquipamentosModel op = new CadastroEquipamentosModel();
        return op.buscarPorIdCadastroEquipamentosModel(id);
    }

    public ArrayList<CadastroEquipamentosModel> listarRegistrosCadastroUsuarioController() {
        CadastroEquipamentosModel op = new CadastroEquipamentosModel();

        return op.listarRegistrosCadastroEquipamentosModel();
    }

    public void excluiRegistroCadastroEquipamnetosController(String id) {
        CadastroEquipamentosModel op = new CadastroEquipamentosModel();
        op.excluiRegistroCadastroEquipamentosModel(id);

    }

    public void atualizaRegistroCadastroEquipamentosController(String id, String equipamento, String defeito, String servico, String tecnico, String valor, String cliente,String finalizado) {
        CadastroEquipamentosModel op = new CadastroEquipamentosModel();
        op.atualizaRegistroCadastroEquipamentosModel(id, equipamento, defeito, servico, tecnico, valor, cliente, finalizado);
    }

    public ArrayList<CadastroEquipamentosModel> filtrarRegistrosCadastroEquipamentosController(String nome) {

        CadastroEquipamentosModel op = new CadastroEquipamentosModel();
        return op.filtrarRegistrosCadastroEquipamentosModel(nome);

    }
    
}
