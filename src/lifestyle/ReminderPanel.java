
package lifestyle;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReminderPanel extends javax.swing.JPanel {

    User user;
    Reminder reminder, newReminder;
    Boolean isComplete = false;
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM");
    DateFormat timeFormat = new SimpleDateFormat("hh:mm");
    
    public ReminderPanel(User user, Reminder reminder) 
    {
        this.user = user;
        this.reminder = reminder;
        
        initComponents();
        
        this.reminderName.setText(reminder.getName());
        if (reminder.getHasDate()) 
        {
            this.dateLabel.setText(dateFormat.format(reminder.getDate()));
            
            //will append the time aswell if there is a time
            if (reminder.getHasTime())
            {
                this.dateLabel.setText( dateLabel.getText() + " - " + timeFormat.format(reminder.getTime() ));
            }
        }
        else
        {
            this.dateLabel.setText("");
        }
        
        if (!reminder.getHasCost()) {this.reminderBudget.setVisible(false);}
        
        if (!reminder.getHasAttachments()) {this.reminderAttachments.setVisible(false);}
    }
    
    public ReminderPanel(User user, Reminder reminder, String complete) 
    {
        this.user = user;
        this.reminder = reminder;
                
        initComponents();
        
        reminderCheckButton.setEnabled(false);
        reminderCheckButton.setBackground(Color.black);
        reminderCheckButton.setForeground(Color.white);
        reminderCheckButton.setText("✓");
        
        this.reminderName.setText(reminder.getName());
        
        if (!reminder.getHasCost()) {this.reminderBudget.setVisible(false);}
        
        if (!reminder.getHasAttachments()) {this.reminderAttachments.setVisible(false);}
    }
            
    public ReminderPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        reminderName = new javax.swing.JLabel();
        reminderBudget = new javax.swing.JLabel();
        reminderCheckButton = new javax.swing.JButton();
        reminderAttachments = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        setMinimumSize(new java.awt.Dimension(0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 102, 204));

        reminderName.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        reminderName.setForeground(new java.awt.Color(255, 255, 255));
        reminderName.setText("Reminder Name");

        reminderBudget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reminderBudget.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Coins_20px.png"))); // NOI18N
        reminderBudget.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        reminderCheckButton.setBackground(new java.awt.Color(255, 255, 255));
        reminderCheckButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        reminderCheckButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        reminderCheckButton.setContentAreaFilled(false);
        reminderCheckButton.setMaximumSize(new java.awt.Dimension(10, 10));
        reminderCheckButton.setMinimumSize(new java.awt.Dimension(10, 10));
        reminderCheckButton.setOpaque(true);
        reminderCheckButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reminderCheckButtonPressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reminderCheckButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reminderCheckButtonHover(evt);
            }
        });
        reminderCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reminderCheckButtonActionPerformed(evt);
            }
        });

        reminderAttachments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reminderAttachments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-attach_filled.png"))); // NOI18N
        reminderAttachments.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        dateLabel.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reminderCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminderName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminderAttachments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminderBudget)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reminderName)
                        .addComponent(dateLabel))
                    .addComponent(reminderCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reminderBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reminderAttachments, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reminderCheckButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderCheckButtonHover

        //will only adjust the check symbol when reminder is not complete yet
        if (reminderCheckButton.getBackground() != Color.black)
        {
            reminderCheckButton.setForeground(Color.black);
            reminderCheckButton.setText("✓");
        }

    }//GEN-LAST:event_reminderCheckButtonHover

    private void reminderCheckButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderCheckButtonHoverLeft

        reminderCheckButton.setForeground(Color.white);
        
    }//GEN-LAST:event_reminderCheckButtonHoverLeft

    private void reminderCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reminderCheckButtonActionPerformed

        user.completeReminder(reminder);
        
    }//GEN-LAST:event_reminderCheckButtonActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        new DetailsWindow(user, "Reminder", reminder).setVisible(true);
        
    }//GEN-LAST:event_formMousePressed

    private void reminderCheckButtonPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reminderCheckButtonPressed
        
        reminderCheckButton.setBackground(Color.black);
        reminderCheckButton.setForeground(Color.white);
        
    }//GEN-LAST:event_reminderCheckButtonPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel reminderAttachments;
    private javax.swing.JLabel reminderBudget;
    private javax.swing.JButton reminderCheckButton;
    private javax.swing.JLabel reminderName;
    // End of variables declaration//GEN-END:variables
}
