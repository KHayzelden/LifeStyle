package lifestyle;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable
{

    String reason, detail;
    Double amount;
    Event event;
    Reminder reminder;
    Date completedDate;
    Boolean isIncome, isRecurring;

    Date lastRecurred;
    String frequency;

    public Transaction(String reason, String detail, Double amount, Event event) {
        this.reason = reason;
        this.detail = detail;
        this.amount = amount;
        this.event = event;

        this.isRecurring = false;
    }

    public Transaction(String reason, String detail, Double amount, Reminder reminder) {
        this.reason = reason;
        this.detail = detail;
        this.amount = amount;
        this.reminder = reminder;

        this.isRecurring = false;
    }

    public Transaction(String reason, String detail, Double amount) {
        this.reason = reason;
        this.detail = detail;
        this.amount = amount;

        this.isIncome = false;
        this.isRecurring = false;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Boolean getIsIncome() {
        return isIncome;
    }

    public void setIsIncome(Boolean isIncome) {
        this.isIncome = isIncome;
    }

    public Boolean getIsRecurring() {
        return isRecurring;
    }

    public void setIsRecurring(Boolean isRecurring) {
        this.isRecurring = isRecurring;
    }

    public Date getLastRecurred() {
        return lastRecurred;
    }

    public void setLastRecurred(Date lastRecurred) {
        this.lastRecurred = lastRecurred;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
