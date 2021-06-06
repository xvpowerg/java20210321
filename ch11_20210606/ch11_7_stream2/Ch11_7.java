/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_7_stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;
public class Ch11_7 {
    public static void main(String[] args) {
         List<String> myList = new ArrayList<>();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Lindy");
       myList.add("joy");
       myList.add("Lucy");
       myList.add("Lindy");
       myList.add("Lucy");
       //在非parallel的狀況下 findAny 與findFirst一樣
       //parallel:將資料與運算分散在多核心
       //有序的都不要用在parallel 因為parallel本身無序 做完parallel 還要排序速度會拖慢
       //findAny:隨機在不同核心內挑一個Stream內的數值
       Optional<String>any = myList.stream().parallel().findAny();
       //一定挑Stream的第一個      
       Optional<String>first = myList.stream().findFirst();
       System.out.println(any.get());
       System.out.println(first.get());
       //字典序
       //小寫 > 大寫 > 數字
       //字串比大小
       //1 如果字串一樣長 由頭開始比 只到找到 小於或大於的就知道結果
       //AAC 小
       //AAE 大
       //2如果字串不一樣長 由頭開始比 如果前面都一樣 看誰最長 誰就最大 
       //AB 大
       //A  小
       //3如果字串不一樣長 由頭開始比 如果前面 誰最大 就是最大的字串
       //ABCDEFG 小
       //ZX 大
       Optional<String> maxOp = myList.stream().max(Comparator.comparing(v->v));
       System.out.println("max:"+maxOp.get());
       
    }
    
}
