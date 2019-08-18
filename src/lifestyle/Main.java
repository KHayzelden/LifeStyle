
package lifestyle;

import java.awt.Color;
import java.io.IOException;
import java.util.Date;

public class Main extends javax.swing.JFrame {

    //This window contins the sidebar, with buttons for each potential tab and the main
    //panel. This panel adjusts by removing the previous panel and adding the chosen panel every time the
    //user selects another one of the buttons, acting as a tab naviagtor.
    
    String activeTab = "today"; //starting tab always
    
    final String    today = "today",
                    calendar = "calendar",
                    contacts = "contacts",
                    reminders = "reminders",
                    finances = "finances";
           
    Color focusedTab = new Color(0,51,153);
    Color tabBackground = new Color(102,153,255);
    
    User user;

    Event updatedEvent;
    
    SaveUser save;

    public Main(User user) throws IOException
    {
        this.user = user;
        
        try
        {
            save = new SaveUser(user);
            save.saveEncrypted();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        initComponents();
  
        checkForCompleteEvents();
        
        checkForRecurringTransactions();
        
        TodayPanel todayPanel = new TodayPanel(user);
        this.mainPanel.add(todayPanel);

    }
    
    public Main() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        todayButtonPanel = new javax.swing.JPanel();
        todayLabel = new javax.swing.JLabel();
        todayIcon = new javax.swing.JLabel();
        calendarButtonPanel = new javax.swing.JPanel();
        calendarLabel = new javax.swing.JLabel();
        calendarIcon = new javax.swing.JLabel();
        contactsButtonPanel = new javax.swing.JPanel();
        contactsLabel = new javax.swing.JLabel();
        contactsIcon = new javax.swing.JLabel();
        remindersButtonPanel = new javax.swing.JPanel();
        remindersLabel = new javax.swing.JLabel();
        remindersIcon = new javax.swing.JLabel();
        financesButtonPanel = new javax.swing.JPanel();
        financesLabel = new javax.swing.JLabel();
        financesIcon = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Main"); // NOI18N
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reload(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                windowFocused(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        backgroundPanel.setBackground(new java.awt.Color(0, 51, 153));

        sidePanel.setBackground(new java.awt.Color(102, 153, 255));

        todayButtonPanel.setBackground(new java.awt.Color(0, 51, 153));
        todayButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                todayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                todayHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                todayHover(evt);
            }
        });

        todayLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        todayLabel.setForeground(new java.awt.Color(255, 255, 255));
        todayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        todayLabel.setText("Today");

        todayIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todayIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Christmas Star_15px.png"))); // NOI18N

        javax.swing.GroupLayout todayButtonPanelLayout = new javax.swing.GroupLayout(todayButtonPanel);
        todayButtonPanel.setLayout(todayButtonPanelLayout);
        todayButtonPanelLayout.setHorizontalGroup(
            todayButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todayButtonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(todayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(todayIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        todayButtonPanelLayout.setVerticalGroup(
            todayButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todayIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(todayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        calendarButtonPanel.setBackground(new java.awt.Color(102, 153, 255));
        calendarButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarHover(evt);
            }
        });

        calendarLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        calendarLabel.setForeground(new java.awt.Color(255, 255, 255));
        calendarLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        calendarLabel.setText("Calendar");

        calendarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calendarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calendar_20px.png"))); // NOI18N

        javax.swing.GroupLayout calendarButtonPanelLayout = new javax.swing.GroupLayout(calendarButtonPanel);
        calendarButtonPanel.setLayout(calendarButtonPanelLayout);
        calendarButtonPanelLayout.setHorizontalGroup(
            calendarButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarButtonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(calendarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(calendarIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        calendarButtonPanelLayout.setVerticalGroup(
            calendarButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendarIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(calendarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        contactsButtonPanel.setBackground(new java.awt.Color(102, 153, 255));
        contactsButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contactsButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactsHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactsHover(evt);
            }
        });

        contactsLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        contactsLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        contactsLabel.setText("Contacts");

        contactsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/User_20px.png"))); // NOI18N

        javax.swing.GroupLayout contactsButtonPanelLayout = new javax.swing.GroupLayout(contactsButtonPanel);
        contactsButtonPanel.setLayout(contactsButtonPanelLayout);
        contactsButtonPanelLayout.setHorizontalGroup(
            contactsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactsButtonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(contactsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(contactsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contactsButtonPanelLayout.setVerticalGroup(
            contactsButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactsIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contactsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        remindersButtonPanel.setBackground(new java.awt.Color(102, 153, 255));
        remindersButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                remindersButtonPressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                remindersHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                remindersHover(evt);
            }
        });

        remindersLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        remindersLabel.setForeground(new java.awt.Color(255, 255, 255));
        remindersLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        remindersLabel.setText("Reminders");

        remindersIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remindersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Checklist_20px.png"))); // NOI18N

        javax.swing.GroupLayout remindersButtonPanelLayout = new javax.swing.GroupLayout(remindersButtonPanel);
        remindersButtonPanel.setLayout(remindersButtonPanelLayout);
        remindersButtonPanelLayout.setHorizontalGroup(
            remindersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remindersButtonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(remindersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(remindersIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        remindersButtonPanelLayout.setVerticalGroup(
            remindersButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(remindersIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(remindersLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        financesButtonPanel.setBackground(new java.awt.Color(102, 153, 255));
        financesButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                financesButtonPressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                financesHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                financesHover(evt);
            }
        });

        financesLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        financesLabel.setForeground(new java.awt.Color(255, 255, 255));
        financesLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        financesLabel.setText("Finances");

        financesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        financesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Coins_20px.png"))); // NOI18N

        javax.swing.GroupLayout financesButtonPanelLayout = new javax.swing.GroupLayout(financesButtonPanel);
        financesButtonPanel.setLayout(financesButtonPanelLayout);
        financesButtonPanelLayout.setHorizontalGroup(
            financesButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(financesButtonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(financesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(financesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        financesButtonPanelLayout.setVerticalGroup(
            financesButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(financesIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(financesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactsButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(calendarButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(todayButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(remindersButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(financesButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(todayButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calendarButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contactsButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(remindersButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(financesButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(0, 51, 153));
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(893, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void todayHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayHover
        
        todayButtonPanel.setBackground(focusedTab);
        
    }//GEN-LAST:event_todayHover

    private void todayHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayHoverLeft
        
        if (!activeTab.equals(today)) todayButtonPanel.setBackground(tabBackground);
        
    }//GEN-LAST:event_todayHoverLeft

    private void calendarHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarHover
        
        calendarButtonPanel.setBackground(focusedTab);
        
    }//GEN-LAST:event_calendarHover

    private void calendarHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarHoverLeft
        
        if (!activeTab.equals(calendar)) calendarButtonPanel.setBackground(tabBackground);
        
    }//GEN-LAST:event_calendarHoverLeft

    private void contactsHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactsHover
        
        contactsButtonPanel.setBackground(focusedTab);
        
    }//GEN-LAST:event_contactsHover

    private void contactsHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactsHoverLeft
        
        if (!activeTab.equals(contacts)) contactsButtonPanel.setBackground(tabBackground);
        
    }//GEN-LAST:event_contactsHoverLeft

    private void remindersHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remindersHover
        
        remindersButtonPanel.setBackground(focusedTab);
        
    }//GEN-LAST:event_remindersHover

    private void remindersHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remindersHoverLeft
        
        if (!activeTab.equals(reminders)) remindersButtonPanel.setBackground(tabBackground);
        
    }//GEN-LAST:event_remindersHoverLeft

    private void financesHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_financesHover
        
        financesButtonPanel.setBackground(focusedTab);
        
    }//GEN-LAST:event_financesHover

    private void financesHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_financesHoverLeft
        
        if (!activeTab.equals(finances)) financesButtonPanel.setBackground(tabBackground);
        
    }//GEN-LAST:event_financesHoverLeft

    private void todayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayButtonClicked
        
        if (!activeTab.equals(today))
        {
            checkForCompleteEvents();
            checkForRecurringTransactions();
            save.saveEncrypted();
            
            activeTab = today;
            TodayPanel todayPanel = new TodayPanel(user);

            this.mainPanel.removeAll();
            this.mainPanel.add(todayPanel);
            this.mainPanel.revalidate();
            this.mainPanel.repaint();

            fixSidePanelButtonColors(); 
        }
        
    }//GEN-LAST:event_todayButtonClicked

    private void calendarButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarButtonClicked

        if (!activeTab.equals(calendar))
        {
            checkForCompleteEvents();
            checkForRecurringTransactions();
            save.saveEncrypted();
            
            activeTab = calendar;
            Date date = new Date();
            
            CalendarPanel calendarPanel = new CalendarPanel(user, date);

            this.mainPanel.removeAll();
            this.mainPanel.add(calendarPanel);
            this.mainPanel.revalidate();
            this.mainPanel.repaint();

            fixSidePanelButtonColors();
        }
        
    }//GEN-LAST:event_calendarButtonClicked

    private void contactsButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactsButtonClicked
        
        if (!activeTab.equals(contacts))
        {
            checkForCompleteEvents();
            checkForRecurringTransactions();
            save.saveEncrypted();
            
            activeTab = contacts;
            ContactsPanel contactsPanel = new ContactsPanel(user);

            this.mainPanel.removeAll();
            this.mainPanel.add(contactsPanel);
            this.mainPanel.revalidate();
            this.mainPanel.repaint();

            fixSidePanelButtonColors();
        }
        
    }//GEN-LAST:event_contactsButtonClicked

    private void remindersButtonPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remindersButtonPressed
        
        if (!activeTab.equals(reminders))
        {
            checkForCompleteEvents();
            checkForRecurringTransactions();
            save.saveEncrypted();
            
            activeTab = reminders;
            RemindersPanel remindersPanel = new RemindersPanel(user);

            this.mainPanel.removeAll();
            this.mainPanel.add(remindersPanel);
            this.mainPanel.revalidate();
            this.mainPanel.repaint();

            fixSidePanelButtonColors();
        }
        
    }//GEN-LAST:event_remindersButtonPressed

    private void financesButtonPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_financesButtonPressed
        
        if (!activeTab.equals(finances))
        {
            checkForCompleteEvents();
            checkForRecurringTransactions();
            save.saveEncrypted();
            
            activeTab = finances;
            FinancesPanel financesPanel = new FinancesPanel(user);
        
            this.mainPanel.removeAll();
            this.mainPanel.add(financesPanel);
            this.mainPanel.revalidate();
            this.mainPanel.repaint();

            fixSidePanelButtonColors();
        }

    }//GEN-LAST:event_financesButtonPressed

    private void reload(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reload
        
    }//GEN-LAST:event_reload

    private void windowFocused(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowFocused
        
        switch (activeTab)
        {
            case today:
                
                checkForCompleteEvents();
                checkForRecurringTransactions();
                save.saveEncrypted();
                
                TodayPanel todayPanel = new TodayPanel(user);

                this.mainPanel.removeAll();
                this.mainPanel.add(todayPanel);
                this.mainPanel.revalidate();
                this.mainPanel.repaint();
                
                break;
                
            case calendar:
                
                checkForCompleteEvents();
                checkForRecurringTransactions();
                save.saveEncrypted();
                
                CalendarPanel calendarPanel = new CalendarPanel(user);

                this.mainPanel.removeAll();
                this.mainPanel.add(calendarPanel);
                this.mainPanel.revalidate();
                this.mainPanel.repaint();
            
                break;
                
            case contacts:
                
                checkForCompleteEvents();
                checkForRecurringTransactions();
                save.saveEncrypted();
                
                ContactsPanel contactsPanel = new ContactsPanel(user);

                this.mainPanel.removeAll();
                this.mainPanel.add(contactsPanel);
                this.mainPanel.revalidate();
                this.mainPanel.repaint();
                
                break;
                
            case reminders:
                
                checkForCompleteEvents();
                checkForRecurringTransactions();
                save.saveEncrypted();
                
                RemindersPanel remindersPanel = new RemindersPanel(user);

                this.mainPanel.removeAll();
                this.mainPanel.add(remindersPanel);
                this.mainPanel.revalidate();
                this.mainPanel.repaint();
            
                break;
                
            case finances:
                
                checkForCompleteEvents();
                checkForRecurringTransactions();
                save.saveEncrypted();
                
                FinancesPanel financesPanel = new FinancesPanel(user);
        
                this.mainPanel.removeAll();
                this.mainPanel.add(financesPanel);
                this.mainPanel.revalidate();
                this.mainPanel.repaint();
                
                break;
        }
        
    }//GEN-LAST:event_windowFocused

    //compares every event to today's date, to create the completed event's costs
    //and therefore count towards the budget.
    public void checkForCompleteEvents()
    {
        for(Event event: user.getCalendar())
        {
            Date today = new Date();

            //checks that the event has happened today or since last checked, and ensures
            //that the event wasn't already completed and therefore avoids duplication
            if (event.getDate().compareTo(today) <= 0 && !event.getIsComplete())
            {
                updatedEvent = event;
                
                updatedEvent.setCompletedDate(today);
                updatedEvent.setIsComplete(true);
                
                user.editEvent(event, updatedEvent);
            }
        }
    }
    
    //checks all recurring transactions to see if they have happened since the last login
    //or date checked. The last completed dates are checked against today's date and the 
    //frequency at which they should be repeated. If it is time to repeat the recurring transaction,
    //a general transaction is created and added to the user object, and the recurring is updated
    //with today's date as its new "last date done".
    public void checkForRecurringTransactions()
    {
        for(Transaction transaction: user.finances.getRecurringTransactions())
        {
            Date today = new Date();
            
            switch (transaction.getFrequency())
            {
                case "Daily":

                    if(transaction.getLastRecurred().compareTo(today) == -1)
                    {
                        Transaction newTransaction = new Transaction("general", transaction.getDetail(), transaction.getAmount());
                        
                        newTransaction.setIsIncome(transaction.getIsIncome());
                        
                        user.finances.addTransaction(transaction);
                                
                        transaction.setLastRecurred(today);
                    }

                    break;

                case "Weekly":

                    if(transaction.getLastRecurred().compareTo(today) == -7)
                    {
                        Transaction newTransaction = new Transaction("general", transaction.getDetail(), transaction.getAmount());
                        
                        newTransaction.setIsIncome(transaction.getIsIncome());
                        
                        user.finances.addTransaction(transaction);
                                
                        transaction.setLastRecurred(today);
                    }

                    break;

                case "Bi-Weekly":

                    if(transaction.getLastRecurred().compareTo(today) == -14)
                    {
                        Transaction newTransaction = new Transaction("general", transaction.getDetail(), transaction.getAmount());
                        
                        newTransaction.setIsIncome(transaction.getIsIncome());
                        
                        user.finances.addTransaction(transaction);
                                
                        transaction.setLastRecurred(today);
                    }

                    break;

                case "Monthly":

                    if(transaction.getLastRecurred().compareTo(today) == -30)
                    {
                        Transaction newTransaction = new Transaction("general", transaction.getDetail(), transaction.getAmount());
                        
                        newTransaction.setIsIncome(transaction.getIsIncome());
                        
                        user.finances.addTransaction(transaction);
                                
                        transaction.setLastRecurred(today);
                    }

                    break;

                case "Yearly":

                    if(transaction.getLastRecurred().compareTo(today) == -365)
                    {
                        Transaction newTransaction = new Transaction("general", transaction.getDetail(), transaction.getAmount());
                        
                        newTransaction.setIsIncome(transaction.getIsIncome());
                        
                        user.finances.addTransaction(transaction);
                                
                        transaction.setLastRecurred(today);
                    }

                    break;
            }
            
        }
    }
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public void fixSidePanelButtonColors()  
    {
        if(!activeTab.equals(today)) this.todayButtonPanel.setBackground(tabBackground);
        if(!activeTab.equals(calendar)) this.calendarButtonPanel.setBackground(tabBackground);
        if(!activeTab.equals(contacts)) this.contactsButtonPanel.setBackground(tabBackground);
        if(!activeTab.equals(reminders)) this.remindersButtonPanel.setBackground(tabBackground);
        if(!activeTab.equals(finances)) this.financesButtonPanel.setBackground(tabBackground);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel calendarButtonPanel;
    private javax.swing.JLabel calendarIcon;
    private javax.swing.JLabel calendarLabel;
    private javax.swing.JPanel contactsButtonPanel;
    private javax.swing.JLabel contactsIcon;
    private javax.swing.JLabel contactsLabel;
    private javax.swing.JPanel financesButtonPanel;
    private javax.swing.JLabel financesIcon;
    private javax.swing.JLabel financesLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel remindersButtonPanel;
    private javax.swing.JLabel remindersIcon;
    private javax.swing.JLabel remindersLabel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel todayButtonPanel;
    private javax.swing.JLabel todayIcon;
    private javax.swing.JLabel todayLabel;
    // End of variables declaration//GEN-END:variables
}
