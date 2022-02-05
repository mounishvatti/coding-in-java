public class methodoverloading{
    void add(int a, int b){   
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        methodoverloading obj = new methodoverloading();
        obj.add(5, 10);
        obj.add(25, 35, 9);
    }
}