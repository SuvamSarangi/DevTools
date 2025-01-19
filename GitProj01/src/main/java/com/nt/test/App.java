package com.nt.test;

import com.nt.service.Arithmatic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       Arithmatic ar = new Arithmatic();
      long result =  ar.sub(10, 20);
       System.out.println("result of sum: "+result);
    }
}
