import java.util.Scanner;
public class sumavg {
    //sum&avg
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i,n;
        float sum=0,avg;
        System.out.print("\nEnter the number of elements: ");
        n=s.nextInt();
        int array[]=new int[n];
        System.out.print("Enter the elements: ");
        for (i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        //sum
        for (i=0;i<n;i++){
            sum=sum+array[i];
        }
        System.out.println("Sum of the elements: "+sum);
        //avg
        avg=sum/array.length;
        System.out.println("Average of the elements: "+avg);
        s.close();

    }
}
