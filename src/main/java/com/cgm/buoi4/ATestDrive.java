/*
*  created date: Apr 25, 2022
*  author: cgm
*/
package com.cgm.buoi4;

public class ATestDrive {

    public static void main(String[] args) {
        B b = new B();

        //cách 1
        A a = new A(b);


        //cách 2
        A a2 = new A();
        a2.setRefObject(b);

    }
    
}
