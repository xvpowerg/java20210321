/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_7_functiona3;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class StringToCharNumber  implements Function<String,Integer>{
    public Integer apply(String str){
	int result = 0;
	 char[] cArray = str.toCharArray();
	 for (char v : cArray){
	    result +=v; 
	 }
	 return result;
    }
}
