
package lifestyle;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class TransactionPanel extends javax.swing.JPanel {

    User user;
    Transaction transaction;
    
    String string;
    
    String  typeReminder = "reminder",
            typeEvent = "event",
            typeGeneral = "general";
    
    DecimalFormat costFormat = new DecimalFormat("#.00");
    DateFormat dateFormat = new SimpleDateFormat("dd/MM");
    
    public TransactionPanel(User user, Transaction transaction)
    {
        this.user = user;
        this.transaction = transaction;
        
        initComponents();

        if(transaction.isIncome)
        {
            this.costLabel.setText("+ £ " + costFormat.format(transaction.getAmount()));
        }
        else
        {
            this.costLabel.setText("- £ " + costFormat.format(transaction.getAmount()));
        }

        this.textLabel.setText(transaction.getDetail());     
    }
    public TransactionPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textLabel.setForeground(new java.awt.Color(0, 51, 204));
        textLabel.setText("12/34/2019 : pick up kevin");
        textLabel.setToolTipText("");
        textLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transactionClicked(evt);
            }
        });

        costLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        costLabel.setForeground(new java.awt.Color(0, 51, 204));
        costLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        costLabel.setText("£30.34");
        costLabel.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transactionClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionClicked
        
        if(transaction.getReason().equals(typeReminder))
        {
            new DetailsWindow(user, "Reminder", transaction.getReminder()).setVisible(true);
        }
        
        else if(transaction.getReason().equals(typeEvent))
        {
            new DetailsWindow(user, "Event", transaction.getEvent()).setVisible(true);
        }
        
        else if (transaction.getIsRecurring())
        {
            new RecurringDetails(user, transaction).setVisible(true);
        }
        
        else if(transaction.getReason().equals(typeGeneral))
        {
            new TransactionDetails(user, transaction).setVisible(true);
        }
        
    }//GEN-LAST:event_transactionClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel costLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}
