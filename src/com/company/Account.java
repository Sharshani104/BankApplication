package com.company;

import java.util.Scanner;

interface accountDetails{

    void calculate(int balance, int amount);
}


public class Account {

    private int currentBalance;

    Scanner input = new Scanner(System.in);

    public Account(int bankBalance) {

        this.currentBalance = bankBalance;
    }

    public void deposit(){

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Current Balance:"+""+currentBalance);
        System.out.print("Deposit Amount:");
        int deposit = input.nextInt();

        accountDetails bankDeposit = (balance, amount) ->{
            currentBalance =  (balance + amount);
            System.out.println("New Balance:" + currentBalance);
        };
        bankDeposit.calculate(currentBalance,deposit);
        bankingOption();
    }

    public  void withdrawal(){

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Current Balance:"+""+currentBalance);
        System.out.print("Withdrawal Amount:");
        int withdrawal = input.nextInt();


        accountDetails bankWithdrawal = (balance, amount) ->{

            if(currentBalance<500){

                System.out.println("Bank Balance is not enough");

            }
            else {
                currentBalance = (balance - amount);
                System.out.println("New Balance:" + currentBalance);
            }
        };
        bankWithdrawal.calculate(currentBalance,withdrawal);
        bankingOption();
    }

    public void bankingOption(){

        System.out.print("\n"+"Please Enter the Banking Option: ");
        String option = input.next();

        switch (option){

            case  "D" : deposit();
                break;
            case  "W" :withdrawal();
                break;
            default:
                System.out.println("System Terminated");

        }
    }

}
