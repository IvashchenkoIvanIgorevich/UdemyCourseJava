package BankApp;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean addNewCustomer(String customerName, double initTransAmount){
        if(findCustomerByName(customerName) == null){
            return customers.add(new Customer(customerName, initTransAmount));
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomerByName(customerName);
        if(existingCustomer != null)
            return existingCustomer.addTransaction(amount);

        return false;
    }

    private Customer findCustomerByName(String customerName){
        return customers.stream().filter(c -> customerName == c.getName()).findFirst().orElse(null);
    }
}
