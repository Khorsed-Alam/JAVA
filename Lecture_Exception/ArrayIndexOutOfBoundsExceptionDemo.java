package Lecture_Exception;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int []arr= new int [10];
        System.out.println("Hi");

        try{
            System.out.println(arr[19]);
        }catch (ArrayIndexOutOfBoundsException E)
        {
            System.out.println("Trird to access the out of bound Exception ");
        }

        System.out.println("Hello");

    }
}
