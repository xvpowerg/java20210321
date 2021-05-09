/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_7_functiona3;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class IntCalculate implements UnaryOperator<Integer>{
     public Integer apply(Integer v){
	 return v + 5;
     }
}
