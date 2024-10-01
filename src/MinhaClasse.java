import java.util.Scanner;

public class MinhaClasse {

    public static double multiplicar(double n1, double n2) {
        return (n1 * n2);
    }

    public static double dividir(double n1, double n2) {
        return (n1 / n2);
    }

    public static double soma(double n1, double n2) {
        return (n1 + n2);
    }

    public static double subtrair(double n1, double n2) {
        return (n1 - n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Qual operação: (*, /, +, -)");
        String tipo = sc.next();

        System.out.println("Digite o Segundo Numero: ");
        double n2 = sc.nextDouble();

        double resultado = 0;

        switch (tipo) {
            case "*":
                resultado = multiplicar(n1, n2);
                break;
            case "/":
                resultado = dividir(n1, n2);
                break;
            case "-":
                resultado = subtrair(n1, n2);
                break;
            case "+":
                resultado = soma(n1, n2);
                break;
            default:
                System.out.println("Simbolo invalido!");
        }

        System.out.println("O resultado é de: " + resultado);

        sc.close();

    }
}