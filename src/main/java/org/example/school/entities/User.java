package org.example.school.entities;

import org.example.school.enums.Gender;
import org.example.school.enums.Role;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private BigDecimal DOB;
    private String email;
    private long phoneNumber;
    private Gender gender;
    private String nextOfKin;
    private String isArchived;
    private String isDeleted;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public User() {
    }

    public User(String firstName, String lastName, int age, String address, BigDecimal DOB, String email, long phoneNumber, Gender gender, String nextOfKin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.DOB = DOB;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.nextOfKin = nextOfKin;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getDOB() {
        return DOB;
    }

    public void setDOB(BigDecimal DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", DOB=" + DOB +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                ", nextOfKin='" + nextOfKin + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && phoneNumber == user.phoneNumber && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(address, user.address) && Objects.equals(DOB, user.DOB) && Objects.equals(email, user.email) && gender == user.gender && Objects.equals(nextOfKin, user.nextOfKin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, address, DOB, email, phoneNumber, gender, nextOfKin);
    }
}
