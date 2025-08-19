public class Corrida {
    public int calcularVoltaRapida(double [] voltas) {
        if (voltas == null || voltas.length == 0) {
            throw new IllegalArgumentException("O array de voltas não pode ser nulo ou vazio.");
        }
        double min = voltas[0];
        int indiceDaVoltaRapida = 0;
        for (int i = 1; i < voltas.length; i++) {
            if (voltas[i] < min) {
                min = voltas[i];
                indiceDaVoltaRapida = i;
            }
        }
        return indiceDaVoltaRapida + 1; 
    }
}