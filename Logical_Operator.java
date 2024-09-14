public class Logical_Operator {
    public static void main(String[] args) {
        boolean FirstExpression = false;
        boolean SecondExpression = true;

        System.out.println(FirstExpression && SecondExpression);// output:False
        System.out.println(FirstExpression || SecondExpression);// output: True
        System.out.println(!FirstExpression);// output: true
        System.out.println(!SecondExpression);// output:false
    }
}
