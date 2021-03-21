/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210321;

/**
 *
 * @author xvpow
 */
public class Test {
    public static void main(String[] args){
        practice2();
    }
    
    static void practice1(){
        for ( int i=1; i<=5; i++)
        {
            if(i == 3)
            {
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
    
    static void practice2(){
        for ( int i=1; i<=5; i++){
            System.out.println("Start:"+i);
            for ( int k=1; k<=3; k++){
                System.out.println("Body:"+i+"_"+k+" ");
            }
            System.out.println();
            System.out.println("End:"+i);
        }
    }
}

