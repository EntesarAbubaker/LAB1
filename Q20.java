class CreditCard3 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard3(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard3(String cust, String bk, String acnt, int lim) {
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
        System.out.println("Customer: " + card.customer);
        System.out.println("Bank: " + card.bank);
        System.out.println("Account: " + card.account);
        System.out.println("Balance: " + card.balance);
        System.out.println("Limit: "+ card.limit);
    }

    // New method to update the credit limit
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

public class Q20 {
    public static void main(String[] args) {
        CreditCard3[] wallet = new CreditCard3[3];

        // Initialize the credit cards
        wallet[0] = new CreditCard3("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard3("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard3("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);

        // Modify charges in the loop
        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val); // Total charge: 3 + 6 + ... + 48 = 408 (within 5000 limit)
            wallet[1].charge(2 * val); // Total charge: 2 + 4 + ... + 32 = 272 (within 3500 limit)
            wallet[2].charge(250);     // Total charge: 250 * 16 = 4000 (exceeds 2500 limit)
        }


        for (CreditCard3 card : wallet) {
            CreditCard3.printSummary(card);
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }}

