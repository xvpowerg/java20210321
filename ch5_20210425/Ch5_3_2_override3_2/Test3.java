/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_3_2_override3_2;
import ch5_20210425.Ch5_3_override3.Test1;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1{
    @Override
    public void publicFuc(){
	System.out.println("Test3 publicFuc");
    }
      @Override
    protected void protectedFuc(){
	System.out.println("Test3 protectedFuc");
    }
    //@Override
    //因為在不同package所以不是覆寫
    void defaultFuc(){
	System.out.println("Test3 defaultFuc");
    }
}
