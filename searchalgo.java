import java.util.Scanner; 
class searchalgo {
    public static void main(String[] args){
        int n,num;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the length of the array: ");
        n=sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter an element to be searched: ");
        num=sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (array[i]==num){
                check=true;
            }
        }
        if (check==true){    
            System.out.println("Element "+num+" is present in the array!");
        }
        else{
                System.out.println("Element "+num+" is not present in the array!");
            }
    }    
}
