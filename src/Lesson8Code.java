import java.util.Scanner;

public class Lesson8Code {
    public static void main(String[] args) {

//        // Use of NESTED IF
//
//        // Its winter.
//        // Its -20 degrees
//        // Check the ice thickness for ice skating
//        // If it is, we will go ice skating
//        // If not, we will got to sauna
//
//        boolean isItWinter = true;
//        boolean isItMinus20 = true;
//        boolean isIceThickEnough = false;
//
//        if(isItWinter) {
//            System.out.println("It is winter");
//            if(isItMinus20) {
//                System.out.println("It is really cold outside");
//
//                if(isIceThickEnough) {
//                    System.out.println("Time to go ice skating");
//                } else {
//                    System.out.println("Let's go to the sauna!");
//                }
//            }
//
//        } else {
//            System.out.println("Its is summer");
//        }
//
//
//        // Better way to write this
//
//        if(isItWinter && isItMinus20 && isIceThickEnough) {
//            System.out.println("Brr. It's cold! Lets go ice skating!");
//        } else if (isItWinter && isItMinus20 && !isIceThickEnough) {
//            System.out.println("Ice is not thick enough. Let's go to sauna!");
//        }

        // TRIANGLE task in groups

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A of triangle");
        int sideA = scanner.nextInt();

        System.out.println("Please enter side B of triangle");
        int sideB = scanner.nextInt();

        System.out.println("Please enter side C of triangle");
        int sideC = scanner.nextInt();


        if ((sideA+sideB<sideC) || (sideB+sideC<sideA) ||(sideA+sideC<sideB)) {
            System.out.println("triangle don't exist");
        }else  if ((sideA == sideB) && (sideB == sideC)) {
            System.out.println("equilateral triangle");
        } else if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
            System.out.println("isosceles triangle");
        } else if ((sideA != sideB) && (sideB != sideC)) {
            System.out.println("scalene triangle");
        } else {
            System.out.println("ERROR");
        }


    }
}
