/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_2_override2;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    /**
     * 覆寫規則
     * 1 權限只能越來越開放不能越來越封閉
     * 2 回傳如是基本形態必須一樣 如是參考形態可以是子類
     * 3 方法名稱傳入參數類型必須一樣
     * 4 例外 可拋 可不拋 可拋子類
     */
    public void test(int v) throws Exception{
    }
    public static void main(String[] args) {
	//1 權限只能越來越開放不能越來越封閉
	//public 最開放   所有都可見
	//protected 中等開放 相同package可見 繼承後可見
	//default 就是空白 低開放 相同package可見
	//private 最不開放 只有在相同類別內可見
	TestModifier mod = new TestModifier();
	System.out.println(mod.publicStr);
	System.out.println(mod.protectedStr);
	System.out.println(mod.defaultStr);
    }
    
}
