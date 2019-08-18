
package lifestyle;

import java.awt.Color;
import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DetailsWindow extends javax.swing.JFrame {

    Color buttonHoverBackground = new Color(102,153,255);
    Color buttonBackground = new Color(51,102,204);
    Color addButtonBackground = new Color(0,51,153);
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat timeFormat = new SimpleDateFormat("HH:mm");
    
    DecimalFormat costFormat = new DecimalFormat("#.00");

    Boolean newItem = false, hasCost = false, isIncome = false;
    
    String type;
    
    User user ;
    Reminder reminder;
    Event event;
    Date date;
    
    Boolean hasAttachments = false;
    
    ArrayList<String> attachments = new ArrayList<>();
    
    //the constructor for a new event or user, the string is used to determine which 
    //type it is. The string type is used to eliminate as much repetative code as possible
    public DetailsWindow(User user, String type)
    {
        this.user = user;
        
        newItem = true;
        this.type = type;
        
        initComponents();
        
        mainLabel.setText("New " + type);
        
        saveButton.setText("Save " + type);
        deleteButton.setText("Discard " + type);
    }

    //is the constructor for a new event specifically as it is pre populated by the selected date
    //from the calendar tab
    public DetailsWindow(User user, String type, Date date)
    {
        this.user = user;
        this.date = date;
        
        newItem = true;
        this.type = type;
        
        initComponents();

        dateField.setText(dateFormat.format(date));
        
        mainLabel.setText("New " + type);
        
        saveButton.setText("Save " + type);
        deleteButton.setText("Discard " + type);
    }
    
    //the constructor for editing a reminder, where the original reminder is provided
    //and any known details of said reminder are populated for the user to view and edit
    public DetailsWindow(User user, String type, Reminder reminder)
    {
        this.user = user;
        this.type = type;
        this.reminder = reminder;
        
        initComponents();
         
        if(reminder.getType().equals("complete"))
        {
            saveButton.setVisible(false);
            deleteButton.setVisible(false);
            
            nameField.setEditable(false);
            dateField.setEditable(false);
            timeField.setEditable(false);
            locationField.setEditable(false);
            detailsField.setEditable(false);
            costButton.setEnabled(false);
            costField.setEditable(false);
        }
        
        mainLabel.setText(type + " Details");
        
        saveButton.setText("Save Changes");
        deleteButton.setText("Delete " + type);
        
        nameField.setText(reminder.getName());
        if(reminder.getHasDate()) {dateField.setText(dateFormat.format(reminder.getDate()));}
        if(reminder.getHasTime()) {timeField.setText(timeFormat.format(reminder.getTime()));}
        locationField.setText(reminder.getLocation());
        detailsField.setText(reminder.getDetails());
        
        if (reminder.getHasCost())
        {
            hasCost = true;
            
            costButton.setText("✓");
            costButton.setBackground(addButtonBackground);
            
            costField.setEnabled(true);
            costField.setText(costFormat.format(reminder.getCost()));
            
            incomeButton.setEnabled(true);
            
            if (reminder.getCostIsIncome())
            {
                isIncome = true;

                incomeButton.setText("✓");
                incomeButton.setBackground(addButtonBackground);
            }
        }
        
        if(reminder.getHasAttachments())
        {
            hasAttachments = true;
            
            attachments = reminder.getAttachments();
            
            filesButton.setEnabled(true);
            filesButton.setBackground(addButtonBackground);
            
            if(attachments.size() == 1)
            {
                filesButton.setText("1 Attached File");
            }
            else
            {
                filesButton.setText(attachments.size() + " Attached Files");
            }
        }
    }
    
    //the constructor for editing and event, where the original event is provided
    //and any known details of said event are populated for the user to view and edit
    public DetailsWindow(User user, String type, Event event)
    {
        this.user = user;
        this.type = type;
        this.event = event;
        this.date = event.getDate();
        
        initComponents();
        
        dateField.setText(dateFormat.format(date));
        
        mainLabel.setText(type + " Details");
        
        saveButton.setText("Save Changes");
        deleteButton.setText("Delete " + type);
        
        nameField.setText(event.getName());
        
        if(event.getHasTime()) {timeField.setText(timeFormat.format(event.getTime()));}
        if(event.getHasLocation()) {locationField.setText(event.getLocation());}
        if(event.getHasDetails()) {detailsField.setText(event.getDetails());}
        
        if (event.getHasCost())
        {
            hasCost = true;
            
            costButton.setText("✓");
            costButton.setBackground(addButtonBackground);
            
            costField.setEnabled(true);
            costField.setText(costFormat.format(event.getCost()));
            
            incomeButton.setEnabled(true);
            
            if (event.getCostIsIncome())
            {
                isIncome = true;

                incomeButton.setText("✓");
                incomeButton.setBackground(addButtonBackground);
            }
        }
        
        if(event.getHasAttachments())
        {
            hasAttachments = true;
            
            attachments = event.getAttachments();
            
            filesButton.setEnabled(true);
            filesButton.setBackground(addButtonBackground);
            
            if(attachments.size() == 1)
            {
                filesButton.setText("1 Attached File");
            }
            else
            {
                filesButton.setText(attachments.size() + " Attached Files");
            }    
        }
    }
    
    
    public DetailsWindow() 
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
        timeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        filesLabel = new javax.swing.JLabel();
        enterDateLabel5 = new javax.swing.JLabel();
        enterDateLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        costField = new javax.swing.JTextField();
        costButton = new javax.swing.JButton();
        addFileButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsField = new javax.swing.JTextArea();
        incomeLabel = new javax.swing.JLabel();
        incomeButton = new javax.swing.JButton();
        incomeLabel2 = new javax.swing.JLabel();
        filesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(0, 0));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(464, 413));
        backgroundPanel.setSize(new java.awt.Dimension(464, 413));

        mainLabel.setBackground(new java.awt.Color(255, 255, 255));
        mainLabel.setFont(new java.awt.Font("Affectionately Yours", 0, 48)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 51, 153));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("xxxxxxxx Details");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 51, 153));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Name : ");

        dateLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 51, 153));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Date : ");

        timeLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(0, 51, 153));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        timeLabel.setText("Time : ");

        locationLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(0, 51, 153));
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        locationLabel.setText("Location : ");

        filesLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        filesLabel.setForeground(new java.awt.Color(0, 51, 153));
        filesLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        filesLabel.setText("Files : ");

        enterDateLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterDateLabel5.setForeground(new java.awt.Color(0, 51, 153));
        enterDateLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enterDateLabel5.setText("Cost : ");

        enterDateLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterDateLabel6.setForeground(new java.awt.Color(0, 51, 153));
        enterDateLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enterDateLabel6.setText("Details : ");

        nameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 153, 255));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
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

        timeField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        timeField.setForeground(new java.awt.Color(255, 153, 204));
        timeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        timeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timeChanged(evt);
            }
        });

        locationField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        locationField.setForeground(new java.awt.Color(102, 153, 255));
        locationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        locationField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        locationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locationChanged(evt);
            }
        });

        costField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        costField.setForeground(new java.awt.Color(102, 153, 255));
        costField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        costField.setEnabled(false);
        costField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costChanged(evt);
            }
        });

        costButton.setBackground(new java.awt.Color(255, 255, 255));
        costButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        costButton.setForeground(new java.awt.Color(255, 255, 255));
        costButton.setToolTipText("");
        costButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        costButton.setContentAreaFilled(false);
        costButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        costButton.setMaximumSize(new java.awt.Dimension(10, 10));
        costButton.setMinimumSize(new java.awt.Dimension(10, 10));
        costButton.setOpaque(true);
        costButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCostButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCostButtonHover(evt);
            }
        });
        costButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costButtonActionPerformed(evt);
            }
        });

        addFileButton.setBackground(new java.awt.Color(0, 51, 153));
        addFileButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addFileButton.setForeground(new java.awt.Color(255, 255, 255));
        addFileButton.setText("+");
        addFileButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        addFileButton.setContentAreaFilled(false);
        addFileButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addFileButton.setMaximumSize(new java.awt.Dimension(10, 10));
        addFileButton.setMinimumSize(new java.awt.Dimension(10, 10));
        addFileButton.setOpaque(true);
        addFileButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        addFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addFileButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addFileButtonHover(evt);
            }
        });
        addFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileButtonActionPerformed(evt);
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

        detailsField.setColumns(20);
        detailsField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        detailsField.setForeground(new java.awt.Color(102, 153, 255));
        detailsField.setLineWrap(true);
        detailsField.setRows(5);
        detailsField.setWrapStyleWord(true);
        detailsField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                detailsChanged(evt);
            }
        });
        jScrollPane1.setViewportView(detailsField);

        incomeLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        incomeLabel.setForeground(new java.awt.Color(0, 51, 153));
        incomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        incomeLabel.setText("Income : ");

        incomeButton.setBackground(new java.awt.Color(255, 255, 255));
        incomeButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        incomeButton.setForeground(new java.awt.Color(255, 255, 255));
        incomeButton.setToolTipText("");
        incomeButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        incomeButton.setContentAreaFilled(false);
        incomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        incomeButton.setEnabled(false);
        incomeButton.setMaximumSize(new java.awt.Dimension(10, 10));
        incomeButton.setMinimumSize(new java.awt.Dimension(10, 10));
        incomeButton.setOpaque(true);
        incomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                incomeButtonaddCostButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                incomeButtonaddCostButtonHover(evt);
            }
        });
        incomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeButtonActionPerformed(evt);
            }
        });

        incomeLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        incomeLabel2.setForeground(new java.awt.Color(0, 51, 153));
        incomeLabel2.setText("* Tick if money is coming in, not out");

        filesButton.setBackground(new java.awt.Color(204, 204, 204));
        filesButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        filesButton.setForeground(new java.awt.Color(255, 255, 255));
        filesButton.setText("No Attachments");
        filesButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));
        filesButton.setContentAreaFilled(false);
        filesButton.setEnabled(false);
        filesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        filesButton.setMaximumSize(new java.awt.Dimension(10, 10));
        filesButton.setMinimumSize(new java.awt.Dimension(10, 10));
        filesButton.setOpaque(true);
        filesButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        filesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filesButtonHoverLeft(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filesButtonHover(evt);
            }
        });
        filesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filesButtonActionPerformed(evt);
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
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField))
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterDateLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterDateLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(filesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(incomeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeField)
                            .addComponent(locationField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addFileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(costButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(incomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(incomeLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(45, 45, 45))
                                    .addComponent(costField)
                                    .addComponent(filesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filesLabel)
                    .addComponent(addFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterDateLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterDateLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
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
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(464, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //checks if the event or reminder already has a cost assigned, if so it will remove this cost and 
    //disable the field, resetting the window to no cost. If the event or reminder does not 
    //already have a cost, this will enable the cost field for the user to input a cost
    private void costButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costButtonActionPerformed
        
        if (!hasCost)
        {
            hasCost = true;
            
            costButton.setText("✓");
            costButton.setBackground(addButtonBackground);
            
            costField.setEnabled(true);
            
            incomeButton.setEnabled(true);
        }
        else
        {
            hasCost = false;
            
            costButton.setText("");
            costButton.setBackground(Color.white);
            
            costField.setText("");
            costField.setEnabled(false);
            
            incomeButton.setEnabled(false);

            isIncome = false;
            

            incomeButton.setText("");
            incomeButton.setBackground(Color.white);

        }
    }//GEN-LAST:event_costButtonActionPerformed

    //opens a file chooser window for the user to attach a file, any file type can be provided
    private void addFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileButtonActionPerformed
        
        File file = null;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        
        file = fileChooser.getSelectedFile();
        
        if (file != null)
        {
            attachments.add(file.getAbsolutePath());
            
            hasAttachments = true;
            
            filesButton.setEnabled(true);
            filesButton.setBackground(addButtonBackground);
            
            if(attachments.size() == 1)
            {
                filesButton.setText("1 Attached File");
            }
            else
            {
                filesButton.setText(attachments.size() + " Attached Files");
            }
        }
        
    }//GEN-LAST:event_addFileButtonActionPerformed

    private void saveButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonHoverLeft

        saveButton.setBackground(buttonBackground);

    }//GEN-LAST:event_saveButtonHoverLeft

    private void saveButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonHover

        saveButton.setBackground(buttonHoverBackground);

    }//GEN-LAST:event_saveButtonHover

    //checks that the name field is entered, as it is a required field for both reminders
    //and events. Then a switch is used to distinguish the event vs reminder. For each type a new object
    //is created, populated, then saved or edited based on the circumstance dictated by the constuctor that was called
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       
        if(nameField.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "Name is a required field.");
        }
        else
        {
            switch (type)
            {
                case "Reminder":

                    try 
                    {
                        Reminder newReminder = new Reminder (nameField.getText());
                        
                        if (!dateField.getText().equals(""))
                        {
                            Date date = dateFormat.parse(dateField.getText());
                            newReminder.setDate(date);
                            newReminder.setHasDate(true);
                            
                            if (!timeField.getText().equals(""))
                            {
                                Date time = timeFormat.parse(timeField.getText());
                                newReminder.setTime(time);
                                newReminder.setHasTime(true);
                            }
                            else
                            {
                                newReminder.setHasTime(false);
                            }
                        }
                        else
                        {
                            newReminder.setHasDate(false);
                            newReminder.setHasTime(false);
                        }
                       
 
                        newReminder.setLocation(locationField.getText());

                        if (hasAttachments)
                        {
                            newReminder.setAttachments(attachments);
                            newReminder.setHasAttachments(true);
                        }
                        else
                        {
                            newReminder.setHasAttachments(false);
                        }

                        newReminder.setDetails(detailsField.getText());
                        
                        //to categorize reminders as general or 
                        //ones with a date as timed for sorting
                        if (dateField.getText().equals(""))
                        {
                            newReminder.setType("general");
                        }
                        else 
                        {
                            newReminder.setType("date");
                        }

                        newReminder.setHasCost(hasCost);

                        if (hasCost)
                        {
                            double cost;
                            cost = Double.parseDouble(costField.getText());

                            newReminder.setCost(cost);
                            
                            if(isIncome)
                            {
                                newReminder.setCostIsIncome(true);
                            }
                            else
                            {
                                newReminder.setCostIsIncome(false);
                            }
                        }
                        
                        if(newItem)
                        {        
                            user.addReminder(newReminder);
                        }
                        else
                        {
                            user.editReminder(reminder, newReminder);   
                        }

                        this.dispose();
                    } 
                    catch (ParseException e) 
                    {
                        JOptionPane.showMessageDialog(null, "Date needs to be in the format of dd/MM/yyyy.");
                    }
                    
                    break;
                    
                case "Event": 

                    if (!dateField.getText().equals(""))
                    {

                        try 
                        {

                            Date date = dateFormat.parse(dateField.getText());
                            
                            Event newEvent = new Event (nameField.getText(), date);

                            if (!timeField.getText().equals(""))
                            {
                                Date time = timeFormat.parse(timeField.getText());
                                newEvent.setTime(time);
                                newEvent.setHasTime(true);
                            }
                            else
                            {
                                newEvent.setHasTime(false);
                            }

                            if (!locationField.getText().equals(""))
                            {
                                newEvent.setLocation(locationField.getText());
                                newEvent.setHasLocation(true);
                            }
                            else
                            {
                                newEvent.setHasLocation(false);
                            }
                            
                            if (!detailsField.getText().equals(""))
                            {
                                newEvent.setDetails(detailsField.getText());
                                newEvent.setHasDetails(true);
                            }
                            else
                            {
                                newEvent.setHasDetails(false);
                            }
                            
                            if (hasAttachments)
                            {
                                newEvent.setAttachments(attachments);
                                newEvent.setHasAttachments(true);
                            }
                            else
                            {
                                newEvent.setHasAttachments(false);
                            }

                            newEvent.setHasCost(hasCost);
                            
                            if (hasCost)
                            {
                                double cost;
                                cost = Double.parseDouble(costField.getText());

                                newEvent.setCost(cost);
                                
                                if(isIncome)
                                {
                                    newEvent.setCostIsIncome(true);
                                }
                                else
                                {
                                    newEvent.setCostIsIncome(false);
                                }
                            }

                            if(newItem)
                            {        
                                user.addEvent(newEvent);
                            }
                            else
                            {
                                user.editEvent(event, newEvent);   
                            }
                            
                            this.dispose();
                        } 
                        catch (ParseException e) 
                        {
                            JOptionPane.showMessageDialog(null, "Date must be in the format of dd/MM/yyyy.");
                        }
                    }
                        
                    break;
            }            
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonHoverLeft

        deleteButton.setBackground(buttonBackground);

    }//GEN-LAST:event_deleteButtonHoverLeft

    private void deleteButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonHover

        deleteButton.setBackground(buttonHoverBackground);

    }//GEN-LAST:event_deleteButtonHover

    //removes the event or user and confirms with the user
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(newItem)
        {
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Deleted.");
           
            if(type.equals("Reminder"))
            {
                user.removeReminder(reminder);
                
                this.dispose();
            }
            else
            {
                user.removeEvent(event);
                
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addFileButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileButtonHover
        
        addFileButton.setBackground(buttonHoverBackground);
        
    }//GEN-LAST:event_addFileButtonHover

    private void addFileButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFileButtonHoverLeft
        
        addFileButton.setBackground(addButtonBackground);

    }//GEN-LAST:event_addFileButtonHoverLeft

    private void addCostButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCostButtonHover
        
        if (!hasCost)
        {
            costButton.setText("✓");
        
            costButton.setBackground(buttonHoverBackground);
        }
    }//GEN-LAST:event_addCostButtonHover

    private void addCostButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCostButtonHoverLeft
        
        if(!hasCost)
        {
            costButton.setText("");
        
            costButton.setBackground(Color.white);
        }
    }//GEN-LAST:event_addCostButtonHoverLeft

    //the following methods validate the user input against a regex (or in the date's case, a set format of dd/MM/yyyy)
    //then deletes the last typed character automatically if it is not valid
    
    private void nameChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameChanged
        
        if(!nameField.getText().equals(""))
        {
            String text = nameField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9\\s]+"))
            {
                nameField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_nameChanged

    private void locationChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_locationChanged
        
        if(!locationField.getText().equals(""))
        {
            String text = locationField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9,\\s]+"))
            {
                locationField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_locationChanged

    private void detailsChanged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsChanged
        
        if(!detailsField.getText().equals(""))
        {
            String text = detailsField.getText();
            String lastChar = text.substring(text.length() - 1, text.length());

            if (!lastChar.matches("[a-zA-Z0-9.,()?!'\"@\\s]+"))
            {
                detailsField.setText(text.substring(0,text.length()-1));
            }   
        }
        
    }//GEN-LAST:event_detailsChanged

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

    private void timeChanged(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timeChanged
        
        if(!timeField.getText().equals(""))
        {
            String text = timeField.getText();
            
            String lastChar, minutes;
            
            switch(text.length())
            {
                case 1:
                    
                    try
                    {
                        Integer.parseInt(text);
                    }
                    catch (NumberFormatException e)
                    {
                        timeField.setText("");
                    }
                    
                    break;
                    
                case 2:
                    
                    try
                    {
                        Integer.parseInt(text);
                    }
                    catch (NumberFormatException e)
                    {
                        timeField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                    
                case 3:
                    
                    lastChar = text.substring(text.length() - 1, text.length());
                    
                    if (!lastChar.equals(":"))
                    {
                        timeField.setText(text.substring(0,text.length()-1));
                    }  
                
                    break;
                    
                case 4:
                    
                    minutes = text.substring(text.length() - 1, text.length());
                    
                    try
                    {
                        Integer.parseInt(minutes);
                    }
                    catch (NumberFormatException e)
                    {
                        timeField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                    
                case 5:
                    
                    minutes = text.substring(text.length() - 2, text.length());
                    
                    try
                    {
                        Integer.parseInt(minutes);
                    }
                    catch (NumberFormatException e)
                    {
                        timeField.setText(text.substring(0,text.length()-1));
                    }
                    
                    break;
                    
                case 6:
                    
                    timeField.setText(text.substring(0,text.length()-1));
                    
                    break;  
            }
        }
    }//GEN-LAST:event_timeChanged

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
    
    private void incomeButtonaddCostButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeButtonaddCostButtonHoverLeft

        if(!isIncome)
        {
            incomeButton.setText("");

            incomeButton.setBackground(Color.white);
        }
    }//GEN-LAST:event_incomeButtonaddCostButtonHoverLeft

    private void incomeButtonaddCostButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeButtonaddCostButtonHover

        if (!isIncome)
        {
            incomeButton.setText("✓");

            incomeButton.setBackground(buttonHoverBackground);
        }
    }//GEN-LAST:event_incomeButtonaddCostButtonHover

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

    private void filesButtonHoverLeft(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesButtonHoverLeft
        
        if (filesButton.isEnabled())
        {
            filesButton.setBackground(addButtonBackground);
        }
        
    }//GEN-LAST:event_filesButtonHoverLeft

    private void filesButtonHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesButtonHover
        
        if (filesButton.isEnabled())
        {
            filesButton.setBackground(buttonHoverBackground);
        }
        
    }//GEN-LAST:event_filesButtonHover

    private void filesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filesButtonActionPerformed
        
        switch (type)
        {
            case "Reminder":
                
                new FileListing(user, reminder).setVisible(true);
                
                break;
                
            case "Event":
                
                
                new FileListing(user, event).setVisible(true);
                
                break;
        }
        
    }//GEN-LAST:event_filesButtonActionPerformed
  
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
            java.util.logging.Logger.getLogger(DetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFileButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton costButton;
    private javax.swing.JTextField costField;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea detailsField;
    private javax.swing.JLabel enterDateLabel5;
    private javax.swing.JLabel enterDateLabel6;
    private javax.swing.JButton filesButton;
    private javax.swing.JLabel filesLabel;
    private javax.swing.JButton incomeButton;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JLabel incomeLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField timeField;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}