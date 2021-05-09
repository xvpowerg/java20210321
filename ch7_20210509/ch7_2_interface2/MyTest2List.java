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
public class MyTest2List implements TestIterator{
        private Test2[] obj = new Test2[1000];
    private int  size = 0;
    public void add(Test2 test2){
	obj[size++] = test2;
    }
    public int size(){
	return size;
    }
    
    public Test2 get(int index){
	if (index >= size){
	    throw new IndexOutOfBoundsException("超過索引!");
	}
       return obj[index];
    }
    
    public int length(){
	return this.size();
    }
    public Object fetch(int i){
	return this.get(i);
    }
    
}
