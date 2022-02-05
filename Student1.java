import java.util.Scanner;
public class Student1 {
    private String name;
    public Student1() {
        name = "Unknown";
    }
    public Student1(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a name: ");
        s = sc.nextLine();
        Student1[] students = {new Student1(), new Student1(s)};
        for (Student1 student : students) {
            System.out.println(student.getName());
        }
        sc.close();
    }
}
