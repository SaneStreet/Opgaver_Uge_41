import java.util.Scanner;

public class Opgave_3_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Ny scanner der hedder input

        //Tilfældigt tal mellem 0, 1 og 2 (Math.random())
        int computer = (int)(Math.random() * 3);
        //System.out.println(computer);            //Test til computer (0, 1 eller 2)

        //Indtast 0, 1 og 2 imellem valgmulighederne
        System.out.print("Choose One: Scissor (0), Rock (1), Paper (2): ");
        int user = input.nextInt(); //Initialisere variablen input, til at være user (indtastet værdi)

        System.out.print("The Computer is: ");
        switch (computer){ //Switch case, der tjekker værdien til variablen computer, derefter udskriver svaret(sout)
            case 0: System.out.println("Scissor!"); break;
            case 1: System.out.println("Rock!"); break;
            case 2: System.out.println("Paper!");
        }
        System.out.print("You chose: ");
        switch (user){ //Switch case der tjekker værdien til variablen user, derefter udskriver svaret(sout)
            case 0: System.out.println("Scissor!"); break;
            case 1: System.out.println("Rock!"); break;
            case 2: System.out.println("Paper!");
        }
        //Resultater ud fra svarene fra computer og user
        if (computer == user)
            System.out.println("It's a draw!");
        else {
            //Boolean der indikerer om condition er true/false (win condition)
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if(win) //Hvis boolean win, er sand så udskriv dette
                System.out.print("You won!");
            else //Hvis boolean win ikke er sand, udskriv dette.
                System.out.println("You lose!");
        }
    }
}
