public class Assignment_Operator {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        System.out.println(a+=b);// output:13
        System.out.println(a-=b);// output: 10
        System.out.println(a*=b);// output:30
        double c= (double)a/b;
        System.out.println(c);// output:10
        System.out.println(a%=b);
    }
}
