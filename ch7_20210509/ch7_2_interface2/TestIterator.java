/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_2_interface2;

/**
 *
 * @author xvpow
 */
public interface TestIterator {
    int length();//長度
    Object fetch(int x);//取數值
    public default void foreach(){//輪巡
	for (int i = 0; i < length();i++){
	    Object obj =  fetch(i);
	    System.out.println(obj);
	}
    }
}
