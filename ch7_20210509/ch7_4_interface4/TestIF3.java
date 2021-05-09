/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_4_interface4;

/**
 *
 * @author xvpow
 */
//因為TestIF1與TestIF2  有相同的default方法 可能會發生錯誤
//解法
//1 TestIF1,TestIF2 不要有一樣的default方法
//2 讓TestIF1與TestIF2 有繼承關係
//3 TestIF3 覆寫重複的 default
//靜態與抽象不須考慮方法名稱重複問題
public interface TestIF3 extends TestIF1,TestIF2{
    public default void run(){
	System.out.println("TestIF3 Run3");
    }
}
