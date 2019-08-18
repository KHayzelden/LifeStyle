
package lifestyle;

import java.awt.Color;

public class TransactionListings extends javax.swing.JFrame {

    Color buttonHoverBackground = new Color(102,153,255);
    Color buttonBackground = new Color(51,102,204);
    Color addButtonBackground = new Color(0,51,153);
    
    User user;
    
    String list;
    
    String recurring = "recurring", all = "all";
    
    public TransactionListings(User user)
    {
        this.user = user;
        
        initComponents();
        
        list = all;
        
        loadTransactions(list);
    }
    
    public TransactionListings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        listingScroll = new javax.swing.JScrollPane();
        listingPanel = new javax.swing.JPanel();
        switchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(464, 413));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                TransactionListings.this.windowLostFocus(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 72)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 51, 153));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Transactions");

        listingScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        listingScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listingPanel.setBackground(new java.awt.Color(102, 153, 255));
        listingPanel.setLayout(new javax.swing.BoxLayout(listingPanel, javax.swing.BoxLayout.Y_AXIS));
        listingScroll.setViewportView(listingPanel);

        switchButton.setBackground(new java.awt.Color(51, 102, 204));
        switchButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        switchButton.setForeground(new java.awt.Color(255, 255, 255));
        switchButton.setText("Switch to Recurring Transactions");
        switchButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        switchButton.setContentAreaFilled(false);
        switchButton.setOpaque(true);
        switchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                switchButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                switchButtonHover(evt);
            }
        });
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listingScroll)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(switchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switchButton)
                .addGap(4, 4, 4)
                .addComponent(listingScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(531, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void windowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowLostFocus
        this.dispose();
    }//GEN-LAST:event_windowLostFocus

    private void switchButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButtonHoverLeft

        switchButton.setBackground(buttonBackground);
    }//GEN-LAST:event_switchButtonHoverLeft

    private void switchButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButtonHover

        switchButton.setBackground(buttonHoverBackground);
    }//GEN-LAST:event_switchButtonHover

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed

        if(list.equals(recurring))
        {
            list = all;
            loadTransactions(list);
            switchButton.setText("Switch to All Transactions");
        }
        else
        {
            list = recurring;
            loadTransactions(list);
            switchButton.setText("Switch to Recurring Transactions");
        }
        
        
    }//GEN-LAST:event_switchButtonActionPerformed

    public void loadTransactions(String list)
    {
        
        this.listingPanel.removeAll();
 
        switch (list)
        {
            case "all":
                
                for(Transaction transaction: user.getFinances().getTransactions())
                {
                    TransactionPanel transactionPanel = new TransactionPanel(user, transaction);

                    this.listingPanel.add(transactionPanel);
                }
                
                break;
            
            case "recurring":
                
                for(Transaction transaction: user.getFinances().getRecurringTransactions())
                {
                    TransactionPanel transactionPanel = new TransactionPanel(user, transaction);

                    this.listingPanel.add(transactionPanel);
                }
                
                break;
        }
        
        this.listingPanel.revalidate();
        this.listingPanel.repaint();
        
    }
    
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
            java.util.logging.Logger.getLogger(TransactionListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionListings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionListings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel listingPanel;
    private javax.swing.JScrollPane listingScroll;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables
}
