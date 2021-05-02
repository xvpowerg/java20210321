/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_7_abstract;

/**
 *
 * @author xvpow
 */
public class Dog  extends Animal{
    //覆寫抽象方法
    //如果不覆寫抽象方法 持續改變Dog為抽象類別
   public void bark(){
	System.out.println("汪汪！！");
    }
}
