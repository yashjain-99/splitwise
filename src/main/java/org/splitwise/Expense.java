package org.splitwise;

import java.util.List;

public class Expense {
    private User payedBy;
    private double amount;
    private String description;
    private SplitType splitType;
    private List<Split> splits;
    public Expense(User payedBy, double amount, String description, SplitType splitType, List<Split> splits) {
        this.payedBy = payedBy;
        this.amount = amount;
        this.description = description;
        this.splitType = splitType;
        this.splits = splits;
    }

    public double getAmount() {
        return amount;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public String getDescription() {
        return description;
    }

    public User getPayedBy() {
        return payedBy;
    }

    public  SplitType getSplitType() {
        return splitType;
    }
}


