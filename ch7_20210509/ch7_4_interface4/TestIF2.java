/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_4_interface4;

/**
 *
 * @author xvpow
 */
public interface TestIF2 {
    static void myStatic(){
	System.out.println("TestIF2");
    }
    public default  void run(){
	 System.out.println("TestIF2 Run2");
     }
}
