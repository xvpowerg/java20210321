/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_3_stream2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ch12_3 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        Student st1 = new  Student(85,"Ken");
        Student st2 = new  Student(96,"Vivin");
        Student st3 = new  Student(75,"Lucy");
        Student st4 = new  Student(94,"Iris");
        Student st5 = new  Student(51,"Tom");
        Student st6 = new  Student(73,"Gigi");
        Student st7 = new  Student(41,"Lindy");
        Student st8 = new  Student(76,"Joy");
        Student st9 = new  Student(81,"Ben");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);        
        list.add(st6);
        list.add(st7);
        list.add(st8);
        list.add(st9);
     Map<Integer,List<Student>>  group = 
             list.stream().collect(Collectors.groupingBy(st->st.getScore()/10));
     System.out.println(group);
     
       Map<Integer,Long>  groupCount = 
               list.stream().collect(Collectors.groupingBy(st->st.getScore()/10,
                 Collectors.counting()
                 ));
       System.out.println(groupCount);
       
        Map<Boolean,List<Student>> map = list.stream().
                collect(Collectors.partitioningBy(st->st.getScore()> 59));
        System.out.println(map);
    }
    
}
