
package lifestyle;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Login extends javax.swing.JFrame {

    Color   buttonHover = new Color(102,153,255),
            buttonHoverText = Color.white,
            buttonBackground = Color.white,
            buttonText = new Color(0,51,153); 
    
    SaveUser save;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(475, 297));
        setResizable(false);
        setSize(new java.awt.Dimension(475, 297));
        getContentPane().setLayout(null);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setMaximumSize(new java.awt.Dimension(640, 426));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(640, 426));

        loginPanel.setBackground(new java.awt.Color(0, 51, 153));

        nameLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 60)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Life Management");

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("username");

        usernameField.setBackground(new java.awt.Color(0, 51, 153));
        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));

        passwordLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("password");

        passwordField.setBackground(new java.awt.Color(0, 51, 153));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 51, 153));
        loginButton.setText("Log In");
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setOpaque(true);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonHover(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 51, 153));
        registerButton.setText("Register");
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setOpaque(true);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonHover(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerButton))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        getContentPane().add(backgroundPanel);
        backgroundPanel.setBounds(0, 0, 650, 420);

        setSize(new java.awt.Dimension(475, 318));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        new Registration().setVisible(true);
        
    }//GEN-LAST:event_registerButtonActionPerformed

    //the username and password are checked for if the username is a valid username
    //and if so checks if the password is correct. This is done using the decryption in the 
    //save user class to load the encryped usernames. It also hashes the inputted password to compare to the
    //stored user's hashed password
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        UsernameCheck usernameCheck = new UsernameCheck();
        
        ArrayList<String> usernames = usernameCheck.load();
        
        User user = null;
        
        if (usernames.contains(usernameField.getText()))
        {
            try
            {
                save = new SaveUser(usernameField.getText());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            user = save.loadEncrypted();
            
            //checks password
            PasswordHasher passwordHasher = new PasswordHasher ();
                    
            String hashedPassword = passwordHasher.makeHash(new String(passwordField.getPassword()));
            
            if(hashedPassword.equals(user.getPassword()))
            {
                try
                {
                    new Main(user).setVisible(true);
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }

                this.dispose();
            }
            else
            {
                user = null;
                System.out.println("login failed");
            }
        }


        
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonHover
        
        loginButton.setBackground(buttonHover);
        loginButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_loginButtonHover

    private void loginButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonHoverLeft
        
        loginButton.setBackground(buttonBackground);
        loginButton.setForeground(buttonText);
        
    }//GEN-LAST:event_loginButtonHoverLeft

    private void registerButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonHover
        
        registerButton.setBackground(buttonHover);
        registerButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_registerButtonHover

    private void registerButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonHoverLeft
        
        registerButton.setBackground(buttonBackground);
        registerButton.setForeground(buttonText);
        
    }//GEN-LAST:event_registerButtonHoverLeft

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
