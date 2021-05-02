/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_6_shade;

/**
 *
 * @author xvpow
 */
public class Ch6_6 {

    /**
     * 那些東西是遮蔽
     * 1 屬性 
     * 2 靜態的方法或屬性
     * 覆寫
     * 非靜態方法
     * 口絕:
     * 遮蔽 看類別
     * 覆寫 看物件
     * 子類沒有找父類
     */
    public static void main(String[] args) {
	// TODO code application logic here
	TestShade tsh1 = new TestShade2();
	tsh1.value1 = "Test1";
	System.out.println(tsh1.value1);
	System.out.println(tsh1.getValue1());
	//因為showTest 是靜態為遮蔽看類別
	tsh1.showTest();
    }
    
}
