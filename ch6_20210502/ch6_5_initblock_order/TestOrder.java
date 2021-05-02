/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_5_initblock_order;

/**
 *
 * @author xvpow
 */
public class TestOrder {
    {
    System.out.println("init block 1");
    }
    
    static{
	System.out.println("static init block 1");
    }
    TestOrder(){
	System.out.println("Constructor ");
    }
    static{
      System.out.println("static init block 2");
    }
    {
    System.out.println("init block 2");
    }
}
