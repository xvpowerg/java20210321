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
public class Ch12_6 {

    public static void main(String[] args) {
        //可對檔案做基本控制
        File srcFile = new File("c:\\mydir\\test_file.zip");
         File copyFile = new File("c:\\mydir\\test_file_copy.zip");
         
        System.out.println(srcFile.exists());
        try{
            InputStream in = new FileInputStream(srcFile);
            in = new BufferedInputStream(in);
            OutputStream out = new FileOutputStream(copyFile);
            out = new BufferedOutputStream(out);
            //如果檔案讀完了 回傳-1
            int data = -1;
            while( (data = in.read()) != -1){
                out.write(data);
            }
            //跟連線相關的一定要呼叫close
            //close 內會呼叫flush在關閉
            //注意close順序內向外
           out.close();
           in.close();
       }catch(FileNotFoundException ex ){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
