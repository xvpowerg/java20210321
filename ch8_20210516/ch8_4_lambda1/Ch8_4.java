/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_4_lambda1;
import java.util.function.Consumer;

//Lambda 只能用於Functional Interface
public class Ch18_4 {

    public static void main(String[] args) {
	
//	Consumer<String> c1 = new Consumer<String>(){
//	
//	public void accept(String s){
//	    
//	}
//	};
    Consumer<String> c1 = (String x) ->{
	System.out.println(x);
    };
    //所有參數的類型都可移除
    Consumer<String> c2 = (x) ->{
	System.out.println(x);
    };
    //只有一個參數時()可以移除
    Consumer<String> c3 = x->{System.out.println(x);};
    c3.accept("C3");
    //{}只有一條命令時可以移除{} 注意 ;也要移除
    Consumer<String> c4 = x->System.out.println(x);
    c4.accept("C4");
    
    
	
    }
    
}
