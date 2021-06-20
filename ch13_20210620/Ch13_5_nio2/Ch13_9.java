/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_5_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch13_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 =  Paths.get("c:", "MyDir","test.txt");
        try{
              Files.lines(p1).forEach(s->System.out.println(s));
        }catch(IOException ex){
            System.out.println(ex);
        }
      
    }
    
}
