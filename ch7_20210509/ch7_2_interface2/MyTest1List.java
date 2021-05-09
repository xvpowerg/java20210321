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
public class MyTest1List implements TestIterator {
    private Test1[] obj = new Test1[1000];
    private int  size = 0;
    public void add(Test1 test1){
	obj[size++] = test1;
    }
    public int size(){
	return size;
    }    
    public Test1 get(int index){
	if (index >= size){
	    throw new IndexOutOfBoundsException("超過索引!");
	}
       return obj[index];
    }
    
    public int length(){
	return this.size();	
    }
    public Object fetch(int index){
	return get(index);
    }    
}
