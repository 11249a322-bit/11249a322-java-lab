AIM:
To write a Java program to demonstrate single inheritance, where the Dog class inherits the properties and methods of the Animal class.

ALGORITHM:
1.Start the program.
2.Create a class Animal with an eat() method.
3.Create a class Dog that extends the Animal class.
4.Define a bark() method in the Dog class.
5.Create an object d of the Dog class.
6.Call the inherited eat() method.
7.Call the bark() method of the Dog class.
8.Display the output.
9.Stop the program
    
 PROGRAM:

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class singleMain {
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
Thus, the Java program to demonstrate single inheritance was successfully executed.
