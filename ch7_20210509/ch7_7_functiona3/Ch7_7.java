/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_7_functiona3;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch7_7 {

    //Function<T,R> 轉換
	//UnaryOperator<T> 一元運算	
	//Predicate<T> 判斷
     
    static int[] stringMap(Function<String,Integer> f,String ...values){
	int[] result = new int[values.length];
	for (int i = 0;i < values.length;i++){
	    result[i] = f.apply(values[i]);
	}
	return result;
    }
    
    static void calculateArray(int[] array,UnaryOperator<Integer> op ){
	for (int i = 0;i < array.length;i++){
	    array[i] = op.apply(array[i]);
	}
	
    }
    //大於5
    //10 20 16 4 7 1                      
    //10 20 16 7 0 0
    static int[] filter(int[] array,Predicate<Integer> p){
	int[] tmp = new int[array.length];
	int size = 0;
	for (int i = 0 ;i < array.length;i++){
	    if (p.test(array[i])){
		tmp[size++] =  array[i];		    	
	    }	    
	}
	int[] result = new int[size];
	for (int i = 0;i < size;i++){
	    result[i] = tmp[i];
	}
	return result;
    }
    
    public static void main(String[] args) {
	StringToCharNumber stcn = new  StringToCharNumber();
	int[] ans =  stringMap(stcn,"A","G","S");
	for (int v : ans){
	    System.out.println(v);
	}
	UnaryOperator<Integer> op = new IntCalculate();
	System.out.println("===================");
	int[] numbes = {5,7,8,9,14};
	calculateArray(numbes,op);
	for (int v : numbes){
	    System.out.println(v);
	}
	System.out.println("===================");
	int[] numbes2 = {10,20,16,4,7,1 };
	PredicateMore5 pm5 = new PredicateMore5();
	int[] a2 = filter(numbes2,pm5);
	for (int v : a2){
	    System.out.println(v);
	}
    }
    
}
