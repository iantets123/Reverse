import java.util.*;
public class SecondBatch{

static public String reversenumber(String numbers){
   
   String temp = " ";
   
   for(int i = numbers.length()-1; i >= 0; i--)
      temp+= numbers.charAt(i);
   
   return temp; 
   
   } 

static public void main(String... args){  
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter number: ");
      
      String numbers = myObj.nextLine();
      
      System.out.println(reversenumber(numbers));                
    }
}