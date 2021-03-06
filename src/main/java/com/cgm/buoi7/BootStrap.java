/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.cgm.buoi7;

import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        UITerminal uiTerminal = new UITerminal(account);

        System.out.println("Welcome to the Cinema Reservation System (CRS)!\n (To exit type 'exit')\n");
        while(true){
            Thread.sleep(3000);
            uiTerminal.displayOptions();
            //chon
            System.out.println(uiTerminal.getPrompt());
            String rep = scanner.nextLine();//CA//LI ca li la
            String cmd = uiTerminal.handleCommands(rep);

            if(cmd != null && !cmd.equals("unknown command.")){
                System.out.println(cmd);//hop thoai
                //CA
                uiTerminal.handleInputs();
            }
            


        }
        
    }
    
}
