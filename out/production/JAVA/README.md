## Basic Java ##
            - Programming Language
            - Working of a Java program
            - Basic Java Program
            - Keyword in Java
            - Variable in Java
            - Data Type in Java
            -Type Conversion in JavaJava Comment
### Programming Language ###
<strong><p> A programming language is a system of notation for writing computer programs </p></strong>

##### Working of a Java Program #####

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

### Fist Java Program ###

```java

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```
## Java Keyword ##
<p>Resever Word </p>

|abstract|continue|for|new|switch|
|-----|----|------|----|-----|
|assert|default|goto|package|synchronized|
|boolean| do| if| private| this|
|break| doble|implements|protected|throw|
|byte|else|import|public|throws|

## Java Variable ##
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
## Java Data Type ##
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
## Data Type Conversion ##
<p>Data Type Implicit Conversion</p>
<p>Data Type Explicit Conversion</p>

```java
   public class Type_Conversion {
    public static void main(String[] args) {
        int num=10;
        long numlong = num;
        System.out.println(numlong);
    }
}
```
 
<h1>Lecture 02 </h1>
<strong>Lecture details </strong>
<ol>
<li> Binary Number System </li>
<li>Java Operators </li>
<li>Taking User Input</li>
</ol>


## Binary Number System ## 

### Convert Decimal to Binary ###
<p>Decimal Number Divide by 2 and remineder is binary digit </p>

### Convert Binary to decimal ###

### Convert Octal to decimal ###

### Decimal to Octal ###

### Hexa decimal to decimal ###

### Decimal to HexaDecimal ### 

### HexaDecimal to Octal ###
 
### Octal to Hexadecimal ###


### Binary Addition ###

### Binary Subtraction ###
<p> 2s complement </p>
<ol>
<li> 1s Complement (Zero to one and one to Zero)</li>
<li> Add 1 with 1s complement </li>
</ol>



## Type of Operator in Java ##
<ul>
<li>Arithmetic Operator </li>
<li>Assignment Operator</li>
<li>Relational Operator</li>
<li>Logical Operator</li>
<li>Unary Operator</li>
<li>Bitwise Operator</li>
</ul>


### Arithmetic Operator ###

|Operator|Sign|
|----|----|
|Additiion|+|
|Subtraction|-|
|Multiplication|*|
|Division|/|
|Modulus|%|

````java
public class Operator {
    public static void main(String[] args) {
        int a=12;
        int b=5;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Modulus: "+(a%b));

        double res = (double) a/b;
        System.out.println(res);
    }
}

````

### Assignment Operator ###
<p> Operation and Assign </p>

|Assignment Operator|Equivalent|
|---|---|
|+=|a=a+b|
|-=| a=a-b|
|*=| a=a*b|
|/=| a=a/b|
|%=|a=a%b|

````java
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

````


### Relational Operator ###
<p>A relational operator is used to check the relationship between two operands</p>
<p>Relational Operator always return boolean value</p>

|Operator|Description |
|-----|----|
|==|is Equal to|
|!=| Not Equal to|
|>|Greater than|
|<|Less than|
|>=| Greater Than Equal|
|<=| Less than Equal|

```java
import com.sun.security.jgss.GSSUtil;

public class Relational_Operato {
    public static void main(String[] args) {
        int FirstNum=10;
        int SecondNum = 3;
        System.out.println(FirstNum== SecondNum);

        System.out.println(FirstNum != SecondNum);

        System.out.println(FirstNum > SecondNum);

        System.out.println(FirstNum< SecondNum);

        System.out.println(FirstNum>=SecondNum);

        System.out.println(FirstNum<=SecondNum);
    }

}

```

### Logical Operator ###
<p>Logical operators are symbols or words used to connect two or more expressions and return a true or false value.</p>

| Operator | Meaning|
|--|---|
| && | Logical and|
| (||) |Logical Or|
| ! | logical Not|

````java
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

````


### Bitwise Operator ###
|Operator| Description|
|------|---|
|~|Bitwise Complement|
|<<| Left Shift|
|>>| Right Shift|
|>>>|unsigned Right Shift|
|& | Bitwise AND|
|^| Bitwise Exclusive Or|


### Unary Operator ###
<p>Unary operators are operators which are used to calculate the result on only one operand.</p>
     1. Increment
         * pre Increment
          * post Increment
      2. Decrement
          * pre decrement
          * post decrement

