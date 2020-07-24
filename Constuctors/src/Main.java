public class Main {
    public static void main(String[] args) {

        BankAccount gabrielAccount = new BankAccount();//("123", 0.0,"Gabriel Molocea",
                //"gabrielgabriel@gail.com", "0123465");


        System.out.println(gabrielAccount.getNumber());
        System.out.println(gabrielAccount.getBalance());


        gabrielAccount.withdrawal(100);

        gabrielAccount.deposit(50);
        gabrielAccount.withdrawal(100);

        gabrielAccount.deposit(51);
        gabrielAccount.withdrawal(100);
    }
}
