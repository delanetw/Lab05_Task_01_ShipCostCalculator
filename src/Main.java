import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double cost = 0;
        double ship = 0;
        double shipCost = 0;
        String trash = "";

        System.out.print("Enter the cost: ");
        if(in.hasNextDouble())
        {
            cost = in.nextDouble();
            if(cost >= 100)
            {
                System.out.println("Your shipment is free! Your total cost is: " + cost);

            }
            else
            {
                ship = cost * .02;
                shipCost = cost + ship;
                System.out.println("Your total cost is: " + shipCost);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your salary " + trash);
            System.out.println("Rerun the program with correct input values");
        }

    }
}
