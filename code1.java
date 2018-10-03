import java.util.*;
class code1
{
static int large(int arr[],int len) 
{ 
         int i; 
         int max = arr[0]; 
        
         for (i = 1; i <len; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max; 
} 
public static void main(String[ ] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter no. of elements:");
int N=s.nextInt();
int[ ] arr=new int[N];
System.out.println("Enter array elements:");
for(int i=0;i<N;i++)
{
  arr[i]=s.nextInt();
}
System.out.println("Largest in given array is : " + large(arr,N));
}
}
