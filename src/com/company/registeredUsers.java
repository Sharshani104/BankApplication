package com.company;
import java.util.Scanner;

public class registeredUsers {

    //user array
    private String[][] users = {
            {"C001", "Amy", "Nicola", "0123 4567 8910", "amy@123", "600000"},
            {"C002", "Jhon", "Peter", "0456 8910 1230","jho@123" , "400000"},
    };

    public registeredUsers(){

    }

    public String[] isUserLogged(){

        Scanner input = new Scanner(System.in);

        System.out.println("Login");
        System.out.print("Username:");
        String username = input.next();
        System.out.print("Password:");
        String password = input.next();

        for(int i = 0; i<= users.length; i++){
            String un = users[i][1];
            String pw = users[i][4];

            String accNo = users[i][3];
            String currentBalance = users[i][5];

            if(username.equals(un) && password.equals(pw)){
                String loggedUser[] = {accNo,currentBalance};
                return  loggedUser;
            }
        }

        return  null;
    }
}
