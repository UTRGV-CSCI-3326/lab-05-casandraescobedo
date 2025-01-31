import java.util.Scanner;

public class Input{

    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double weight;
        boolean smoke;
        // User's name
        System.out.print("Enter your name: ");
        name = scanner.next();
        // User's age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        // User's weight
        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();
        // If the user smokes or not
        System.out.print("Type 'true'/ 'false', Are you a smoker? ");
        smoke = scanner.nextBoolean();

        System.out.println("The patient's name is " + name + " who is " + age + " years old " + "who weights " + weight + ". Are they a smoker? " + smoke);

    }
}
