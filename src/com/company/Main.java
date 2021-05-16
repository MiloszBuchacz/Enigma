import com.company.Cipher;

import java.util.*;

class Enigma {
    static Scanner option = new Scanner(System.in);
    static char letter;
    static boolean isRuninng = true;

    public static void main(String[] args) {

        System.out.println("Welcome to the Enigma!");

        menu();
    }

    private static String clipper(String wordToCrypt, String keyword) {
        Cipher obj = new Cipher();
        System.out.println();
       // System.out.println("inserted word is: " + wordToCrypt);
       System.out.println("Encoded word is: " + obj.encode(wordToCrypt, keyword));
        return obj.encode(wordToCrypt, keyword);
    }

    




    public static void menu() {

        System.out.println("Main Menu: ");
        System.out.println("1. Atbash Cipher");
        System.out.println("2. ROT13 Cipher");
        System.out.println("3. Caesar Cipher");
        System.out.println("4. Beaufort Cipher ");
        System.out.println("5. Exit");
        System.out.print("Choose the option ");

        switch (option.nextInt())
        {
            case 1:
                System.out.println("atbash clipper");
                break;
            case 2:
                System.out.println("ROT13 Cipher");
                break;
            case 3:
                System.out.println("Caesar Cipher");
                break;
            case 4:
                while(isRuninng) {
                    System.out.println("1. encliper" + ("\n") + "2. decliper");
                    if (option.nextInt() == 1) {
                        System.out.println();
                        System.out.println("insert word to crypt:");
                        String password = option.next();
                        System.out.println("insert your keyword: ");
                        String keyword = option.next();
                        clipper(password, keyword);
                        System.out.println("press '3' to return to main menu" + ("\n") + "press 4 to EXIT");
                    } else {
                        System.out.println("insert word to decrypt:");
                        String password = option.next();
                        System.out.println("insert your keyword: ");
                        String keyword = option.next();
                        clipper(password, keyword);
                        System.out.println("press '3' to return to main menu" + ("\n") + "press 4 to EXIT");
                    }
                    if (option.nextInt() == 3) {
                        menu();
                    }
                    else{
                        System.exit(0);
                        break;


                    }
                    }





            case 5:
                System.exit(0);
            default:
                System.out.println("Wrong input, please provide option again.");
                menu();
                option.close();
        }
    }
}