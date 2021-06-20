/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_1_serial;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Ch13_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          File file = new File("C:\\MyDir\\myItem.obj");
       Item i1 = new Item("A",100);
        try(FileOutputStream fOut = new FileOutputStream(file);
               ObjectOutputStream pbjOut = new ObjectOutputStream(fOut);){
            pbjOut.writeObject(i1);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
