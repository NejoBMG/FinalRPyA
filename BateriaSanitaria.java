package finalrpa;

public class BateriaSanitaria {
    // Atributos
    private String marca;
    private int piso;
    private double consumoAgua; // En litros

    // Constructores
    public BateriaSanitaria(String marca, int piso, double consumoAgua) {
        this.marca = marca;
        this.piso = piso;
        this.consumoAgua = consumoAgua;
    }

    // Métodos
    public String getMarca() {
        return marca;
    }

    public int getPiso() {
        return piso;
    }

    public double getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(double consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nPiso: " + piso + "\nConsumo de agua: " + consumoAgua + " litros";
    }
}
