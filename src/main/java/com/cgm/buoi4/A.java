/*
*  created date: Apr 25, 2022
*  author: cgm
*/
package com.cgm.buoi4;

public class A {
    private B refObject;//Remote//null


    public A(){
        //composition
        this.refObject = new B();
    }

    //cách 1
    public A(B b){
        this.refObject = b;
    }

    //cách 2 setter

    /**
     * @param refObject the refObject to set
     */
    public void setRefObject(B refObject) {
        this.refObject = refObject;
    }
}
