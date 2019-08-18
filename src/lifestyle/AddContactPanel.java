
package lifestyle;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AddContactPanel extends javax.swing.JPanel {

    Color buttonHoverBackground = new Color(102,153,255);
    Color buttonBackground = new Color(51,102,204);
    Color addButtonBackground = new Color(0,51,153);
    
    User user;
    Contact contact;
    
    public AddContactPanel(User user, Contact contact)
    {
        this.user = user;
        this.contact = contact;
        
        initComponents();
        
        setDetails();
    }
    
    public AddContactPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactPanel = new javax.swing.JPanel();
        contactImagePanel = new javax.swing.JPanel();
        contactImageLabel = new javax.swing.JLabel();
        contactNameLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        contactPanel.setBackground(new java.awt.Color(102, 153, 255));
        contactPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        contactPanel.setForeground(new java.awt.Color(102, 153, 255));

        contactImagePanel.setBackground(new java.awt.Color(0, 0, 0));
        contactImagePanel.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout contactImagePanelLayout = new javax.swing.GroupLayout(contactImagePanel);
        contactImagePanel.setLayout(contactImagePanelLayout);
        contactImagePanelLayout.setHorizontalGroup(
            contactImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        contactImagePanelLayout.setVerticalGroup(
            contactImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactImageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contactNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        contactNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactNameLabel.setText("FirstName LastName");
        contactNameLabel.setToolTipText("");

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(contactPanel);
        contactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        contactPanelLayout.setVerticalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(contactNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        
         
    }//GEN-LAST:event_formMousePressed

    private void setDetails()
    {
        contactNameLabel.setText(contact.getFirstName() + " " + contact.getLastName());
        
        //the image saved is loaded and scaled to fit the display window
        ImageIcon icon = new ImageIcon(new ImageIcon(contact.getImagePath()).getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));

        contactImageLabel.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactImageLabel;
    public javax.swing.JPanel contactImagePanel;
    public javax.swing.JLabel contactNameLabel;
    private javax.swing.JPanel contactPanel;
    // End of variables declaration//GEN-END:variables
}
