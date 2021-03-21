/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210321;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * 比較運算子
     */
    public static void main(String[] args) {
	
	/*int a = 10,b = 5;
	System.out.println(a > b);
	System.out.println(a < b);
	System.out.println(a >= b);
	System.out.println(a <= b);
	System.out.println(a != b);
	System.out.println(a == b);*/
	//字串池優化
	String name1 = "Ken";
	String name2 = "Ken";
	System.out.println(name1+":"+name2);
	System.out.println(name1 == name2);
	
	String name3  = new String("Ken");
	String name4  = new String("Ken");
	System.out.println(name3+":"+name4);
	System.out.println(name3 == name4);

	//比較非基本型態使用equals
	System.out.println(name1.equals(name2));
	System.out.println(name3.equals(name4));
	//null 空無一物
	String name5 = null;
	System.out.println(name5);
	System.out.println(name5.equals(name4));
	//System.out.println(name4.equals(name5));
    }
    
}
