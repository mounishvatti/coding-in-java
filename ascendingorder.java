import java.util.Scanner;
public class ascendingorder {
    //sorting in ascending order
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("\nEnter the number of elements: ");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.print("Enter the elements: ");
        for(i=0; i<n; i++){
            ar[i]=sc.nextInt();
        }
        for ( i = 0; i < n-1; i++)
            for (j = 0; j < n-i-1; j++)
                if (ar[j] > ar[j+1])
                {
                    int temp = ar[j]; 
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
        System.out.print("Sorted Array: ");
        for (i=0; i<n; ++i)
            System.out.print(ar[i] + " ");
    
        sc.close();    
    }    
}

