/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_2_treemap;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Iris");
        list.add("Ken");
        list.add("Lucy");
        list.add("Tom");
        list.removeIf(p->p.indexOf("i") != -1);
        //System.out.println(list);
        System.out.println("Lucy".indexOf("x"));

                

    }
    
}
