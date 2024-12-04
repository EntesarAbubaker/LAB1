class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    public boolean charge(double price) {
        if (price < 0) {
            System.out.println("Error: Charge amount cannot be negative.");
            return false;
        }
        if (price + balance > limit)
            return false;
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount > balance) {
            System.out.println("Error: Payment exceeds current balance.");
        } else {
            balance -= amount;
        }
    }

    public static void printSummary(CreditCard3 card) {
        System.out.println("Credit Card Summary:");
        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.printf("Balance: ", card.balance);
        System.out.printf("Limit: ", card.getLimit());

    }


    public boolean updateLimit(int newLimit) {
        if (newLimit < 0) {
            System.out.println("Error: Credit limit cannot be negative.");
            return false;
        }
        if (newLimit < balance) {
            System.out.println("Error: New limit is less than the current balance.");
            return false;
        }
        limit = newLimit;
        System.out.println("Credit limit successfully updated to: " + newLimit);
        return true;
    }
}

public class Q18 {

    public static void main(String[] args) {

        CreditCard3 card = new CreditCard3("Ahmed", "Bank ABC", "1234-5678-9012", 5000, 2000);


        CreditCard3.printSummary(card);


        card.updateLimit(6000);
        card.updateLimit(1000);


        CreditCard3.printSummary(card);
    }
}