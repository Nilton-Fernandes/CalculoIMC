import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "ESSO PROGRAMA CALCULA,\nCLASSIFICA O IMC.\nPARA COMEÇAR:\nDIGITE SUA ALTURA:\n";
        System.out.println(menu);
        double altura = sc.nextDouble();
        System.out.println("digite seu peso: ");
        double peso = sc.nextDouble();
        double imc = IMC.calcularIMC(altura, peso);
        System.out.printf("ALTURA = %.2f.\nPESO= %.2f.\n", altura, peso);
            if (imc < 16.9) {
                System.out.printf("\nIMC = %.2f. \nVOCÊ ESTA MUITO ABAIXO DO PESO:", imc);

            }else if (imc >= 17 && imc <= 18.4){
                System.out.printf("IMC = %.2f. \nVOCÊ ESTA ABAIXO DO PESO:", imc);

            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.printf("IMC = %.2f. \nVOCÊ ESTA COM PESO NORMAL:", imc);
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.printf("IMC = %.2f. \nVOCÊ ESTA ACIMA DO PESO:", imc);

            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.printf("IMC = %.2f. \nVOCÊ ESTA OBESIDADE GRAU I:", imc);

            } else {
                System.out.printf("IMC = %.2f. \nVOCÊ ESTA OBESIDADE GRAU II:", imc);

            }
            PesoIdeal.calculoDoPesoIdeal(altura,imc);

    }




}
