/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_6_functiona2;
import java.util.function.Supplier;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Lotto1to100  implements Supplier<Integer>{
    private Random ran = new Random();
    public Integer get(){
	return ran.nextInt(100) +1;
    }
}
