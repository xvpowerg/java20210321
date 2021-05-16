/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_1_anonymous1;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class Ch8_2 {
    
    static void printStrngArray(Consumer<String> com,String ... values){
	for (String v : values){
	    com.accept(v);
	}
    }
    
    static void replaceStringArray(String[] array,Predicate<String> p1){
	for (int i=0;i<array.length; i++){
	    String s = array[i];
	    if (p1.test(s)){
		array[i] +=2;
	    }
	}
    }
    
    
    public static void main(String[] args) {
//匿名內部類 可呼叫 區域變數 但不能重新給予數值
//當作java在區域變數上 加上了final
	printStrngArray(new Consumer<String>(){	
	public void accept(String c){
		System.out.println("V:"+c);
	}
	},"A","B","C","D");
	
	
	int size = 25;		
	//size = 50;
	String[] test = {"Ken","Vivin","Lindy","Tom"};
	//所有字串長度小於4的都加2
	replaceStringArray(test,new Predicate<String>(){
	public boolean test(String st){	    
	    System.out.println(size);
	    if (st.length() < 4) return true;	
	    return false;
	}
	
	});
	
	System.out.println(test[0]);
	System.out.println(test[3]);
    }
    
}
