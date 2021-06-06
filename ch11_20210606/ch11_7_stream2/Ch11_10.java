/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_7_stream2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch11_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(25);
       list.add(65);
       list.add(18);
       //parallel 時 會使用第一個參數 跟 Stream的內容先運算
       //運算後再合併
      int ans =  list.stream().parallel().reduce(0,
               (v1,v2)->{
                   // parallel 時可先做預先的處裡
                   System.out.println("acc:"+v1+":"+v2);
                   return v1+v2;},
               (v1,v2)->{
                   System.out.println("com:"+v1+":"+v2);
                   return v1+v2;});
      System.out.println(ans);
    }
    
}
