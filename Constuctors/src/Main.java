public class Main {
    public static void main(String[] args) {
//
//        BankAccount gabrielAccount = new BankAccount();//("123", 0.0,"Gabriel Molocea",
//                //"gabrielgabriel@gail.com", "0123465");
//
//
//        System.out.println(gabrielAccount.getNumber());
//        System.out.println(gabrielAccount.getBalance());
//
//
//        gabrielAccount.withdrawal(100);
//
//        gabrielAccount.deposit(50);
//        gabrielAccount.withdrawal(100);
//
//        gabrielAccount.deposit(51);
//        gabrielAccount.withdrawal(100);
//
//        BankAccount newAccount = new BankAccount("Gabriel","gabriel@email.com","122355");
//        System.out.println(newAccount.getNumber() + " name " + newAccount.getCustomerName());


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob",25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Gabriel",100.00,"gabriel@email.com");
        System.out.println(person3.getName());

    }
}
