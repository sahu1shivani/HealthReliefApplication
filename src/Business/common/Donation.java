/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.common;

/**
 *
 * @author shreya baliga
 */
public class Donation {
     private String amount;
    private String donationDate;
    private String accountNumber;
    private String accountName;
    public static String toAccountNumber = "1234567890";
    
    private static int count = 0;
    private int donationId;
    
    public Donation()
    {
     count++;
     donationId = count;
    }
    

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    @Override
    public String toString() {
        return String.valueOf(donationId);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }
    
    
}
