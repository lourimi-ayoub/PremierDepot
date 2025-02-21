import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        System.out.println("Bienvenue dans la Calculatrice !");
        System.out.println("Opérations possibles : +, -, *, /");
        
        System.out.print("Entrez l'opération que vous voulez faire : ");
        String operation = scanner.nextLine();

        System.out.print("Entrez le premier nombre : ");
        double nombre1;
        double nombre2;
        try {
            nombre1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Entrez le deuxième nombre : ");
            nombre2 = Double.parseDouble(scanner.nextLine());

            double resultat;
            if (operation.equals("+")) {
                resultat = calc.addition(nombre1, nombre2);
                System.out.println("Résultat : " + nombre1 + " + " + nombre2 + " = " + resultat);
            } else if (operation.equals("-")) {
                resultat = calc.soustraction(nombre1, nombre2);
                System.out.println("Résultat : " + nombre1 + " - " + nombre2 + " = " + resultat);
            } else if (operation.equals("*")) {
                resultat = calc.multiplication(nombre1, nombre2);
                System.out.println("Résultat : " + nombre1 + " * " + nombre2 + " = " + resultat);
            } else if (operation.equals("/")) {
                resultat = calc.division(nombre1, nombre2);
                System.out.println("Résultat : " + nombre1 + " / " + nombre2 + " = " + resultat);
            } else {
                System.out.println("Erreur : Opération invalide ! Utilisez +, -, * ou /.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erreur : Vous devez entrer des nombres valides !");
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro impossible !");
        }

        System.out.println("Fin du programme.");
        scanner.close();
    }
}