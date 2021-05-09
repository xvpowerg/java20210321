/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_6_functiona2;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Arrays;
public class Ch7_6 {

    static void printString(Consumer<String> c, String... values) {
	for (String v : values) {
	    c.accept(v);
	}
    }

    //1~100 挑 6
    static int[] lotto(int size, Supplier<Integer> sup) {
	int[] lottoNumber = new int[size];
	for (int i = 0; i < size; i++) {
	    lottoNumber[i] = sup.get();
	}
	Arrays.sort(lottoNumber);
	return lottoNumber;
    }

    public static void main(String[] args) {
	// TODO code application logic here
	//Consumer<T> 接收	
	//Supplier<T> 提供	
	//Function<T,R> 轉換
	//UnaryOperator<T> 一元運算	
	//Predicate<T> 判斷
	Consumer<String> c = new MyConsumer();
	printString(c, "B", "G", "H", "C");
	Supplier<Integer> sp = new Lotto1to100();
	int[] lottos = lotto(6, sp);
	for (int v : lottos) {
	    System.out.println(v);
	}

    }

}
