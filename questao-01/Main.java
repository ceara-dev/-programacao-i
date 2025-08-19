
public class Main {

    public static void main(String[] args) {
        Corrida corrida = new Corrida();
        double[] voltas = {125.333, 123.120, 119.456, 128.001, 125.999, 126.750};
        int numeroDaVoltaRapida = corrida.calcularVoltaRapida(voltas);
        System.out.println("A volta mais rápida foi a volta número: " + numeroDaVoltaRapida);
    }
}
