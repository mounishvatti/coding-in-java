import java.util.Scanner;  
public class decimaltobinary {
  //decimal to binary
    static void DecimalToBinary(int n){
	    int[] binarynum = new int[1000];
	    int i=0;
		while(n>0)
		{
			binarynum[i] = n%2;
			n=n/2;
			i++;
		}
		for (int j = i-1; j>=0; j--)
			System.out.print(binarynum[j]);
    }
	public static void main (String[] args)
	{
        int n;
        Scanner sc = new Scanner(System.in);  
        System.out.print("\nEnter the decimal: "); 
        n=sc.nextInt();
        sc.close();
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		DecimalToBinary(n);
	}
}
