import java.lang.Math; 
public class numbers {
    public static void main(String[] args){
        double a = 56.34, b = 6.58334, c = -34.4265, d = (a*a+b*b);
        System.out.println("\n(i) "+Math.random());
        System.out.println("\n(ii) The absolute value of c is: "+Math.abs(c));
        System.out.println("\n(iii) The sqare root of a is: "+Math.sqrt(a));
        if (a>b)
            System.out.println("\n(iv) a is greater");
        else System.out.println("\n(iv) b is greater");
        System.out.println("\n(v) The value of a^b is: "+Math.pow(a,b));
        System.out.println("\n(vi) Rounding off a = "+Math.round(a));
        System.out.println("\n(vii) [(a^2)+(b^2)]^(1/2) = "+Math.sqrt(d));
        System.out.println("\n(viii) Floor of b: "+Math.floor(b));
        System.out.println("       Ceil of b: "+Math.ceil(b));
        System.out.println("       Round of b: "+Math.round(b));
        System.out.println("       Floor of c: "+Math.floor(c));
        System.out.println("       Ceil of c: "+Math.ceil(c));
        System.out.println("       Round of c: "+Math.round(c));
        System.out.println("\n(ix) Radian of a: "+Math.toRadians(a));
        System.out.println("\n(x) Sin value of a is: "+Math.sin(a)+"\n");
    }
}
