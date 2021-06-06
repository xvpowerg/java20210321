/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_3_optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student(null,20);
        Optional<String> nameOptional = st1.getName();
        //isPresent() 表示內容不是null
        //get() 表示取出內容
        if (nameOptional.isPresent() &&
                nameOptional.get().equals("Ken")){
           System.out.println("Hi!!!");
        }
    }
    
}
