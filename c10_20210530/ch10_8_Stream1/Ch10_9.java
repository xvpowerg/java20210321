/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_8_Stream1;

import java.util.OptionalDouble;
public class Ch10_9 {
    public static void main(String[] args) {
               Student st = new Student();
        st.add(20);
        st.add(60);
        st.add(95);
        //好閱讀
        //不修改來源
        //Stream優點
        OptionalDouble average = st.getScoreStream().
                mapToInt(s->s).
                average();
       System.out.println(average.getAsDouble());
               
    }
    
}
