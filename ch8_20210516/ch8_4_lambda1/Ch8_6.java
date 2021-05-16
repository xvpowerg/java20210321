/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_4_lambda1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	
	Function<String,Integer> f1 = (String st)->{return 10;};
	Function<String,Integer> f2 = st->{return 10;};
	Function<String,Integer> f3 = st->st.length();
	System.out.println(f3.apply("ABCD"));
	
    }
    
}
