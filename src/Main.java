import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* int x = 5;
        System.out.println(x);

        String myName = "Mustafa";
        System.out.println(myName);

        System.out.println(myName + " " + x);*/

        /*Scanner userInput = new Scanner(System.in);
        System.out.println("enter your name");

        String name = userInput.next();

        System.out.println("Welcome" + " " + name);

        System.out.println("Please" + " " + name + " "+ "tell me your age" );

        int age = userInput.nextInt();
        System.out.println("your age equals" + age);*/

        /*
        Car c1 = new Car();
        c1.setSpeed(100);
        int speed = c1.getSpeed();
        System.out.println(speed);*/


        Boy b1 = new Boy();
        Boy b2 = new Boy("aser", true);
        b1.setAge(20);
        System.out.println(b1.getAge());

        b1.eat();

    }
}