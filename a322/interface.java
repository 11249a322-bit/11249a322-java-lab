AIM:
To write a Java program to demonstrate the implementation of an interface using a class.

ALGORITHM:
1.Start the program.
2.Create an interface named Animal.
3.Declare animalSound() and sleep() methods in the interface.
4.Create a Dog class that implements the Animal interface.
5.Define the methods animalSound() and sleep() in the Dog class.
6.Create an object of the Dog class.
7.Call both methods using the object.
8.Display the output.
9.Stop the program.
    
PROGRAM:
interface Animal {
    public void animalSound();
    public void sleep();
}

class Dog implements Animal {

    public void animalSound() {
        System.out.println("The dog says: Bow Bow");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class interface {
    public static void main(String[] args) {

        Dog a = new Dog();

        a.animalSound();
        a.sleep();
    }
}

OUTPUT:
The dog says: Bow Bow
Zzz
RESULT:
Thus, the Java program to demonstrate an interface and its implementation using the Dog class was successfully executed.
