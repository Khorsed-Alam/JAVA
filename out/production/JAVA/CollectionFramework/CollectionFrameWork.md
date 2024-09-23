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

|Method Name|Uses|
|----|------|
|int size()| Return the number of element in the collection |
|boolean isEmpty()|Return True if Collection contain no element|
|boolean contains(Object o)|Return true If the collection contains the specific element|
|boolean add (E e)|adds the specific element to the collection . Returns true if the collection change as a result.|
|boolean remove(Object o)|Remove a single object of the specific element from the collection|
|boolean containsAll(Collection<>c) |Return true if the collection contains all element of the specified collection|

<h3>Java List Interface</h3>
<p>The list interface extends the collection interface and adds methods that are specific to list ,Which are ordered collection that allow duplicate element</p>

<h4>List is an interface but subclass are Class</h4>
<ul>
    <li>ArrayList</li>
    <li>LinkedList</li>
    <li>Stack</li>
    <li>Vector</li>
</ul>


<h2>ArrayList</h2>