import java.util.Scanner;
public class strings{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        String st="";
        do{
        System.out.println("\n1.Append \n2.Insert \n3.Delete");
        System.out.print("\nEnter: ");
        n=sc.nextInt();
        String portion;
        String newstr;
        switch(n){
            case 1:
            //Appending string
                System.out.println("Enter to append string: ");
                newstr=s.nextLine();
                System.out.println("Your updated string is: ");
                st=st+" "+newstr;
                System.out.println(st);
                break;
            case 2:
            //Inserting string
                System.out.println("Enter the string to be inserted: ");
                st=s.nextLine();
                System.out.println("Entered string: "+st);
                break;
            case 3:
            //Delete portion of string
                System.out.println("Enter the portion of the string to be deleted: ");
                portion=s.nextLine();
                if(st.contains(portion))
                    st=st.replace(portion, "");
                System.out.println("String after deletion is: "+st);
                break;
        }
    }
        while(n<=3 && n>=1);   
        sc.close();
        s.close();
}
}