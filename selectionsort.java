import java.util.Scanner;
public class selectionsort {
    //selection sort
    public static void main(String[] args){
        System.out.print("\nEnter number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array= new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n-1; i++){
            int min = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min])
                    min = j;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.print("Sorted array: ");
        for (int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
        int a=0;
        array[a]=array[0];
        for(int i=0;i<n;i++){
            if (array[a]!=array[i]){
                a++;
                array[a]=array[i];
            }
        }
        System.out.print("\nSorted array after deletion of duplicate elements is: ");
        for (int i=0;i<=a;i++){
            System.out.print(array[i]+" ");
        }    
    }
}
