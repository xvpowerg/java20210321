/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_7_Generics4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author xvpow
 */
public class Ch10_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestFunction tf1 = new TestFunction();
        String obj = tf1.<String>testValue("Ken");
        System.out.println(obj);
        
        int v2 =  tf1.<Integer>testValue(20);
        System.out.println(v2);
        
        int ans = tf1.calculate(20, 15,
                (x1,x2)->x1+x2);
        System.out.println(ans);
        
        double ans2 = tf1.calculate(3.5, 2.5,
                (x1,x2)->x1*x2);
        System.out.println(ans2);
        List<Integer> list = new ArrayList();
        TestFunction.testEmpty(list,
                (ls)->ls.isEmpty(), 
                ()->new NoSuchElementException());
        
//        TestFunction.testEmpty("",str->str.length() == 0,
//                ()->new IllegalArgumentException("字串空白"));
//        
    }
    
}
