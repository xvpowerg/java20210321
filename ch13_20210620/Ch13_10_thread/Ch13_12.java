/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_10_thread;

/**
 *
 * @author xvpow
 */
public class Ch13_12 {
    static class TestClass{
        int x;        
        public  void count(){
            int y = 0;
            for(int x=1;x<=50;x++){
               System.out.println(Thread.currentThread().getName()+":y:"+(++y));
        }
         //加一把鎖
         //
            synchronized(this){
                    for (int i =1;i <=50;i++){
                        System.out.println("Start Name:"+Thread.currentThread().getName());
                        x++;
                        System.out.println(x);
                       System.out.println("End Name:"+Thread.currentThread().getName());
                    }
            }
                
    
        }
    }
    public static void main(String[] args) {
      TestClass t1 = new TestClass();
      Thread th1 = new Thread(()->{
          t1.count();
      });
      Thread th2 = new Thread(()->{
          t1.count();
      });
      th1.start();
      th2.start();
    }
    
}
