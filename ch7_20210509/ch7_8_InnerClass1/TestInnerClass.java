/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_8_InnerClass1;

/**
 *
 * @author xvpow
 */
public class TestInnerClass {
    private int size = 25;
    
    //一般類 modifier 只能是default 或　public
    //內部類 可擁有所有 modifier
    static class MyStaticClass{
	private String value;
	public MyStaticClass(String value){
	    this.value = value;
	}
	public String getValue(){
	    return value;
	}
	public String toString(){
	    return "StaticClass:"+value;
	}
    }
    //如果想使用外部類的屬性或方法請使用非靜態的內部類
    //呼叫方式 在內部類呼叫比較常用
    class InnerClass{
	private  String msg;
	InnerClass(String msg){
	    this.msg = msg;
	}
	public String toString(){
	    return msg+":"+size;
	}
    }
    
    public void testInner(){
	InnerClass inclass = new InnerClass("InnerMsg");
	System.out.println(inclass);
    }
}
