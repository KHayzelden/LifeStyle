
package lifestyle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class EventsPanel extends javax.swing.JPanel {

    User user ;
    Event event;
    
    public EventsPanel(User user, Event event)
    {
        this.user = user;
        this.event = event;
        
        initComponents();
        
        eventName.setText(event.getName());
        
        if(!event.getHasCost())
        {
            eventCost.setVisible(false);
        }
        
        if(!event.getHasAttachments())
        {
            eventAttachments.setVisible(false);
        }   
        
        if(event.getHasTime())
        {
            DateFormat timeFormat = new SimpleDateFormat ("hh:mm");
            
            eventTime.setText(timeFormat.format(event.getTime()));
        }
        else
        {
            eventTime.setText("");
        }
    }
    
    public EventsPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eventName = new javax.swing.JLabel();
        eventAttachments = new javax.swing.JLabel();
        eventCost = new javax.swing.JLabel();
        eventTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5), javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2)));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        eventName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        eventName.setForeground(new java.awt.Color(255, 255, 255));
        eventName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Calendar_20px.png"))); // NOI18N
        eventName.setText("Event Name / Description");
        eventName.setToolTipText("");
        eventName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eventClicked(evt);
            }
        });

        eventAttachments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventAttachments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-attach_filled.png"))); // NOI18N
        eventAttachments.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        eventCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventCost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Coins_20px.png"))); // NOI18N
        eventCost.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        eventTime.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        eventTime.setForeground(new java.awt.Color(255, 255, 255));
        eventTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eventTime.setText("XX:XX");
        eventTime.setToolTipText("");
        eventTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eventTimeeventClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eventName, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventTime, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventCost, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventAttachments, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventCost)
                    .addComponent(eventAttachments)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eventTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eventClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventClicked
        
        new DetailsWindow(user, "Event", event).setVisible(true);
        
    }//GEN-LAST:event_eventClicked

    private void eventTimeeventClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventTimeeventClicked
       
    }//GEN-LAST:event_eventTimeeventClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eventAttachments;
    private javax.swing.JLabel eventCost;
    private javax.swing.JLabel eventName;
    private javax.swing.JLabel eventTime;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
