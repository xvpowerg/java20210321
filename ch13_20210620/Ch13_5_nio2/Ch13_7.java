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
public class Ch13_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 =  Paths.get("c:","mydir","test_file.zip");
        Path p2 =  Paths.get("c:","mydir","..","mydir","test_file.zip");
        
        Path p3 =  Paths.get("d:","mydir",".","xxxx");
        Path p4 =  Paths.get("d:","mydir","xxxx");
        try{
            //isSameFile 是否為同一個檔案
          //System.out.println(Files.isSameFile(p1, p2));
          //就算檔案不存在 只要路徑一樣就認為相同檔案 
          //路徑不一樣 才會真的察看 目錄下的檔案
          System.out.println(Files.isSameFile(p3, p4));
        }catch(IOException ex){
            System.out.println(ex);
        }
       
    }
    
}
