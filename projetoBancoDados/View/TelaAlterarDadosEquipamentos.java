/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import CEP.buscadorCep;
import Controller.CadastroEquipamentosController;
import Controller.CadastroUsuarioController;
import Controller.UsuarioController;
import FormatadorCampo.formatadorCampo;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaAlterarDadosEquipamentos extends javax.swing.JFrame {

    /**
     * Creates new form TelaNovoUsuario
     */
    public TelaAlterarDadosEquipamentos() throws ParseException {
        initComponents();
        txtId.setEditable(false);
        txtNomeCliente.setEditable(false);
        txtNomeTecnico.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlDados = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        lblTécnico = new javax.swing.JLabel();
        txtTecnico = new javax.swing.JTextField();
        btnPesquisarTecnico = new javax.swing.JButton();
        lblEquipamento = new javax.swing.JLabel();
        txtEquipamento = new javax.swing.JTextField();
        lblDefeito = new javax.swing.JLabel();
        txtDefeito = new javax.swing.JTextField();
        lblServico = new javax.swing.JLabel();
        txtServico = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblNomeTecnico = new javax.swing.JLabel();
        txtNomeTecnico = new javax.swing.JTextField();
        lblFinalizado = new javax.swing.JLabel();
        cbxFinalizado = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setTitle("Atualizar ordem");
        setResizable(false);

        pnlBase.setLayout(new java.awt.BorderLayout());

        pnlTop.setPreferredSize(new java.awt.Dimension(772, 70));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeAtualiza.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
            .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLogoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
            .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLogoLayout.createSequentialGroup()
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Alterar dados equipamento");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBase.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlLeft.setPreferredSize(new java.awt.Dimension(15, 255));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        pnlBase.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlBottom.setPreferredSize(new java.awt.Dimension(772, 60));

        pnlBotoes.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnAtualizar);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlRight.setPreferredSize(new java.awt.Dimension(15, 255));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        pnlBase.add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlCenter.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados novo usuário"));

        pnlDados.setLayout(new java.awt.GridLayout(20, 1, 5, 5));

        lblCliente.setText("Cliente ID:");
        pnlDados.add(lblCliente);

        txtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClienteFocusLost(evt);
            }
        });
        pnlDados.add(txtCliente);

        btnPesquisarCliente.setText("Pesquisar Cliente");
        btnPesquisarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPesquisarCliente.setPreferredSize(new java.awt.Dimension(60, 23));
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });
        pnlDados.add(btnPesquisarCliente);

        lblTécnico.setText("Técnico ID:");
        pnlDados.add(lblTécnico);

        txtTecnico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTecnicoFocusLost(evt);
            }
        });
        pnlDados.add(txtTecnico);

        btnPesquisarTecnico.setText("Pesquisar Técnico");
        btnPesquisarTecnico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPesquisarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTecnicoActionPerformed(evt);
            }
        });
        pnlDados.add(btnPesquisarTecnico);

        lblEquipamento.setText("Equipamento:");
        pnlDados.add(lblEquipamento);

        txtEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipamentoActionPerformed(evt);
            }
        });
        pnlDados.add(txtEquipamento);

        lblDefeito.setText("Defeito:");
        pnlDados.add(lblDefeito);
        pnlDados.add(txtDefeito);

        lblServico.setText("Serviço:");
        pnlDados.add(lblServico);
        pnlDados.add(txtServico);

        lblValor.setText("Valor:");
        pnlDados.add(lblValor);
        pnlDados.add(txtValor);

        lblNomeCliente.setText("Nome Cliente:");
        pnlDados.add(lblNomeCliente);
        pnlDados.add(txtNomeCliente);

        lblNomeTecnico.setText("Nome Técnico:");
        pnlDados.add(lblNomeTecnico);
        pnlDados.add(txtNomeTecnico);

        lblFinalizado.setText("Finalizado");
        pnlDados.add(lblFinalizado);

        cbxFinalizado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));
        pnlDados.add(cbxFinalizado);

        lblId.setText("ID:");

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, 806, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipamentoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
        TelaOperCadastroEquipamentos tela = new TelaOperCadastroEquipamentos();

        tela.setVisible(true);
        tela.atualizaFechar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        //1. Recuperar os dados atualizados das caixas de texto
        String id = txtId.getText();
        String equipamento = txtEquipamento.getText();
        String defeito = txtDefeito.getText();
        String servico = txtServico.getText();
        String tecnico = txtTecnico.getText();
        String valor = txtValor.getText();
        String cliente = txtCliente.getText();
        String finalizado = cbxFinalizado.getSelectedItem().toString();
        
        

        //2. Verificar se não há campos vazios + tratamentos
        if (cliente.isEmpty()) {
            String mensagem = "Cliente não informado!";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtCliente.grabFocus();
        } else if (tecnico.isEmpty()) {
            String mensagem = "Técnico não informado";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtTecnico.grabFocus();
        } else if (equipamento.isEmpty()) {
            String mensagem = "Equipamento não informado!";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtEquipamento.grabFocus();
        } else if (defeito.isEmpty()) {
            String mensagem = "Defeito não informado!";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtDefeito.grabFocus();
        } else if (servico.isEmpty()) {
            String mensagem = "Serviço não informado!";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtServico.grabFocus();
        } else if (valor.isEmpty()) {
            String mensagem = "Valor não informado!";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtValor.grabFocus();
        } else if (cliente.isEmpty()) {
            String mensagem = "Cliente não informado!";
            JOptionPane.showMessageDialog(rootPane, mensagem);
            txtValor.grabFocus();
        } else {

            String nomeCliente = "";
            CadastroUsuarioController cliente2 = new CadastroUsuarioController();
            CadastroUsuarioModel modelo1 = cliente2.buscarPorIdRegistroCadastroController(txtCliente.getText());
            nomeCliente = modelo1.getNome();

            String nomeTecnico = "";
            UsuarioController tecnico2 = new UsuarioController();
            UsuarioModel modelo2 = tecnico2.buscarPorIdRegistroController(txtTecnico.getText());
            nomeTecnico = modelo2.getUsername();

            if (nomeCliente == null || nomeCliente.isEmpty() || txtCliente.getText() == "") {
                JOptionPane.showMessageDialog(null, "ID inválido ou não existe");
                
            } else if (nomeTecnico == null || nomeTecnico.isEmpty() || txtTecnico.getText() == "") {
                JOptionPane.showMessageDialog(null, "ID inválido ou não existe");
            }
            
            else if(numberOrChar(valor) == false){
                JOptionPane.showMessageDialog(null, "Verifique números/caracteres");
            }

          
        
             
   
        
        else{
            
               //2. Mandar as informações atualizadas para o controller
            CadastroEquipamentosController op = new CadastroEquipamentosController();
            op.atualizaRegistroCadastroEquipamentosController(id, equipamento, defeito, servico, tecnico, valor, cliente, finalizado);
            
             

            //3. Limpa os campos e fecha a janela
            txtId.setText(null);
            txtEquipamento.setText(null);
            txtDefeito.setText(null);
            txtServico.setText(null);
            txtTecnico.setText(null);
            txtValor.setText(null);
            txtCliente.setText(null);

            ////testeAtualizaTabelaAutomatico
            TelaOperCadastroEquipamentos tela = new TelaOperCadastroEquipamentos();

            tela.setVisible(true);
            tela.atualizaFechar();

            this.dispose();
            
        }

        }


    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtTecnicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTecnicoFocusLost
//        String nomeTecnico = "";
//        UsuarioController tecnico = new UsuarioController();
//        UsuarioModel modelo = tecnico.buscarPorIdRegistroController(txtTecnico.getText());
//        nomeTecnico = modelo.getUsername();
//        
//        if(nomeTecnico == null || nomeTecnico.isEmpty() || txtTecnico.getText() == ""){
//            txtNomeTecnico.setText("Nome não encontrado");
//        }
//        
//        else{
//            txtNomeTecnico.setText(nomeTecnico);     
//        }
    }//GEN-LAST:event_txtTecnicoFocusLost

    private void txtClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClienteFocusLost
//        String nomeCliente = "";
//        CadastroUsuarioController cliente = new CadastroUsuarioController();
//        CadastroUsuarioModel modelo = cliente.buscarPorIdRegistroCadastroController(txtCliente.getText());
//        nomeCliente = modelo.getNome();
//        
//        if(nomeCliente == null || nomeCliente.isEmpty() || txtCliente.getText() == ""){
//            txtNomeCliente.setText("Nome não encontrado");
//        }
//        
//        else{
//            txtNomeCliente.setText(nomeCliente);     
//        }
    }//GEN-LAST:event_txtClienteFocusLost

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        String nomeCliente = "";
        CadastroUsuarioController cliente = new CadastroUsuarioController();
        CadastroUsuarioModel modelo = cliente.buscarPorIdRegistroCadastroController(txtCliente.getText());
        nomeCliente = modelo.getNome();

        if (nomeCliente == null || nomeCliente.isEmpty() || txtCliente.getText() == "") {
            txtNomeCliente.setText("Nome não encontrado");
        } else {
            txtNomeCliente.setText(nomeCliente);
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnPesquisarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTecnicoActionPerformed
        String nomeTecnico = "";
        UsuarioController tecnico = new UsuarioController();
        UsuarioModel modelo = tecnico.buscarPorIdRegistroController(txtTecnico.getText());
        nomeTecnico = modelo.getUsername();

        if (nomeTecnico == null || nomeTecnico.isEmpty() || txtTecnico.getText() == "") {
            txtNomeTecnico.setText("Nome não encontrado");
        } else {
            txtNomeTecnico.setText(nomeTecnico);
        }
    }//GEN-LAST:event_btnPesquisarTecnicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDadosEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDadosEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDadosEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDadosEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaAlterarDadosEquipamentos().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(TelaAlterarDadosEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarTecnico;
    private javax.swing.JComboBox<String> cbxFinalizado;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDefeito;
    private javax.swing.JLabel lblEquipamento;
    private javax.swing.JLabel lblFinalizado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeTecnico;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTécnico;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDefeito;
    private javax.swing.JTextField txtEquipamento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeTecnico;
    private javax.swing.JTextField txtServico;
    private javax.swing.JTextField txtTecnico;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    public void popularCamposUsuario(String id, String equipamento, String defeito, String servico, String tecnico, String valor, String cliente, String nomeCliente, String nomeTecnico,String finalizado) {

        txtId.setText(id);
        txtEquipamento.setText(equipamento);
        txtDefeito.setText(defeito);
        txtServico.setText(servico);
        txtTecnico.setText(tecnico);
        txtValor.setText(valor);
        txtCliente.setText(cliente);
        txtNomeCliente.setText(nomeCliente);
        txtNomeTecnico.setText(nomeTecnico);
        cbxFinalizado.setSelectedItem(finalizado);
        
       

    }
    
    public boolean numberOrChar(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
