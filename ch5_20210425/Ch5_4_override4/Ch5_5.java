/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_4_override4;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    /**
     * 覆寫規則
     * 1 權限只能越來越開放不能越來越封閉
     * 2 回傳如是基本形態必須一樣 如是參考形態可以是子類
     * 3 方法名稱傳入參數類型必須一樣
     * 4 例外 可拋 可不拋 可拋子類
     */
    public static void main(String[] args) {
	
	Test1 t2 = new Test2();
	t2.func1();
	t2.func2();
	
    }
    
}
