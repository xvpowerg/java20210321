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
public class Ch13_13 {
        
    static class TestLock{
        public synchronized void func1(TestLock lock,String name){
            System.out.println("  ");
            lock.func2(name);
        }
        public synchronized void func2(String name){
            System.out.println("name:"+name);
        }        
    }
    
    
    public static void main(String[] args) {
        TestLock t1 = new TestLock();//綠
        TestLock t2 = new TestLock();//紅
        
        Thread th1 = new Thread(()->{
             t1.func1(t2, "T2");
        });
        Thread th2 = new Thread(()->{
            t2.func1(t1, "T1");
        });
        th1.start();
        th2.start();
        
    }
    
}
