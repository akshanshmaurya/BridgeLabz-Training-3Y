package BridgeLabz.ControlFlowPractices.Level2;

import java.util.Scanner;

class FriendsCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();

        System.out.print("Enter height of Amar: ");
        double hAmar = input.nextDouble();
        System.out.print("Enter height of Akbar: ");
        double hAkbar = input.nextDouble();
        System.out.print("Enter height of Anthony: ");
        double hAnthony = input.nextDouble();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Youngest is Amar");
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        if (hAmar > hAkbar && hAmar > hAnthony)
            System.out.println("Tallest is Amar");
        else if (hAkbar > hAmar && hAkbar > hAnthony)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");

        input.close();
    }
}
