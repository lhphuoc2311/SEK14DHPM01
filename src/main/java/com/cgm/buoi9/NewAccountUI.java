/*
*  created date: May 23, 2022
*  author: cgm
*/
package com.cgm.buoi9;

import java.util.Scanner;

public class NewAccountUI {
    private static Scanner scanner = new Scanner(System.in);
    private CreateAccountController createAccountController;
    private Actions command;
    /**
     * @param createAccountController
     */
    public NewAccountUI(CreateAccountController createAccountController) {
        this.createAccountController = createAccountController;
        this.command = null;
    }

    private static Account createAccountInputs() {
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        Integer password = scanner.nextInt();
        scanner.nextLine();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();
        return new Account(username, password, email);
    }


    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if (this.command.equals(Actions.CA)) {
            return "Enter a username, a password, a email";
        } else {
            return "Unkown command.";
        }
    
    }

    public void handleInputs() {
        if (this.command.equals(Actions.CA)) {
            Account account = createAccountInputs();
            this.createAccountController.createAccount(account.getUsername(), account.getPassword(), account.getEmail());
        } 
          
          
          
    }

    
    
}
