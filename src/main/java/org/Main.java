package org;

public class Main {
    public static void main(String[] args) {
        User exampleUser1 = new User("Declan", "Derible");
        User exampleUser2 = new User("Jamie", "Cornick");
        System.out.println("exampleUser1 Balance:");
        System.out.println(exampleUser1.getAccBalance());
        exampleUser1.deposit(100);
        System.out.println("exampleUser1 Balance:");
        System.out.println(exampleUser1.getAccBalance());
        exampleUser1.withdraw(55);
        System.out.println("exampleUser1 Balance:");
        System.out.println(exampleUser1.getAccBalance());
        exampleUser2.deposit(365);
        System.out.println("exampleUser2 Balance:");
        System.out.println(exampleUser2.getAccBalance());
    }
}