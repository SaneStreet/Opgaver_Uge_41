import java.util.Scanner;

public class Opgave_3_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);         //Scanner til at finde brugerens input
        System.out.print("Indtast din Vægt i Kilogram: ");
        double weight = input.nextDouble();
        //System.out.println(weight);                   //<--- Test Weight input
        System.out.print("Indtast din Højde i Meter: ");
        double height = input.nextDouble();
        //System.out.println(height);                   //<--- Test Height input
        double resBMI = weight / (height * height);
        System.out.println("Din BMI er: " + resBMI + ".");

        if (resBMI < 18.5)                              //Hvis BMI er mindre end 18.5, udskriv Undervægtig
            System.out.println("Du er Undervægtig");
        else if(resBMI < 25 && resBMI > 18.5 )                           //Hvis BMI er mindre end 25, udskriv Normalvægtig
            System.out.println("Du er Normalvægtig");
        else if(resBMI < 30)                            //Hvis BMI er over 30, udskriv Overvægtig
            System.out.println("Du er Overvægtig");
        else                                            //BMI 25 eller over, udskriv Fedme / Svær overvægt
            System.out.println("Du har Fedme / Svær overvægt");
    }
}
