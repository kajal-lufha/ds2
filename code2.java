import java.util.*;
class code2
{
    static void Sort(int array[],int n)
    {
        
        for (int i = 0; i <n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
 
    static void display(int array[],int n)
    {
        
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n=S.nextInt();
        int[ ] array=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
          array[i]=S.nextInt();
        }
        Sort(array,n);
        System.out.println("output : ");
        display(array,n);
    }
}
