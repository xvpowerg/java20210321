/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_10_Stream2;
import java.util.stream.Stream;
public class Ch10_10 {

    //Stream 不會修改來源
    //Stream 只能使用一次不可重複使用
    //Stream 惰性 跟 終端
    //惰性 不會運行
    //終端 會開始運行一連串的惰性方法
    public static void main(String[] args) {
        // TODO code application logic here
        Stream<String> st1 = Stream.of("A","B","C");
        st1.forEach(v->System.out.println(v));
        //long count = st1.count();//Stream 只能使用一次不可重複使用
        
        Stream<String> st2 = Stream.of("A","B","C");
        st2.peek(v->System.out.println("peek"+v));//不會輸出因為peek回傳Stream所以是惰性(lazy)
        
        //會輸出因為count回傳不是Stream所以是終端(termainal)
        //long count2 = st2.peek(v->System.out.println("peek"+v)).count();
        
        //System.out.println(count2);
    }
    
}
