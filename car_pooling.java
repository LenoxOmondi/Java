import java.util.Scanner;
public class car_pooling {
    public static void main (String[]args){
        String name, city;
        int mile, capacity;
        Float parking, consumption, charge, newcost;
        Float gallon, price, cost, save;
        Scanner input = new Scanner(System.in);
        System.out.println("\nHello, please what's your name as you check in?");
        name = input.nextLine();
        System.out.println("Welcome to Car Pooling System "+name+"! Happy to have you back.");

        System.out.println("Where are you travelling today "+name+"?");
        city = input.nextLine();

        System.out.println("Great! \n"+city+" is not that far, how long do you expect to travel?");
        mile = input.nextInt();
        System.out.println("What's your average car consumption?");
        consumption = input.nextFloat();
        System.out.println("Please give me the current fuel price charges.");
        charge = input.nextFloat();

        System.out.println("Your Parking fees please.");
        parking = input.nextFloat();

        //calculations
        gallon = mile/consumption;
        price = gallon*charge;
        cost = price+parking;

        //feedback
        System.out.println(name+" you are expected to spend "+gallon+" gallons of gasoline and it will cost you approximately Ksh"+price);
        System.out.println("Adding your parking fees, your are expected to spend Ksh"+cost);

        //cost sharing
        System.out.println("\nDo you mind cutting cost, what's your car passenger capacity?");
        capacity = input.nextInt();
        newcost = cost/capacity;
        save = cost - newcost;
        System.out.println("Kila mtu ata lipa "+newcost);
        System.out.println("This will save you "+save+".\n \tThanks "+name);
}
}