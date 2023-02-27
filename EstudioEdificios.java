package finalrpa;

public class EstudioEdificios {
    public static void main(String[] args) {
        // Crea las baterías sanitarias del edificio
        BateriaSanitaria[] BATERIAS_SANITARIAS = new BateriaSanitaria[2];

        for (int i = 0; i < BATERIAS_SANITARIAS.length; i++) {
            System.out.println("Datos de la bateria sanitaria " + (i+1) + ":");
            String marca = Console.readString("Marca: ");
            int piso = Console.readInt("Piso: ");
            double consumoAgua = Console.readDouble("Consumo de agua (en litros): ");
            BATERIAS_SANITARIAS[i] = new BateriaSanitaria(marca, piso, consumoAgua);
        }

        // Crea el objeto Edificio con los datos ingresados
        Edificio edificio = new Edificio("1234 Nestor Kirchner", "2966-123456", "Centro", BATERIAS_SANITARIAS);
        
        // Mostrar los datos del edificio
        System.out.println("Informe del edificio:");
        System.out.println("\n"+edificio.obtenerDatosEdificio());

        // Mostrar el informe de baterías sanitarias
        System.out.println("Informe de baterias sanitarias del edificio:");
        edificio.informeBaterias();

        // Calcular y mostrar el consumo total del edificio
        double consumoTotal = edificio.calcularConsumoTotal();
        System.out.println("\nConsumo total de agua del edificio: " + consumoTotal + " litros");

    }
}
