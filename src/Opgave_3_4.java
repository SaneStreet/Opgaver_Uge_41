public class Opgave_3_4 {
    public static void main(String[] args) {
        /*Deklarer og initialisere variablen randMonth,
        til at finde et tilfældigt nummer imellem 1-12 (for hver måned)*/
        int rMonth = (int)((Math.random() * 12) + 1);
        //System.out.println(randMonth); <---- Test Random med Switch

        /*En Switch case, der udskriver hvilken måned, der er tilhørende tallet fra rMonth */
        switch(rMonth){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }
    }
}
