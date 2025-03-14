/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroUsuarioController;
import Controller.UsuarioController;
import Model.CadastroUsuarioModel;
import Model.UsuarioModel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Aluno
 */
public class TelaOperCadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form TelaOperCadastroUsuarios
     */
    public TelaOperCadastroClientes() {
        initComponents();
        atualizaFechar();

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
        pnlImagem = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlBotoes = new javax.swing.JPanel();
        btnID = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        btnCriarNovo = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDadosUsuarios = new javax.swing.JTable();
        lblFiltro = new javax.swing.JLabel();
        txtNomeFiltro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

        pnlBase.setLayout(new java.awt.BorderLayout());

        pnlTop.setPreferredSize(new java.awt.Dimension(783, 65));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-user-40.png"))); // NOI18N
        lblImagem.setText(" ");

        javax.swing.GroupLayout pnlImagemLayout = new javax.swing.GroupLayout(pnlImagem);
        pnlImagem.setLayout(pnlImagemLayout);
        pnlImagemLayout.setHorizontalGroup(
            pnlImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagemLayout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        pnlImagemLayout.setVerticalGroup(
            pnlImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagemLayout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitulo.setText("Formulário de Manutenção de Clientes - AppAsistência");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addContainerGap(538, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        pnlBase.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlLeft.setPreferredSize(new java.awt.Dimension(15, 243));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        pnlBase.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlBottom.setPreferredSize(new java.awt.Dimension(783, 50));

        pnlBotoes.setLayout(new java.awt.GridLayout(1, 6, 5, 5));

        btnID.setText("Buscar ID");
        btnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnID);

        btnAtualiza.setText("Listar Todos");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnAtualiza);

        btnCriarNovo.setText("Criar Novo");
        btnCriarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarNovoActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCriarNovo);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnDelete);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnUpdate);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar);

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBase.add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlRight.setPreferredSize(new java.awt.Dimension(15, 243));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        pnlBase.add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlCenter.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Clientes:"));

        tbDadosUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CEP", "Endereço", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDadosUsuarios);

        lblFiltro.setText("Filtrar pelo nome:");

        btnFiltrar.setText("Flitrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addComponent(lblFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltro)
                    .addComponent(txtNomeFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );

        pnlBase.add(pnlCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed

//        // Definem uma arraylist para receber os dados do controller
//        // Executa uma operação para atribuir a essa lista o resultado
//        // da lisyagem de registros do controller
//        UsuarioController op = new UsuarioController();
//        ArrayList<UsuarioModel> listaUsuarios = new ArrayList<UsuarioModel>();
//        listaUsuarios = op.listarRegistrosController();
//
//        //Utilizar um método para capturar o modelo da tabela(disposição
//        //da ordem das colunas, quantidade de linhas...
//        DefaultTableModel tableModel = (DefaultTableModel) tbDadosUsuarios.getModel();
//
//        //Iterator -> método iterator
//        //Documentação disponível junto ao site da Oracle
//        //Descrição do método e a validação de como ele funciona
//        //Desafio para a próxima aula
//        Iterator<UsuarioModel> iterator = listaUsuarios.iterator();
//
//        while (tableModel.getRowCount() > 0) {
//            int deleteRow = 0;
//            tableModel.removeRow(deleteRow);
//
//        }
//
//        while (iterator.hasNext()) {
//            UsuarioModel usuario = iterator.next();
//
//            tableModel.addRow(
//                    new Object[]{
//                        usuario.getId(),
//                        usuario.getUsername(),
//                        usuario.getEmail(),
//                        usuario.getLogin(),
//                        usuario.getPerfil()
//
//                    }
//            );
//
//        }
        atualizaFechar();

    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed

        //Capturar a informação do texto digitado no campo filtro
        String nome = txtNomeFiltro.getText();

        // Definem uma arraylist para receber os dados do controller
        // Executa uma operação para atribuir a essa lista o resultado
        // da lisyagem de registros do controller
        CadastroUsuarioController op = new CadastroUsuarioController();
        ArrayList<CadastroUsuarioModel> listaUsuarios = new ArrayList<CadastroUsuarioModel>();
        listaUsuarios = op.filtrarRegistrosCadastroController(nome);

        //Utilizar um método para capturar o modelo da tabela(disposição
        //da ordem das colunas, quantidade de linhas...
        DefaultTableModel tableModel = (DefaultTableModel) tbDadosUsuarios.getModel();

        //Iterator -> método iterator
        //Documentação disponível junto ao site da Oracle
        //Descrição do método e a validação de como ele funciona
        //Desafio para a próxima aula
        Iterator<CadastroUsuarioModel> iterator = listaUsuarios.iterator();

        while (tableModel.getRowCount() > 0) {
            int deleteRow = 0;
            tableModel.removeRow(deleteRow);

        }

        while (iterator.hasNext()) {
            CadastroUsuarioModel usuario = iterator.next();

            tableModel.addRow(
                    new Object[]{
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getCep(),
                        usuario.getEndereco(),
                        usuario.getFone(),
                        usuario.getEmail()

                    }
            );

        }


    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnCriarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarNovoActionPerformed

        TelaNovoUsuarioCadastroClientes tela = null;
        try {
            tela = new TelaNovoUsuarioCadastroClientes();
        } catch (ParseException ex) {
            Logger.getLogger(TelaOperCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);

        
        //testeAtualizaTabelaAutomatico
        fecharJanela();
    }//GEN-LAST:event_btnCriarNovoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (tbDadosUsuarios.getSelectedRow() == -1) {
            String mensagem = "Selecione uma linha primeiro";
            JOptionPane.showMessageDialog(null, mensagem);
        } else {

            //Capturar o número da linha que foi selecionada pelo usuário  
            Integer linhaSelec = tbDadosUsuarios.getSelectedRow();
            String idUser = tbDadosUsuarios.getValueAt(linhaSelec, 0).toString();
            String nome = tbDadosUsuarios.getValueAt(linhaSelec, 1).toString();
            String mensagem = "Deseja realmente excluir o registro de: " + nome + " ?";
            Integer numeroRetorno = JOptionPane.showConfirmDialog(null, mensagem);

            System.out.println("Numero retorno " + numeroRetorno);

            if (numeroRetorno.equals(0)) {
                CadastroUsuarioController op = new CadastroUsuarioController();
                op.excluiRegistroCadastroUsuarioController(idUser);
               
            } else {
                String mensagemCancelamento = "Operação cancelada!";
                JOptionPane.showMessageDialog(null, mensagemCancelamento);
            }

//        UsuarioController op = new UsuarioController();
//        op.excluirRegistroController(idUser);
        }
        
        atualizaFechar();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tbDadosUsuarios.getSelectedRow() == -1) {
            String mensagem = "Selecione uma linha primeiro";
            JOptionPane.showMessageDialog(null, mensagem);
        } else {

            Integer linhaSelec = tbDadosUsuarios.getSelectedRow();
            //Recuperação dos dados na tabela
            String idUser = tbDadosUsuarios.getValueAt(linhaSelec, 0).toString();
            String userName = tbDadosUsuarios.getValueAt(linhaSelec, 1).toString();
            String cep = tbDadosUsuarios.getValueAt(linhaSelec, 2).toString();
            String endereco = tbDadosUsuarios.getValueAt(linhaSelec, 3).toString();
            String telefone = tbDadosUsuarios.getValueAt(linhaSelec, 4).toString().replaceAll("[()\\s-]", "").trim();;
            String email = tbDadosUsuarios.getValueAt(linhaSelec, 5).toString();

            //Enviar para a tela AtualizaUsuário
            TelaAlterarDadosUsuarioCliente tela = null;
            try {
                tela = new TelaAlterarDadosUsuarioCliente();
            } catch (ParseException ex) {
                Logger.getLogger(TelaOperCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            tela.setVisible(true);
            tela.popularCamposUsuario(idUser,userName,cep,endereco,telefone,email);
            fecharJanela();
            
            System.out.println("Telefone:" + telefone);

        }
        
        atualizaFechar();
        
         
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDActionPerformed
         TelaBuscaPorIDClientes tela = new TelaBuscaPorIDClientes();
         tela.setVisible(true);
         this.dispose();
         
         
    }//GEN-LAST:event_btnIDActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOperCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOperCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOperCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOperCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOperCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriarNovo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnID;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlImagem;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tbDadosUsuarios;
    private javax.swing.JTextField txtNomeFiltro;
    // End of variables declaration//GEN-END:variables

    public void atualizaFechar() {

        // Definem uma arraylist para receber os dados do controller
        // Executa uma operação para atribuir a essa lista o resultado
        // da lisyagem de registros do controller
        CadastroUsuarioController op = new CadastroUsuarioController();
        ArrayList<CadastroUsuarioModel> listaUsuarios = new ArrayList<CadastroUsuarioModel>();
        listaUsuarios = op.listarRegistrosCadastroUsuarioController();

        //Utilizar um método para capturar o modelo da tabela(disposição
        //da ordem das colunas, quantidade de linhas...
        DefaultTableModel tableModel = (DefaultTableModel) tbDadosUsuarios.getModel();

        //Iterator -> método iterator
        //Documentação disponível junto ao site da Oracle
        //Descrição do método e a validação de como ele funciona
        //Desafio para a próxima aula
        Iterator<CadastroUsuarioModel> iterator = listaUsuarios.iterator();

        while (tableModel.getRowCount() > 0) {
            int deleteRow = 0;
            tableModel.removeRow(deleteRow);

        }

        while (iterator.hasNext()) {
            CadastroUsuarioModel usuario = iterator.next();

            tableModel.addRow(
                    new Object[]{
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getCep(),
                        usuario.getEndereco(),
                        usuario.getFone(),
                        usuario.getEmail()

                    }
            );

        }
    }

    public void fecharJanela() {
        this.dispose();

    }

}
