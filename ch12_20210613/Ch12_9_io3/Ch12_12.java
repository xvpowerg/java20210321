/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_9_io3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File file = new File("C:\\MyDir\\test3.txt");
         String msg = "Hello";
         try(FileWriter fw =  new FileWriter(file);){
             fw.write(msg);
         }catch(IOException ex){
               System.out.println(ex);
         }
    }
    
}
