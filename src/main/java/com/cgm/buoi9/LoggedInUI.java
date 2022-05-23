/*
*  created date: May 23, 2022
*  author: cgm
*/
package com.cgm.buoi9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoggedInUI {
    private Scanner scanner = new Scanner(System.in);
    private LogginAccountController logginAccountController;
    private Actions command;
    /**
     * @param logginAccountController
     */
    public LoggedInUI(LogginAccountController logginAccountController) {
        this.logginAccountController = logginAccountController;
        this.command = null;
    }

    public void handleInputs() {
        if (this.command.equals(Actions.LI)) {
            // ???code?
           List<Object> list =  loginInputs();// Implementations
           logginAccountController.login(list.get(0).toString(), (int)list.get(1));//
        }else if(this.command.equals(Actions.LO)){
            this.logginAccountController.logout();
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

    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if (this.command.equals(Actions.LO)) {
            return "Logging out ...";
        } else if (this.command.equals(Actions.LI)) {
            return "Enter a username, a password";
        } else {
            return "Unkown command.";
        }
    }




    


    
}
