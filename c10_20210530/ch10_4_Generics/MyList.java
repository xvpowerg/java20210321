/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_4_Generics;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList list = new ArrayList();
    public void add(T s){
        list.add(s);
    }    
    public T get(int index){
        return (T)list.get(index);
    }
}
