public class Main {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1);  // Customer's toString()

        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // Test Invoice class
        Account acc1 = new Account(101, c1, 888.8);
        System.out.println(acc1);

        acc1.setBalance(999.9);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + acc1.getBalance());
        System.out.println("after deposit 500:" + acc1.deposit(500).toString());
        System.out.println("after withdraw 700:" + acc1.withdraw(700).toString());
    }
}