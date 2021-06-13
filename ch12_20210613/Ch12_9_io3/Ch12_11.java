/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_9_io3;
import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
public class Ch12_11 {
    public static void main(String[] args) {
        File file = new File("C:\\MyDir\\test.txt");
//        try(FileReader fr = new FileReader(file);){
//            int data = -1;
//            while ((data = fr.read()) != -1){
//                System.out.print((char)data);
//            }            
//        }catch(Exception ex){
//            System.out.println(ex);
//        }

     try(BufferedReader br = new BufferedReader(new FileReader(file)) ;){
            br.lines().forEach(v->System.out.println(v));              
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
}
