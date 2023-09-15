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
        Account acc = new Account();
        Account acc1 = new Account();
        //1st ACC
        acc.setAccountnumber(1); acc.setBalance(10);
        acc.setName("Failure"); acc.setEmail("Bank@gmail.com");
        acc.setPhonenumber(01347);
        //2nd ACC
        acc1.setAccountnumber(2);acc1.setBalance(100);
        acc1.setName("Dunno"); acc1.setEmail("Dork@gmail.com");
        acc1.setPhonenumber(98);
        
        System.out.println("Current Balance: "+acc.getBalance()+'$');
        acc.stats(acc.depositFunds(200f));
        acc.stats(acc.withdrawfunds(300f));     
        acc.stats(acc.transfer(acc1, 210));
        System.out.println(acc1);
    }
}
