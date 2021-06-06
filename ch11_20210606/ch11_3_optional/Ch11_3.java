/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_3_optional;

/**
 *
 * @author xvpow
 */
public class Ch11_3 {
    public static void main(String[] args) {
     //希望使用一種標準方式 處理!= null的問題
        Student st1 = new Student(null,10);
        if (st1.getName() != null && st1.getName().equals("Ken")){
            
                  System.out.println("Hi 您好");
            
       }
        
    }
    
}
