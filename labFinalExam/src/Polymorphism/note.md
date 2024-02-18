
### Q) Why Method Overloading is not possible by changing the return type of method only?

<br>

In java, method overloading is not possible by changing the return type of the method only because of ambiguity. 
Let's see how ambiguity may occur:

```java

class Adder{  
static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}} 

```

### Q) Can we overload java main() method?

<br><br>

Yes, by method overloading. You can have any number of main methods in a class by method overloading. 
But JVM calls main() method which receives string array as arguments only. Let's see the simple example:

<br>

```java

class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
}  

```