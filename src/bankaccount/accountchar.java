/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author User
 */
public class accountchar {
    private int accountnumber;
    private float balance;
    private String name;
    private String email;
    private long phonenumber;
    private boolean status;

    public int getAccountnumber() {
        return accountnumber;
    }

    public float getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public boolean depositFunds(float balance){
        if(balance>0){
            this.balance = balance + getBalance();
            return true;
        }
        return false;
    }
    
    public boolean withdrawfunds(float balance){
        if(balance <= getBalance()){
            this.balance = getBalance() - balance;
            return true;
        }
        return false;
    }
    
    public void stats(boolean s){
        if(s==true){
            System.out.println("Success!");
            System.out.println("New Balance: "+getBalance()+'$');
        }else{
            System.out.println("Operation Failed");
        }
    }
}
