/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_5_Generics2;

import c10_20210530.ch10_4_Generics.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {
    static class Test1{
	   //如果方法泛型與類別泛型相衝突時 會依照 方法泛型為主 
	public <R> R testValue(R v){
	   return v;
	}
	
	//驗證是否為空白 是空白回傳某種例外
	static <T,E extends Exception>void testEmpty(T v,
		Predicate<T> isEmpty,
		Supplier<E>getEx)throws E{
	    //如果是空白
	    if (isEmpty.test(v)){
		throw getEx.get();
	    }	    
	}
	
    }
    
    public static void main(String[] args) {
        Test1 t1 = new Test1();
	  int v = t1.<Integer>testValue(10);
          
        MyNumberList<Double> list = new MyNumberList();
      list.add(10.5);
      list.add(25.7);
              System.out.println(list.get(1));
       
    }
    
}

