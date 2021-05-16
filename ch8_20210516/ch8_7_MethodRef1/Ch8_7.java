/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210516.ch8_7_MethodRef1;
import java.util.function.Function;
public class Ch18_7 {
    /*
MethodReferences
作用:lambda很複雜時 不好閱讀 可使用MethodReferences簡化
1 建立一組方法
2 方法 參數 與 回傳值類型必須跟 Interface一樣
*/
    
    static Integer testFunc(String str){
	char[] cs = str.toCharArray();
	int sum = 0;
	for (char c : cs){
	    sum+=c;
	}
	return sum;
    }
    
    static void runFunc(Function<String,Integer> func,String ...v){
	for (String s : v){
	    System.out.println(func.apply(s));
	}
    }
    public static void main(String[] args) {
	Function<String,Integer> f1 =(v1)->v1.length();
	runFunc(f1,"AA","BBB","CCCC");
	runFunc(Ch18_7::testFunc,"AA","BBB","CCCC");
	//System.out.println(f1.apply("ABCDEF"));
	
	Function<String,Integer> f2 =String::length;
	runFunc(f2,"AA","BBB","CCCC");
	
    }
    
}
