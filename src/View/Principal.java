/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public void enterOrigem(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.CANCEL_OPTION) {
            } else {
                String file = fileChooser.getSelectedFile().getPath();
                txt_BDorigem.setText(file);
                txt_BDorigem.setText(txt_BDorigem.getText().replace("\\", "/"));
            }
        }
    }
    public void enterDestino(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.CANCEL_OPTION) {
            } else {
                String file = fileChooser.getSelectedFile().getPath();
                txt_BDdestino.setText(file);
                txt_BDdestino.setText(txt_BDdestino.getText().replace("\\", "/"));
            }
        }
    }
//
//    public void alteraDiretorio() {
//        diretorio = "";
//        if (cbx_tipo.getSelectedIndex() == 0) {
//            diretorio += "localhost:3050/";
//        } else {
//            diretorio += txt_ip.getText() + ":3050/";
//        }
//        if (txt_diretorio.getText().compareTo("") != 0) {
//            diretorio += txt_diretorio.getText().replace("\\", "/");
//            txt_diretorio.setText(txt_diretorio.getText().replace("\\", "/"));
//        }
//    }
//
//    public void testaConexão() {
//        if ((cbx_tipo.getSelectedIndex() != 0) && (txt_ip.getText().compareTo("") == 0)) {
//            JOptionPane.showMessageDialog(null, "IP é Obrigatorio se Tipo de conexão é REMOTO");
//            txt_ip.requestFocus();
//        } else {
//            if (txt_diretorio.getText().compareTo("") == 0) {
//                JOptionPane.showMessageDialog(null, "Campo Diretorio é Obrigatorio");
//                txt_diretorio.requestFocus();
//            } else {
//                if (txt_user.getText().compareTo("") == 0) {
//                    JOptionPane.showMessageDialog(null, "Campo User é Obrigatorio");
//                    txt_user.requestFocus();
//                } else {
//                    if (txt_password.getText().compareTo("") == 0) {
//                        JOptionPane.showMessageDialog(null, "Campo Password é Obrigatorio");
//                        txt_password.requestFocus();
//                    } else {
//                        try {
//                            alteraDiretorio();
//                            Class.forName("org.firebirdsql.jdbc.FBDriver");
//                            con = DriverManager.getConnection(
//                                    "jdbc:firebirdsql://" + diretorio,
//                                    txt_user.getText(),
//                                    txt_password.getText());
//                            st = con.createStatement();
//                            status.setText("Conexão Bem Sucedida!");
//                        } catch (ClassNotFoundException ex)//caso o driver não seja localizado  
//                        {
//                            JOptionPane.showMessageDialog(null, "Driver não encontrado!");
//                        } catch (SQLException ex)//caso a conexão não possa se realizada  
//                        {
//                            status.setText("Sem Conexão!");
//                            JOptionPane.showMessageDialog(null, ex.getMessage());
//                        }
//                    }
//                }
//            }
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_conexao = new javax.swing.JPanel();
        pnl_fundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_BDorigem = new javax.swing.JTextField();
        txt_BDdestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_carregar = new javax.swing.JButton();
        icone1 = new javax.swing.JLabel();
        icone2 = new javax.swing.JLabel();
        btn_testar = new javax.swing.JButton();
        pnl_tabelas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_importar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_fundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Banco Origem:");

        txt_BDorigem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_BDorigemKeyPressed(evt);
            }
        });

        txt_BDdestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_BDdestinoKeyPressed(evt);
            }
        });

        jLabel2.setText("Banco Destino:");

        btn_carregar.setText("Carregar");
        btn_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carregarActionPerformed(evt);
            }
        });

        icone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/OK.gif"))); // NOI18N

        icone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel.gif"))); // NOI18N

        btn_testar.setText("Testar");
        btn_testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_carregar))
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_BDdestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_BDorigem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icone1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icone2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icone1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_BDorigem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icone2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_BDdestino, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_carregar)
                    .addComponent(btn_testar))
                .addGap(4, 4, 4))
        );

        pnl_tabelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Fornecedor", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela2);

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Produto", "Referencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela1);

        javax.swing.GroupLayout pnl_tabelasLayout = new javax.swing.GroupLayout(pnl_tabelas);
        pnl_tabelas.setLayout(pnl_tabelasLayout);
        pnl_tabelasLayout.setHorizontalGroup(
            pnl_tabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tabelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_tabelasLayout.setVerticalGroup(
            pnl_tabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tabelasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_tabelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_importar.setText("Importar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_importar)
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btn_importar)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout pnl_conexaoLayout = new javax.swing.GroupLayout(pnl_conexao);
        pnl_conexao.setLayout(pnl_conexaoLayout);
        pnl_conexaoLayout.setHorizontalGroup(
            pnl_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_conexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_tabelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_conexaoLayout.setVerticalGroup(
            pnl_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_conexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_tabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_conexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_conexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carregarActionPerformed

    private void btn_testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarActionPerformed
        if (txt_BDorigem.getText().compareTo("")==0) {
            
        }
    }//GEN-LAST:event_btn_testarActionPerformed

    private void txt_BDorigemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BDorigemKeyPressed
        enterOrigem(evt);
    }//GEN-LAST:event_txt_BDorigemKeyPressed

    private void txt_BDdestinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BDdestinoKeyPressed
        enterDestino(evt);
    }//GEN-LAST:event_txt_BDdestinoKeyPressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_carregar;
    private javax.swing.JButton btn_importar;
    private javax.swing.JButton btn_testar;
    private javax.swing.JLabel icone1;
    private javax.swing.JLabel icone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl_conexao;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_tabelas;
    private javax.swing.JTable tabela1;
    private javax.swing.JTable tabela2;
    private javax.swing.JTextField txt_BDdestino;
    private javax.swing.JTextField txt_BDorigem;
    // End of variables declaration//GEN-END:variables
}
