import java.util.Scanner;
public class Mars {
    public static void startColony() throws InterruptedException {
        Scanner input= new Scanner(System.in);
        String colonyName = "Kaeden's Place";
        int shipPopulation = 300;
        double shipFood = 4000;
        boolean landing = true;
        int days = 4;


        System.out.println("Starting" + colonyName +" Colony game");
        Thread.sleep(1000);
        System.out.println(shipFood);

        for (int i = 1; i <= days; i++) {

            shipFood = shipFood - (shipPopulation * 0.75);
            System.out.println(shipFood);
            System.out.println("food left");
            Thread.sleep(1500);
        }
        shipFood = shipFood * 1.5;

        shipPopulation = shipPopulation + 5;

        System.out.println("Where would you like to land?... 'The Plain', 'The Hills', 'The Mountain'");
        String landingLocation = input.nextLine();

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the plain");
        } else {
            System.out.println("ERROR Flight plan already set landing on the plains");
        }
        System.out.println("...");
        Thread.sleep(4000);
        landing = LandingCheck(50);
    }

    public static boolean LandingCheck(int Loops) throws InterruptedException {
//Create a for loop that starts at i = 0, loops until i is equal to Loops, and i increments by 1 each loop
        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);

        }
        System.out.println("Landed");
        Thread.sleep(1000);
        return false;
    }

}






