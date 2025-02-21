public class Calculatrice {
    // l'addition
    public double addition(double a, double b) {
        return a + b;
    }

    // la soustraction
    public double soustraction(double a, double b) {
        return a - b;
    }

    //  la multiplication
    public double multiplication(double a, double b) {
        return a * b;
    }

    //  la division 
    public double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erreur : Division par zéro impossible !");
        }
        return a / b;
    }
}