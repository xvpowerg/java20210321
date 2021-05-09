/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_2_interface2;
/**
 *
 * @author xvpow
 */
public class Ch7_2 {
    //幫我輸出 Test1List與Test2List的資料
    public static  void prints(TestIterator ti){
	ti.foreach();
    }
    
    public static void main(String[] args) {
	
	MyTest1List list = new MyTest1List();
	list.add(new Test1("Test1:10"));
	list.add(new Test1("Test1:20"));
	list.add(new Test1("Test1:30"));
	
	MyTest2List list2 = new MyTest2List();
	list2.add(new Test2("Test2:10"));
	list2.add(new Test2("Test2:20"));
	list2.add(new Test2("Test2:30"));
	
//	System.out.println(list.size());
//	System.out.println(list.get(3));
	prints(list);
	//prints(list2);
	
    }
    
}
