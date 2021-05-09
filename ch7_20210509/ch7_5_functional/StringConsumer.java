/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210509.ch7_5_functional;

/**
 *
 * @author xvpow
 */
//因為interface 內的抽象方法只有一個 所以它是一組 Functional Interface
//FunctionalInterface 假裝這介面是一個方法或函數 
//就可將方法傳到參數中 或變數
@FunctionalInterface
public interface StringConsumer {
      void accept(String s);          
}
