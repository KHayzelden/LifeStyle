
package lifestyle;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ContactDetails extends javax.swing.JFrame {

    Color buttonHoverBackground = new Color(102,153,255);
    Color buttonBackground = new Color(51,102,204);
    Color addButtonBackground = new Color(0,51,153);
    
    User user;
    Contact contact;
    
    Boolean isNewContact = true; //will change if editing a contact vs creating a new one
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    File file;
    Boolean hasImage = false;
    Image image;
    
    //is the constructor for a new contact
    public ContactDetails(User user)
    {
        this.user = user;
        
        initComponents();  
        
        mainLabel.setText("New Contact");
        saveChangesButton.setText("Save Contact");
        deleteContactButton.setText("Discard Contact");
    }
    
    //is the constructor for an existing contact to be edited
    public ContactDetails(User user, Contact contact)
    {
        this.user = user;
        this.contact = contact;
        
        isNewContact = false;
        
        initComponents();
        
        setDetails();
    }
    
    public ContactDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        birthdayField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        address1Field = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        address2Field = new javax.swing.JTextField();
        countyField = new javax.swing.JTextField();
        countyLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        postCodeField = new javax.swing.JTextField();
        postCodeLabel = new javax.swing.JLabel();
        contactImagePanel = new javax.swing.JPanel();
        contactImageLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        deleteContactButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 48)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 51, 153));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Contact Details");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 51, 153));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Name (title, first, last) : ");

        birthdayLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        birthdayLabel.setForeground(new java.awt.Color(0, 51, 153));
        birthdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        birthdayLabel.setText("Birthday : ");

        phoneLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(0, 51, 153));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone : ");

        addressLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 51, 153));
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel.setText("Address : ");

        cityLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(0, 51, 153));
        cityLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        cityLabel.setText("City : ");

        titleField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        titleField.setForeground(new java.awt.Color(102, 153, 255));
        titleField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titleField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        titleField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                titleChanged(evt);
            }
        });

        birthdayField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        birthdayField.setForeground(new java.awt.Color(255, 153, 204));
        birthdayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        birthdayField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        birthdayField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                birthdayChanged(evt);
            }
        });

        phoneField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        phoneField.setForeground(new java.awt.Color(255, 153, 204));
        phoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneChanged(evt);
            }
        });

        address1Field.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        address1Field.setForeground(new java.awt.Color(102, 153, 255));
        address1Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address1Field.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        address1Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                address1Changed(evt);
            }
        });

        cityField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cityField.setForeground(new java.awt.Color(102, 153, 255));
        cityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cityChanged(evt);
            }
        });

        address2Field.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        address2Field.setForeground(new java.awt.Color(102, 153, 255));
        address2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address2Field.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        address2Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                address2Changed(evt);
            }
        });

        countyField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        countyField.setForeground(new java.awt.Color(102, 153, 255));
        countyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countyField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        countyField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                countyChanged(evt);
            }
        });

        countyLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        countyLabel.setForeground(new java.awt.Color(0, 51, 153));
        countyLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        countyLabel.setText("County : ");

        firstNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(102, 153, 255));
        firstNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameChanged(evt);
            }
        });

        postCodeField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        postCodeField.setForeground(new java.awt.Color(102, 153, 255));
        postCodeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        postCodeField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        postCodeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                postcodeChanged(evt);
            }
        });

        postCodeLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        postCodeLabel.setForeground(new java.awt.Color(0, 51, 153));
        postCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        postCodeLabel.setText("Post Code : ");

        contactImagePanel.setBackground(new java.awt.Color(0, 0, 0));
        contactImagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pictureClicked(evt);
            }
        });

        contactImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contactImageLabelClicked(evt);
            }
        });

        javax.swing.GroupLayout contactImagePanelLayout = new javax.swing.GroupLayout(contactImagePanel);
        contactImagePanel.setLayout(contactImagePanelLayout);
        contactImagePanelLayout.setHorizontalGroup(
            contactImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        contactImagePanelLayout.setVerticalGroup(
            contactImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        lastNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(102, 153, 255));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameChanged(evt);
            }
        });

        saveChangesButton.setBackground(new java.awt.Color(51, 102, 204));
        saveChangesButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        saveChangesButton.setForeground(new java.awt.Color(255, 255, 255));
        saveChangesButton.setText("Save Changes");
        saveChangesButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        saveChangesButton.setContentAreaFilled(false);
        saveChangesButton.setOpaque(true);
        saveChangesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveChangesButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveChangesButtonHover(evt);
            }
        });
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        deleteContactButton.setBackground(new java.awt.Color(51, 102, 204));
        deleteContactButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        deleteContactButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteContactButton.setText("Delete Contact");
        deleteContactButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        deleteContactButton.setContentAreaFilled(false);
        deleteContactButton.setOpaque(true);
        deleteContactButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteContactButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteContactButtonHover(evt);
            }
        });
        deleteContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContactButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthdayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(address1Field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address2Field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countyField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postCodeField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthdayField)
                            .addComponent(phoneField)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(contactImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(firstNameField)
                            .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saveChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteContactButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(contactImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdayLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(deleteContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(467, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //removes the contact from the user object and confirms the deletion to the user
    private void deleteContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContactButtonActionPerformed
        
        if (isNewContact)
        {
            this.dispose();
        }
        else
        {
            user.removeContact(contact);
            
            this.dispose();
            
            JOptionPane.showMessageDialog(null, "Contact Deleted.");
        }
        
        
    }//GEN-LAST:event_deleteContactButtonActionPerformed

    private void deleteContactButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteContactButtonHover
        
        deleteContactButton.setBackground(buttonHoverBackground);
        
    }//GEN-LAST:event_deleteContactButtonHover

    private void deleteContactButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteContactButtonHoverLeft
        
        deleteContactButton.setBackground(buttonBackground);
        
    }//GEN-LAST:event_deleteContactButtonHoverLeft

    //checks that the required field is filled, then creates a new contact object
    //that stores all the given information (and sets the contact's boolean variables to false
    //for non provided information, then adds this new contact object to the user object if
    //it is new, otherwise if it is being editied it will update the contact with the 
    //new information
    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        
        if(firstNameField.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "Name is a required field.");
        }
        else
        {
            Contact newContact = new Contact(firstNameField.getText());
            
            newContact.setTitle(titleField.getText());
            newContact.setLastName(lastNameField.getText());
            newContact.setPhone(phoneField.getText());
            newContact.setAddress1(address1Field.getText());
            newContact.setAddress2(address2Field.getText());
            newContact.setCity(cityField.getText());
            newContact.setCounty(countyField.getText());
            newContact.setPostCode(postCodeField.getText());
            
            if (hasImage)
            {
                newContact.setImagePath(file.getAbsolutePath());
                newContact.setHasImage(true);
            }
            else
            {
                newContact.setHasImage(false);
            }
            
            try 
            {
                if (!birthdayField.getText().equals(""))
                {
                    Date date = dateFormat.parse(birthdayField.getText());
                    newContact.setBirthday(date);
                    newContact.setHasBirthday(true);
                }
                else
                {
                    newContact.setHasBirthday(false);
                }
                
                if(isNewContact)
                {        
                    user.addContact(newContact);
                }
                else
                {
                    user.editContact(contact, newContact);   
                }

                this.dispose();
            }
            catch (ParseException e) 
            {
                //on a failed date pass attempt
                
                JOptionPane.showMessageDialog(null, "Date needs to be in the format of dd/MM/yyyy.");
            }
        }
        
    }//GEN-LAST:event_saveChangesButtonActionPerformed

    private void saveChangesButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveChangesButtonHover
        
        saveChangesButton.setBackground(buttonHoverBackground);
        
    }//GEN-LAST:event_saveChangesButtonHover

    private void saveChangesButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveChangesButtonHoverLeft
        
        saveChangesButton.setBackground(buttonBackground);
        
    }//GEN-LAST:event_saveChangesButtonHoverLeft

    //The follow methods check the input of each field as the user types and validates
    //against regex. If the input is not valid the character is deleted while its being typed.
    
    private void titleChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleChanged
        
        if(!titleField.getText().equals(""))
        {
            String text = titleField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z.\\s]+"))
            {
                titleField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_titleChanged

    private void firstNameChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameChanged
        
        if(!firstNameField.getText().equals(""))
        {
            String text = firstNameField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z\\s]+"))
            {
                firstNameField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_firstNameChanged

    private void lastNameChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameChanged
        
        if(!lastNameField.getText().equals(""))
        {
            String text = lastNameField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z\\s]+"))
            {
                lastNameField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_lastNameChanged

    private void birthdayChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_birthdayChanged
        
        if(!birthdayField.getText().equals(""))
        {
            String text = birthdayField.getText();
            
            String lastChar, month, year;
            
            switch(text.length())
            {
                case 1:
                    
                    try
                    {
                        Integer.parseInt(text);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText("");
                    }
                    
                    break;
                
                case 2:
                    
                    try
                    {
                        Integer.parseInt(text);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                    
                case 3:
                    
                    lastChar = text.substring(text.length() - 1, text.length());
                    
                    if (!lastChar.equals("/"))
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }  
                    
                    break;
                    
                case 4:
                    
                    month = text.substring(text.length() - 1, text.length());
                    
                    try
                    {
                        Integer.parseInt(month);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                
                case 5:
                    
                    month = text.substring(text.length() - 2, text.length());
                    
                    try
                    {
                        Integer.parseInt(month);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                    
                case 6:
                    
                    lastChar = text.substring(text.length() - 1, text.length());
                    
                    if (!lastChar.equals("/"))
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }  
                    
                    break;
                    
                case 7:
                    
                    year = text.substring(text.length() - 1, text.length());
                    
                    try
                    {
                        Integer.parseInt(year);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                
                case 8:
                    
                    year = text.substring(text.length() - 2, text.length());
                    
                    try
                    {
                        Integer.parseInt(year);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                
                case 9:
                    
                    year = text.substring(text.length() - 3, text.length());
                    
                    try
                    {
                        Integer.parseInt(year);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                    
                case 10:
                    
                    year = text.substring(text.length() - 4, text.length());
                    
                    try
                    {
                        Integer.parseInt(year);
                    }
                    catch (NumberFormatException e)
                    {
                        birthdayField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;   
                    
                case 11:
                    
                    birthdayField.setText(text.substring(0,text.length()-1));
                    
                    break;
            }
        }
        
    }//GEN-LAST:event_birthdayChanged

    private void phoneChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneChanged
        
        if(!phoneField.getText().equals(""))
        {
            String text = phoneField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[0-9,\\s]+"))
            {
                phoneField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_phoneChanged

    private void address1Changed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address1Changed
        
        if(!address1Field.getText().equals(""))
        {
            String text = address1Field.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9,\\s]+"))
            {
                address1Field.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_address1Changed

    private void address2Changed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address2Changed
        
        if(!address2Field.getText().equals(""))
        {
            String text = address2Field.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9,\\s]+"))
            {
                address2Field.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_address2Changed

    private void cityChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityChanged
        
        if(!cityField.getText().equals(""))
        {
            String text = cityField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z\\s]+"))
            {
                cityField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_cityChanged

    private void countyChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countyChanged
        
        if(!countyField.getText().equals(""))
        {
            String text = countyField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z\\s]+"))
            {
                countyField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_countyChanged

    private void postcodeChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postcodeChanged
        
        if(!postCodeField.getText().equals(""))
        {
            String text = postCodeField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9\\s]+"))
            {
                postCodeField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_postcodeChanged

    private void pictureClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureClicked
        
        
        
    }//GEN-LAST:event_pictureClicked

    // opens a file chooser for the user to select an image for the contact's icon
    // it then attempts to pass the image to ensure the uploaded file is actually an image.
    private void contactImageLabelClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactImageLabelClicked
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        
        File tempFile = fileChooser.getSelectedFile();
        
        try 
        {
            image = ImageIO.read(tempFile);
            
            if (image == null) 
            {
                hasImage = false;
                
                JOptionPane.showMessageDialog(null, "CFile must be a supported image format.");
            }
            
            file = tempFile;
            
            hasImage = true;
            
            loadImage(file.getAbsolutePath());
        } 
        catch(Exception e) 
        {
            hasImage = false;
            
            JOptionPane.showMessageDialog(null, "CFile must be a supported image format.");
        }
        
    }//GEN-LAST:event_contactImageLabelClicked

    //populates the contact's details if it is beind edited
    private void setDetails()
    {
        titleField.setText(contact.getTitle());
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        if(contact.hasBirthday) {birthdayField.setText(dateFormat.format(contact.getBirthday()));}
        phoneField.setText(contact.getPhone());
        address1Field.setText(contact.getAddress1());
        address2Field.setText(contact.getAddress2());
        cityField.setText(contact.getCity());
        countyField.setText(contact.getCounty());
        postCodeField.setText(contact.getPostCode());
        
        if(contact.getHasImage()) 
        {
            loadImage(contact.getImagePath());
            file = new File(contact.getImagePath());
            hasImage = contact.getHasImage();
        }
    }
    
    //gets a scaled instance of the contact image to fit the panel
    public void loadImage(String imagePath)
    {
        ImageIcon icon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(164, 164, Image.SCALE_DEFAULT));

        contactImageLabel.setIcon(icon);
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
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address1Field;
    private javax.swing.JTextField address2Field;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel contactImageLabel;
    private javax.swing.JPanel contactImagePanel;
    private javax.swing.JTextField countyField;
    private javax.swing.JLabel countyLabel;
    private javax.swing.JButton deleteContactButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField postCodeField;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables
}
