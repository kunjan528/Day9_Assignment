import java.util.Scanner;
import java.util.Arrays;
public class Assignment1
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number N *  N :");
        int n = sc.nextInt();
        

        int a[][]=new int[n][n]; 
        System.out.print("Enter the array:");
        
      // int sum = 0;
      int i = 0;
      int j = 0 ;
        
        for( i = 0 ; i<n ; i++)
        {
            for( j = 0 ;j<n ;j++)
            {
                
                a[i][j]= sc.nextInt();
               
            }
           
        }
        for( i = 0 ; i<n ; i++)
        {
            for( j = 0 ;j<n ;j++)
            {
                
                System.out.print(" "+a[i][j]);
               
            }
            System.out.println();
           
        }

        int sumL = 0 ; 
        int sumR = 0 ;
       int sum = 0;
        int count = 0;
        
        for(i = 0 ;i<a.length ; i++)
        {
            for(j = i;j<a[0].length ; j++)
            {
                
                
                    if(i==j)
                {
                    sum = sum + a[i][j];
                    break;
                    //System.out.println("*********"+sumL);
                }
            }
        }
         for(i = 0 ;i<a.length ; i++)
        {
            for(j = 0 ;j<a[0].length ; j++)
            {
                
               if(i + j == a.length-1)
                {
                    
                    
                    sum  = sum+ a[i][j] ;
                    break;
                   
                    //    System.out.println(sumR);
                }
            }
        }
        if(a.length % 2  == 1)
        {
            i = a.length/2 ;
            sum = sum - a[i][i];
        }
           System.out.println("OUTPUT :"+sum);        
             
                
     }
           
                
            
}
        
       
       
