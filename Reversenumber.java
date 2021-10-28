import java.util.*;
public class Reversenumber 
{  
    public static void main(String[] args) {  
        //Initialize array  
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        int [] arr = new int [s];
        
        for(int i=0;i<s;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.println(arr[i] + " ");  
        }  
    }  
}  

