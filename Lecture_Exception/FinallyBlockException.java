package Lecture_Exception;

public class FinallyBlockException {
    public static void main(String[] args) {
        int []a= new int [4];
        System.out.println("hello world");
        try{
            System.out.println(a[8]);
        }catch (Exception E)
        {
            System.out.println("Exception Handle");
        }finally {
            System.out.println("I will run Always");
        }
        System.out.println("Bye world");
    }
}
