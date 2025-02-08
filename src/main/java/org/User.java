package org;

public class User {
    public String firstName;
    public String lastName;
    protected double accBalance = 0.0;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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