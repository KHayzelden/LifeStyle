
package lifestyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;

public class User implements  Serializable
{
    String username;
    String passwordHash;
    
    UUID userID;
    
    ArrayList<Event> calendar = new ArrayList<>();
    ArrayList<Reminder> reminders = new ArrayList<>();
    ArrayList<Reminder> completeReminders = new ArrayList<>();
    ArrayList<Contact> contacts = new ArrayList<>();
    
    Finances finances = new Finances();

    public User(String username, String passwordHash)
    {
        this.username = username;
        this.passwordHash = passwordHash;
        
        userID = UUID.randomUUID();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return passwordHash;
    }

    public void setPassword(String password) {
        this.passwordHash = password;
    }
    
    public ArrayList<Event> getCalendar() {
        return calendar;
    }
    
    public void addEvent (Event event)
    {
        this.calendar.add(event);
    }
    
    public void removeEvent (Event event)
    {
        calendar.remove(event);
        
        if(event.getHasCost() && event.getIsComplete())
        {
            this.finances.removeTransaction(event.getTransaction());
        }
    }
    
    public void editEvent (Event event, Event newEvent)
    {
        if(newEvent.getIsComplete() && newEvent.getHasCost())
        {
            Transaction transaction = new Transaction ("event", newEvent.getName(), newEvent.getCost(), newEvent);
            transaction.setCompletedDate(event.getDate());
            transaction.setIsIncome(event.getCostIsIncome());

            newEvent.setTransaction(transaction);

            finances.addTransaction(transaction);
        }
        
        calendar.remove(event);
        calendar.add(newEvent);

    }
    
    public ArrayList<Reminder> getReminders() {
        return reminders;
    }
    
    public void addReminder (Reminder reminder)
    {
        this.reminders.add(reminder);
    }
    
    public void removeReminder (Reminder reminder)
    {
        reminders.remove(reminder);
    }

    public void editReminder (Reminder reminder, Reminder newReminder)
    {
        reminders.remove(reminder);
        reminders.add(newReminder);
    }
    
    public void completeReminder (Reminder reminder)
    {
        reminders.remove(reminder);
        
        //updates the reminder's information before moving it to the completed list
        reminder.setType("complete");
        reminder.setIsComplete(true);
        reminder.setCompletedDate(new Date());
        
        if(reminder.hasCost)
        {
            Transaction transaction = new Transaction ("reminder", reminder.getName(), reminder.getCost(), reminder);
            transaction.setCompletedDate(new Date());
            transaction.setIsIncome(reminder.getCostIsIncome());

            reminder.setTransaction(transaction);

            finances.addTransaction(transaction);
        }

        completeReminders.add(reminder);
    }
    
    public ArrayList<Contact> getContacts() 
    {
        return contacts;
    }
    
    public void addContact (Contact contact)
    {
        this.contacts.add(contact);
        Collections.sort(contacts);
    }
    
    public void removeContact (Contact contact)
    {
        contacts.remove(contact);
    }
    
    public void editContact (Contact contact, Contact newContact)
    {
        contacts.remove(contact);
        contacts.add(newContact);
        Collections.sort(contacts);
    }
            
    public Finances getFinances() {
        return finances;
    }

    public ArrayList<Reminder> getCompleteReminders() {
        return completeReminders;
    }

    public UUID getUserID() {
        return userID;
    }
    
    
}
