import java.util.Scanner;  
public class reversearray { 
        //reverse the array
        public static void main(String[] args){   
            int n;  
            Scanner sc = new Scanner(System.in);  
            System.out.print("\nEnter the number of elements you want to store: ");  
            n=sc.nextInt();  
            int[] array = new int[n];  
            System.out.print("Enter the elements of the array: ");  
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();  
            }  
            System.out.println("Original array: ");  
            for (int i = 0; i < n; i++) 
            {  
                System.out.print(array[i] + " ");  
            }  
            System.out.println();  
            System.out.println("Array in reverse order: ");  
            for (int i = n-1; i >= 0; i--) 
            {  
                System.out.print(array[i] + " ");  
            }  
        sc.close(); 
    }  
}

