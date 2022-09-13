import java.util.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;


public class FindingsLists {
    public static void FindingsLists() throws InterruptedException {
        System.out.println("Findings Booting........");


        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        ArrayList<String> rocklist = new ArrayList<String>();
        System.out.println("Rock data downloaded");

        rocklist.add("Geode");
        rocklist.add("Gravel");
        rocklist.add("Sandstone");
        rocklist.add("Not Rock");
        System.out.println(rocklist);

        Thread.sleep(500);
        System.out.println("wait that last one isn't a rock----------");
        Thread.sleep(800);
        rocklist.remove("Not Rock");
        System.out.println(rocklist);
    }

    public static void fossilDirectory() throws InterruptedException {
        Thread.sleep(2000);
        HashMap<String, String> fossilDirectory = new HashMap<>();
        System.out.println("fossil data updated");
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil has fins implying there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        boolean check = false;
        while (!check) {
            System.out.println("Which of the fossils would you like to learn more about Fish Fossil, Tooth Fossil, Bird Fossil");

            Scanner input = new Scanner(System.in);
            String fossilChoice = input.nextLine();

            if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
                System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Bird Fossil"));
                check = true;
            } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
                System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Fish Fossil"));
                check = true;
            } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
                System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get("Tooth Fossil"));
                check = true;
            } else {
                System.out.println("that wasn't a correct response");
                check = false;
            }
        }
    }
    public static void suppliesUsed() throws  InterruptedException{
        Thread.sleep(2000);
        HashSet<String> suppliesBought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        suppliesBought.add("Food");

        suppliesBought.add("Medicine");
        suppliesBought.add("Water");
        System.out.println("Alright we need to see what supplies we have so we can continue our adventure.. we brought\n"+suppliesBought);
        Thread.sleep(2000);


        suppliesUsed.add("Medicine");
        suppliesUsed.add("Water");
        System.out.println("These are the supplies we used " + suppliesUsed);
        Thread.sleep(2000);
        suppliesUsed.add("Test");

        for (String s : suppliesBought){
            if (!suppliesUsed.contains(s)){
                System.out.println("All that we have left is... " + s + " ...we should probably get more supplies");
            }


            }
        }





    }




