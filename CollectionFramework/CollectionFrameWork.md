<H1>Java Collection Framework</h1>
<br>The java collection framework provides a set of interface and Classes to implement various data structure and algorithms.</br> These interface include several method to perform different operator on Collection. </p>

<Strong>Collection(interface)</Strong>
<ol>
<li>List</li>
<li>Set
<ul>
<li>Sorted Set</li>
</ul>
</li>
<li>Queue
<ul>
<li>Deque </li>
</ul>
</li>
</ol>

<h3>Java Collection Interface</h3>
<p>The collection interface include various method that can be used to perform different operator on object </p>

| Method Name                        |Uses|
|------------------------------------|------|
| int size()                         | Return the number of element in the collection |
| boolean isEmpty()                  |Return True if Collection contain no element|
| boolean contains(Object o)         |Return true If the collection contains the specific element|
| boolean add (E e)                  |adds the specific element to the collection . Returns true if the collection change as a result.|
| boolean remove(Object o)           |Remove a single object of the specific element from the collection|
| boolean containsAll(Collection<>c) |Return true if the collection contains all element of the specified collection|
| boolean addAll(Collection<>c)      |Adds all element from the specific collction to the collection|
| boolean removeAll(Collection<>c    |Remove All element in the collection that are alse contained in the specified collection|
| boolean retainAll(Collection<>c)   |Remove all element from the collection that are not present in the specified collection|
|void clear() |Remove All element from the collection|
|object []toArray()|return an array containging all elements in the collection |



<h2>ArrayList  collection interface </h2>
```java
package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);// Print Full List-->[10, 20, 30]
        System.out.println(list.size());// print List size--->3
        System.out.println(list.contains(300));// Print true or false if element is part of the list

        System.out.println(list.remove(1));// Remove 1 th index element

        list.add(29);
        list.add(35);
        list.add(56);

        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(35)));// Remove Specific element into the list
        System.out.println(list);


    }
}

```

<h3>Java List Interface</h3>
<p>The list interface extends the collection interface and adds methods that are specific to list ,Which are ordered collection that allow duplicate element</p>

<h4>List is an interface but subclass are Class</h4>
<ul>
    <li>ArrayList</li>
    <li>LinkedList</li>
    <li>Stack</li>
    <li>Vector</li>
</ul>

|List Interface method| uses    |
|----|---------|
|get(int index)| Retrieves the element at the specified index in the list |
|set(int index,E element)| Replace the element at the specific index with the given element |
|add(int index,E element)| Insert the specific element at the specified position in the list -->shifting the current elements to the right |
|remove(int index)| Remove the element at the specified index from the list and shifts the remaining elements to the left |
|indexof(Object 0)| Return the index of the first occurrence of the specified element in the list, or -1 if not into  present. |
|lastIndexof(Object o)| Return the index of the last occurrencr of the specified element in the list or -1 if element not into the list|
|listItarator(int index)|Return List iterator over the elements in the list|
|subList(int fromIndex, int toIndex|Return a view of the portion of the list between the specific fromIndex and toIndex|


<h6>Code</h6>

`````java
package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfacelist {
    public static void main(String[] args) {
        List <Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));// print 1 st index element

        list.set(1,200);// Replace element from specific position
        System.out.println(list);

        list.add(0,100);
        System.out.println(list);// Right shifting and added one element

        list.remove(2);
        System.out.println(list);// Left shifting and remove one element
    }
}

`````




````java
package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {
        List<String> Fruits = new ArrayList<>();
        Fruits.add("Kiwi");
        Fruits.add("Papaya");
        Fruits.add("Mango");
        Fruits.add("Apple");

        for(int i=0;i<Fruits.size();i++){
            System.out.println("Fruits is: "+Fruits.get(i));
        }

        System.out.println("\n\nUse for each Loop\n\n\n");

        for(String Fruit:Fruits){
            System.out.println("For ecah Fruits: "+Fruit);
        }

        System.out.println("\n\n Use Iterator \n\n");


        Iterator<String>fr=Fruits.iterator();
        while (fr.hasNext()){
            System.out.println("Iterator: "+fr.next());
        }
        

    }
}

````


<h2>Java Array List</h2>

<p>In java we need to declare the size of an array before we can use it . Once the size of an array is declared its hard to change<br>
To Handle this issue we can use the array List class <br/>.ArrayList are also Known as dynamic array. </p>

<h4>Internal Working of ArrayList</h4>

<P>Initially the array has a certain capacity and as element are added it fills up. <br>
When the capacity is reached the Arraylist Creates a new large array and copies the element from old array to new array</p>

<h1>New Array Size</h1>
new size= {(old size * 3)/2}+1;
