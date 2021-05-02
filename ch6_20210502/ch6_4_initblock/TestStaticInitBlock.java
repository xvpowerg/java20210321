/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210502.ch6_4_initblock;

import java.util.Arrays;
public class TestStaticInitBlock {
    
        //幫我把data初始值變為空白字串
   private static String[] data = new String[50000];    
   //比所有方法都早執行
   static{
	Arrays.fill(data, "");
    }
   public static String getData(int i){
       return data[i];
   }

}
