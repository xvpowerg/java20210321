/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_8_InnerClass1;
import ch7_20210509.ch7_8_InnerClass1.TestInnerClass.MyStaticClass;
/**
 *
 * @author xvpow
 */
public class Ch7_8 {

    /**
     * 內部類
     * 1 非靜態
     * 2 靜態
     * 3 匿名
     * 為什麼要內部類?
     * 這類別只會使用一次
     * 這類別跟外部類關係密切
     * 加強封裝效果
     */
    public static void main(String[] args) {
	TestInnerClass.MyStaticClass msc =
		new TestInnerClass.MyStaticClass("TestValue");
	MyStaticClass msc2 = new MyStaticClass("TestValue2");
	System.out.println(msc);
	System.out.println(msc2);
	TestInnerClass tc2 = new TestInnerClass();
	tc2.testInner();
    }
    
}

