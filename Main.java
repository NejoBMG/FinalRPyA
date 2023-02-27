package finalrpa;

public class Main {
    public static void main(String[] args) {
        // Creamos un piloto
        Piloto piloto = new Piloto();
        piloto.setApellido("Martinez");
        piloto.setDni("31912018");
        // Creamos un vuelo
        Vuelo vuelo = new Vuelo("AR1234");
        vuelo.setAerolinea("American Airlines");
        vuelo.setCiudadOrigen("Buenos Aires");
        vuelo.setCiudadDestino("Madrid");

        // Asignamos el piloto al vuelo
        vuelo.setPiloto(piloto);

        // Mostramos la informacion del vuelo y del piloto a cargo
        System.out.println("Informacion del vuelo:");
        System.out.println("Numero de vuelo: " + vuelo.getNumeroVuelo());
        System.out.println("Aerolinea: " + vuelo.getAerolinea());
        System.out.println("Ciudad origen: " + vuelo.getCiudadOrigen());
        System.out.println("Ciudad destino: " + vuelo.getCiudadDestino());
        System.out.println("Piloto a cargo: " + vuelo.getPiloto().getApellido());

        System.out.println("\nInformacion del piloto:");
        System.out.println("Apellido: " + piloto.getApellido());
        System.out.println("DNI: " + piloto.getDni());
    }
}