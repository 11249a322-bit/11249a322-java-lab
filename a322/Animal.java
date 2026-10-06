AIM:

To write a Java program to demonstrate single inheritance, where the Dog class inherits the eat() method from the Animal class.

ALGORITHM:
1.Start the program.
2.Create a class Animal with an eat() method.
3.Create a class Dog that extends the Animal class.
4.Define a bark() method inside the Dog class.
5.Create an object d of the Dog class.
6.Call the inherited eat() method using d.
7.Call the bark() method using d.
8.Display the output.

    
PROGRAM:
Stop the program.class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();  
        d.bark();  
    }
}

OUTPUT:
Animal is eating
Dog is barking

RESULT:
Thus, the Java program successfully demonstrates single inheritance, where the Dog class inherits the eat() method from the Animal class.
