/*
*  created date: Apr 12, 2022
*  author: cgm
*/
package com.cgm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooTest {

    @Test
    public void testFooBar() {
        Foo foo = new Foo();
        String fooBar = foo.getFooBar();
        assertEquals("fooBar", fooBar);
        
    }

    
    
}
