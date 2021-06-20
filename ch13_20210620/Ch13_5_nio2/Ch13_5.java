/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210620.Ch13_5_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Path 管理路徑        
        Path p1  = Paths.get("c:", "mydir","test.txt");
        System.out.println(p1.getFileName());
          System.out.println(p1.getRoot());
          //root 不算在NameCount
           System.out.println(p1.getNameCount());
        Path p2  = Paths.get("c:", "A","B","C","D");    
        //Root不算在subpath內
         System.out.println("subpath:"+p2.subpath(0, 3));    
         System.out.println("p2:"+p2); 
         //normalize 可移除不必要的路徑
         Path p3 = Paths.get("c:","./Mydir/../MyDir/dir1");
          System.out.println("p3:"+p3.normalize()); 
          
          Path p4 = Paths.get("c:","mydir","dir1");
          Path p5 = Paths.get("c:","mydir","dir1","dir2");
          //relativize 取得相對位置
          //root必須一樣
          System.out.println(p4.relativize(p5));
          System.out.println(p5.relativize(p4));
          
          Path p6 = Paths.get("c:","mydir","dir1");
          Path p7 = Paths.get("images","test.jpg");
          //融合
          System.out.println(p6.resolve(p7));
    }
}
