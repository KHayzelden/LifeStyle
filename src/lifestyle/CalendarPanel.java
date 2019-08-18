
package lifestyle;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class CalendarPanel extends javax.swing.JPanel {

    String activeDay = "tuesday"; //TEMPORARY - gets overwritten by 
    
    //there are strings delcared to avoid typos 
    final String    monday = "monday",
                    tuesday = "tuesday",
                    wednesday = "wednesday",
                    thursday = "thursday",
                    friday = "friday",
                    saturday = "saturday",
                    sunday = "sunday";
    
    String monthString, mondayMonthString, tuesdayMonthString, wednesdayMonthString, 
           thursdayMonthString, fridayMonthString, saturdayMonthString, sundayMonthString;
    
    Color buttonHover = new Color(102,153,255);
    Color buttonHoverText = Color.white;
    Color buttonBackground = Color.white;
    Color buttonTextDark = new Color(0,51,153);
    Color buttonTextLight = new Color(102,153,255);
    Color weekButtonHoverColor = new Color(0,51,153);
    Color weekButtonColor = new Color(51,102,204);
    Color addNewButtonHover = Color.white;
    Color addNewButtonHoverText = new Color(51,102,204);
    Color addNewButtonBackground = new Color(51,102,204);
    Color addNewButtonText = Color.white;
    
    User user;
    
    static Date date;
    
    Calendar calendar = Calendar.getInstance();
    
    Date mondayDate, tuesdayDate, wednesdayDate, thursdayDate, fridayDate, saturdayDate, sundayDate;
    
    //will load with today's date, and is called on a new calendar instance
    public CalendarPanel(User user, Date date)
    {
        this.date = date;
        this.user = user;
        
        initComponents();
        
        //will initally load based on today's date defined above or the last used
        loadCalendar(date);
        
        loadEvents();
    }
    
    //will use the last remembered date, and is called on a reload to keep the user on the same day, this will only
    //happen once a date has been established either by the main window (today) or by the user in this window
    public CalendarPanel (User user)
    {
        this.user = user;
        
        initComponents();
        
        //will initally load based on today's date defined above or the last used
        loadCalendar(date);
        
        loadEvents();
    }
    
    public CalendarPanel() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendarPanel = new javax.swing.JPanel();
        summaryPanel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        eventsPanel = new javax.swing.JPanel();
        eventsPanelIcon = new javax.swing.JLabel();
        eventsPanelLabel = new javax.swing.JLabel();
        eventListingScroll = new javax.swing.JScrollPane();
        eventListingPanel = new javax.swing.JPanel();
        dateSelectionPanel = new javax.swing.JPanel();
        mondayPanel = new javax.swing.JPanel();
        mondayDateLabel = new javax.swing.JLabel();
        mondayLabel = new javax.swing.JLabel();
        tuesdayPanel = new javax.swing.JPanel();
        tuesdayDateLabel = new javax.swing.JLabel();
        tuesdayLabel = new javax.swing.JLabel();
        wednesdayPanel = new javax.swing.JPanel();
        wednesdayDateLabel = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        thursdayPanel = new javax.swing.JPanel();
        thursdayDateLabel = new javax.swing.JLabel();
        thursdayLabel = new javax.swing.JLabel();
        fridayPanel = new javax.swing.JPanel();
        fridayDateLabel = new javax.swing.JLabel();
        fridayLabel = new javax.swing.JLabel();
        saturdayPanel = new javax.swing.JPanel();
        saturdayDateLabel = new javax.swing.JLabel();
        saturdayLabel = new javax.swing.JLabel();
        sundayPanel = new javax.swing.JPanel();
        sundayDateLabel = new javax.swing.JLabel();
        sundayLabel = new javax.swing.JLabel();
        weekPickerPanel = new javax.swing.JPanel();
        enterDateLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        weekLabel = new javax.swing.JLabel();
        weekBackButton = new javax.swing.JButton();
        weekForwardButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        newEventButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        calendarPanel.setBackground(new java.awt.Color(255, 255, 255));

        summaryPanel.setBackground(new java.awt.Color(255, 255, 255));

        dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 72)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 51, 153));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Tuesday, February 27");

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(eventListingScroll)
        );
        eventsPanelLayout.setVerticalGroup(
            eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventsPanelLabel)
                    .addComponent(eventsPanelIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventListingScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        dateSelectionPanel.setBackground(new java.awt.Color(255, 255, 255));
        dateSelectionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));

        mondayPanel.setBackground(new java.awt.Color(255, 255, 255));
        mondayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        mondayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        mondayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mondayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mondayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mondayButtonHover(evt);
            }
        });

        mondayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        mondayDateLabel.setForeground(new java.awt.Color(0, 51, 153));
        mondayDateLabel.setText("26");

        mondayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        mondayLabel.setForeground(new java.awt.Color(102, 153, 255));
        mondayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mondayLabel.setText("M");
        mondayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout mondayPanelLayout = new javax.swing.GroupLayout(mondayPanel);
        mondayPanel.setLayout(mondayPanelLayout);
        mondayPanelLayout.setHorizontalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mondayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mondayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mondayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mondayPanelLayout.setVerticalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mondayPanelLayout.createSequentialGroup()
                .addGroup(mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mondayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mondayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mondayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tuesdayPanel.setBackground(new java.awt.Color(102, 153, 255));
        tuesdayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        tuesdayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        tuesdayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tuesdayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tuesdayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tuesdayButtonHover(evt);
            }
        });

        tuesdayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        tuesdayDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        tuesdayDateLabel.setText("27");

        tuesdayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        tuesdayLabel.setForeground(new java.awt.Color(255, 255, 255));
        tuesdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        tuesdayLabel.setText("T");
        tuesdayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout tuesdayPanelLayout = new javax.swing.GroupLayout(tuesdayPanel);
        tuesdayPanel.setLayout(tuesdayPanelLayout);
        tuesdayPanelLayout.setHorizontalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuesdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tuesdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tuesdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tuesdayPanelLayout.setVerticalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuesdayPanelLayout.createSequentialGroup()
                .addGroup(tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuesdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tuesdayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tuesdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        wednesdayPanel.setBackground(new java.awt.Color(255, 255, 255));
        wednesdayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        wednesdayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        wednesdayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wednesdayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wednesdayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wednesdayButtonHover(evt);
            }
        });

        wednesdayDateLabel.setBackground(new java.awt.Color(0, 0, 0));
        wednesdayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        wednesdayDateLabel.setForeground(new java.awt.Color(0, 51, 153));
        wednesdayDateLabel.setText("28");

        wednesdayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        wednesdayLabel.setForeground(new java.awt.Color(102, 153, 255));
        wednesdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        wednesdayLabel.setText("W");
        wednesdayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout wednesdayPanelLayout = new javax.swing.GroupLayout(wednesdayPanel);
        wednesdayPanel.setLayout(wednesdayPanelLayout);
        wednesdayPanelLayout.setHorizontalGroup(
            wednesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wednesdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wednesdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wednesdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        wednesdayPanelLayout.setVerticalGroup(
            wednesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wednesdayPanelLayout.createSequentialGroup()
                .addGroup(wednesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wednesdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(wednesdayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(wednesdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        thursdayPanel.setBackground(new java.awt.Color(255, 255, 255));
        thursdayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        thursdayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        thursdayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thursdayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                thursdayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thursdayButtonHover(evt);
            }
        });

        thursdayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        thursdayDateLabel.setForeground(new java.awt.Color(0, 51, 153));
        thursdayDateLabel.setText("1");

        thursdayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        thursdayLabel.setForeground(new java.awt.Color(102, 153, 255));
        thursdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        thursdayLabel.setText("T");
        thursdayLabel.setToolTipText("");
        thursdayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout thursdayPanelLayout = new javax.swing.GroupLayout(thursdayPanel);
        thursdayPanel.setLayout(thursdayPanelLayout);
        thursdayPanelLayout.setHorizontalGroup(
            thursdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thursdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thursdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thursdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        thursdayPanelLayout.setVerticalGroup(
            thursdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thursdayPanelLayout.createSequentialGroup()
                .addGroup(thursdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thursdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(thursdayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(thursdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fridayPanel.setBackground(new java.awt.Color(255, 255, 255));
        fridayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        fridayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        fridayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fridayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fridayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fridayButtonHover(evt);
            }
        });

        fridayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        fridayDateLabel.setForeground(new java.awt.Color(0, 51, 153));
        fridayDateLabel.setText("2");

        fridayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        fridayLabel.setForeground(new java.awt.Color(102, 153, 255));
        fridayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fridayLabel.setText("F");
        fridayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout fridayPanelLayout = new javax.swing.GroupLayout(fridayPanel);
        fridayPanel.setLayout(fridayPanelLayout);
        fridayPanelLayout.setHorizontalGroup(
            fridayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fridayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fridayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fridayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fridayPanelLayout.setVerticalGroup(
            fridayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fridayPanelLayout.createSequentialGroup()
                .addGroup(fridayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fridayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fridayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fridayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saturdayPanel.setBackground(new java.awt.Color(255, 255, 255));
        saturdayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        saturdayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        saturdayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saturdayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saturdayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saturdayButtonHover(evt);
            }
        });

        saturdayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        saturdayDateLabel.setForeground(new java.awt.Color(0, 51, 153));
        saturdayDateLabel.setText("3");

        saturdayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        saturdayLabel.setForeground(new java.awt.Color(102, 153, 255));
        saturdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        saturdayLabel.setText("S");
        saturdayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout saturdayPanelLayout = new javax.swing.GroupLayout(saturdayPanel);
        saturdayPanel.setLayout(saturdayPanelLayout);
        saturdayPanelLayout.setHorizontalGroup(
            saturdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saturdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saturdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saturdayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        saturdayPanelLayout.setVerticalGroup(
            saturdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saturdayPanelLayout.createSequentialGroup()
                .addGroup(saturdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saturdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(saturdayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saturdayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sundayPanel.setBackground(new java.awt.Color(255, 255, 255));
        sundayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 5));
        sundayPanel.setPreferredSize(new java.awt.Dimension(90, 184));
        sundayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sundayButtonClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sundayButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sundayButtonHover(evt);
            }
        });

        sundayDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        sundayDateLabel.setForeground(new java.awt.Color(0, 51, 153));
        sundayDateLabel.setText("4");

        sundayLabel.setFont(new java.awt.Font("A Year Without Rain", 0, 14)); // NOI18N
        sundayLabel.setForeground(new java.awt.Color(102, 153, 255));
        sundayLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        sundayLabel.setText("S");
        sundayLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout sundayPanelLayout = new javax.swing.GroupLayout(sundayPanel);
        sundayPanel.setLayout(sundayPanelLayout);
        sundayPanelLayout.setHorizontalGroup(
            sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sundayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sundayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sundayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sundayPanelLayout.setVerticalGroup(
            sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sundayPanelLayout.createSequentialGroup()
                .addGroup(sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sundayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sundayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sundayDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dateSelectionPanelLayout = new javax.swing.GroupLayout(dateSelectionPanel);
        dateSelectionPanel.setLayout(dateSelectionPanelLayout);
        dateSelectionPanelLayout.setHorizontalGroup(
            dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateSelectionPanelLayout.createSequentialGroup()
                .addComponent(mondayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(tuesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(wednesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(thursdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(fridayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(saturdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sundayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
        );
        dateSelectionPanelLayout.setVerticalGroup(
            dateSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mondayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(tuesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(wednesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(thursdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(fridayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(saturdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(sundayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        weekPickerPanel.setBackground(new java.awt.Color(102, 153, 255));

        enterDateLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterDateLabel.setText("Enter Date : ");

        dateField.setBackground(new java.awt.Color(102, 153, 255));
        dateField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        dateField.setForeground(new java.awt.Color(255, 255, 255));
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        dateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateChanged(evt);
            }
        });

        weekLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        weekLabel.setForeground(new java.awt.Color(255, 255, 255));
        weekLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        weekLabel.setText("Week :");

        weekBackButton.setBackground(new java.awt.Color(51, 102, 204));
        weekBackButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        weekBackButton.setForeground(new java.awt.Color(255, 255, 255));
        weekBackButton.setText("<");
        weekBackButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        weekBackButton.setContentAreaFilled(false);
        weekBackButton.setOpaque(true);
        weekBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                weekBackButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weekBackButtonMouseEntered(evt);
            }
        });
        weekBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekBackButtonActionPerformed(evt);
            }
        });

        weekForwardButton.setBackground(new java.awt.Color(51, 102, 204));
        weekForwardButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        weekForwardButton.setForeground(new java.awt.Color(255, 255, 255));
        weekForwardButton.setText(">");
        weekForwardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        weekForwardButton.setContentAreaFilled(false);
        weekForwardButton.setOpaque(true);
        weekForwardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                weekForwardButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weekForwardButtonMouseEntered(evt);
            }
        });
        weekForwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekForwardButtonActionPerformed(evt);
            }
        });

        goButton.setBackground(new java.awt.Color(51, 102, 204));
        goButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        goButton.setForeground(new java.awt.Color(255, 255, 255));
        goButton.setText("Go");
        goButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        goButton.setContentAreaFilled(false);
        goButton.setOpaque(true);
        goButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                goButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                goButtonHover(evt);
            }
        });
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout weekPickerPanelLayout = new javax.swing.GroupLayout(weekPickerPanel);
        weekPickerPanel.setLayout(weekPickerPanelLayout);
        weekPickerPanelLayout.setHorizontalGroup(
            weekPickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weekPickerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(weekLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekForwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        weekPickerPanelLayout.setVerticalGroup(
            weekPickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, weekPickerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(weekPickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(weekPickerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enterDateLabel)
                        .addComponent(weekLabel)
                        .addComponent(weekBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(weekForwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        newEventButton.setBackground(new java.awt.Color(51, 102, 204));
        newEventButton.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        newEventButton.setForeground(new java.awt.Color(255, 255, 255));
        newEventButton.setText("Add New Event");
        newEventButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 204), 5));
        newEventButton.setContentAreaFilled(false);
        newEventButton.setOpaque(true);
        newEventButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newEventButtonnewReminderHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newEventButtonnewReminderHover(evt);
            }
        });
        newEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEventButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calendarPanelLayout = new javax.swing.GroupLayout(calendarPanel);
        calendarPanel.setLayout(calendarPanelLayout);
        calendarPanelLayout.setHorizontalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(summaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weekPickerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newEventButton, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                .addContainerGap())
        );
        calendarPanelLayout.setVerticalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addComponent(summaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(weekPickerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sundayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sundayButtonHover

        this.sundayPanel.setBackground(buttonHover);
        this.sundayDateLabel.setForeground(buttonHoverText);
        this.sundayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_sundayButtonHover

    private void sundayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sundayButtonHoverLeft

        if (!activeDay.equals(sunday))
        {
            this.sundayPanel.setBackground(buttonBackground);
            this.sundayDateLabel.setForeground(buttonTextDark);
            this.sundayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_sundayButtonHoverLeft

    private void sundayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sundayButtonClicked

        activeDay = sunday;
        
        date = sundayDate;
        
        dateLabel.setText("Sunday, " + sundayMonthString + " " + sundayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_sundayButtonClicked

    private void saturdayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saturdayButtonHover

        this.saturdayPanel.setBackground(buttonHover);
        this.saturdayDateLabel.setForeground(buttonHoverText);
        this.saturdayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_saturdayButtonHover

    private void saturdayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saturdayButtonHoverLeft

        if (!activeDay.equals(saturday))
        {
            this.saturdayPanel.setBackground(buttonBackground);
            this.saturdayDateLabel.setForeground(buttonTextDark);
            this.saturdayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_saturdayButtonHoverLeft

    private void saturdayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saturdayButtonClicked

        activeDay = saturday;
        
        date = saturdayDate;
        
        dateLabel.setText("Saturday, "  + saturdayMonthString + " " + saturdayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_saturdayButtonClicked

    private void fridayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fridayButtonHover

        this.fridayPanel.setBackground(buttonHover);
        this.fridayDateLabel.setForeground(buttonHoverText);
        this.fridayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_fridayButtonHover

    private void fridayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fridayButtonHoverLeft

        if (!activeDay.equals(friday))
        {
            this.fridayPanel.setBackground(buttonBackground);
            this.fridayDateLabel.setForeground(buttonTextDark);
            this.fridayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_fridayButtonHoverLeft

    private void fridayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fridayButtonClicked

        activeDay = friday;
        
        date = fridayDate;
        
        dateLabel.setText("Friday, " + fridayMonthString + " " + fridayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_fridayButtonClicked

    private void thursdayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thursdayButtonHover

        this.thursdayPanel.setBackground(buttonHover);
        this.thursdayDateLabel.setForeground(buttonHoverText);
        this.thursdayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_thursdayButtonHover

    private void thursdayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thursdayButtonHoverLeft

        if (!activeDay.equals(thursday))
        {
            this.thursdayPanel.setBackground(buttonBackground);
            this.thursdayDateLabel.setForeground(buttonTextDark);
            this.thursdayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_thursdayButtonHoverLeft

    private void thursdayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thursdayButtonClicked

        activeDay = thursday;
        
        date = thursdayDate;
        
        dateLabel.setText("Thursday, " + thursdayMonthString + " " + thursdayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_thursdayButtonClicked

    private void wednesdayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wednesdayButtonHover

        this.wednesdayPanel.setBackground(buttonHover);
        this.wednesdayDateLabel.setForeground(buttonHoverText);
        this.wednesdayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_wednesdayButtonHover

    private void wednesdayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wednesdayButtonHoverLeft

        if (!activeDay.equals(wednesday))
        {
            this.wednesdayPanel.setBackground(buttonBackground);
            this.wednesdayDateLabel.setForeground(buttonTextDark);
            this.wednesdayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_wednesdayButtonHoverLeft

    private void wednesdayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wednesdayButtonClicked

        activeDay = wednesday;
        
        date = wednesdayDate;
        
        dateLabel.setText("Wednesday, " + wednesdayMonthString + " " + wednesdayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_wednesdayButtonClicked

    private void tuesdayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuesdayButtonHover

        this.tuesdayPanel.setBackground(buttonHover);
        this.tuesdayDateLabel.setForeground(buttonHoverText);
        this.tuesdayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_tuesdayButtonHover

    private void tuesdayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuesdayButtonHoverLeft

        if (!activeDay.equals(tuesday))
        {
            this.tuesdayPanel.setBackground(buttonBackground);
            this.tuesdayDateLabel.setForeground(buttonTextDark);
            this.tuesdayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_tuesdayButtonHoverLeft

    private void tuesdayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuesdayButtonClicked

        activeDay = tuesday;
        
        date = tuesdayDate;
        
        dateLabel.setText("Tuesday, " + tuesdayMonthString + " " + tuesdayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_tuesdayButtonClicked

    private void mondayButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mondayButtonHover

        this.mondayPanel.setBackground(buttonHover);
        this.mondayDateLabel.setForeground(buttonHoverText);
        this.mondayLabel.setForeground(buttonHoverText);
    }//GEN-LAST:event_mondayButtonHover

    private void mondayButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mondayButtonHoverLeft

        if (!activeDay.equals(monday))
        {
            this.mondayPanel.setBackground(buttonBackground);
            this.mondayDateLabel.setForeground(buttonTextDark);
            this.mondayLabel.setForeground(buttonTextLight);
        }
    }//GEN-LAST:event_mondayButtonHoverLeft

    private void mondayButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mondayButtonClicked

        activeDay = monday;
        
        date = mondayDate;
        
        dateLabel.setText("Monday, " + mondayMonthString + " " + mondayDateLabel.getText());

        loadEvents();
        
        fixButtonColors();
    }//GEN-LAST:event_mondayButtonClicked

    private void weekBackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekBackButtonMouseEntered
        
        this.weekBackButton.setBackground(weekButtonHoverColor);
        
    }//GEN-LAST:event_weekBackButtonMouseEntered

    private void weekBackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekBackButtonMouseExited
        
        this.weekBackButton.setBackground(weekButtonColor);
        
    }//GEN-LAST:event_weekBackButtonMouseExited

    private void weekForwardButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekForwardButtonMouseEntered
        
        this.weekForwardButton.setBackground(weekButtonHoverColor);
        
    }//GEN-LAST:event_weekForwardButtonMouseEntered

    private void weekForwardButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekForwardButtonMouseExited
        
        this.weekForwardButton.setBackground(weekButtonColor);
        
    }//GEN-LAST:event_weekForwardButtonMouseExited

    private void goButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goButtonHover
        
        this.goButton.setBackground(weekButtonHoverColor);
        
    }//GEN-LAST:event_goButtonHover

    private void goButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goButtonHoverLeft
        
        this.goButton.setBackground(weekButtonColor);
        
    }//GEN-LAST:event_goButtonHoverLeft

    // this button checks that the date is a valid date (the format is ensured by validation) and
    // will then reload to that page
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        
        try 
        {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            Date selectedDate = dateFormat.parse(dateField.getText());
            
            date = selectedDate;
            
            loadCalendar(date);
            
        }
        catch (ParseException e) 
        {
            JOptionPane.showMessageDialog(null, "Date must be in dd/MM/yyy format.");
        }
        
    }//GEN-LAST:event_goButtonActionPerformed

    
    //this will get the date of exactly a week before the selected date and refreshs the page
    private void weekBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekBackButtonActionPerformed
        
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -7);
        date = calendar.getTime();

        loadCalendar(date);
        loadEvents();

    }//GEN-LAST:event_weekBackButtonActionPerformed

    //this will get the date of a week forward from the selected date and refreshes the page
    private void weekForwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekForwardButtonActionPerformed
       
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 7);
        date = calendar.getTime();

        loadCalendar(date);
        loadEvents();
        
    }//GEN-LAST:event_weekForwardButtonActionPerformed

    private void newEventButtonnewReminderHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newEventButtonnewReminderHoverLeft

        newEventButton.setBackground(addNewButtonBackground);
        newEventButton.setForeground(addNewButtonText);

    }//GEN-LAST:event_newEventButtonnewReminderHoverLeft

    private void newEventButtonnewReminderHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newEventButtonnewReminderHover

        newEventButton.setBackground(addNewButtonHover);
        newEventButton.setForeground(addNewButtonHoverText);

    }//GEN-LAST:event_newEventButtonnewReminderHover

    private void newEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEventButtonActionPerformed
        
        new DetailsWindow(user, "Event", date).setVisible(true);
        
    }//GEN-LAST:event_newEventButtonActionPerformed

    //this checks the entered date's format as each key is enetered and ensures that it matches
    //it ensures the format dd/MM/yyy
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

    //this mathod gets the current date and formats it into seperate day, month, and week categoires which
    //are used for sorting and for the main label. it then checks the date's day of the week and sets the dates according
    //to what that day is (eg. if the selected date is a tuesday, the monday will be that date minus one day, and so on.
    //the use of the calendar format is required to subtract or add days.
    private void loadCalendar(Date date) {
        
        DateFormat dateFormatDate = new SimpleDateFormat("dd");
        String todayDate = dateFormatDate.format(date);

        DateFormat dateFormatMonth = new SimpleDateFormat("MMMM");
        String todayMonth = dateFormatMonth.format(date);
        monthString = todayMonth;
        
        DateFormat dateFormatDay = new SimpleDateFormat("EEEE");
        String todayDay = dateFormatDay.format(date);
        
        dateLabel.setText(todayDay + ", " + monthString + " " + todayDate);
        
        activeDay = todayDay.toLowerCase();
        
        switch (activeDay)
        {
            case monday:
                
                //monday
                mondayDateLabel.setText(todayDate);
                
                mondayDate = date;
                
                mondayMonthString = dateFormatMonth.format(date);
                
                //tuesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 1);
                tuesdayDate = calendar.getTime();
                
                tuesdayMonthString = dateFormatMonth.format(tuesdayDate);
                
                tuesdayDateLabel.setText(dateFormatDate.format(tuesdayDate));
                
                //wednesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 2);
                wednesdayDate = calendar.getTime();

                wednesdayMonthString = dateFormatMonth.format(wednesdayDate);
                
                wednesdayDateLabel.setText(dateFormatDate.format(wednesdayDate));
                
                //thursday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 3);
                thursdayDate = calendar.getTime();
                
                thursdayMonthString = dateFormatMonth.format(thursdayDate);
                
                thursdayDateLabel.setText(dateFormatDate.format(thursdayDate));
                
                //friday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 4);
                fridayDate = calendar.getTime();

                fridayMonthString = dateFormatMonth.format(fridayDate);
                
                fridayDateLabel.setText(dateFormatDate.format(fridayDate));
                
                //saturday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 5);
                saturdayDate = calendar.getTime();
                
                saturdayMonthString = dateFormatMonth.format(saturdayDate);
                
                saturdayDateLabel.setText(dateFormatDate.format(saturdayDate));
                
                //sunday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 6);
                sundayDate = calendar.getTime();

                sundayMonthString = dateFormatMonth.format(sundayDate);
                
                sundayDateLabel.setText(dateFormatDate.format(sundayDate));
                
                break;
                
            case tuesday:
                
                //monday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -1);
                mondayDate = calendar.getTime();
                
                mondayMonthString = dateFormatMonth.format(mondayDate);
                
                mondayDateLabel.setText(dateFormatDate.format(mondayDate));
                
                //tuesday
                tuesdayDateLabel.setText(todayDate);
                
                tuesdayDate = date;
                
                tuesdayMonthString = dateFormatMonth.format(date);
                
                //wednesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 1);
                wednesdayDate = calendar.getTime();
 
                wednesdayMonthString = dateFormatMonth.format(wednesdayDate);
                
                wednesdayDateLabel.setText(dateFormatDate.format(wednesdayDate));
                
                //thursday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 2);
                thursdayDate = calendar.getTime();

                thursdayMonthString = dateFormatMonth.format(thursdayDate);
                
                thursdayDateLabel.setText(dateFormatDate.format(thursdayDate));
                
                //friday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 3);
                fridayDate = calendar.getTime();

                fridayMonthString = dateFormatMonth.format(fridayDate);
                
                fridayDateLabel.setText(dateFormatDate.format(fridayDate));
                
                //saturday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 4);
                saturdayDate = calendar.getTime();

                saturdayMonthString = dateFormatMonth.format(saturdayDate);
                
                saturdayDateLabel.setText(dateFormatDate.format(saturdayDate));
                
                //sunday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 5);
                sundayDate = calendar.getTime();

                sundayMonthString = dateFormatMonth.format(sundayDate);
                
                sundayDateLabel.setText(dateFormatDate.format(sundayDate));
                
                break;
                
            case wednesday:
                
                //monday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -2);
                mondayDate = calendar.getTime();
                
                mondayMonthString = dateFormatMonth.format(mondayDate);
                
                mondayDateLabel.setText(dateFormatDate.format(mondayDate));
                
                //tuesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -1);
                tuesdayDate = calendar.getTime();
  
                tuesdayMonthString = dateFormatMonth.format(tuesdayDate);
                
                tuesdayDateLabel.setText(dateFormatDate.format(tuesdayDate));
                
                //wednesday
                wednesdayDateLabel.setText(todayDate);
                
                wednesdayDate = date;
                
                wednesdayMonthString = dateFormatMonth.format(date);
                
                //thursday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 1);
                thursdayDate = calendar.getTime();

                thursdayMonthString = dateFormatMonth.format(thursdayDate);
                
                thursdayDateLabel.setText(dateFormatDate.format(thursdayDate));
                
                //friday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 2);
                fridayDate = calendar.getTime();

                fridayMonthString = dateFormatMonth.format(fridayDate);
                
                fridayDateLabel.setText(dateFormatDate.format(fridayDate));
                
                //saturday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 3);
                saturdayDate = calendar.getTime();

                saturdayMonthString = dateFormatMonth.format(saturdayDate);
                
                saturdayDateLabel.setText(dateFormatDate.format(saturdayDate));
                
                //sunday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 4);
                sundayDate = calendar.getTime();

                sundayMonthString = dateFormatMonth.format(sundayDate);
                
                sundayDateLabel.setText(dateFormatDate.format(sundayDate));
                
                break;
                
            case thursday:
               
                //monday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -3);
                mondayDate = calendar.getTime();
                
                mondayMonthString = dateFormatMonth.format(mondayDate);
                
                mondayDateLabel.setText(dateFormatDate.format(mondayDate));
                
                //tuesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -2);
                tuesdayDate = calendar.getTime();

                tuesdayMonthString = dateFormatMonth.format(tuesdayDate);
                
                tuesdayDateLabel.setText(dateFormatDate.format(tuesdayDate));
                
                //wednesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -1);
                wednesdayDate = calendar.getTime();

                wednesdayMonthString = dateFormatMonth.format(wednesdayDate);
                
                wednesdayDateLabel.setText(dateFormatDate.format(wednesdayDate));
                
                //thursday
                thursdayDateLabel.setText(todayDate);
                
                thursdayDate = date;
                
                thursdayMonthString = dateFormatMonth.format(date);
                
                //friday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 1);
                fridayDate = calendar.getTime();

                fridayMonthString = dateFormatMonth.format(fridayDate);
                
                fridayDateLabel.setText(dateFormatDate.format(fridayDate));
                
                //saturday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 2);
                saturdayDate = calendar.getTime();

                saturdayMonthString = dateFormatMonth.format(saturdayDate);
                
                saturdayDateLabel.setText(dateFormatDate.format(saturdayDate));
                
                //sunday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 3);
                sundayDate = calendar.getTime();

                sundayMonthString = dateFormatMonth.format(sundayDate);
                
                sundayDateLabel.setText(dateFormatDate.format(sundayDate));
                
                break;
            
            case friday:
               
                //monday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -4);
                mondayDate = calendar.getTime();
                
                mondayMonthString = dateFormatMonth.format(mondayDate);
                
                mondayDateLabel.setText(dateFormatDate.format(mondayDate));
                
                //tuesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -3);
                tuesdayDate = calendar.getTime();

                tuesdayMonthString = dateFormatMonth.format(tuesdayDate);
                
                tuesdayDateLabel.setText(dateFormatDate.format(tuesdayDate));
                
                //wednesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -2);
                wednesdayDate = calendar.getTime();
                
                wednesdayMonthString = dateFormatMonth.format(wednesdayDate);
                
                wednesdayDateLabel.setText(dateFormatDate.format(wednesdayDate));
                
                //thursday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -1);
                thursdayDate = calendar.getTime();

                thursdayMonthString = dateFormatMonth.format(thursdayDate);
                
                thursdayDateLabel.setText(dateFormatDate.format(thursdayDate));
                
                //friday
                fridayDateLabel.setText(todayDate);
                
                fridayDate = date;
                
                fridayMonthString = dateFormatMonth.format(date);
                
                //saturday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 1);
                saturdayDate = calendar.getTime();

                saturdayMonthString = dateFormatMonth.format(saturdayDate);
                
                saturdayDateLabel.setText(dateFormatDate.format(saturdayDate));
                
                //sunday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 2);
                sundayDate = calendar.getTime();
                
                sundayMonthString = dateFormatMonth.format(sundayDate);
                
                sundayDateLabel.setText(dateFormatDate.format(sundayDate));
                
                break;
                
            case saturday:
               
                //monday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -5);
                mondayDate = calendar.getTime();
                
                mondayMonthString = dateFormatMonth.format(mondayDate);
                
                mondayDateLabel.setText(dateFormatDate.format(mondayDate));
                
                //tuesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -4);
                tuesdayDate = calendar.getTime();
                
                tuesdayMonthString = dateFormatMonth.format(tuesdayDate);
                
                tuesdayDateLabel.setText(dateFormatDate.format(tuesdayDate));
                
                //wednesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -3);
                wednesdayDate = calendar.getTime();

                wednesdayMonthString = dateFormatMonth.format(wednesdayDate);
                
                wednesdayDateLabel.setText(dateFormatDate.format(wednesdayDate));
                
                //thursday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -2);
                thursdayDate = calendar.getTime();
                
                thursdayMonthString = dateFormatMonth.format(thursdayDate);
                
                thursdayDateLabel.setText(dateFormatDate.format(thursdayDate));
                
                //friday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -1);
                fridayDate = calendar.getTime();
                
                fridayMonthString = dateFormatMonth.format(fridayDate);
                
                fridayDateLabel.setText(dateFormatDate.format(fridayDate));
                
                //saturday
                saturdayDateLabel.setText(todayDate);
                
                saturdayDate = date;
                
                saturdayMonthString = dateFormatMonth.format(date);
                
                //sunday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, 1);
                sundayDate = calendar.getTime();
                
                sundayMonthString = dateFormatMonth.format(sundayDate);
                
                sundayDateLabel.setText(dateFormatDate.format(sundayDate));
                
                break;
            
            case sunday:
               
                //monday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -6);
                mondayDate = calendar.getTime();
                
                mondayMonthString = dateFormatMonth.format(mondayDate);
                
                mondayDateLabel.setText(dateFormatDate.format(mondayDate));
                
                //tuesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -5);
                tuesdayDate = calendar.getTime();
                
                tuesdayMonthString = dateFormatMonth.format(tuesdayDate);
                
                tuesdayDateLabel.setText(dateFormatDate.format(tuesdayDate));
                
                //wednesday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -4);
                wednesdayDate = calendar.getTime();
                
                wednesdayMonthString = dateFormatMonth.format(wednesdayDate);
                
                wednesdayDateLabel.setText(dateFormatDate.format(wednesdayDate));
                
                //thursday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -3);
                thursdayDate = calendar.getTime();
                
                thursdayMonthString = dateFormatMonth.format(thursdayDate);
                
                thursdayDateLabel.setText(dateFormatDate.format(thursdayDate));
                
                //friday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -2);
                fridayDate = calendar.getTime();
                
                fridayMonthString = dateFormatMonth.format(fridayDate);
                
                fridayDateLabel.setText(dateFormatDate.format(fridayDate));
                
                //saturday
                calendar.setTime(date);
                calendar.add(Calendar.DATE, -1);
                saturdayDate = calendar.getTime();
 
                saturdayMonthString = dateFormatMonth.format(saturdayDate);
                
                saturdayDateLabel.setText(dateFormatDate.format(saturdayDate));
                
                //sunday
                sundayDateLabel.setText(todayDate);
                
                sundayDate = date;
                
                sundayMonthString = dateFormatMonth.format(date);
                
                break;
        }

        fixButtonColors();
        
    }
    
    private void fixButtonColors() {
        
        if (!activeDay.equals(monday))
        {
            this.mondayPanel.setBackground(buttonBackground);
            this.mondayDateLabel.setForeground(buttonTextDark);
            this.mondayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.mondayPanel.setBackground(buttonHover);
            this.mondayDateLabel.setForeground(buttonHoverText);
            this.mondayLabel.setForeground(buttonHoverText);
        }
        
        if (!activeDay.equals(tuesday))
        {
            this.tuesdayPanel.setBackground(buttonBackground);
            this.tuesdayDateLabel.setForeground(buttonTextDark);
            this.tuesdayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.tuesdayPanel.setBackground(buttonHover);
            this.tuesdayDateLabel.setForeground(buttonHoverText);
            this.tuesdayLabel.setForeground(buttonHoverText);
        }
        
        if (!activeDay.equals(wednesday))
        {
            this.wednesdayPanel.setBackground(buttonBackground);
            this.wednesdayDateLabel.setForeground(buttonTextDark);
            this.wednesdayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.wednesdayPanel.setBackground(buttonHover);
            this.wednesdayDateLabel.setForeground(buttonHoverText);
            this.wednesdayLabel.setForeground(buttonHoverText);
        }
        
        if (!activeDay.equals(thursday))
        {
            this.thursdayPanel.setBackground(buttonBackground);
            this.thursdayDateLabel.setForeground(buttonTextDark);
            this.thursdayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.thursdayPanel.setBackground(buttonHover);
            this.thursdayDateLabel.setForeground(buttonHoverText);
            this.thursdayLabel.setForeground(buttonHoverText);
        }
        
        if (!activeDay.equals(friday))
        {
            this.fridayPanel.setBackground(buttonBackground);
            this.fridayDateLabel.setForeground(buttonTextDark);
            this.fridayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.fridayPanel.setBackground(buttonHover);
            this.fridayDateLabel.setForeground(buttonHoverText);
            this.fridayLabel.setForeground(buttonHoverText);
        }
        
        if (!activeDay.equals(saturday))
        {
            this.saturdayPanel.setBackground(buttonBackground);
            this.saturdayDateLabel.setForeground(buttonTextDark);
            this.saturdayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.saturdayPanel.setBackground(buttonHover);
            this.saturdayDateLabel.setForeground(buttonHoverText);
            this.saturdayLabel.setForeground(buttonHoverText);
        }
        
        if (!activeDay.equals(sunday))
        {
            this.sundayPanel.setBackground(buttonBackground);
            this.sundayDateLabel.setForeground(buttonTextDark);
            this.sundayLabel.setForeground(buttonTextLight);
        }
        else
        {
            this.sundayPanel.setBackground(buttonHover);
            this.sundayDateLabel.setForeground(buttonHoverText);
            this.sundayLabel.setForeground(buttonHoverText);
        }
        
    }
    
    //goes through the events in user and displays them if they match the selected date
    public void loadEvents(){
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        this.eventListingPanel.removeAll();
        
        for (Event event: user.getCalendar()) 
        {    
            String eventDate = dateFormat.format(event.getDate());
            String calendarDate = dateFormat.format(date);
            
            if (eventDate.equals(calendarDate))
            {
                EventsPanel eventPanel = new EventsPanel(user, event);
                
                this.eventListingPanel.add(eventPanel);
            }            
        }
        
        this.eventListingPanel.revalidate();
        this.eventListingPanel.repaint(); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JPanel dateSelectionPanel;
    private javax.swing.JLabel enterDateLabel;
    private javax.swing.JPanel eventListingPanel;
    private javax.swing.JScrollPane eventListingScroll;
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JLabel eventsPanelIcon;
    private javax.swing.JLabel eventsPanelLabel;
    private javax.swing.JLabel fridayDateLabel;
    private javax.swing.JLabel fridayLabel;
    private javax.swing.JPanel fridayPanel;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel mondayDateLabel;
    private javax.swing.JLabel mondayLabel;
    private javax.swing.JPanel mondayPanel;
    private javax.swing.JButton newEventButton;
    private javax.swing.JLabel saturdayDateLabel;
    private javax.swing.JLabel saturdayLabel;
    private javax.swing.JPanel saturdayPanel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JLabel sundayDateLabel;
    private javax.swing.JLabel sundayLabel;
    private javax.swing.JPanel sundayPanel;
    private javax.swing.JLabel thursdayDateLabel;
    private javax.swing.JLabel thursdayLabel;
    private javax.swing.JPanel thursdayPanel;
    private javax.swing.JLabel tuesdayDateLabel;
    private javax.swing.JLabel tuesdayLabel;
    private javax.swing.JPanel tuesdayPanel;
    private javax.swing.JLabel wednesdayDateLabel;
    private javax.swing.JLabel wednesdayLabel;
    private javax.swing.JPanel wednesdayPanel;
    private javax.swing.JButton weekBackButton;
    private javax.swing.JButton weekForwardButton;
    private javax.swing.JLabel weekLabel;
    private javax.swing.JPanel weekPickerPanel;
    // End of variables declaration//GEN-END:variables
}