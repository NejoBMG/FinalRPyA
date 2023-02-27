package finalrpa;

public class MultRecursiva {
    public static int multiplicacion(int a, int b) {
        if(a == 0 || b == 0){
            return 0;
        }
        else{
            if (b == 1) {
                return a;
            } else {
                return a + multiplicacion(a, b-1);
            }
        }
    }
    public static void main(String[] args) {
        int a = Console.readInt("Ingrese un valor para A, mayor a 0: ");
        int b = Console.readInt("Ingrese un valor para B, mayor a 0: ");
        int resultado = multiplicacion(a, b);
        System.out.println("El resultado de " + a + " * " + b + " es " + resultado);
    }
}
