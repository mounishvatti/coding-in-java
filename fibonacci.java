import java.util.Scanner;
public class fibonacci {
    //fibonacci series
    public static void main(String[] args){  
        int num1=0,num2=1,num3,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of elements required: ");
        n = sc.nextInt();
        sc.close();
        System.out.print(""+num1+" "+num2+"");
        for (i = 2; i < n; i++){
            num3 = num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}
