
package lifestyle;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RemindersPanel extends javax.swing.JPanel {

    Color buttonHover = Color.white;
    Color buttonHoverText = new Color(51,102,204);
    Color buttonBackground = new Color(51,102,204);
    Color buttonText = Color.white;
    
    User user;
    
    public RemindersPanel(User user)
    {
        this.user = user;
        
        initComponents();
        
        loadReminders();
        
    }
    
    public RemindersPanel() {
        
        initComponents();
        
        ReminderPanel reminder1 = new ReminderPanel();
        this.todayListingPanel.add(reminder1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactsPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        todayPanel = new javax.swing.JPanel();
        todayPanelIcon = new javax.swing.JLabel();
        todayPanelLabel = new javax.swing.JLabel();
        todayListingScroll = new javax.swing.JScrollPane();
        todayListingPanel = new javax.swing.JPanel();
        upcomingPanel = new javax.swing.JPanel();
        upcomingPanelIcon = new javax.swing.JLabel();
        upcomingPanelLabel = new javax.swing.JLabel();
        upcomingListingScroll = new javax.swing.JScrollPane();
        upcomingListingPanel = new javax.swing.JPanel();
        generalPanel = new javax.swing.JPanel();
        generalPanelIcon = new javax.swing.JLabel();
        generalPanelLabel = new javax.swing.JLabel();
        generalListingScroll = new javax.swing.JScrollPane();
        generalListingPanel = new javax.swing.JPanel();
        newReminderButton = new javax.swing.JButton();
        viewCompleteReminderButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 106, 124));

        contactsPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 72)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 51, 153));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Reminders");

        todayPanel.setBackground(new java.awt.Color(102, 153, 255));

        todayPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Checklist_20px.png"))); // NOI18N
        todayPanelIcon.setToolTipText("");

        todayPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        todayPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        todayPanelLabel.setText("Today");

        todayListingScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        todayListingScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        todayListingPanel.setBackground(new java.awt.Color(102, 153, 255));
        todayListingPanel.setLayout(new javax.swing.BoxLayout(todayListingPanel, javax.swing.BoxLayout.Y_AXIS));
        todayListingScroll.setViewportView(todayListingPanel);

        javax.swing.GroupLayout todayPanelLayout = new javax.swing.GroupLayout(todayPanel);
        todayPanel.setLayout(todayPanelLayout);
        todayPanelLayout.setHorizontalGroup(
            todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(todayPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todayPanelLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(todayListingScroll)
        );
        todayPanelLayout.setVerticalGroup(
            todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(todayPanelLabel)
                    .addComponent(todayPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todayListingScroll))
        );

        upcomingPanel.setBackground(new java.awt.Color(102, 153, 255));

        upcomingPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Checklist_20px.png"))); // NOI18N
        upcomingPanelIcon.setToolTipText("");

        upcomingPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        upcomingPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        upcomingPanelLabel.setText("Upcoming");

        upcomingListingScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        upcomingListingScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        upcomingListingPanel.setBackground(new java.awt.Color(102, 153, 255));
        upcomingListingPanel.setLayout(new javax.swing.BoxLayout(upcomingListingPanel, javax.swing.BoxLayout.Y_AXIS));
        upcomingListingScroll.setViewportView(upcomingListingPanel);

        javax.swing.GroupLayout upcomingPanelLayout = new javax.swing.GroupLayout(upcomingPanel);
        upcomingPanel.setLayout(upcomingPanelLayout);
        upcomingPanelLayout.setHorizontalGroup(
            upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upcomingPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upcomingPanelLabel)
                .addContainerGap(284, Short.MAX_VALUE))
            .addComponent(upcomingListingScroll)
        );
        upcomingPanelLayout.setVerticalGroup(
            upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upcomingPanelLabel)
                    .addComponent(upcomingPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upcomingListingScroll))
        );

        generalPanel.setBackground(new java.awt.Color(102, 153, 255));

        generalPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Checklist_20px.png"))); // NOI18N
        generalPanelIcon.setToolTipText("");

        generalPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        generalPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        generalPanelLabel.setText("General");

        generalListingScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        generalListingScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        generalListingPanel.setBackground(new java.awt.Color(102, 153, 255));
        generalListingPanel.setLayout(new javax.swing.BoxLayout(generalListingPanel, javax.swing.BoxLayout.Y_AXIS));
        generalListingScroll.setViewportView(generalListingPanel);

        javax.swing.GroupLayout generalPanelLayout = new javax.swing.GroupLayout(generalPanel);
        generalPanel.setLayout(generalPanelLayout);
        generalPanelLayout.setHorizontalGroup(
            generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(generalPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalPanelLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(generalListingScroll)
        );
        generalPanelLayout.setVerticalGroup(
            generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generalPanelLabel)
                    .addComponent(generalPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generalListingScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );

        newReminderButton.setBackground(new java.awt.Color(51, 102, 204));
        newReminderButton.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        newReminderButton.setForeground(new java.awt.Color(255, 255, 255));
        newReminderButton.setText("Add New Reminder");
        newReminderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        newReminderButton.setContentAreaFilled(false);
        newReminderButton.setOpaque(true);
        newReminderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newReminderClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newReminderHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newReminderHover(evt);
            }
        });

        viewCompleteReminderButton.setBackground(new java.awt.Color(51, 102, 204));
        viewCompleteReminderButton.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        viewCompleteReminderButton.setForeground(new java.awt.Color(255, 255, 255));
        viewCompleteReminderButton.setText("View Completed");
        viewCompleteReminderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        viewCompleteReminderButton.setContentAreaFilled(false);
        viewCompleteReminderButton.setOpaque(true);
        viewCompleteReminderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewCompleteReminderButtonnewReminderClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewCompleteReminderButtonnewReminderHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewCompleteReminderButtonnewReminderHover(evt);
            }
        });

        javax.swing.GroupLayout contactsPanelLayout = new javax.swing.GroupLayout(contactsPanel);
        contactsPanel.setLayout(contactsPanelLayout);
        contactsPanelLayout.setHorizontalGroup(
            contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contactsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upcomingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(todayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newReminderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(viewCompleteReminderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                .addContainerGap())
        );
        contactsPanelLayout.setVerticalGroup(
            contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactsPanelLayout.createSequentialGroup()
                        .addComponent(todayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upcomingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contactsPanelLayout.createSequentialGroup()
                        .addComponent(newReminderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCompleteReminderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(contactsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contactsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newReminderHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newReminderHover
            
        newReminderButton.setBackground(buttonHover);
        newReminderButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_newReminderHover

    private void newReminderHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newReminderHoverLeft
        
        newReminderButton.setBackground(buttonBackground);
        newReminderButton.setForeground(buttonText);
        
    }//GEN-LAST:event_newReminderHoverLeft

    private void newReminderClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newReminderClicked
        
        new DetailsWindow(user, "Reminder").setVisible(true);
        
    }//GEN-LAST:event_newReminderClicked

    private void viewCompleteReminderButtonnewReminderHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCompleteReminderButtonnewReminderHover
        
        viewCompleteReminderButton.setBackground(buttonHover);
        viewCompleteReminderButton.setForeground(buttonHoverText);
        
    }//GEN-LAST:event_viewCompleteReminderButtonnewReminderHover

    private void viewCompleteReminderButtonnewReminderHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCompleteReminderButtonnewReminderHoverLeft
        
        viewCompleteReminderButton.setBackground(buttonBackground);
        viewCompleteReminderButton.setForeground(buttonText);
        
    }//GEN-LAST:event_viewCompleteReminderButtonnewReminderHoverLeft

    private void viewCompleteReminderButtonnewReminderClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCompleteReminderButtonnewReminderClicked
        
        new ListingWindow(user).setVisible(true);
        
    }//GEN-LAST:event_viewCompleteReminderButtonnewReminderClicked

    //loads the reminders into their respective areas based on the status of the reminder
    private void loadReminders()
    {
        for (Reminder reminder: user.getReminders()) 
        {    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date today = new Date();
            dateFormat.format(today);
            
            //ensures dates are not checked on reminders without dates, causing error
            if (reminder.getHasDate())
            {
                //today or overdue reminders
                if (reminder.getDate().equals(today) || reminder.getDate().before(today))
                {
                    ReminderPanel reminderPanel = new ReminderPanel(user, reminder);

                    this.todayListingPanel.add(reminderPanel);
                }

                //upcoming reminders, will only print the next 30 reminders to not overwhelm

                int x = 0;

                if (reminder.getDate().after(today) && x < 30)
                {
                    ReminderPanel reminderPanel = new ReminderPanel(user, reminder);

                    this.upcomingListingPanel.add(reminderPanel);

                    x++;
                }
            }
            
            //general reminders with no time limitations
            if (reminder.getType().equals("general"))
            {
                ReminderPanel reminderPanel = new ReminderPanel(user,reminder);
                
                this.generalListingPanel.add(reminderPanel);
            }   
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contactsPanel;
    private javax.swing.JPanel generalListingPanel;
    private javax.swing.JScrollPane generalListingScroll;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JLabel generalPanelIcon;
    private javax.swing.JLabel generalPanelLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JButton newReminderButton;
    private javax.swing.JPanel todayListingPanel;
    private javax.swing.JScrollPane todayListingScroll;
    private javax.swing.JPanel todayPanel;
    private javax.swing.JLabel todayPanelIcon;
    private javax.swing.JLabel todayPanelLabel;
    private javax.swing.JPanel upcomingListingPanel;
    private javax.swing.JScrollPane upcomingListingScroll;
    private javax.swing.JPanel upcomingPanel;
    private javax.swing.JLabel upcomingPanelIcon;
    private javax.swing.JLabel upcomingPanelLabel;
    private javax.swing.JButton viewCompleteReminderButton;
    // End of variables declaration//GEN-END:variables
}
