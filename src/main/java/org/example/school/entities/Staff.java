package org.example.school.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Staff extends User{
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;
    private long phoneNumber;
    private BigDecimal DOB;
    private String nextOfKin;
    private String qualification;
    private String dateOfEmployment;
    private LocalDate yearsOfExperience;
    private BigDecimal salary;
    private String ID;

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public Staff() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Staff(String firstName, String lastName, String email, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.ID = ID;
    }
}
