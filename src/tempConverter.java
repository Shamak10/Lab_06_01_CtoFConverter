import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args) {//Creating scanner to take input from the user
        Scanner input = new Scanner("-10");//Put in a value for celsius
        System.out.print("Enter the temperature in Celsius:");//Taking temperature in C to covert it to F

        if (input.hasNextDouble()) {
            double celsius = input.nextDouble();//Converting C to F
            double fahrenheit = celsius * 9 / 5 + 32;// Converted to F
            System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit.");
        }
        input.close();
    }
}
