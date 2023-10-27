/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.person;

import Business.common.Donation;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shreya baliga
 */
public class Person {
    private String firstName;
    private String name;
    private String lastName;
    private Date dob;
    private String addressline1;
    private String phoneNumber;
    private String personId;
    private boolean Volunteer;
    private boolean Patients;
    private String emailId;
    private String occupation;
    private String addressline2;
    private String town;
    private String zipCode;
    private String gender;
    private static int count = 00001;
    private String country;
    private String state;
    private int age;
    private ArrayList<Donation> donationList;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person()
    {
     StringBuffer sb = new StringBuffer();
        sb.append("P");
        sb.append(count);
        personId = sb.toString();
        count++;   
        donationList = new ArrayList<>();
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = this.firstName+ " "+this.lastName;
    }

    public String getPersonId() {
        return personId;
    }

   
    public boolean isVolunteer() {
        return Volunteer;
    }

    public void setVolunteer(boolean Volunteer) {
        this.Volunteer = Volunteer;
    }

    public boolean isPatients() {
        return Patients;
    }

    public void setPatients(boolean Patients) {
        this.Patients = Patients;
    }

   
    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

 

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

   
    
    @Override
    public String toString() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

       public Donation addDonation()
    {
        Donation donation = new Donation();
        donationList.add(donation);
        return donation;
    }
            
    
}
