
package lifestyle;

import java.awt.Color;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public final class ContactsPanel extends javax.swing.JPanel {

    Color buttonHover = Color.white;
    Color buttonHoverText = new Color(51,102,204);
    Color buttonBackground = new Color(51,102,204);
    Color buttonText = Color.white;
    
    User user;
    
    final public static JSlider newLetterSlider = new JSlider();
    
    public ContactsPanel(User user)
    {
        this.user = user;
        
        initComponents();
        
        createLetterSlider();
        
        loadContacts();
    }
    
    public ContactsPanel() {
        
        initComponents();
        
        createLetterSlider();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactsPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        sliderPanel = new javax.swing.JPanel();
        contactListScrollPane = new javax.swing.JScrollPane();
        contactListPanel = new javax.swing.JPanel();
        contactListingPanel = new javax.swing.JPanel();
        addNewButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 106, 124));

        contactsPanel.setBackground(new java.awt.Color(255, 255, 255));

        dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 72)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 51, 153));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Contacts");

        sliderPanel.setBackground(new java.awt.Color(255, 255, 255));
        sliderPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        sliderPanel.setLayout(new java.awt.BorderLayout());

        contactListScrollPane.setBorder(null);

        contactListPanel.setBackground(new java.awt.Color(255, 255, 255));
        contactListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3), " All ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Affectionately Yours", 0, 55), new java.awt.Color(0, 51, 153))); // NOI18N
        contactListPanel.setLayout(new java.awt.BorderLayout());

        contactListingPanel.setBackground(new java.awt.Color(255, 255, 255));
        contactListingPanel.setLayout(new javax.swing.BoxLayout(contactListingPanel, javax.swing.BoxLayout.Y_AXIS));
        contactListPanel.add(contactListingPanel, java.awt.BorderLayout.CENTER);

        contactListScrollPane.setViewportView(contactListPanel);

        addNewButton.setBackground(new java.awt.Color(51, 102, 204));
        addNewButton.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        addNewButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewButton.setText("Add New");
        addNewButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        addNewButton.setContentAreaFilled(false);
        addNewButton.setOpaque(true);
        addNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewButtonaddNewHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addNewButtonaddNewHover(evt);
            }
        });
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contactsPanelLayout = new javax.swing.GroupLayout(contactsPanel);
        contactsPanel.setLayout(contactsPanelLayout);
        contactsPanelLayout.setHorizontalGroup(
            contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addComponent(contactListScrollPane)
                    .addComponent(addNewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contactsPanelLayout.setVerticalGroup(
            contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(contactsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contactsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewButtonaddNewHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewButtonaddNewHoverLeft

        addNewButton.setBackground(buttonBackground);
        addNewButton.setForeground(buttonText);

    }//GEN-LAST:event_addNewButtonaddNewHoverLeft

    private void addNewButtonaddNewHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewButtonaddNewHover

        addNewButton.setBackground(buttonHover);
        addNewButton.setForeground(buttonHoverText);

    }//GEN-LAST:event_addNewButtonaddNewHover

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        
        new ContactDetails(user).setVisible(true);
        
    }//GEN-LAST:event_addNewButtonActionPerformed

    
    //customly creates a letter slider where the values 0-26 are used to represental all-z.
    //The slider's position is used to determine which contacts to load.
    //the listener on the slider calls the loading of the contact panels and will only
    //load the ones starting with the corresponding letter
    private void createLetterSlider()
    {
        newLetterSlider.setMajorTickSpacing(1);
        newLetterSlider.setPaintTicks(true);
        newLetterSlider.setMinimum(0);
        newLetterSlider.setMaximum(26);
        newLetterSlider.setValue(0);

        Hashtable labels = new Hashtable();
        labels.put(0, new JLabel("All"));
        labels.put(1, new JLabel("A"));
        labels.put(2, new JLabel("B"));
        labels.put(3, new JLabel("C"));
        labels.put(4, new JLabel("D"));
        labels.put(5, new JLabel("E"));
        labels.put(6, new JLabel("F"));
        labels.put(7, new JLabel("G"));
        labels.put(8, new JLabel("H"));
        labels.put(9, new JLabel("I"));
        labels.put(10, new JLabel("J"));
        labels.put(11, new JLabel("K"));
        labels.put(12, new JLabel("L"));
        labels.put(13, new JLabel("M"));
        labels.put(14, new JLabel("N"));
        labels.put(15, new JLabel("O"));
        labels.put(16, new JLabel("P"));
        labels.put(17, new JLabel("Q"));
        labels.put(18, new JLabel("R"));
        labels.put(19, new JLabel("S"));
        labels.put(20, new JLabel("T"));
        labels.put(21, new JLabel("U"));
        labels.put(22, new JLabel("V"));
        labels.put(23, new JLabel("W"));
        labels.put(24, new JLabel("X"));
        labels.put(25, new JLabel("Y"));
        labels.put(26, new JLabel("Z"));
        
        newLetterSlider.setLabelTable(labels);
        newLetterSlider.setPaintLabels(true);
        newLetterSlider.setVisible(true);
        
        
        newLetterSlider.addChangeListener(new ChangeListener() 
        {
            public void stateChanged(ChangeEvent e) 
            {
        
                int sliderNumber = newLetterSlider.getValue();
                String letterString = "";
                
                switch (sliderNumber) 
                {
                    case 0:
                        letterString = " All ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        loadContacts();
                    break;
                    
                    case 1:
                        letterString = " A ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("A");
                    break;
                    
                    case 2:
                        letterString = " B ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("B");
                    break;
                    
                    case 3:
                        letterString = " C ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("C");
                    break;
                    
                    case 4:
                        letterString = " D ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("D");
                    break;
                    
                    case 5:
                        letterString = " E ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("E");
                    break;
                    
                    case 6:
                        letterString = " F ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("F");
                    break;
                    
                    case 7:
                        letterString = " G ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("G");
                    break;
                    
                    case 8:
                        letterString = " H ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("H");
                    break;
                    
                    case 9:
                        letterString = " I ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("I");
                    break;
                    
                    case 10:
                        letterString = " J ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("J");
                    break;
                    
                    case 11:
                        letterString = " K ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("K");
                    break;
                    
                    case 12:
                        letterString = " L ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("L");
                    break;
                    
                    case 13:
                        letterString = " M ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("M");
                    break;
                    
                    case 14:
                        letterString = " N ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("N");
                    break;
                    
                    case 15:
                        letterString = " O ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("O");
                    break;
                    
                    case 16:
                        letterString = " P ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("P");
                    break;
                    
                    case 17:
                        letterString = " Q ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("Q");
                    break;
                    
                    case 18:
                        letterString = " R ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("R");
                    break;
                    
                    case 19:
                        letterString = " S ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("S");
                    break;
                    
                    case 20:
                        letterString = " T ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("T");
                    break;
                    
                    case 21:
                        letterString = " U ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("U");
                    break;
                    
                    case 22:
                        letterString = " V ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("V");
                    break;
                    
                    case 23:
                        letterString = " W ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("W");
                    break;
                    
                    case 24:
                        letterString = " X ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("X");
                    break;
                    
                    case 25:
                        letterString = " Y ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("Y");
                    break;
                    
                    case 26:
                        letterString = " Z ";
                        
                        contactListingPanel.removeAll();
                        contactListingPanel.revalidate();
                        contactListingPanel.repaint();
                        
                        listLetterContacts("Z");
                    break;
                    
                }
                
                //this will adjust the panel to show the letter chosen
                
                contactListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder
                    (javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3), letterString, 
                     javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, 
                     new java.awt.Font("Affectionately Yours", 0, 55), new java.awt.Color(0, 51, 153)));
            }
        });
       
        this.sliderPanel.add(newLetterSlider);
    }
    
    //loads the contacts from the user object into contact panels and then adds them to the listing panel
    public void loadContacts()
    {
        contactListingPanel.removeAll();
        contactListingPanel.revalidate();
        contactListingPanel.repaint();
        
        newLetterSlider.setValue(0);
        
        for (Contact contact: user.getContacts()) 
        {            
            ContactPanel contactPanel = new ContactPanel(user, contact);
            
            this.contactListingPanel.add(contactPanel);
        }

    }
    
    //loads the contacts from the user object into contact panels and then adds them to the listing panel
    //but only for for the selected letter
    private void listLetterContacts(String letter)
    {
        for (Contact contact: user.getContacts()) 
        {            
            if (contact.getFirstName().substring(0, 1).toUpperCase().equals(letter))
            {
                ContactPanel contactPanel = new ContactPanel(user, contact);
                
                this.contactListingPanel.add(contactPanel);
            }
        }
    }
            
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewButton;
    private javax.swing.JPanel contactListPanel;
    private javax.swing.JScrollPane contactListScrollPane;
    private javax.swing.JPanel contactListingPanel;
    private javax.swing.JPanel contactsPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel sliderPanel;
    // End of variables declaration//GEN-END:variables
}
