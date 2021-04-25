/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_3_override3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void publicFuc(){
	System.out.println("Test1 PublicFunc");
    }
      protected void protectedFuc(){
	System.out.println("Test1 ProtectedFunc");
    }
      void defaultFuc(){
	  System.out.println("Test1 DefaultFunc");
      }
      
      private void privateFuc(){
	    System.out.println("Test1 PrivateFuc");
      }
}
