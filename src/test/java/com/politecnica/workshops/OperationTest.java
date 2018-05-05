package com.politecnica.workshops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
jdk 8
INTELLIJ IDEA
MAvEn

nexus repositorio maven


blootchat	(chat interno)

https://start.spring.io/			proyecto default lantilla

*/

public class OperationTest {

    @Test
    public  void sumGreaterThan10MustReturnSuccessfully(){
        //Given:
        Operation operation = new Operation();

        //When:
        int result = operation.suma(10,20);

        //Then:
        assertEquals("La suma debe ser 30", 30, result);
    }

    @Test(expected = Exception.class)
    public void sumLessThan10MustThrowException(){
        //Given:
        Operation operation=  new Operation();

        //When:
        int result = operation.suma(1,3);

        // Must throw an exception for result less than 10
    }

}
