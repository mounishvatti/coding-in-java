import java.util.Scanner;  
public class convertors {
  //decimal to binary
    static void DecimalToBinary(int n){
	    int[] binarynum = new int[100];
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
    static void DecimalToOctal(int n){
        int[] octalnum = new int[n];
        int i=0;
        while(n>0){
            octalnum[i] = n%8;
            n=n/8;
            i++;
        }
        for (int j = i-1; j >= 0; j--)
            System.out.print(octalnum[j]);
    }
    static void DecimalToHexadecimal(int n){
        int rem;
        String hexdec_num="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n>0)
        {
            rem = n%16;
            hexdec_num = hex[rem] + hexdec_num;
            n = n/16;
        }
        System.out.print(hexdec_num);  
    }
	public static void main (String[] args)
	{
        int n;
        Scanner sc = new Scanner(System.in);  
        System.out.print("\nEnter the decimal: "); 
        n=sc.nextInt();
        sc.close();
		System.out.print("Binary - "); DecimalToBinary(n);
        System.out.print("\nOctal - "); DecimalToOctal(n);
        System.out.print("\nHexadecimal - "); DecimalToHexadecimal(n);
	}
}
