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
public class Bankaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        accountchar acc = new accountchar();
        acc.setAccountnumber(12345);
        acc.setBalance(10);
        acc.setName("Failure");
        acc.setEmail("Bank@gmail.com");
        acc.setPhonenumber(01347);
        System.out.println("Current Balance: "+acc.getBalance()+'$');
        acc.stats(acc.depositFunds(200f));
        acc.stats(acc.withdrawfunds(300f));     
    }
    
}
