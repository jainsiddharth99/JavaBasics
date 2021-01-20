
// Import Statement to import the io pacakage with all its Consituents Classes in Java.
import java.io.*;

/*
 * A Java Program to Show the use of the 
 * BufferReader Class in Java to take
 * User String user input from Java.
 */
 
 public class Bufread{
   
 // Main Method Start 
 public static void main(String[] args){
     printName();
 }

 // Print Name Method Start 
   static void printName(){
   String pname=null;
 try{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter your name:");
     pname=br.readLine();
    }catch(IOException e){}
    
	System.out.println("Hello "+pname);
	

} // End of printName() Method.
 } // End of Class Bufread.
