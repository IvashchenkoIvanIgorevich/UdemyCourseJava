package BankApp;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName){
        if(findBranchByName(branchName) == null)
            return branches.add(new Branch(branchName));

        return false;
    }

    public boolean addCustomer(String name, String customerName, double initialAmount){
        Branch newBranch = findBranchByName(name);
        if(newBranch != null)
            return newBranch.addNewCustomer(customerName, initialAmount);

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranchByName(branchName);
        if(branch != null)
            return branch.addCustomerTransaction(customerName, amount);

        return false;
    }

    private Branch findBranchByName(String branchName){
        return branches.stream().filter(b -> branchName == b.getName()).findFirst().orElse(null);
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranchByName(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            branchCustomers.forEach((Customer customer) -> {
                System.out.println("Customer: " + customer.getName() + "[" + (branchCustomers.indexOf(customer) + 1) + "]");
                if (showTransaction){
                    System.out.println("Transactions");
                    customer.getTransactions().forEach((Double transaction) -> {
                        System.out.println("[" + (customer.getTransactions().indexOf(transaction) + 1) + "] Amount " + transaction);
                    });
                }
            });

            return true;
        }

        return false;
    }
}

