import java.io.*;
import java.util.*;


 class MyException extends Exception{
  
    
  
  public MyException(){
    System.out.println("java.lang.Exception: Breadth and height must be positive");
  }
}

class Solution {
  
    static int calculateArea(int b , int h) throws MyException{
        if (b < 0 || h<0){
            throw new MyException();
        }
        else{
            return b * h;
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sn = new Scanner(System.in);
        
        for(int i =0; i<2; i++){
          try{
            
          }
          
          catch(Exception e){
            System.out.println("Make sure it is of type int");
            sn.nextLine();
          }
        }
        
    }
}