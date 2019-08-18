
package lifestyle;

import java.awt.Color;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class RecurringDetails extends javax.swing.JFrame {

    Color buttonHoverBackground = new Color(102,153,255);
    Color buttonBackground = new Color(51,102,204);
    Color addButtonBackground = new Color(0,51,153);
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    DecimalFormat costFormat = new DecimalFormat("#.00");

    Boolean newItem = false, isIncome = false;
    
    User user;
    Date date;
    Transaction transaction;
    
    String frequency;
    
    //This constructor is for a transaction that is being editied, so it takes the
    //passed transaction and popualtes the fields based on known information
    public RecurringDetails(User user, Transaction transaction)
    {
        this.user = user;
        
        newItem = false;
        this.transaction = transaction;
        
        initComponents();
        
        saveButton.setText("Save");
        deleteButton.setText("Discard");
        
        if (transaction.getIsIncome())
        {
            isIncome = true;
            
            incomeButton.setText("✓");
            incomeButton.setBackground(addButtonBackground);
        }
        
        reasonField.setText(transaction.getDetail());
        dateField.setText(dateFormat.format(transaction.getCompletedDate()));
        costField.setText(costFormat.format(transaction.getAmount()));
        
        frequency = transaction.getFrequency();
                
        switch (frequency)
        {
            case "Daily":
                
                frequencyComboBox.setSelectedIndex(0);
 
                break;
                
            case "Weekly":
                
                frequencyComboBox.setSelectedIndex(1);
                
                break;
                
            case "Bi-Weekly":
                
                frequencyComboBox.setSelectedIndex(2);
                
                break;
                
            case "Monthly":
                
                frequencyComboBox.setSelectedIndex(3);
                
                break;
                
            case "Yearly":
                
                frequencyComboBox.setSelectedIndex(4);
                
                break;
        }
    }

    //the constructor for a new transaction
    public RecurringDetails(User user)
    {
        this.user = user;
        
        newItem = true;   
        
        initComponents();
        
        saveButton.setText("Save Changes");
        deleteButton.setText("Delete Transaction");
        
        dateField.setText(dateFormat.format(new Date()));
    }

    public RecurringDetails() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        reasonField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        costField = new javax.swing.JTextField();
        incomeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        incomeLabel = new javax.swing.JLabel();
        incomeLabel2 = new javax.swing.JLabel();
        frequencyLabel = new javax.swing.JLabel();
        frequencyComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(464, 392));
        setResizable(false);
        setSize(new java.awt.Dimension(464, 392));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setMaximumSize(new java.awt.Dimension(464, 349));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(464, 349));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(464, 349));
        backgroundPanel.setSize(new java.awt.Dimension(464, 349));

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 48)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 51, 153));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Recurring Transaction");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 51, 153));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Reason : ");

        dateLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 51, 153));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Start Date : ");

        amountLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(0, 51, 153));
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        amountLabel.setText("Amount : ");

        reasonField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        reasonField.setForeground(new java.awt.Color(102, 153, 255));
        reasonField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reasonField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        reasonField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameChanged(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameChanged(evt);
            }
        });

        dateField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        dateField.setForeground(new java.awt.Color(255, 153, 204));
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        dateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateChanged(evt);
            }
        });

        costField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        costField.setForeground(new java.awt.Color(102, 153, 255));
        costField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        costField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costChanged(evt);
            }
        });

        incomeButton.setBackground(new java.awt.Color(255, 255, 255));
        incomeButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        incomeButton.setForeground(new java.awt.Color(255, 255, 255));
        incomeButton.setToolTipText("");
        incomeButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        incomeButton.setContentAreaFilled(false);
        incomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        incomeButton.setMaximumSize(new java.awt.Dimension(10, 10));
        incomeButton.setMinimumSize(new java.awt.Dimension(10, 10));
        incomeButton.setOpaque(true);
        incomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCostButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCostButtonHover(evt);
            }
        });
        incomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(51, 102, 204));
        saveButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save Changes");
        saveButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        saveButton.setContentAreaFilled(false);
        saveButton.setOpaque(true);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonHover(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 102, 204));
        deleteButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Discard Changes");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        deleteButton.setContentAreaFilled(false);
        deleteButton.setOpaque(true);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonHover(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        incomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        incomeLabel.setForeground(new java.awt.Color(0, 51, 153));
        incomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        incomeLabel.setText("Income : ");

        incomeLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        incomeLabel2.setForeground(new java.awt.Color(0, 51, 153));
        incomeLabel2.setText("* Tick if money is coming in, not out");

        frequencyLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        frequencyLabel.setForeground(new java.awt.Color(0, 51, 153));
        frequencyLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        frequencyLabel.setText("Frequency : ");

        frequencyComboBox.setBackground(new java.awt.Color(255, 255, 255));
        frequencyComboBox.setFont(new java.awt.Font("Helvetica", 2, 16)); // NOI18N
        frequencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Weekly", "Bi-Weekly", "Monthly", "Yearly" }));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(frequencyLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(incomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reasonField)
                            .addComponent(dateField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(costField)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(incomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(frequencyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(reasonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(incomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incomeLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frequencyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
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
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(464, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if(newItem)
        {
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Deleted");

            user.finances.removeRecurringTransaction(transaction);

            this.dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonHover

        deleteButton.setBackground(buttonHoverBackground);

    }//GEN-LAST:event_deleteButtonHover

    private void deleteButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonHoverLeft

        deleteButton.setBackground(buttonBackground);

    }//GEN-LAST:event_deleteButtonHoverLeft

    //creates a new transaction object and takes the inputted data,
    //to set the details. Then, the transaction is added to the user, or editied
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        if(reasonField.getText().equals("") || costField.getText().equals("") || dateField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "All fields are required.");
        }
        else
        {
            try
            {
                String details = reasonField.getText();
                String reason = "general";
                double amount =  Double.parseDouble(costField.getText());

                Date completedDate = dateFormat.parse(dateField.getText());

                Transaction newTransaction = new Transaction(reason, details, amount);
                newTransaction.setCompletedDate(completedDate);
                
                newTransaction.setIsRecurring(true);
                
                newTransaction.setFrequency( (String) frequencyComboBox.getSelectedItem());

                if (isIncome)
                {
                    newTransaction.setIsIncome(true);
                }
                
                if (newItem)
                {
                    newTransaction.setLastRecurred(completedDate);
                    
                    user.finances.addRecurringTransaction(newTransaction);

                    this.dispose();
                }
                else
                {
                    user.finances.updateRecurringTransaction(transaction, newTransaction);

                    this.dispose();
                }
            }
            catch (ParseException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid date or money amount. Please format date as dd/MM/yyyy and money as xx.xx");
            }

        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void saveButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonHover

        saveButton.setBackground(buttonHoverBackground);
    }//GEN-LAST:event_saveButtonHover

    private void saveButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonHoverLeft

        saveButton.setBackground(buttonBackground);
    }//GEN-LAST:event_saveButtonHoverLeft

    private void incomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeButtonActionPerformed

        if (!isIncome)
        {
            isIncome = true;

            incomeButton.setText("✓");
            incomeButton.setBackground(addButtonBackground);
        }
        else
        {
            isIncome = false;

            incomeButton.setText("");
            incomeButton.setBackground(Color.white);
        }
    }//GEN-LAST:event_incomeButtonActionPerformed

    private void addCostButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCostButtonHover

        if (!isIncome)
        {
            incomeButton.setText("✓");

            incomeButton.setBackground(buttonHoverBackground);
        }
    }//GEN-LAST:event_addCostButtonHover

    private void addCostButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCostButtonHoverLeft

        if(!isIncome)
        {
            incomeButton.setText("");

            incomeButton.setBackground(Color.white);
        }
    }//GEN-LAST:event_addCostButtonHoverLeft

    private void costChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costChanged

        if(!costField.getText().equals(""))
        {
            String text = costField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            //removes dDfF as they are accepted in double conversions
            if (lastChar.matches("[dDfF]+"))
            {
                costField.setText(text.substring(0,text.length()-1));
            }

            //converts to double to see if valid cost, if not deletes last char
            try
            {
                Double.parseDouble(text);
            }
            catch (NumberFormatException e)
            {
                costField.setText(text.substring(0,text.length()-1));
            }
        }
    }//GEN-LAST:event_costChanged

    private void dateChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateChanged

        if(!dateField.getText().equals(""))
        {
            String text = dateField.getText();

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
                    dateField.setText("");
                }

                break;

                case 2:

                try
                {
                    Integer.parseInt(text);
                }
                catch (NumberFormatException e)
                {
                    dateField.setText(text.substring(0,text.length()-1));
                }

                break;

                case 3:

                lastChar = text.substring(text.length() - 1, text.length());

                if (!lastChar.equals("/"))
                {
                    dateField.setText(text.substring(0,text.length()-1));
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
                    dateField.setText(text.substring(0,text.length()-1));
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
                    dateField.setText(text.substring(0,text.length()-1));
                }

                break;

                case 6:

                lastChar = text.substring(text.length() - 1, text.length());

                if (!lastChar.equals("/"))
                {
                    dateField.setText(text.substring(0,text.length()-1));
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
                    dateField.setText(text.substring(0,text.length()-1));
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
                    dateField.setText(text.substring(0,text.length()-1));
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
                    dateField.setText(text.substring(0,text.length()-1));
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
                    dateField.setText(text.substring(0,text.length()-1));
                }

                break;

                case 11:

                dateField.setText(text.substring(0,text.length()-1));

                break;
            }
        }
    }//GEN-LAST:event_dateChanged

    private void nameChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameChanged

        if(!reasonField.getText().equals(""))
        {
            String text = reasonField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9\\s]+"))
            {
                reasonField.setText(text.substring(0,text.length()-1));
            }
        }
    }//GEN-LAST:event_nameChanged

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
            java.util.logging.Logger.getLogger(RecurringDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecurringDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecurringDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecurringDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecurringDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JTextField costField;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> frequencyComboBox;
    private javax.swing.JLabel frequencyLabel;
    private javax.swing.JButton incomeButton;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JLabel incomeLabel2;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField reasonField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
