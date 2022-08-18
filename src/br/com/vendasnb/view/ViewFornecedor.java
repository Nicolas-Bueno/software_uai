/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vendasnb.view;

import br.com.vendasnb.controller.ControllerFornecedor;
import br.com.vendasnb.model.ModelFornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Nicolas
 */
public class ViewFornecedor extends javax.swing.JFrame {
    
    ArrayList<ModelFornecedor> listaModelFornecedor = new ArrayList<>();
    ModelFornecedor modelFornecedor = new ModelFornecedor();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    String salvarAlterar;
    
    /**
     * Creates new form ViewFornecedor
     */
    public ViewFornecedor() {
        initComponents();
        this.carregarFornecedores();
        setLocationRelativeTo(null);
        this.habilitarDesabilitar(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtForId = new javax.swing.JTextField();
        txtForNome = new javax.swing.JTextField();
        txtForTel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFornecedor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtForPesquisar = new javax.swing.JTextField();
        btnForPesquisar = new javax.swing.JButton();
        btnForCancelar = new javax.swing.JButton();
        btnForEditar = new javax.swing.JButton();
        btnForNew = new javax.swing.JButton();
        btnForSalvar = new javax.swing.JButton();
        btnForDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        txtForId.setEnabled(false);

        tableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFornecedor);
        if (tableFornecedor.getColumnModel().getColumnCount() > 0) {
            tableFornecedor.getColumnModel().getColumn(1).setMinWidth(150);
            tableFornecedor.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableFornecedor.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jLabel4.setText("Pesquisar:");

        btnForPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/pesquisar.png"))); // NOI18N
        btnForPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForPesquisarActionPerformed(evt);
            }
        });

        btnForCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/cancelar.png"))); // NOI18N
        btnForCancelar.setToolTipText("Cancelar");
        btnForCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForCancelarActionPerformed(evt);
            }
        });

        btnForEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/editar.png"))); // NOI18N
        btnForEditar.setToolTipText("Editar");
        btnForEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForEditarActionPerformed(evt);
            }
        });

        btnForNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/novo.png"))); // NOI18N
        btnForNew.setToolTipText("Novo");
        btnForNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForNewActionPerformed(evt);
            }
        });

        btnForSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/salvar.png"))); // NOI18N
        btnForSalvar.setToolTipText("Salvar");
        btnForSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForSalvarActionPerformed(evt);
            }
        });

        btnForDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/deletar.png"))); // NOI18N
        btnForDeletar.setToolTipText("Deletar");
        btnForDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtForPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnForPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnForCancelar)
                                .addGap(30, 30, 30)
                                .addComponent(btnForEditar)
                                .addGap(33, 33, 33)
                                .addComponent(btnForNew)
                                .addGap(310, 310, 310)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnForDeletar)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtForId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtForNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtForTel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnForSalvar)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtForId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtForTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtForPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnForPesquisar))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnForCancelar)
                    .addComponent(btnForEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnForNew)
                    .addComponent(btnForSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnForDeletar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForCancelarActionPerformed
        // Desabilita e limpa campos
        habilitarDesabilitar(false);
        limparCampo();
    }//GEN-LAST:event_btnForCancelarActionPerformed

    private void btnForNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForNewActionPerformed
        // Habilita campos
        habilitarDesabilitar(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_btnForNewActionPerformed

    private void btnForDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForDeletarActionPerformed
        // Exclui um Fornecedor no banco
        int linha = tableFornecedor.getSelectedRow();
        int codigoFornecedor = (int) tableFornecedor.getValueAt(linha, 0);

        if (controllerFornecedor.excluirFornecedorController(codigoFornecedor)) {
            JOptionPane.showMessageDialog(this, "Fornecedor excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.carregarFornecedores();
            this.habilitarDesabilitar(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o Fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnForDeletarActionPerformed

    private void btnForSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForSalvarActionPerformed
        // Salvar Fornecedor
        if(salvarAlterar.equals("salvar")){
           this.salvaFornecedor(); 
        }else if (salvarAlterar.equals("alterar")){
            this.alteraFornecedor();
        }
    }//GEN-LAST:event_btnForSalvarActionPerformed

    private void btnForEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForEditarActionPerformed
        // Altera dados do fornecedor
        salvarAlterar = "alterar";
        habilitarDesabilitar(true);
        int linha = tableFornecedor.getSelectedRow();
        try {
            int codigoFornecedor = (int) tableFornecedor.getValueAt(linha, 0);
            // recuperar os dados do banco
            modelFornecedor = controllerFornecedor.getFornecedorController(codigoFornecedor);
            // setar na interface
            this.txtForId.setText(String.valueOf(modelFornecedor.getId()));
            this.txtForNome.setText(modelFornecedor.getNome());
            this.txtForTel.setText(String.valueOf(modelFornecedor.getFone()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnForEditarActionPerformed

    private void btnForPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForPesquisarActionPerformed
        // Pesquisar
        DefaultTableModel modelo = (DefaultTableModel) this.tableFornecedor.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.tableFornecedor.setRowSorter(classificador);
        
        String texto = txtForPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
        
    }//GEN-LAST:event_btnForPesquisarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedor().setVisible(true);
            }
        });
    }
    
    /***
     * Carrega os fornecedores na tabela
     */
    
    private void carregarFornecedores(){
        listaModelFornecedor = controllerFornecedor.getListaFornecedorController();
        DefaultTableModel modelo = (DefaultTableModel) this.tableFornecedor.getModel();
        modelo.setNumRows(0);
        // inserir produtos na tabela
        for(int i=0; i < listaModelFornecedor.size(); i++){
            modelo.addRow( new Object[]{
            listaModelFornecedor.get(i).getId(),
            listaModelFornecedor.get(i).getNome(),
            listaModelFornecedor.get(i).getFone()
        });
        }
    }
    
    /***
     * Habilita ou desabilita campos
     * @param condicao 
     */
    
    private void habilitarDesabilitar(boolean condicao){
        txtForNome.setEnabled(condicao);
        txtForTel.setEnabled(condicao);
    }
    
    /***
     * limpa os campos
     */
    private void limparCampo() {
        txtForNome.setText("");
        txtForTel.setText("");
        txtForPesquisar.setText("");
    }
    
    /***
     * Salva os fornecedores no banco
     */
    
    private void salvaFornecedor(){
        try {
            modelFornecedor.setNome(txtForNome.getText());
            modelFornecedor.setFone(txtForTel.getText());
            
            if(controllerFornecedor.salvarFornecedorController(modelFornecedor) > 0){
                JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.carregarFornecedores();
                this.limparCampo();
                habilitarDesabilitar(false);
            }else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /***
     * Altera os fornecedores no banco
     */
    private void alteraFornecedor(){
        try {
            modelFornecedor.setNome(txtForNome.getText());
            modelFornecedor.setFone(txtForTel.getText());
            
            if(controllerFornecedor.atualizarFornecedorController(modelFornecedor)){
                JOptionPane.showMessageDialog(this, "Fornecedor alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                this.carregarFornecedores();
                this.limparCampo();
                habilitarDesabilitar(false);
            }else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o fornecedor!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForCancelar;
    private javax.swing.JButton btnForDeletar;
    private javax.swing.JButton btnForEditar;
    private javax.swing.JButton btnForNew;
    private javax.swing.JButton btnForPesquisar;
    private javax.swing.JButton btnForSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFornecedor;
    private javax.swing.JTextField txtForId;
    private javax.swing.JTextField txtForNome;
    private javax.swing.JTextField txtForPesquisar;
    private javax.swing.JTextField txtForTel;
    // End of variables declaration//GEN-END:variables
}
