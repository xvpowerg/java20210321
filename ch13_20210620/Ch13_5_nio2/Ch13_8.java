/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_5_nio2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch13_8 {


    public static void main(String[] args) {
     Path p1 =  Paths.get("c:", "MyDir");
     try{
         //list只會讀一層
       //Files.list(p1).forEach(p->System.out.println(p));\
       //  Files.walk 會讀到2147483647層       
       //Files.walk(p1).forEach(p->System.out.println(p));
       Files.walk(p1,1).forEach(p->System.out.println(p));
     }catch(IOException ex){
         System.out.println(ex);
     }
    
    }
    
}
