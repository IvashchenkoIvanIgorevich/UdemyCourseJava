package BankApp;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private ArrayList<Double> Transactions;

    public Customer(String name, double transactionAmount) {
        this.name = name;
        Transactions = new ArrayList<Double>();
        addTransaction(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }

    public boolean addTransaction(double amount){
        return Transactions.add(amount);
    }
}
