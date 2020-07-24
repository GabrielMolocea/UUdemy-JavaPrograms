public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50,"Default name",
                "Default address","Default phine");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerEmail =customerEmail;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmout){
        this.balance += depositAmout;
    }

    public void withdrawal(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed" );
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.Remaining balance = " + this.balance);

        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
