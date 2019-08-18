
package lifestyle;

import java.awt.Color;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static lifestyle.CalendarPanel.date;

public class FinancesPanel extends javax.swing.JPanel {

    Color buttonHover = Color.white;
    Color buttonHoverText = new Color(51,102,204);
    Color buttonBackground = new Color(51,102,204);
    Color buttonText = Color.white;
    
    User user;
    
    double weekIncome, weekOutcome, monthIncome, monthOutcome;
    DecimalFormat costFormat = new DecimalFormat("#0.00");
    
    public FinancesPanel(User user)
    {
        this.user = user;
        
        initComponents();
        
        loadTransactions();
    }
           
    public FinancesPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewTransactions = new javax.swing.JPanel();
        summaryPanel = new javax.swing.JPanel();
        summaryPanelIcon = new javax.swing.JLabel();
        summaryPanelLabel = new javax.swing.JLabel();
        transactionListingPanelWeek = new javax.swing.JPanel();
        listingScrollWeek = new javax.swing.JScrollPane();
        listingPanelWeek = new javax.swing.JPanel();
        summaryDetailsPanelMonth = new javax.swing.JPanel();
        summaryDetailsLabelMonth = new javax.swing.JLabel();
        transactionListingPanelMonth = new javax.swing.JPanel();
        listingScrollMonth = new javax.swing.JScrollPane();
        listingPanelMonth = new javax.swing.JPanel();
        summaryDetailsPanelWeek = new javax.swing.JPanel();
        summaryDetailsLabelWeek = new javax.swing.JLabel();
        addNewButton = new javax.swing.JButton();
        addRecurring = new javax.swing.JButton();
        viewTransactionsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 106, 124));

        viewTransactions.setBackground(new java.awt.Color(255, 255, 255));

        summaryPanel.setBackground(new java.awt.Color(102, 153, 255));

        summaryPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Coins_20px.png"))); // NOI18N
        summaryPanelIcon.setToolTipText("");

        summaryPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        summaryPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        summaryPanelLabel.setText("Summary");

        transactionListingPanelWeek.setBackground(new java.awt.Color(0, 51, 153));

        listingScrollWeek.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        listingScrollWeek.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listingPanelWeek.setBackground(new java.awt.Color(102, 153, 255));
        listingPanelWeek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "This Week's Transactions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Affectionately Yours", 0, 30), new java.awt.Color(255, 255, 255))); // NOI18N
        listingPanelWeek.setLayout(new javax.swing.BoxLayout(listingPanelWeek, javax.swing.BoxLayout.Y_AXIS));
        listingScrollWeek.setViewportView(listingPanelWeek);

        javax.swing.GroupLayout transactionListingPanelWeekLayout = new javax.swing.GroupLayout(transactionListingPanelWeek);
        transactionListingPanelWeek.setLayout(transactionListingPanelWeekLayout);
        transactionListingPanelWeekLayout.setHorizontalGroup(
            transactionListingPanelWeekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionListingPanelWeekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listingScrollWeek)
                .addContainerGap())
        );
        transactionListingPanelWeekLayout.setVerticalGroup(
            transactionListingPanelWeekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionListingPanelWeekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listingScrollWeek, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        summaryDetailsPanelMonth.setBackground(new java.awt.Color(0, 51, 153));
        summaryDetailsPanelMonth.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        summaryDetailsLabelMonth.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        summaryDetailsLabelMonth.setForeground(new java.awt.Color(255, 255, 255));
        summaryDetailsLabelMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        summaryDetailsLabelMonth.setText("This month you have earned £ xx.xx and spent £ xx.xx. You have net + £ xx.xx !");

        javax.swing.GroupLayout summaryDetailsPanelMonthLayout = new javax.swing.GroupLayout(summaryDetailsPanelMonth);
        summaryDetailsPanelMonth.setLayout(summaryDetailsPanelMonthLayout);
        summaryDetailsPanelMonthLayout.setHorizontalGroup(
            summaryDetailsPanelMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryDetailsPanelMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(summaryDetailsLabelMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        summaryDetailsPanelMonthLayout.setVerticalGroup(
            summaryDetailsPanelMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryDetailsPanelMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(summaryDetailsLabelMonth)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        transactionListingPanelMonth.setBackground(new java.awt.Color(0, 51, 153));

        listingScrollMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        listingScrollMonth.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listingPanelMonth.setBackground(new java.awt.Color(102, 153, 255));
        listingPanelMonth.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "This Month's Transactions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Affectionately Yours", 0, 30), new java.awt.Color(255, 255, 255))); // NOI18N
        listingPanelMonth.setLayout(new javax.swing.BoxLayout(listingPanelMonth, javax.swing.BoxLayout.Y_AXIS));
        listingScrollMonth.setViewportView(listingPanelMonth);

        javax.swing.GroupLayout transactionListingPanelMonthLayout = new javax.swing.GroupLayout(transactionListingPanelMonth);
        transactionListingPanelMonth.setLayout(transactionListingPanelMonthLayout);
        transactionListingPanelMonthLayout.setHorizontalGroup(
            transactionListingPanelMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionListingPanelMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listingScrollMonth)
                .addContainerGap())
        );
        transactionListingPanelMonthLayout.setVerticalGroup(
            transactionListingPanelMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionListingPanelMonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listingScrollMonth)
                .addContainerGap())
        );

        summaryDetailsPanelWeek.setBackground(new java.awt.Color(0, 51, 153));
        summaryDetailsPanelWeek.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        summaryDetailsLabelWeek.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        summaryDetailsLabelWeek.setForeground(new java.awt.Color(255, 255, 255));
        summaryDetailsLabelWeek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        summaryDetailsLabelWeek.setText("This week you have earned £ xx.xx and spent £ xx.xx. You have net + £ xx.xx !");

        javax.swing.GroupLayout summaryDetailsPanelWeekLayout = new javax.swing.GroupLayout(summaryDetailsPanelWeek);
        summaryDetailsPanelWeek.setLayout(summaryDetailsPanelWeekLayout);
        summaryDetailsPanelWeekLayout.setHorizontalGroup(
            summaryDetailsPanelWeekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryDetailsPanelWeekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(summaryDetailsLabelWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        summaryDetailsPanelWeekLayout.setVerticalGroup(
            summaryDetailsPanelWeekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryDetailsPanelWeekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(summaryDetailsLabelWeek)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(summaryDetailsPanelWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(summaryDetailsPanelMonth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(summaryPanelLayout.createSequentialGroup()
                        .addComponent(summaryPanelIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(summaryPanelLabel))
                    .addGroup(summaryPanelLayout.createSequentialGroup()
                        .addComponent(transactionListingPanelWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionListingPanelMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(summaryPanelLabel)
                    .addComponent(summaryPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transactionListingPanelWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionListingPanelMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(summaryDetailsPanelWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(summaryDetailsPanelMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addNewButton.setBackground(new java.awt.Color(51, 102, 204));
        addNewButton.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        addNewButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewButton.setText("Add New");
        addNewButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        addNewButton.setContentAreaFilled(false);
        addNewButton.setOpaque(true);
        addNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addNewHover(evt);
            }
        });
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });

        addRecurring.setBackground(new java.awt.Color(51, 102, 204));
        addRecurring.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        addRecurring.setForeground(new java.awt.Color(255, 255, 255));
        addRecurring.setText("Add Recurring");
        addRecurring.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        addRecurring.setContentAreaFilled(false);
        addRecurring.setOpaque(true);
        addRecurring.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addRecurringHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addRecurringHover(evt);
            }
        });
        addRecurring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecurringActionPerformed(evt);
            }
        });

        viewTransactionsButton.setBackground(new java.awt.Color(51, 102, 204));
        viewTransactionsButton.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        viewTransactionsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewTransactionsButton.setText("View All");
        viewTransactionsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        viewTransactionsButton.setContentAreaFilled(false);
        viewTransactionsButton.setOpaque(true);
        viewTransactionsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewTransactionsButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewTransactionsButtonHover(evt);
            }
        });
        viewTransactionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransactionsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewTransactionsLayout = new javax.swing.GroupLayout(viewTransactions);
        viewTransactions.setLayout(viewTransactionsLayout);
        viewTransactionsLayout.setHorizontalGroup(
            viewTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(summaryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewTransactionsLayout.createSequentialGroup()
                        .addComponent(addNewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addRecurring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewTransactionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewTransactionsLayout.setVerticalGroup(
            viewTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(summaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecurring, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewTransactionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(viewTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(viewTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewHover
            
        addNewButton.setBackground(buttonHover);
        addNewButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_addNewHover

    private void addNewHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewHoverLeft
        
        addNewButton.setBackground(buttonBackground);
        addNewButton.setForeground(buttonText);
        
    }//GEN-LAST:event_addNewHoverLeft

    private void addRecurringHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecurringHoverLeft
        
        addRecurring.setBackground(buttonBackground);
        addRecurring.setForeground(buttonText);
        
    }//GEN-LAST:event_addRecurringHoverLeft

    private void addRecurringHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecurringHover
        
        addRecurring.setBackground(buttonHover);
        addRecurring.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_addRecurringHover

    private void addRecurringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecurringActionPerformed
        
        new RecurringDetails(user).setVisible(true);
        
    }//GEN-LAST:event_addRecurringActionPerformed

    private void viewTransactionsButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTransactionsButtonHoverLeft
        
        viewTransactionsButton.setBackground(buttonBackground);
        viewTransactionsButton.setForeground(buttonText);
        
    }//GEN-LAST:event_viewTransactionsButtonHoverLeft

    private void viewTransactionsButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTransactionsButtonHover
        
        viewTransactionsButton.setBackground(buttonHover);
        viewTransactionsButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_viewTransactionsButtonHover

    private void viewTransactionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransactionsButtonActionPerformed
        
        new TransactionListings(user).setVisible(true);
        
    }//GEN-LAST:event_viewTransactionsButtonActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        
        new TransactionDetails(user).setVisible(true);
        
    }//GEN-LAST:event_addNewButtonActionPerformed

    //loads the transactions stored in the user by date, so the transaction occuring within the last 7
    //days are loaded into the week's area and the last month are loaded into the month's area.
    //It also keeps track of the spending income and outcome for the week and month and update the panels accordingly
    public void loadTransactions()
    {        
        weekIncome = 0;
        weekOutcome = 0;
         
        for(Transaction transaction: user.getFinances().getTransactions())
        {
            if(transaction.getCompletedDate().compareTo(new Date()) >= -7)
            {
                TransactionPanel transactionPanel = new TransactionPanel(user, transaction);

                this.listingPanelWeek.add(transactionPanel);

                if (transaction.getIsIncome())
                {
                    weekIncome += transaction.getAmount();
                }
                else
                {
                    weekOutcome += transaction.getAmount();
                }
            }
        }
        
        double weekNet = weekIncome - weekOutcome;
        
        String weekNetString;
        
        if (weekNet == 0)       { weekNetString = "You have broken even."; }
        else if (weekNet < 0)   { weekNetString = "You have overspent by £" + costFormat.format(weekNet) + "."; }
        else                    { weekNetString = "You are in the green by £" + costFormat.format(weekNet) + "!"; }
        
        this.summaryDetailsLabelWeek.setText
            (
                "This week you have earned £" + costFormat.format(weekIncome) + " and spent £"
                        + costFormat.format(weekOutcome) + ". " + weekNetString 
            );

        monthIncome = 0;
        monthOutcome = 0;
                
        for(Transaction transaction: user.getFinances().getTransactions())
        {
            DateFormat dateFormat = new SimpleDateFormat ("MMYYYY");

            String transactionMonth = dateFormat.format(transaction.getCompletedDate());
            String todayMonth = dateFormat.format(new Date());

            if(transactionMonth.equals(todayMonth))
            {
                TransactionPanel transactionPanel = new TransactionPanel(user, transaction);

                this.listingPanelMonth.add(transactionPanel);

                if (transaction.getIsIncome())
                {
                    monthIncome += transaction.getAmount();
                }
                else
                {
                    monthOutcome += transaction.getAmount();
                }
            } 
        }
        
        double monthNet = monthIncome - monthOutcome;
        
        String monthNetString;
        
        if (weekNet == 0)       { monthNetString = "You have broken even."; }
        else if (weekNet < 0)   { monthNetString = "You have overspent by £" + costFormat.format(monthNet) + "."; }
        else                    { monthNetString = "You are in the green by £" + costFormat.format(monthNet) + "!"; }
        
        this.summaryDetailsLabelMonth.setText
            (
                "This month you have earned £" + costFormat.format(monthIncome) + " and spent £"
                        + costFormat.format(monthOutcome) + ". " + monthNetString 
            );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton addRecurring;
    private javax.swing.JPanel listingPanel1;
    private javax.swing.JPanel listingPanelMonth;
    private javax.swing.JPanel listingPanelWeek;
    private javax.swing.JScrollPane listingScroll1;
    private javax.swing.JScrollPane listingScrollMonth;
    private javax.swing.JScrollPane listingScrollWeek;
    private javax.swing.JLabel summaryDetailsLabel1;
    private javax.swing.JLabel summaryDetailsLabelMonth;
    private javax.swing.JLabel summaryDetailsLabelWeek;
    private javax.swing.JPanel summaryDetailsPanel1;
    private javax.swing.JPanel summaryDetailsPanelMonth;
    private javax.swing.JPanel summaryDetailsPanelWeek;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JLabel summaryPanelIcon;
    private javax.swing.JLabel summaryPanelLabel;
    private javax.swing.JPanel transactionListingPanel1;
    private javax.swing.JPanel transactionListingPanelMonth;
    private javax.swing.JPanel transactionListingPanelWeek;
    private javax.swing.JPanel viewTransactions;
    private javax.swing.JButton viewTransactionsButton;
    // End of variables declaration//GEN-END:variables
}
