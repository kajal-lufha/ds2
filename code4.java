import java.util.*; 
import java.io.*;
class code4{ 
    public static void display(int matrix[][]) 
    { 
        
        for (int[] row : matrix) 
  
           
            for (int x : row) 
                System.out.print(x + " "); 
    } 
  
    public static void main(String args[]) throws IOException 
    {
         Scanner s=new Scanner(System.in);
		 System.out.print("Enter Row : ");
         int rows=s.nextInt();
		 System.out.print("Enter Column : ");
         int columns=s.nextInt();
         System.out.println("Enter array elements : ");    
       int matrix[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                matrix[i][j]=s.nextInt();
            }
         }
        display(matrix); 
    } 
} 
