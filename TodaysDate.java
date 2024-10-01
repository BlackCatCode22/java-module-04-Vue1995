// sV 01Oct2024
// Today'sDate.java


import java.util.Date;
import java.text.SimpleDateFormat;

public class TodaysDate {
    public static void main(String[] args) {
        System.out.println("\nHello and welcome!");

        //Create a new Date object
        Date today = new Date();

        //Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        //Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        //Output the result
        System.out.println("\nToday's date in the format yyyy-MM-dd is " + strTodaysDate);
        System.out.println();

        //Calculate birthdates for the following two hyenas
        //C, tan color, 70 pounds, from
        //Friguia Park, Tunisia
        //12 year old male hyena, born in fall, brown color, 150 pounds, from
        //Friguia Park, Tunisia

        //Write Java code to calculate birthdates for the animal
        //Then create a method that returns the animal's birthdate

        //input: "4 year-old female hyena born in spring
        //processing: find the age and birth season
        //use decision control structures to calculate the date

        //Parse the string
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from\n" +
                "Friguia Park, Tunisia";

        // Split the string by commas
        String[] parts = strStarting.split(", ");

        // Print each part
        for (String part : parts) {
            System.out.println("Elements of the string are: " + part);
        }
        System.out.println();

        String[] part = parts[0].split(" ");
        for (String thePart : part) {
            System.out.println("Elements of the string is: " + thePart);
        }

        String ageInYears = part[0];
        System.out.println("\nThe animal's age is " + ageInYears);
        System.out.println();

        String[] part2 = parts[1].split(" ");
        for (String thePart : part2) {
            System.out.println("Elements of the string is: " + thePart);
        }

        String animalBirthSeason = part2[2];
        System.out.println("\nThe animal's birth season is " + animalBirthSeason);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
        }

        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }
        System.out.println("\nThe animal's birthdate is " + animalBirthdate);




    }
}