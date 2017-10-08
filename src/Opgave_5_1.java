import java.util.Scanner;

public class Opgave_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Ny scanner der hedder input

        System.out.print("Indtast din Java score: ");
        int score = input.nextInt(); //værdien fra variablen input er værdien for variablen score

        if (score < 0) //Hvis værdien af score er under 0, udskriv følgende
            System.out.println("Score SKAL være større end 0!");
        else if (score > 60 || score == 60) //Hvis værdien score er større eller lig med 60, udskriv følgende
            System.out.println("Du har bestået.");
        else //Hvis værdien score er alt andet, udskriv følgende
            System.out.println("Du har ikke bestået");

    }
}
