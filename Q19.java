class CreditCard2 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard2(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard2(String cust, String bk, String acnt, int lim) {
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
        if (amount < 0) {
            System.out.println("Error: Payment amount cannot be negative. Ignoring request.\"");
        }
        if (amount > balance) {
            System.out.println("Error: Payment exceeds current balance.");
        } else {
            balance -= amount;
        }
    }

    public static void printSummary(CreditCard2 card) {
        System.out.println("Credit Card Summary:");
        System.out.println("Customer: " + card.customer);
        System.out.println("Bank: " + card.bank);
        System.out.println("Account: " + card.account);
        System.out.printf("Balance: %.2f\n", card.balance);
        System.out.printf("Limit: %d\n", card.limit);

    }
}

public class Q19 {

    public static void main(String[] args) {

        CreditCard2 card = new CreditCard2("Jane Smith", "Bank XYZ", "9876-5432-1098", 3000, 1000);


        CreditCard2.printSummary(card);


        card.makePayment(500);
        card.makePayment(-200);
        card.makePayment(1500);


        CreditCard2.printSummary(card);
    }
}
