/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_5_Generics2;
import c10_20210530.ch10_4_Generics.*;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
//MyList 泛型必須是Number的子類
public class MyNumberList<T extends Number> {
    private ArrayList list = new ArrayList();
    public void add(T s){
        //預設情況下 T可以任何類型
        //所以s只能用Object的函數                
        list.add(s);
    }    
    public T get(int index){
        return (T)list.get(index);
    }
}
