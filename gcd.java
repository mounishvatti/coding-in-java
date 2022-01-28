import java.util.Scanner;  
public class gcd {
    //greatest common divisor
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the two integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int i,n,gcd=0;
        n=Math.min(a,b);
        for (i=1; i<=n; i++)
        { 
            if ((a%i==0) && (b%i==0))
                gcd=i;
        }
        System.out.println("The greatest common divisor of "+a+" and "+b+" is: "+gcd);
        System.out.println("\n");
        sc.close();
    }    
}
