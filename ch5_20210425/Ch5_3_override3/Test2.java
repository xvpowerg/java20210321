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
public class Test2 extends Test1 {
    //只能 public
    @Override
    public void publicFuc(){
	System.out.println("Test2 PublicFunc");
    }
    // protected public
    @Override
    protected void protectedFuc(){
	System.out.println("Test2 protected");
    }
  //  default protected public
   @Override
    void defaultFuc(){
	System.out.println("Test2 default");
    }
   //因為父類別這個方法是私有 所以子類不會納入override的範圍
   //@Override 驗證是否為正確的覆寫
    void privateFuc(){
       	System.out.println("Test2 privateFuc");
   }
    
}
