/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_10_thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Ch13_14 {

 
    public static void main(String[] args) {
       Random ran = new Random();
       ExecutorService es =  Executors.newCachedThreadPool();
       for (int i =1;i<=5;i++){
              es.execute(()->{           
                System.out.println("開始:"+Thread.currentThread().getName());
                try{
                    TimeUnit.SECONDS.sleep(ran.nextInt(10)+1);
                }catch(Exception ex){               
                }
                System.out.println("完成!");
            });
       }

       es.shutdown();
       
    }
    
}
