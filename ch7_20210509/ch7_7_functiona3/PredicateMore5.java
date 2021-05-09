/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_7_functiona3;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class PredicateMore5  implements Predicate<Integer>{
    
    public boolean test(Integer v){
	return v > 5;
    }
}
