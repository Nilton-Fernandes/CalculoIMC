public class PesoIdeal {
    public  static void calculoDoPesoIdeal(double altura, double imc){
        if (imc <18.5 || imc >24.5) {
            double pesoIdealMin = altura * altura * 18.5;
            double pesoIdealMax = altura * altura * 24.9;

            System.out.printf("\nPESO IDEAL MÍNIMO = %.2f\nPESO IDEAL MÁXIMO = %.2f", pesoIdealMin, pesoIdealMax);
        }
    }
}
