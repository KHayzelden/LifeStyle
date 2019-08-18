
package lifestyle;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static lifestyle.CalendarPanel.date;

public class TodayPanel extends javax.swing.JPanel {

    String activeFinanceButton = "day"; //starting button always
    final String    day = "day",
                    week = "week",
                    month = "month";
    
    Color buttonHover = Color.white;
    Color buttonHoverText = new Color(51,102,204);
    Color buttonBackground = new Color(51,102,204);
    Color buttonText = Color.white;
    
    User user;
    
    DateFormat monthFormat = new SimpleDateFormat ("MMMM");
    DateFormat dateFormat = new SimpleDateFormat ("dd");
    DateFormat dayFormat = new SimpleDateFormat ("EEEE");
    
    public TodayPanel(User user)
    {
        this.user = user;
        
        initComponents();
        
        loadEvents();
        loadReminders();
        
        Date date = new Date();
        
        String monthString = monthFormat.format(date);
        String dateString = dateFormat.format(date);
        String dayString = dayFormat.format(date);
        
        dateLabel.setText( dayString + ", "  + monthString + " " + dateString);
    }
    
    public TodayPanel() {
        
        initComponents();

    }
    
    //loads the events that occur today
    
    public void loadEvents()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        this.eventListingPanel.removeAll();
        
        for (Event event: user.getCalendar()) 
        {    
            String eventDate = dateFormat.format(event.getDate());
            String today = dateFormat.format(new Date());
            
            if (eventDate.equals(today))
            {
                EventsPanel eventPanel = new EventsPanel(user, event);
                
                this.eventListingPanel.add(eventPanel);
            }            
        }
        
        this.eventListingPanel.revalidate();
        this.eventListingPanel.repaint(); 
    }
    
    //loads the reminders that are matching the date of today

    public void loadReminders()
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

                    this.reminderListingPanel.add(reminderPanel);
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        todayPanel = new javax.swing.JPanel();
        summaryPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        eventsPanel = new javax.swing.JPanel();
        eventsPanelIcon = new javax.swing.JLabel();
        eventsPanelLabel = new javax.swing.JLabel();
        eventListingScroll = new javax.swing.JScrollPane();
        eventListingPanel = new javax.swing.JPanel();
        remindersPanel = new javax.swing.JPanel();
        remindersPanelIcon = new javax.swing.JLabel();
        remindersPanelLabel = new javax.swing.JLabel();
        reminderListingScroll = new javax.swing.JScrollPane();
        reminderListingPanel = new javax.swing.JPanel();
        financesPanel = new javax.swing.JPanel();
        financesPanelLabel = new javax.swing.JLabel();
        financesPanelIcon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 106, 124));

        todayPanel.setBackground(new java.awt.Color(255, 255, 255));

        summaryPanel.setBackground(new java.awt.Color(255, 255, 255));

        dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 72)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 51, 153));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Wednesday, February 28");

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        eventsPanel.setBackground(new java.awt.Color(102, 153, 255));
        eventsPanel.setMinimumSize(new java.awt.Dimension(356, 149));

        eventsPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calendar_20px.png"))); // NOI18N
        eventsPanelIcon.setToolTipText("");

        eventsPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        eventsPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        eventsPanelLabel.setText("Events");

        eventListingScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        eventListingScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        eventListingPanel.setBackground(new java.awt.Color(102, 153, 255));
        eventListingPanel.setLayout(new javax.swing.BoxLayout(eventListingPanel, javax.swing.BoxLayout.Y_AXIS));
        eventListingScroll.setViewportView(eventListingPanel);

        javax.swing.GroupLayout eventsPanelLayout = new javax.swing.GroupLayout(eventsPanel);
        eventsPanel.setLayout(eventsPanelLayout);
        eventsPanelLayout.setHorizontalGroup(
            eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eventsPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventsPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(eventsPanelLayout.createSequentialGroup()
                .addComponent(eventListingScroll)
                .addGap(1, 1, 1))
        );
        eventsPanelLayout.setVerticalGroup(
            eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventsPanelLabel)
                    .addComponent(eventsPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventListingScroll))
        );

        remindersPanel.setBackground(new java.awt.Color(102, 153, 255));

        remindersPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Checklist_20px.png"))); // NOI18N
        remindersPanelIcon.setToolTipText("");

        remindersPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        remindersPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        remindersPanelLabel.setText("Reminders");

        reminderListingScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        reminderListingScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        reminderListingPanel.setBackground(new java.awt.Color(102, 153, 255));
        reminderListingPanel.setLayout(new javax.swing.BoxLayout(reminderListingPanel, javax.swing.BoxLayout.Y_AXIS));
        reminderListingScroll.setViewportView(reminderListingPanel);

        javax.swing.GroupLayout remindersPanelLayout = new javax.swing.GroupLayout(remindersPanel);
        remindersPanel.setLayout(remindersPanelLayout);
        remindersPanelLayout.setHorizontalGroup(
            remindersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remindersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remindersPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remindersPanelLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(reminderListingScroll)
        );
        remindersPanelLayout.setVerticalGroup(
            remindersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(remindersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(remindersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(remindersPanelLabel)
                    .addComponent(remindersPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminderListingScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        financesPanel.setBackground(new java.awt.Color(102, 153, 255));

        financesPanelLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        financesPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        financesPanelLabel.setText("Finances");

        financesPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Coins_20px.png"))); // NOI18N
        financesPanelIcon.setToolTipText("");

        javax.swing.GroupLayout financesPanelLayout = new javax.swing.GroupLayout(financesPanel);
        financesPanel.setLayout(financesPanelLayout);
        financesPanelLayout.setHorizontalGroup(
            financesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(financesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(financesPanelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(financesPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        financesPanelLayout.setVerticalGroup(
            financesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(financesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(financesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(financesPanelLabel)
                    .addComponent(financesPanelIcon))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout todayPanelLayout = new javax.swing.GroupLayout(todayPanel);
        todayPanel.setLayout(todayPanelLayout);
        todayPanelLayout.setHorizontalGroup(
            todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eventsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(financesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remindersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(summaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        todayPanelLayout.setVerticalGroup(
            todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todayPanelLayout.createSequentialGroup()
                .addComponent(summaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(todayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(todayPanelLayout.createSequentialGroup()
                        .addComponent(remindersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(financesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(eventsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(todayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(todayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel eventListingPanel;
    private javax.swing.JScrollPane eventListingScroll;
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JLabel eventsPanelIcon;
    private javax.swing.JLabel eventsPanelLabel;
    private javax.swing.JPanel financesPanel;
    private javax.swing.JLabel financesPanelIcon;
    private javax.swing.JLabel financesPanelLabel;
    private javax.swing.JPanel reminderListingPanel;
    private javax.swing.JScrollPane reminderListingScroll;
    private javax.swing.JPanel remindersPanel;
    private javax.swing.JLabel remindersPanelIcon;
    private javax.swing.JLabel remindersPanelLabel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JPanel todayPanel;
    // End of variables declaration//GEN-END:variables
}
