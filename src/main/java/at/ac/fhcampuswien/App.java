package at.ac.fhcampuswien;

import java.util.Scanner;


public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __" + System.lineSeparator() +
                        " _(\\    |@@|" + System.lineSeparator() +
                        "(__/\\__ \\--/ __" + System.lineSeparator() +
                        "   \\___|----|  |   __" + System.lineSeparator() +
                        "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                        "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                        "      (--/\\--)    \\__/" + System.lineSeparator() +
                        "      _)(  )(_" + System.lineSeparator() +
                        "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int s,t,u,v,w,x,y,z;
        s = 'Z';
        t = 0xface;
        u = 012;
        v = (int)80L;
        w = (int)44e-1f;
        x = (int)5.5f;
        y = (int)8.88e1;
        z = (int) 99.9;
        System.out.println(s+t+u+v+w+x+y+z);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = x + y;
        System.out.println(z);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        System.out.println("Before Swap:");
        System.out.print("x: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("y: ");
        int y = scan.nextInt();
        x = x + y;
        y = x - y;
        x = x- y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        System.out.print("n1: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("n2: ");
        int y = scan.nextInt();

        if(x > y) {
            System.out.println("n1 > n2");
        } else if (y > x) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x < 0 || x >= 100000) {
            System.out.println("Invalid Revenue");
        } else if(0 <= x && x < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if(20000 <= x && x < 50000 ) {
            System.out.println("Average Sales Revenue");
        } else if(50000 <= x && x < 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        switch (x) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.print("Year: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        System.out.print("Number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i, z, e;
        i = number % 10;
        z = number / 10 % 10;
        e = number / 100;
        number = i * 100 + z * 10 + e;
        System.out.println(number);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}