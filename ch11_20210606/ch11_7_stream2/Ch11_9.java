/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_7_stream2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Ch11_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(25);
       list.add(65);
       list.add(18);
       
       int sum = list.stream().mapToInt(v->v).sum();
       System.out.println(sum);
       
       Optional<Integer> op1 =  list.stream().reduce((v1,v2)->{
            System.out.println(v1+":"+v2);
            return v1+v2;
        });
       System.out.println(op1.get());
       System.out.println("================");
       //可給第一個數值
       int ans = list.stream().reduce(0, (v1,v2)->{
       System.out.println(v1+":"+v2);
       return v1+v2;
       });
       System.out.println(ans);
       System.out.println("================");
         List<String> myList = new ArrayList<>();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Lindy");
       myList.add("joy");
       myList.add("Lucy");
       
       String div = myList.stream().reduce("",(v1,v2)->{
           return v1+String.format("<div>%s</div>", v2);
       });
       System.out.println("div:"+div);
    }
    
}
