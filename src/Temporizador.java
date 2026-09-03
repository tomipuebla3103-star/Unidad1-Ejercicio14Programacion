public class Temporizador {
    private int minutos;
    private int segundos;

    public Temporizador(int minutos, int segundos) {

        if (minutos >= 0 && segundos > 0 && segundos < 60) {
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Tiempo no válido.");
        }
    }

    public void avanzarSegundos(int cantidad) {

        if (cantidad > 0) {
            segundos += cantidad;

            minutos += segundos / 60;
            segundos = segundos % 60;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
