public class parameters{
    public static void main(String[] args){
        parameters obj = new parameters();
        obj.Printn(969, 'Y');
        obj.Printn('X', 7);
    }
    void Printn(int n , char c){
        System.out.println("Integer is: "+n+ "\t Char is: "+c); 
    }
    void Printn(char c,int n ){
        System.out.println("Char is: "+c+ "\tInteger is: "+n );
    }
}