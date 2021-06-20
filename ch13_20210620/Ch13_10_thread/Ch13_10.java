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
public class Ch13_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        System.out.println("Start!");
        //模擬做了5秒事情
        Thread th1= new Thread(){
            public void run(){
                try{
                       Thread.sleep(5000);
                }catch(Exception ex){
                    
                }
             
            }
        };
        th1.start();
        
        System.out.println("End!!");
        
        
    }
    
}
