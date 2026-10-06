AIM:
To write a Java program to demonstrate the use of an interface and its implementation using a class.

ALGORITHM:
1.Start the program.
2.Create an interface named Animal.
3.Declare the methods animalSound() and sleep() in the interface.
4.Create a class Dog that implements the Animal interface.
5.Define the animalSound() and sleep() methods in the Dog class.
6.Create an object of the Dog class.
7.Call the animalSound() and sleep() methods.
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

class Main {
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
Thus, the Java program to demonstrate interface implementation using the Animal and Dog classes was successfully executed.
