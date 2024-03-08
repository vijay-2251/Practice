import java.io.*;

class Father{
public void height(){
System.out.println("The father is brown in color");
}
}

class Mother extends Father{
public void hair(){
System.out.println("The mother has the long hair");
}
}

class Child extends Father{
public void eat(){
System.out.println("The child is eating the food");
}
}

class MultiInh{
public static void main(String args[])
{
Child c = new Child();
c.height();
c.hair();
c.eat();
}
}