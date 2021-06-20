/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_1_serial;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {
// 反序列化 接收序列化的物件 把物件化後的IOStream 轉換為 指定的物建 (把物件變成IOStream)
    public static void main(String[] args) {
          File file = new File("C:\\MyDir\\myList.obj");
     try(FileInputStream fin = new FileInputStream(file);
          ObjectInputStream objIn = new   ObjectInputStream(fin); ){
         ArrayList<String> list = (ArrayList)objIn.readObject();
         
         System.out.println(list);
     }catch(IOException | ClassNotFoundException ex){//使用|的catch 的例外不可有繼承關西
         System.out.println(ex);
     }
        
        
    }
    
}
