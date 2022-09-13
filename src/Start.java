import java.util.Scanner;

public class Start {


        static boolean checkYorN(String answer) {
            if(answer.equalsIgnoreCase("Y" )){
                return true;
            }else if(answer.equalsIgnoreCase("N")){
                System.out.println("That's too bad... when you would like to begin enter Y");
                return false;
            }else{
                System.out.println("Please say Y or N");
                return false;
            }
        }
        static boolean checkNum(int answer) {

            try {
                if (answer <= 0) {
                    System.out.println("You have to have more then 0");
                    return false;
                } else {
                    System.out.println(answer + " is a good number");
                    return true;
                }

            } catch (Exception e) {
                System.out.println("you must have a valid number");
            return false;
            }
        }

    public static void runStart()  {
//                System.out.println("Hello world!");
                Scanner input = new Scanner(System.in);

                System.out.println("Booting up landing protocols...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Ready");

//        game start
                System.out.println("Hello What is your name?");
                String name = input.nextLine();while(name=="") {name = input.nextLine();}

                System.out.println("Hello " + name + " Welcome to Expedition prep, are you ready to head out into the new world? Type Y or N");

                while(!checkYorN(input.nextLine())){
                }

                System.out.println("I knew you'd say that you're team Leader for a reason");
                System.out.println("How many people do you want on your expedition team?");

                while(!checkNum(input.nextInt())){

                }










            }

        }


