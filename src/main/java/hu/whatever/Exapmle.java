package hu.whatever;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exapmle {
    public static void main(String[] args) throws InputMismatchException {

        Scanner scr = new Scanner(System.in);
        String operator = "";
        int szam1 = 0;
        int szam2 = 0;
        int szam3 = 0;

        System.out.println("Adj meg 3 számot, hogy kiírjam növekvőbe");
        try {
            szam1 = scr.nextInt();
            szam2 = scr.nextInt();
            szam3 = scr.nextInt();

        } catch (ArrayIndexOutOfBoundsException outofbounds) {
            System.out.println("Használat: operandus operátor operandus" + outofbounds);
        }
        ;

        if (operator.equals("x")) {
            System.out.println("A szorzas eredmenye: " + (szam1 * szam2));
        } else if (operator.equals("+")) {
            System.out.println("A osszeadas eredmenye: " + (szam1 + szam2));
        } else if (operator.equals("-")) {
            System.out.println("A kivonas eredmenye: " + (szam1 - szam2));
        } else if (operator.equals("/")) {
            System.out.println("A osztas eredmenye: " + (szam1 / szam2));
        } else if (operator.equals("p")) {
            System.out.println("A pumped eredmenye: " + (szam1 * szam1 * szam1 * szam2 * szam2 * szam2));
        } else if (operator.equals("")) {
        } else {
            System.err.println("Nem letezo operator.");
        }
    }
}
