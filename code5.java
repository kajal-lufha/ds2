
import java.util.*;
class code5 {
static void rev(int array[],int i, int j)
{
  int temp;        
  if(i < j)
  {
    temp = array[i]; 
    array[i] = array[j];
    array[j] = temp;
    rev(array, ++i, --j);
  } 
}     
 public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the Size of Array : "); 
       int n=s.nextInt();
        int[] array=new int[n];
       System.out.print("Enter the elements of Array : ");
       for(int i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }  
        rev(array, 0, n-1);
        System.out.print("Array is reversed format is :");
        System.out.println(Arrays.toString(array)); 
        
    }
}