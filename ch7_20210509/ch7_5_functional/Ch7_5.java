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
public class Ch7_5 {
    //因為程式會變 希望相容性可提高(低耦合)
    static void printString(StringConsumer ps,
	    String... data){
	for (String s : data){
	    //System.out.println(s);
	    ps.accept(s);
	}
	
    }
    public static void main(String[] args) {
	//使用介面模擬方法!
	printString(new PrintStyle(),
		"A","B","F","D","G");
    }
    
}
