package finalrpa;

public class ContarLetras {
    public static int contarLetrasRecursivo(char[] palabraArr, int indice) {
        int n = palabraArr.length-1;
        if(palabraArr[n] == '.'){
            if (palabraArr[indice] == '.') {
                return 0;
            } else {
                return 1 + contarLetrasRecursivo(palabraArr, indice + 1);
            }
        }
        else return -1;
    }
    public static void main(String[] args) {
        String palabra = Console.readString("Ingrese una palabra terminada en punto:");
        char[] palabraArr = palabra.toCharArray();
        int cantidadLetras = contarLetrasRecursivo(palabraArr, 0);

        if(cantidadLetras == -1){
            System.out.println("Error, la palabra ingresada no termina en punto");
        }
        else{
            System.out.println("La cantidad de letras de la palabra es: " + cantidadLetras);
        }
    }
}
