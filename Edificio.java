package finalrpa;

public class Edificio {
    // Atributos
    private String direccion;
    private String telefono;
    private String barrio;
    private BateriaSanitaria[] bateriasSanitarias;

    // Constructor
    public Edificio(String direccion, String telefono, String barrio, BateriaSanitaria[] bateriasSanitarias) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.barrio = barrio;
        this.bateriasSanitarias = bateriasSanitarias;
    }

    // Métodos
    public double calcularConsumoTotal() {
        double consumoTotal = 0;
        for (BateriaSanitaria bateria : bateriasSanitarias) {
            consumoTotal += bateria.getConsumoAgua();
        }
        return consumoTotal;
    }

    public void informeBaterias() {
        for (BateriaSanitaria bateria : bateriasSanitarias) {
            System.out.println("Bateria sanitaria:\n" + bateria);
        }
    }
    public String obtenerDatosEdificio() {
        String datos = "Direccion: " + direccion + "\n" + "Telefono: " + telefono + "\n" + "Barrio: " + barrio + "\n";
        return datos;
    }
    

    // Getters
    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getBarrio() {
        return barrio;
    }
}

 