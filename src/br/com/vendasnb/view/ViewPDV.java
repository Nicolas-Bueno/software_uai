/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vendasnb.view;

import br.com.vendasnb.controller.ControllerProdutos;
import br.com.vendasnb.controller.ControllerVenda;
import br.com.vendasnb.controller.ControllerVendasProdutos;
import br.com.vendasnb.model.ModelProdutos;
import br.com.vendasnb.model.ModelSessaoUsuario;
import br.com.vendasnb.model.ModelVenda;
import br.com.vendasnb.model.ModelVendasProdutos;
import br.com.vendasnb.util.Datas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolas
 */
public class ViewPDV extends javax.swing.JFrame {

    ControllerProdutos controllerProduto = new ControllerProdutos();
    ControllerVenda controllerVenda = new ControllerVenda();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelProdutos modelProduto = new ModelProdutos();
    ModelVenda modelVenda = new ModelVenda();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    Datas datas = new Datas();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    int quantidade;
    private ViewPagamentoPDV viewPagamentoPDV;

    /**
     * Creates new form ViewPDV
     */
    public ViewPDV() {
        initComponents();
        setLocationRelativeTo(null);
        quantidade = 1;
        this.setarOperador();
        this.limparForm();
        
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
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        txtOperador = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePDV = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemQuantidade = new javax.swing.JMenuItem();
        MenuItemFInalizarVenda = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PDV");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(73, 171, 168));

        jPanel5.setBackground(new java.awt.Color(84, 182, 178));

        jPanel2.setBackground(new java.awt.Color(112, 194, 191));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Status:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Operador:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Caixa:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("01");

        labelStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("jLabel7");

        txtOperador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtOperador.setForeground(new java.awt.Color(255, 255, 255));
        txtOperador.setText("operador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtOperador)
                    .addComponent(labelStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOperador))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelStatus))
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(112, 194, 191));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Valor Bruto");

        txtValorTotal.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Comandos");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("F3 - Quantidade");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("F4 - Finalizar Venda");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("F5 - Pesquisar Produto");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("F6 - Sair");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("F2 - Excluir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePDV);
        if (tablePDV.getColumnModel().getColumnCount() > 0) {
            tablePDV.getColumnModel().getColumn(0).setMinWidth(40);
            tablePDV.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablePDV.getColumnModel().getColumn(0).setMaxWidth(40);
            tablePDV.getColumnModel().getColumn(1).setMinWidth(60);
            tablePDV.getColumnModel().getColumn(1).setPreferredWidth(60);
            tablePDV.getColumnModel().getColumn(1).setMaxWidth(60);
            tablePDV.getColumnModel().getColumn(3).setMinWidth(70);
            tablePDV.getColumnModel().getColumn(3).setPreferredWidth(70);
            tablePDV.getColumnModel().getColumn(3).setMaxWidth(70);
            tablePDV.getColumnModel().getColumn(4).setMinWidth(70);
            tablePDV.getColumnModel().getColumn(4).setPreferredWidth(70);
            tablePDV.getColumnModel().getColumn(4).setMaxWidth(70);
            tablePDV.getColumnModel().getColumn(5).setMinWidth(70);
            tablePDV.getColumnModel().getColumn(5).setPreferredWidth(70);
            tablePDV.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/NBtech-sem.png"))); // NOI18N

        txtCodProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Comandos");

        jMenuItemExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExcluir);

        jMenuItemQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemQuantidade.setText("Quantidade");
        jMenuItemQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemQuantidade);

        MenuItemFInalizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuItemFInalizarVenda.setText("Finalizar Venda");
        MenuItemFInalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFInalizarVendaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemFInalizarVenda);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("Pesquisar Produtos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void MenuItemFInalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFInalizarVendaActionPerformed
        // Botao F4 finalizar venda
        try {
            this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
            viewPagamentoPDV.setValorTotal(Float.parseFloat(txtValorTotal.getText()));
            viewPagamentoPDV.setTextValorTotal();
            viewPagamentoPDV.setVisible(true);

//        txtValor.setText(viewPagamentoPDV.getValorTotal()+"");
//        txtDesconto.setText(viewPagamentoPDV.getDesconto()+"");
            if (viewPagamentoPDV.isFlag()) {
                this.salvarVenda();
            } else {
                //JOptionPane.showMessageDialog(this, "Você cancelou o pagamento!");
            }
            viewPagamentoPDV.setFlag(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você deve incluir um produto!");
        }


    }//GEN-LAST:event_MenuItemFInalizarVendaActionPerformed

    private void jMenuItemQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuantidadeActionPerformed
        //Quantidade F3
        try {
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade!"));
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jMenuItemQuantidadeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        // F2 Excluir
        int qtdLinha = tablePDV.getRowCount();

        if (qtdLinha < 1) {
            JOptionPane.showMessageDialog(this, "Não existe itens para excluir");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tablePDV.getModel();
            int linha = Integer.parseInt(JOptionPane.showInputDialog("Informe o item que deseja excluir"));
            modelo.removeRow(linha - 1);
            txtValorTotal.setText(somaValorTotal() + "");

            for (int i = 0; i < qtdLinha; i++) {
                modelo.setValueAt((i + 1), i, 0);
            }

        }

    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void txtCodProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyPressed
        // TODO add your handling code here:
        this.getConteudo(evt);
    }//GEN-LAST:event_txtCodProdutoKeyPressed

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

    private void getConteudo(java.awt.event.KeyEvent e) {
        labelStatus.setText("Venda");
        DefaultTableModel modelo = (DefaultTableModel) tablePDV.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                modelProduto = controllerProduto.retornaProdutoController(Integer.parseInt(txtCodProduto.getText()));

                modelo.addRow(new Object[]{
                    modelo.getRowCount() + 1,
                    modelProduto.getIdProduto(),
                    modelProduto.getNome(),
                    quantidade,
                    modelProduto.getValorVenda(),
                    modelProduto.getValorVenda() * quantidade
                });
                txtValorTotal.setText(String.valueOf(somaValorTotal()));
                txtCodProduto.setText("");
                quantidade = 1;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Codigo não cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                txtCodProduto.setText("");
            }
        }
    }

    private float somaValorTotal() {
        float soma = 0, valor = 0;
        int cont = tablePDV.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(tablePDV.getValueAt(i, 5)));
            soma += valor;
        }

        return soma;
    }

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
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }

    private void limparForm() {
        txtValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tablePDV.getModel();
        modelo.setNumRows(0);
        labelStatus.setText("Caixa Livre");


    }

    private void setarOperador() {
        txtOperador.setText(modelSessaoUsuario.nome);
    }

    private void salvarVenda() {
        int codigoProduto = 0, codigoVenda = 0;

        listaModelVendasProdutos = new ArrayList<>();

        modelVenda.setUsuarioId(1);

        try {
            modelVenda.setDataVenda(datas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {
        }

        modelVenda.setValorBruto(Double.parseDouble(txtValorTotal.getText()));
        modelVenda.setValorLiquido(Double.parseDouble(viewPagamentoPDV.getValorTotal() + ""));
        modelVenda.setDesconto(Double.parseDouble(viewPagamentoPDV.getDesconto() + ""));

        //Salvar venda
        codigoVenda = controllerVenda.salvarVendaController(modelVenda);

        for (int i = 0; i < tablePDV.getRowCount(); i++) {
            codigoProduto = (int) tablePDV.getValueAt(i, 1);
            //venda
            modelVendasProdutos = new ModelVendasProdutos();
            modelProduto = new ModelProdutos();
            modelVendasProdutos.setProdutoId(codigoProduto);
            modelVendasProdutos.setVendaId(codigoVenda);
            modelVendasProdutos.setValorUnitario((Double) tablePDV.getValueAt(i, 4));
            modelVendasProdutos.setQuantidade(Integer.parseInt(tablePDV.getValueAt(i, 3).toString()));
            //dar baixa no estoque
            modelProduto.setIdProduto(codigoProduto);
            modelProduto.setEstoque(controllerProduto.retornaProdutoController(codigoProduto).getEstoque()
                    - Integer.parseInt(tablePDV.getValueAt(i, 3).toString()));
            listaModelVendasProdutos.add(modelVendasProdutos);
            listaModelProdutos.add(modelProduto);
        }
        // salvar os produtos da venda
        if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
            // alterar o estoque de produtos
            controllerProduto.alterarEstoqueProdutoController(listaModelProdutos);
            //JOptionPane.showMessageDialog(this, "Produtos da venda salva com sucesso", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar produtos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.limparForm();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemFInalizarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemQuantidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTable tablePDV;
    private javax.swing.JFormattedTextField txtCodProduto;
    private javax.swing.JLabel txtOperador;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
