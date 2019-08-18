
package lifestyle;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

public class FilePanel extends javax.swing.JPanel {

    Color buttonHover = Color.white;
    Color buttonHoverText = new Color(51,102,204);
    Color buttonBackground = new Color(51,102,204);
    Color buttonText = Color.white;
    
    User user;
    
    String type, attachment;
    
    Event event;
    Reminder reminder;
    
    public FilePanel(User user, String attachment, Event event)
    {
        this.user = user;
        this.attachment = attachment;
        this.event = event;
        type = "event";
        
        initComponents();
        
        this.textLabel.setText(attachment);
    }
    
    public FilePanel(User user, String attachment, Reminder reminder)
    {
        this.user = user;
        this.attachment = attachment;
        this.reminder = reminder;
        type = "reminder";
        
        initComponents();
        
        this.textLabel.setText(attachment);
    }
    
    public FilePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        removeAttachmentButton = new javax.swing.JButton();
        openAttachmentButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        textLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        textLabel.setForeground(new java.awt.Color(0, 51, 204));
        textLabel.setText("path name");
        textLabel.setToolTipText("");

        removeAttachmentButton.setBackground(new java.awt.Color(51, 102, 204));
        removeAttachmentButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        removeAttachmentButton.setForeground(new java.awt.Color(255, 255, 255));
        removeAttachmentButton.setText("Remove");
        removeAttachmentButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        removeAttachmentButton.setContentAreaFilled(false);
        removeAttachmentButton.setOpaque(true);
        removeAttachmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeAttachmentButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeAttachmentButtonHover(evt);
            }
        });
        removeAttachmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAttachmentButtonActionPerformed(evt);
            }
        });

        openAttachmentButton.setBackground(new java.awt.Color(51, 102, 204));
        openAttachmentButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        openAttachmentButton.setForeground(new java.awt.Color(255, 255, 255));
        openAttachmentButton.setText("Open");
        openAttachmentButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        openAttachmentButton.setContentAreaFilled(false);
        openAttachmentButton.setOpaque(true);
        openAttachmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openAttachmentButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openAttachmentButtonHover(evt);
            }
        });
        openAttachmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAttachmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openAttachmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeAttachmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAttachmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openAttachmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeAttachmentButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeAttachmentButtonHoverLeft

        removeAttachmentButton.setBackground(buttonBackground);
        removeAttachmentButton.setForeground(buttonText);

    }//GEN-LAST:event_removeAttachmentButtonHoverLeft

    private void removeAttachmentButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeAttachmentButtonHover

        removeAttachmentButton.setBackground(buttonHover);
        removeAttachmentButton.setForeground(buttonHoverText);

    }//GEN-LAST:event_removeAttachmentButtonHover

    //will remove the attachemtn from its original object
    private void removeAttachmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAttachmentButtonActionPerformed

        switch(type)
        {
            case "reminder":
                
                reminder.removeAttachment(attachment);
 
                mainPanel.setVisible(false);
                mainPanel.setBackground(new Color(102,153,255));
                
                break;
                
            case "event":
                
                event.removeAttachment(attachment);
                
                mainPanel.setVisible(false);
                mainPanel.setBackground(new Color(102,153,255));
                
                break;
        }
        
    }//GEN-LAST:event_removeAttachmentButtonActionPerformed

    private void openAttachmentButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openAttachmentButtonHoverLeft
        
        openAttachmentButton.setBackground(buttonBackground);
        openAttachmentButton.setForeground(buttonText);
        
    }//GEN-LAST:event_openAttachmentButtonHoverLeft

    private void openAttachmentButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openAttachmentButtonHover
        
        openAttachmentButton.setBackground(buttonHover);
        openAttachmentButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_openAttachmentButtonHover

    //will open the attachment as if it were opened by the user - i.e. using the 
    //computer's default application for opening that file type
    private void openAttachmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAttachmentButtonActionPerformed
        
        try
        {
            Desktop.getDesktop().open(new File(attachment));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "File not found.");
        }   
    }//GEN-LAST:event_openAttachmentButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton openAttachmentButton;
    private javax.swing.JButton removeAttachmentButton;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}
