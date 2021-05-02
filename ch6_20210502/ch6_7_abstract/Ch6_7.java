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
public class Ch6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//無法new的東西 可變為抽象類
	//提醒開發人員要覆寫某些方法
	Animal a1 = new Dog();
	a1.bark();

    }
    
}
