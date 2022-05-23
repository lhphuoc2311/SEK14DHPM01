/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.cgm.buoi9;

import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException {
        Scanner inpuScanner  = new Scanner(System.in);
        Account account = new Account();
        CreateAccountController createAccountController;
        createAccountController = new CreateAccountController(account);
        //UITerminal uiTerminal = new UITerminal(accObject);
        NewAccountUI newAccountUI = new NewAccountUI(createAccountController);

        LogginAccountController logginAccountController = new LogginAccountController(account);
        LoggedInUI loggedInUI = new LoggedInUI(logginAccountController);

        System.out.println("Welcome to the Cinema Reservation System!!\n (To exit type 'exit') \n");

        while(true){
            Thread.sleep(5000);
            displayOptions(createAccountController);
            System.out.println(getPrompt(createAccountController));
            //chon
            //command
            String rep = inpuScanner.nextLine();

            String resCmd;
            if(rep.toUpperCase().equals(Actions.CA.toString())){
                resCmd = newAccountUI.handleCommands(rep);//?????
                System.out.println(resCmd);
              //  if(resCmd != null && !resCmd.equals("Unkown command.")){
                newAccountUI.handleInputs();
             //   }

            }else if(rep.toUpperCase().equals(Actions.LI.toString()) ||
                    rep.toUpperCase().equals(Actions.LO.toString()) ){
                resCmd = loggedInUI.handleCommands(rep);
                System.out.println(resCmd);
                loggedInUI.handleInputs();
            }

            //LI
           //String cmd =  handleCommands(rep);

            // if(cmd != null && !cmd.equals("Unkown command.")){
                // System.out.println(cmd);
                // uiTerminal.handleInputs();
            // }
            //inpuScanner.nextLine();

           
           
           
            

        }
    }
//B-C-E
    public static void displayOptions(CreateAccountController createAccountController) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~CRS MENU~~~~~~~~~~~~~~~~~~~");
        // check
        if (! createAccountController.getAccount().checkLoggedIn()) {
        
            System.out.println("Enter one of the commands in the brackets:\n" +
                    "[CA] Create Account\n" +
                    "[LI] Login");
        } else {
            //login as #mr teo
            System.out.println("Enter on of the commands in brackets:\n " +
                    "[LO] Logout");
        }
    }

    public static String getPrompt(CreateAccountController createAccountController) {
        //this.prompt = "LOGGED IN AS # " + accObject.getUsername();
        // check
    if (! createAccountController.getAccount().checkLoggedIn()) {
        return "";
    }

    return "LOGGED IN AS # " + createAccountController.getAccount().getUsername();

}
    
}
