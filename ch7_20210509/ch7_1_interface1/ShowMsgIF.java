/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_1_interface1;

/**
 *
 * @author xvpow
 */
public interface ShowMsgIF {
    
    String msg();
    //預設為public 
    //通常使用default方法 因為要呼叫介面內其他 抽象方法 
    default void printMsg(){
	System.out.println(msg());
    }
}
