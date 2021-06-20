/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_5_nio2;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
public class Ch13_6 {

    public static void main(String[] args) {
        Path p1 =  Paths.get("c:","mydir","test_file.zip");
        Path p2 =  Paths.get("c:","mydir","test_file_copy.zip");
        try{
            //預設情況下 copy檔名不可重複
            Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);}
        catch(IOException ex){System.out.println(ex);}
    }
    
}
