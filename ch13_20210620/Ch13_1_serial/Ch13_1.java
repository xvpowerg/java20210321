/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_1_serial;
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Ch13_1 {
// 序列化 把物件變得可以傳遞到另一個系統內 (把物件變成IOStream)
// 反序列化 接收序列化的物件 把物件化後的IOStream 轉換為 指定的物建 (把物件變成IOStream)
    public static void main(String[] args) {            
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        File file = new File("C:\\MyDir\\myList.obj");
        try(FileOutputStream fout = new FileOutputStream(file);
             ObjectOutputStream objOut= new ObjectOutputStream(fout);   ){
                     objOut.writeObject(list);
            }catch(IOException ex){
            System.out.println(ex);
            }
        
        
    }
    
}
