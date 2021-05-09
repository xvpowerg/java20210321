/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_5_functional;

/**
 *
 * @author xvpow
 */
public class PrintStyle implements StringConsumer {
    
    public void accept(String str){
	System.out.print(str);
    }
    
}
