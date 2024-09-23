<h1>Exception Handling</h1>
<h4>Exception</h4>
<ol>
<li>Java Exception</li>
<li>Java Exception Handle</li>
<li>Try and Catch Block</li>
<li>Throw and Throws Block</li>
</ol>


<h2>Java Exception</h2>
<p>An Exception is an unexpected event that occurs during program Execution . Its effect the flow of the program instruction which can cause the problem to terminate <b>abnormally</b></p>

<b>Exception can occur for many reason </b>
<ul>
<li> Invalid User input</li>
<li>Device Failure</li>
<li>Lose of network Connection</li>
<li>Physical Limitation (Out of disk memory)</li>
<li>Code Error </li>
<li>Opening an unavailable file</li>
</ul>

<h3>Types of Java Exception </h3>
<ul>
<li>Java Runtime Exception </li>
<li>Java IOException Exception </li>
</ul>

<h4>Java Runtime Exception</h4>
<p>A Runtime Exceptin happends due to a programming Error . These Exception are not Check at compile time </p>

<b>Some Run Time Exception</b>
<ol>
<li>NULL Pointer Access --> (Missing the initialization of a Variable) NULLPointerException</li>
<li>Out-of-bounds array access --> ArrayIndexOutOfBoundsExecption </li>
<li>Dividing a Number by 0 -->ArithmeticException </li>
</ol>

<p><b>NB: </b> If it is a runtime Exception then it is your fault </p>


<h4>Java IOException Exception/ Compile Time Exception </h4>
<P>An IOException is also known as a checked exception . They are checked by compiler</p>


<h2>Try and Catch Block</h2>
<p>Try Catch block in java is used to handle Exception and Prevents the Abnormal termination of the program </p>

````text
try{
    // code;
        }catch(){
    // code;
        }
````

<h5>ArrayOutOfBoundsException</h5>
```java
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

```

<h5>ArithmeticException</h5>
```java
package Lecture_Exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            int result=5/0;
        }catch (ArithmeticException E){
             E.printStackTrace();
        }
        System.out.println("bye");
    }
}

```

<h5>Mixed Exception</h5>


```java
package Lecture_Exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            int result=5/0;
        }catch (ArithmeticException E){
             E.printStackTrace();
        }
        System.out.println("bye");
    }
}

```


<h2>try-catch-finally Block</h2>
<p>Finally keyword use only one time. But we can use catch  block multiple time </p>

````java
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

````

<h2>Throw and Throws</h2>
