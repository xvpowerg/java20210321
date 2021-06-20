/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_1_serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ch13_4 {
    public static void main(String[] args)throws Exception {
        File file = new File("C:\\MyDir\\myItem.obj");
        try(FileInputStream fi = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fi);    ){
            Item item = (Item)objIn.readObject();
            System.out.println(item);
        }
    }    
}
