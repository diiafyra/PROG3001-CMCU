/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài6;

class BankAccount
{
    private int accountNumber;
    private String accountHolder;
    private int balance;

    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public  void deposit(int a)
    {
        this.setBalance(this.getBalance() + a);
    }

    public  void withdraw(int a)
    {
        this.setBalance(this.getBalance() - a);
    }
}
public class Bài6 {
    
    public static void main(String[] args) {
       BankAccount NTTacc = new BankAccount(20102005, "Nguyễn Thu Trang", 10000000);
       System.out.println("So du tai khoan NTT truoc khi mua SleepyPanda: "+NTTacc.getBalance()+ "$");
       NTTacc.withdraw(100);
       System.out.println("So du tai khoan NTT sau khi mua SleepyPanda: "+NTTacc.getBalance() + "$");
       NTTacc.deposit(10000);
       System.out.println("So du tai khoan NTT sau khi nhan hoc bong:  "+NTTacc.getBalance() + "$");
    }
}
