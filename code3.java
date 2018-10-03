import java.util.*;
class code3 {
   public static void main(String args[]) {
      Scanner S=new Scanner(System.in);
      System.out.println("Enter no. of elements of first array : ");
      int n=S.nextInt();
      int[ ] array1=new int[1];
      System.out.println("Enter first array elements : ");
      for(int i=0;i<n;i++)
      {
        array1[i]=S.nextInt();
      }
      System.out.println("Enter no. of elements of second array : ");
      int n1=S.nextInt();
      int[ ] array2=new int[n1];	  
      System.out.println("Enter second array elements : ");
      for(int i=0;i<n1;i++)
      {
        array2[i]=S.nextInt();
      }
      
	  System.out.println("Intersection of the two arrays ::");
     
      for(int i = 0; i<n; i++ ) {
         for(int j = 0; j<n1; j++) {
            if(array[i]==array2[j]) {
               System.out.println(array2[j]);
            }
         }
      }
   }
}

