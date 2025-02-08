package org;

public class User {
    public String firstName;
    public String lastName;
    public double accBalance = 0.0;

    public BankAccount (String firstName, String lastName, double accBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accBalance = this.accBalance;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Double getAccBalance() {
        return this.accBalance;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String toString() {
        return firstName + " " + lastName + "- Balance: $" + accBalance;
    }

    public void deposit(double amount) {
        this.accBalance += amount;
    }

    public void withdraw(double amount) {
        this.accBalance -= amount;
    }
}