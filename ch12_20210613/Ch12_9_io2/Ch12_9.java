/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210613.Ch12_9_io2;

/**
 *
 * @author xvpow
 */
public class Ch12_9 {
     public static void main(String[] args) {
         /*
         Body!!
         close name:Test2 Close
        close name:Test1 Close
         */
//         try( TestClose tc1 = new TestClose("Test1 Close");
//              TestClose tc2 = new TestClose("Test2 Close");){
//             System.out.println("Body!!");
//         }catch(Exception ex){
//             System.out.println(ex);
//         }
        /*
        Body!!
        close name:Test2 Close
        close name:Test1 Close
        finally!!
        */
//    try( TestClose tc1 = new TestClose("Test1 Close");
//              TestClose tc2 = new TestClose("Test2 Close");){
//             System.out.println("Body!!");
//         }catch(Exception ex){
//             System.out.println(ex);
//         }finally{
//          System.out.println("finally!!");
//         }

//
//    try( TestClose tc1 = new TestClose("Test1 Close");
//              TestClose tc2 = new TestClose("Test2 Close",true);){
//             System.out.println("Body!!");             
//         }catch(Exception ex){
//             System.out.println("Exception"+ex);
//         }finally{
//          System.out.println("finally!!");
//         }

/*
Body!!
close name:Test2 Close
close name:Test1 Close
Exceptionjava.lang.Exception: Body~!!!
finally!!
*/
    try( TestClose tc1 = new TestClose("Test1 Close");
              TestClose tc2 = new TestClose("Test2 Close",true);){
             System.out.println("Body!!");
             throw new Exception("Body~!!!");
         }catch(Exception ex){
             //TestClose 被 Suppressed 為什麼因為Body Exception 先拋出
             
            Throwable[] tharry=  ex.getSuppressed();            
                    for(Throwable th:  tharry){
                          System.out.println(th);
                    }            
             System.out.println("Exception"+ex);
         }finally{
          System.out.println("finally!!");
         }
         
//         System.out.println(tc1);
//         System.out.println(tc2);
     }
}
