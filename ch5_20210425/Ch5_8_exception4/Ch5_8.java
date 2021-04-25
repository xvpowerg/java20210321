/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20210425.Ch5_8_exception4;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
public class Ch5_8 {

  static void testException(int v)throws IOException,FileNotFoundException,SQLException{
      switch(v){
	  case 1:
	      throw new IOException("IO1");
	  case 2:
	      throw new FileNotFoundException("Fnot 2");
	  case 3:
	      throw new SQLException("SQL Ex");	      
      }
  }
    public static void main(String[] args) {
	//越下越父	
	try{
	   testException(5); 
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(SQLException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}catch(Exception ex){
	    System.out.println(ex);
	}
    }
    
}
