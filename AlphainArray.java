import java.util.*;
public class AlphainArray {    
    public static void main(String[] args) {  
         Scanner obj=new Scanner(System.in);
         int n=obj.nextInt();
         
        char [] a = new char[n]; 
        System.out.println("Write Character in array:");  
        for (int i = 0; i < a.length; i++) {  
             a[i]=obj.next().charAt(0);
        }  
        
        System.out.println();
        System.out.println("The given Character is: "); 
        for (int i = 0; i < a.length; i++) {  
             System.out.print(a[i]);
        }  
        
    }  
}  




