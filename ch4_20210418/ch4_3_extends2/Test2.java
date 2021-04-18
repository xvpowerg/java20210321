/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210418.ch4_3_extends2;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    //1 在無任何Constructor(建構式)時 自動建立一組 無參數的建構式
    //2 在所有建構式　無手動呼叫　this(333)或 super(....)時 
    //  都會自動呼叫super() 表示呼叫父類別預設建構式
    
   public Test2(int x){
	//因為父類別無預設建構式 所以需要手動呼叫建構式
	super(x);
    } 
    
}
