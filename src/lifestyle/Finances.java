
package lifestyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Finances implements  Serializable
{
    ArrayList<Transaction> transactions = new ArrayList<>();
    ArrayList<Transaction> recurringTransactions = new ArrayList<>();
    
    double  budget,
            monthlySpending,
            weeklySpending,
            weeklyIncome,
            monthlyIncome;

    public Finances(){}
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Transaction> getRecurringTransactions() {
        return recurringTransactions;
    }

    public void setRecurringTransactions(ArrayList<Transaction> recurringTransactions) {
        this.recurringTransactions = recurringTransactions;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMonthlySpending() {
        return monthlySpending;
    }

    public void setMonthlySpending(double monthlySpending) {
        this.monthlySpending = monthlySpending;
    }

    public double getWeeklySpending() {
        return weeklySpending;
    }

    public void setWeeklySpending(double weeklySpending) {
        this.weeklySpending = weeklySpending;
    }

    public double getWeeklyIncome() {
        return weeklyIncome;
    }

    public void setWeeklyIncome(double weeklyIncome) {
        this.weeklyIncome = weeklyIncome;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    
    public void addTransaction(Transaction transaction)
    {
        this.transactions.add(transaction);
    }
    
    public void removeTransaction(Transaction transaction)
    {
        transactions.remove(transaction);
    }
    
    public void updateTransaction(Transaction transaction, Transaction newTransaction)
    {
        this.transactions.remove(transaction);
        this.transactions.add(newTransaction);
    }
    
    public void addRecurringTransaction(Transaction transaction)
    {
        this.recurringTransactions.add(transaction);
    }
    
    public void removeRecurringTransaction(Transaction transaction)
    {
        recurringTransactions.remove(transaction);
    }
    
    public void updateRecurringTransaction(Transaction transaction, Transaction newTransaction)
    {
        this.recurringTransactions.remove(transaction);
        this.recurringTransactions.add(newTransaction);
    }
    
}
