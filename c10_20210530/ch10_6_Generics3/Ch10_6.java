/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_6_Generics3;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch10_6 {

  static void testList(ArrayList<Test1> list){
      
  }
  //我不清楚泛型是什麼類型 但一定是 Test1的子類型
  //只能取值不能新增
  //取出的數值是泛型定義的數值
  static void testSubList(ArrayList<? extends Test1> list){
      //list.add(new Test2());
        for (Test1 t1 : list){
            System.out.println(t1);
        }
  }
  //我不清楚泛型是什麼類型 但一定是 Test3的父類型  
  //可新增類型必須跟泛型一樣
  //可取值取出類型為Object
  static void testSuper(ArrayList<? super Test3> list){
      list.add(new Test3());
      
      for(Object t3 : list){          
          System.out.println(t3);
      }
      
  }
  
    public static void main(String[] args) {
        //在一般情況下 傳入泛型變數的泛型必須一樣
       ArrayList<Test1> listT2 = new ArrayList<>();
       //testList(listT2);//錯誤因為參數泛型是Test1 但傳入的泛型是Test2
       //泛型可為 Test1 ~Test4   
       listT2.add(new Test1());
       listT2.add(new Test2());
       listT2.add(new Test3());
       listT2.add(new Test4());
       testSubList(listT2);
        
     ArrayList<Test2> listT3 = new ArrayList<>();
     //必須是Test3父類型 所以<Test1> <Test2> <Test3> 可以放入參數
       testSuper(listT3);
       
    }
    
}

