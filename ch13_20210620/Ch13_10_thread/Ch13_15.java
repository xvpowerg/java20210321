/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_10_thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch13_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
      ExecutorService es = Executors.newCachedThreadPool();
      Future<Integer> f =es.submit(()->{
           System.out.println("開始");
          TimeUnit.SECONDS.sleep(5);
          System.out.println("完成");
           return ran.nextInt(5000);
        });
        System.out.println("等待區!!");
        es.execute(()->{
               try{
                    System.out.println(f.get());//停在這邊等待完成
                }catch(Exception ex){            
                }    
        });
        
     
        System.out.println("等待完成!!");
     es.shutdown();
    }
    
}
