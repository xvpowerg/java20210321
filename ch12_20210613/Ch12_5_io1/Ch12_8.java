/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_5_io1;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch12_8 {

    public static void main(String[] args) {
        //可對檔案做基本控制
        File srcFile = new File("c:\\mydir\\test_file.zip");
         File copyFile = new File("c:\\mydir\\test_file_copy.zip");
         //Auto Close 內的變數是final的
        System.out.println(srcFile.exists());
        try( InputStream in =  
                new BufferedInputStream(new FileInputStream(srcFile));
            OutputStream out = 
                    new BufferedOutputStream(new FileOutputStream(copyFile));){     
            
            //如果檔案讀完了 回傳-1
            int data = -1;
            while( (data = in.read()) != -1){
                out.write(data);
            }     
       }catch(FileNotFoundException ex ){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
