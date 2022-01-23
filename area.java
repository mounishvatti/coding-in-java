import java.util.Scanner;
import java.text.DecimalFormat;
public class area {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius: ");
    Float radius = sc.nextFloat();
    sc.close();
    DecimalFormat df = new DecimalFormat("####.##");     
    System.out.println(df.format(3.14f*radius*radius));     
    System.out.println(df.format(2*3.14f*radius));
}
}
