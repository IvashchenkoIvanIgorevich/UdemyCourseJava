package BankApp;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Ukrainian bank");

        bank.addBranch("Dnipro");

        bank.addCustomer("Dnipro", "Tim", 50.05);
        bank.addCustomer("Dnipro", "Mike", 175.34);
        bank.addCustomer("Dnipro", "Percy", 220.12);

        bank.addBranch("Kyiv");
        bank.addCustomer("Kyiv", "Bob", 150.54);

        bank.addCustomerTransaction("Dnipro", "Tim", 44.22);
        bank.addCustomerTransaction("Dnipro", "Tim", 12.44);
        bank.addCustomerTransaction("Dnipro", "Mike", 1.65);

        bank.listCustomers("Dnipro", true);
        bank.listCustomers("Kyiv", true);
    }
}
