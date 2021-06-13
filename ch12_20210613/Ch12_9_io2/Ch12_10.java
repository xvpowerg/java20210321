/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_9_io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author xvpow
 */
public class Ch12_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     File srcFile = new File("c:\\mydir\\test_file.zip");
         File copyFile = new File("c:\\mydir\\test_file_copy.zip");
        try( InputStream in = new FileInputStream(srcFile);
            OutputStream out = new FileOutputStream(copyFile);){
            byte[] buffer = new byte[1024*1024];//1mb大小的buffer
            int index = -1;
            while( (index = in.read(buffer)) != -1){
                out.write(buffer, 0, index);                
            }
       }catch(FileNotFoundException ex ){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
