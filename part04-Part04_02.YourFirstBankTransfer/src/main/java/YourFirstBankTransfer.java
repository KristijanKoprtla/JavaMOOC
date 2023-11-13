
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewAcc = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);
        
        matthewAcc.withdrawal(100.0);
        myAcc.deposit(100.00);
        System.out.println(matthewAcc);
        System.out.println(myAcc);
    }
}
