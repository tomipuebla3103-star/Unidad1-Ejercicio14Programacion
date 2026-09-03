//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Temporizador temporizador = new Temporizador(5, 30);

    System.out.println("Tiempo inicial: "
            + temporizador.getMinutos() + " minutos y "
            + temporizador.getSegundos() + " segundos");

    temporizador.avanzarSegundos(90);

    System.out.println("Tiempo final: "
            + temporizador.getMinutos() + " minutos y "
            + temporizador.getSegundos() + " segundos");
}
