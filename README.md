# Basic Java #
            - Programming Language
            - Working of a Java program
            - Basic Java Program
            - Keyword in Java
            - Variable in Java
            - Data Type in Java
            -Type Conversion in JavaJava Comment
## Programming Language ##
<strong><p> A programming language is a system of notation for writing computer programs </p></strong>

#### Working of a Java Program ####

     hello.java ---(Compiler)--> Hello.class ----(JVM)-->Hello.exe
 <strong>JVM:  </strong>
<p>JVM(java Virtual Machine) is an abstract machine that enable your computer to run a java program </p>

<strong> JRE: </strong> 
<p> Java Runtime Environment is a software package that provide java class Libraries , Java Virtual Machine and another component</p>

<Strong> JDK: </strong>

<p>Java Developement Kit is a software development kit required to devlop applilcation in Java</p>
<p>JRE and JDK Contain </p>
<ul>
 <li>Compiler</li>
<li>JavaDoc</li>
<li>Java Debugger</li>
</ul>

<strong> IDE </strong>
<p>Integrated Development Environment</p>

## Fist Java Program ##

```java

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```
# Java Keyword #
<p>Resever Word </p>
|abstract|continue|for|new|switch|
|-----|----|------|----|-----|
|assert|default|goto|package|synchronized|
|boolean| do| if| private| this|
|break| doble|implements|protected|throw|
|byte|else|import|public|throws|

# Java Variable #
<p>Variable is like container that store data or value </p>
<p>Use Camelcase Notation Ex: (phoneNumber) </p>

<strong>Rules for Naming Variable in Java </strong>
<ol>
  <li> Case Sensitive </li>
  <li> Variable Must Start with either a letter or underscore or a dollar sign </li>
  <li> Variable Name Can not ues White Space </li>
  <li> Variable Name cannot be a keyword </li>
</ol>

`````java
public class Variable {
    public static void main(String[] args) {
        int num=10;
        int mark=89;
        System.out.println("Number: "+num);
        System.out.println("Mark: "+mark);
    }
}

`````
# Java Data Type #
<p>Data types refer to the different sizes and values that can be stored in the variable</p>
<strong>Different type of Data type </strong>

|Data Type|Size|Default|
|-----|----|-----|
|boolean|1 bit| false|
|byte| 1 byte = 8 bit| 0|
|short| 2 byte| 0|
|int | 4 byte| 0|
|long|8 byte | 0L|
|float|4 byte | 0.of|
|double| 8 byte | 0.0d|
|char | 2 bytes|'\u0000'|

````java
public class Data_Type {
    public static void main(String[] args) {
        int num=10;
        float num2=3.14f;
        double num3 = 3.45;
        boolean ispassed = true;
        char ch ='a';
        String  name="Khorsed Alam";
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(ispassed);
        System.out.println(ch);
        System.out.println(name);
    }
}

````
# Data Type Conversion #
<p>Data Type Implicit Conversion</p>
<p>Data Type Explicit Conversion</p>
````java
    public class Type_Conversion {
    public static void main(String[] args) {
        int num=10;
        long numlong = num;
        System.out.println(numlong);
    }
}

````