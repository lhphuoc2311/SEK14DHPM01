/*
*  created date: May 17, 2022
*  author: cgm
*/
package com.cgm.buoi8;

import com.cgm.buoi9.Actions;

public class StoredFilesTestDrive {
    public static void main(String[] args) {
        StoredFiles storedFiles = new StoredFiles("accounts.json");
        storedFiles.read();
        System.out.println("");

        Actions.valueOf("");
    }
    
}
