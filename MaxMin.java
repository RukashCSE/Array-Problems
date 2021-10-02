import java.util.*;
class MaxMin
{
    public static void main(String[] args)
    {
        int i,j,temp=0,min=0;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        a[i]=temp;  // a[0]=temp only pass large num, a[i] pass both
        for(i=0;i<n;i++)
        {
           if(a[i]>temp)
           {
             temp=a[i];  
           }
        }
        min=temp;
        for(i=0;i<n;i++)
        {
           if(a[i]<min)
           {
             min=a[i];  
           }
        }
        System.out.println("The minimum Num is :"+min);
            System.out.println("The maximum Num is :"+temp);
    }
}
