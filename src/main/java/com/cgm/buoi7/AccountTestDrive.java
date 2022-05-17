/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.cgm.buoi7;

import java.util.List;

public class AccountTestDrive {
    public static void main(String[] args) {
        //Account account = new Account();
        List<Object> list =  Account.accountValid("mr teo em", "mrteoanh@gmail.com");
        Account.createAccount("mr teo anh", 123, "mrteoanh@gmail.com");

        System.out.println(list.get(0) + "@@@@@" + list.get(1));

    }
    
}
