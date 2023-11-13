
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account newAccount = new Account("Kiletov acc", 100.00);
        System.out.println(newAccount);
        newAccount.deposit(20);
        System.out.println(newAccount);
    }
}
