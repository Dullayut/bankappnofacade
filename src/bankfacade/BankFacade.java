/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankFacadeDesign object = new BankFacadeDesign();
        AccountIf account = null;
            
        //// report customer 1
        CustomerIf customer1 = object.getBankCustomer("Tom");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer1.getCustomerName());
        System.out.println("Has " + customer1.getNumAccounts() + " accounts");
            
            account = object.getBankAccount(customer1, 0001);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            account = object.getBankAccount(customer1, 0002);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            object.doDeposit(1650,customer1,0002);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            ArrayList<AccountIf> accounts1 = object.getBankCustomer("Tom").getllAccounts();
            for(AccountIf accounted : accounts1) {
                System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
            }
        
        CustomerIf customer2 = object.getBankCustomer("Jerry");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer2.getCustomerName());
        System.out.println("Has " + customer2.getNumAccounts() + " accounts");
        
            account = object.getBankAccount(customer2, 0003);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            account = object.getBankAccount(customer2, 0004);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            object.doDeposit(1000, customer2, 0004);
            System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            ArrayList<AccountIf> accounts2 = object.getBankCustomer("Jerry").getllAccounts();
            for(AccountIf accounted : accounts2) {
                System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
            }
    }
    
}
