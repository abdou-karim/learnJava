package firstCours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int i = sc.nextInt();
        sc.nextLine();
        System.out.println("Veuillez saisir un mot: ");
        String str = sc.nextLine();
        System.out.println("Vous avez saisis " + i +" et " + str);
    }
}
