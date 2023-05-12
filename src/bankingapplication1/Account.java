/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication1;

/**
 *
 * @author Student
 */
public class Account {
    private int number;
    private String name;
    private double balance;
    

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        //this.balance += amount//
    }
    
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public int getAccountNumber() {
        return this.number;
    }
    
    public String getAccountName() {
        return this.name;
    }
}
