/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication1;

/**
 *
 * @author Student
 */
public class Customer {
     private int idCard;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(int idCard, String firstName, String lastName, String phoneNumber) {
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getIdCard() {
        return idCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
}
