import java.io.*;
import java.lang.*;

class Parent{
public void height()
{
System.out.println("The father height is 5'6ft");
}
}

class Child extends Parent{
public void color()
{
System.out.println("The child is white color");
}
}

public class SingleInh{
public static void main(String args[]){
Child c = new Child();
c.color();
c.height();
}
}