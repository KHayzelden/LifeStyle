package lifestyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Event implements  Serializable
{

    static int id = 1;

    String name, location, details;
    Date date, time, completedDate;
    Double cost;
    Boolean hasCost, hasTime, hasLocation, hasDetails, hasAttachments, 
            isComplete, costIsIncome, hasContacts;
    
    Transaction transaction;

    ArrayList<String> attachments = new ArrayList();
    ArrayList<Contact> contacts = new ArrayList();
    
    int eventID;

    public Event(String name, Date date) {
        eventID = id;
        id++;

        isComplete = false; 
        costIsIncome = false;
        hasAttachments = false;
        hasContacts = false;
        
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getHasCost() {
        return hasCost;
    }

    public void setHasCost(Boolean hasCost) {
        this.hasCost = hasCost;
    }

    public Boolean getHasTime() {
        return hasTime;
    }

    public void setHasTime(Boolean hasTime) {
        this.hasTime = hasTime;
    }

    public int getEventID() {
        return eventID;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getHasLocation() {
        return hasLocation;
    }

    public void setHasLocation(Boolean hasLocation) {
        this.hasLocation = hasLocation;
    }

    public Boolean getHasDetails() {
        return hasDetails;
    }

    public void setHasDetails(Boolean hasDetails) {
        this.hasDetails = hasDetails;
    }

    public Boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Boolean getCostIsIncome() {
        return costIsIncome;
    }

    public void setCostIsIncome(Boolean costIsIncome) {
        this.costIsIncome = costIsIncome;
    }

    public Boolean getHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public ArrayList<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(ArrayList<String> attachments) {
        this.attachments = attachments;
    }
    
    public void removeAttachment (String attachment)
    {
        attachments.remove(attachment);
        
        if(attachments.isEmpty())
        {
            hasAttachments = false;
        }
    }

    public Boolean getHasContacts() {
        return hasContacts;
    }

    public void setHasContacts(Boolean hasContacts) {
        this.hasContacts = hasContacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public void removeContact (Contact contact)
    {
        contacts.remove(contact);
        
        if(contacts.isEmpty())
        {
            hasContacts = false;
        }
    }

}
