package org;

public class Main {
    public static void main(String[] args) {

        // Setting up users
        User exampleUser1 = new User("Declan", "Derible");
        User exampleUser2 = new User("Jamie", "Cornick");

        // Deposit example
        System.out.println("exampleUser1 Balance:");
        System.out.println(exampleUser1.getAccBalance());
        exampleUser1.deposit(100);
        System.out.println("exampleUser1 Balance:");
        System.out.println(exampleUser1.getAccBalance());

        // Withdrawal Example
        exampleUser1.withdraw(55);
        System.out.println("exampleUser1 Balance:");
        System.out.println(exampleUser1.getAccBalance());

        // 2nd example
        exampleUser2.deposit(365);
        System.out.println("exampleUser2 Balance:");
        System.out.println(exampleUser2.getAccBalance());
    }
}