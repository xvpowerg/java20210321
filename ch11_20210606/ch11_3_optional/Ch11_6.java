/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210606.ch11_3_optional;
import java.util.Optional;
public class Ch11_6 {
    
    static Optional<String> searchNameByLength(int len,String ... names){
        
        for (String  n : names){
            if (n.length() == len){
                return Optional.ofNullable(n);
            }
        }
        return Optional.empty();
    }
    
     public static void main(String[] args) {
        Optional<String>  name = searchNameByLength(4,"Vivin","Iris","joy","Lucy");
        name.ifPresent(n->System.out.println(n));
//         System.out.println(name);
         
     }
}
