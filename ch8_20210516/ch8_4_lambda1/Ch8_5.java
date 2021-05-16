/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_4_lambda1;
import java.util.function.BiConsumer;
/**
 *
 * @author xvpow
 */
//傳2參數
public class Ch18_5 {
    public static void main(String[] args) {
	// TODO code application logic here
	BiConsumer<Integer,String> b1 = (Integer v1,String v2)->{
	    System.out.println(v1+":"+v2);	
	};
	b1.accept(10, "A");
	
	BiConsumer<Integer,String> b2 = (v1,v2)->
				    System.out.println(v1+":"+v2);		
	b2.accept(20, "B");
    }
    
}
