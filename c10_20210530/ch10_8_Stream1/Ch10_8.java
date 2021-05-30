/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_8_Stream1;

import java.util.List;

public class Ch10_8 {

   //1 不希望列表(清單)被修改到
   //2 語意不清 無標準流程
    public static void main(String[] args) {
        Student st = new Student();
        st.add(20);
        st.add(60);
        st.add(95);
        List<Integer> scoreList = st.getScores();
        scoreList.add(87);
        scoreList = st.getScores();
        int sum = 0;
        for (int v  : scoreList){
            System.out.println(v);
            sum+=v;
        }
        System.out.println("avg:"+(sum / scoreList.size()));
        
        
        
    }
    
}
