/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author andre.ataide
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        // Inicializa componentes da interface gráfica
        initComponents();

        // Altera o ícone do jFrame
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/box_flat.png")));

        /*
         * As linhas abaixo marcadas com o comentário "Estética → ", alteram um pouco a estética da tabela.
         * Elas não interferem, além do visual, no funcionamento do aplicativo.
         */
        // Estética → Centraliza conteúdo das células de cabeçalho
        JTableHeader header = tableListAll.getTableHeader();
        DefaultTableCellRenderer tableHeader = (DefaultTableCellRenderer) header.getDefaultRenderer();
        tableHeader.setHorizontalAlignment(SwingConstants.CENTER);

        // Estética → Centraliza verticalmente o conteúdo das células
        DefaultTableCellRenderer tableCell = new DefaultTableCellRenderer();
        tableCell.setHorizontalAlignment(SwingConstants.CENTER);

        // Estética → Centraliza os conteúdos das células da coluna[0] Id
        tableListAll.getColumnModel().getColumn(0).setCellRenderer(tableCell);

        // Estética → Centraliza os conteúdos das células da coluna[1] Data
        tableListAll.getColumnModel().getColumn(1).setCellRenderer(tableCell);

        // Estética → Centraliza os conteúdos das células da coluna[3] Status
        tableListAll.getColumnModel().getColumn(3).setCellRenderer(tableCell);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainCards = new javax.swing.JPanel();
        panelReadAll = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListAll = new javax.swing.JTable();
        panelUpdate = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelForm1 = new View.panelForm();
        panelRead = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFilePanel1 = new javax.swing.JMenuItem();
        mnuFilePanel2 = new javax.swing.JMenuItem();
        mnuFilePanel3 = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuEditFind = new javax.swing.JMenuItem();
        mnuEditReplace = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuHelpSupport = new javax.swing.JMenuItem();
        mnuHelpUpdates = new javax.swing.JMenuItem();
        mnuHelpSite = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadatro de Trecos");
        setPreferredSize(new java.awt.Dimension(640, 520));

        pnlMainCards.setLayout(new java.awt.CardLayout());

        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Visualizar Selecionado");

        jButton4.setText("Editar Selecionado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tableListAll.setFont(tableListAll.getFont().deriveFont(tableListAll.getFont().getSize()+3f));
        tableListAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Nome", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListAll.setColumnSelectionAllowed(true);
        tableListAll.setMinimumSize(new java.awt.Dimension(100, 100));
        jScrollPane2.setViewportView(tableListAll);
        tableListAll.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableListAll.getColumnModel().getColumnCount() > 0) {
            tableListAll.getColumnModel().getColumn(0).setMinWidth(30);
            tableListAll.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableListAll.getColumnModel().getColumn(0).setMaxWidth(100);
            tableListAll.getColumnModel().getColumn(2).setMinWidth(50);
            tableListAll.getColumnModel().getColumn(2).setPreferredWidth(350);
            tableListAll.getColumnModel().getColumn(2).setMaxWidth(600);
        }

        javax.swing.GroupLayout panelReadAllLayout = new javax.swing.GroupLayout(panelReadAll);
        panelReadAll.setLayout(panelReadAllLayout);
        panelReadAllLayout.setHorizontalGroup(
            panelReadAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReadAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReadAllLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelReadAllLayout.setVerticalGroup(
            panelReadAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReadAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainCards.add(panelReadAll, "card1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Editar Treco");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Altere apenas os dados necessários mantendo os outros intactos.");

        javax.swing.GroupLayout panelUpdateLayout = new javax.swing.GroupLayout(panelUpdate);
        panelUpdate.setLayout(panelUpdateLayout);
        panelUpdateLayout.setHorizontalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(panelUpdateLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelForm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelUpdateLayout.setVerticalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainCards.add(panelUpdate, "card2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel3");

        jLabel9.setText("jLabel4");

        jLabel10.setText("jLabel5");

        jLabel11.setText("jLabel6");

        jLabel12.setText("jLabel7");

        javax.swing.GroupLayout panelReadLayout = new javax.swing.GroupLayout(panelRead);
        panelRead.setLayout(panelReadLayout);
        panelReadLayout.setHorizontalGroup(
            panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        panelReadLayout.setVerticalGroup(
            panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReadLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(panelReadLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pnlMainCards.add(panelRead, "card3");

        mnuFile.setText("Arquivo");

        mnuFilePanel1.setText("Abre Painel 1");
        mnuFilePanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFilePanel1ActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFilePanel1);

        mnuFilePanel2.setText("Abre Painel 2");
        mnuFilePanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFilePanel2ActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFilePanel2);

        mnuFilePanel3.setText("Abre Painel 3");
        mnuFilePanel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFilePanel3ActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFilePanel3);

        jMenuBar1.add(mnuFile);

        mnuEdit.setText("Editar");

        mnuEditFind.setText("Procurar");
        mnuEdit.add(mnuEditFind);

        mnuEditReplace.setText("Substituir");
        mnuEdit.add(mnuEditReplace);

        jMenuBar1.add(mnuEdit);

        mnuHelp.setText("Ajuda");

        mnuHelpSupport.setText("Suporte");
        mnuHelp.add(mnuHelpSupport);

        mnuHelpUpdates.setText("Atualizações");
        mnuHelp.add(mnuHelpUpdates);

        mnuHelpSite.setText("Site");
        mnuHelp.add(mnuHelpSite);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(650, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFilePanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFilePanel1ActionPerformed

        // Exibir o painel "card1"
        openCard("card1");

    }//GEN-LAST:event_mnuFilePanel1ActionPerformed

    private void mnuFilePanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFilePanel2ActionPerformed

        // Exibir o painel "card1"
        openCard("card2");

    }//GEN-LAST:event_mnuFilePanel2ActionPerformed

    private void mnuFilePanel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFilePanel3ActionPerformed

        // Exibir o painel "card1"
        openCard("card3");

    }//GEN-LAST:event_mnuFilePanel3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenuItem mnuEditFind;
    private javax.swing.JMenuItem mnuEditReplace;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFilePanel1;
    private javax.swing.JMenuItem mnuFilePanel2;
    private javax.swing.JMenuItem mnuFilePanel3;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHelpSite;
    private javax.swing.JMenuItem mnuHelpSupport;
    private javax.swing.JMenuItem mnuHelpUpdates;
    private View.panelForm panelForm1;
    private javax.swing.JPanel panelRead;
    private javax.swing.JPanel panelReadAll;
    private javax.swing.JPanel panelUpdate;
    private javax.swing.JPanel pnlMainCards;
    private javax.swing.JTable tableListAll;
    // End of variables declaration//GEN-END:variables

    // Abre um card 
    public void openCard(String cardName) {
        // Códigos para exibir o painel "card1"
        CardLayout card = (CardLayout) pnlMainCards.getLayout();
        card.show(pnlMainCards, cardName);
    }

    // Abre um card de um mainCard específico
    public void openCard(String cardName, JPanel mainCard) {
        // Códigos para exibir o painel "card1"
        CardLayout card = (CardLayout) mainCard.getLayout();
        card.show(mainCard, cardName);
    }

}
