package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        registeredUsers user = new registeredUsers();
        String ans[] = user.isUserLogged();
        String accountNo = ans[0];
        int currentBalance =  Integer.parseInt(ans[1]) ;

            if(ans != null){

                System.out.println("Login Success!");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Account No:"+""+accountNo);
                System.out.println("Current Balance:"+""+currentBalance);
                System.out.println("");

                System.out.println("Banking Options");
                System.out.println("To Deposit Money: Enter 'D' ");
                System.out.println("To Withdraw Money: Enter 'W' ");

                Account account = new Account(currentBalance);
                account.bankingOption();

            }
            else {
                System.out.println("Login Fail");

            }

    }

}
