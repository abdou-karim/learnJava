package firstCours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre reel");
        int i = sc.nextInt();
        if(i<0){
            System.out.println("Vous avez saisis un nombre negatif");
        }else {
            System.out.println("Vous avez saisis un nombre positif");
        }

    }
}
