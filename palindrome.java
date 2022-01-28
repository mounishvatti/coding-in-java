import java.util.Scanner;
public class palindrome {
  //palindrome  
    public static void main(String[] args){
        int n=0;
        boolean check=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String str = sc.nextLine();
        sc.close();
        n=str.length();
        for (int i=0; i<n; i++){
            if(str.charAt(i)==str.charAt((n-1)-i)){
                check=true;
            }
        }
        if (check==true){
            System.out.println("It's a palindrome"); 
        }
        else System.out.println("Not a palindrome");          
    }
}

