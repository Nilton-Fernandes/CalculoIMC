import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "ESSO PROGRAMA CALCULA,\nCLASSIFICA O IMC.\nPARA COMEÇAR:\nDIGITE SUA ALTURA:\n";
        System.out.println(menu);
        double altura = sc.nextDouble();
        System.out.println("digite seu peso: ");
        double peso = sc.nextDouble();
        double imc = calcularIMC(altura, peso);
        System.out.printf("ALTURA = %.2f.\nPESO= %.2f.\n", altura, peso);
        double pesoIdealMin = altura * altura * 18.5;
        double pesoIdealMax = altura * altura * 24.9;
        if (imc < 16.9) {
            System.out.printf("\nIMC = %.2f. VOCÊ ESTA MUITO ABAIXO DO PESO:", imc);
            System.out.printf("\nPESO IDEAL MÍNIMO = %.2f\nPESO IDEAL MÁXIMO = %.2f", pesoIdealMin, pesoIdealMax);
        } else if (imc >= 17.0 && imc <= 18.4) {
            System.out.printf("IMC = %.2f. VOCÊ ESTA ABAIXO DO PESO:", imc);
            System.out.printf("\nPESO IDEAL MÍNIMO = %.2f\nPESO IDEAL MÁXIMO = %.2f", pesoIdealMin, pesoIdealMax);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("IMC = %.2f. VOCÊ ESTA COM PESO NORMAL:", imc);
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("IMC = %.2f. VOCÊ ESTA ACIMA DO PESO:", imc);
            System.out.printf("\nPESO IDEAL MÍNIMO = %.2f\nPESO IDEAL MÁXIMO = %.2f", pesoIdealMin, pesoIdealMax);
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("IMC = %.2f. VOCÊ ESTA OBESIDADE GARAU I:", imc);
            System.out.printf("\nPESO IDEAL MÍNIMO = %.2f\nPESO IDEAL MÁXIMO = %.2f", pesoIdealMin, pesoIdealMax);
        } else {
            System.out.printf("IMC = %.2f. VOCÊ ESTA OBESIDADE GARAU II:", imc);
            System.out.printf("\nPESO IDEAL MÍNIMO = %.2f\nPESO IDEAL MÁXIMO = %.2f", pesoIdealMin, pesoIdealMax);
        }

    }

    public static Double calcularIMC(double altura, double peso) {
        return peso / (altura * altura);
    }
}
