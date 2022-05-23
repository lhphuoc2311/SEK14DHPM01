/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.cgm.buoi9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UITerminal {
    private static Scanner scanner = new Scanner(System.in);
    private Account accObject;
    private String prompt;
    private Actions command;

    /**
     * @param accObject
     */
    public UITerminal(Account accObject) {
        this.accObject = accObject;
        this.prompt = null;
        this.command = null;

    }

    
    

    
    
    
    
    
    
    
    
    
    

    

    /**
     * @return the prompt
     */
    
    
    

    public void handleInputs() {
        if (this.command.equals(Actions.CA)) {
            Account account = createAccountInputs();
            Account.createAccount(account.getUsername(), account.getPassword(), account.getEmail());

        } else if (this.command.equals(Actions.LI)) {
            // ???code?
           List<Object> list =  loginInputs();// Implementations
           accObject.login(list.get(0).toString(), (int)list.get(1));

        }else if(this.command.equals(Actions.LO)){
            accObject.logout();
        }
    }

    private List<Object> loginInputs() {
        List<Object> list = new ArrayList<>();
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        Integer password = scanner.nextInt();scanner.nextLine();
        list.add(username);
        list.add(password);
        return list;
    }

    

    
    
    
    
    
    
    
    

    

    // CA LI LO li
    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);

        if (this.command.equals(Actions.CA)) {
            return "Enter a username, a password, a email";
        } else if (this.command.equals(Actions.LO)) {
            return "Logging out ...";
        } else if (this.command.equals(Actions.LI)) {
            return "Enter a username, a password";
        } else {
            return "Unkown command.";
        }

    }

}
