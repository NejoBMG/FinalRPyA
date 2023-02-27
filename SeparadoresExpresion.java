package finalrpa;

public class SeparadoresExpresion {
    public static boolean verificarSeparadores(String expresion) {
        // Inicializo la pila que contendra los separadores
        Pila pila = new Pila();
        // Recorre caracter por caracter a la expresion aritmetica
        for (int i = 0; i < expresion.length(); i++) {
            //Guarda el caracter en la posicion i con el método charAt del objeto String
            char c = expresion.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                pila.meter(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) {
                    return false; //Si detecta un separador de cierre y la pila esta vacia, es incorrecta
                }
                // Saca el ultimo elemento de la pila
                char ultimo = pila.sacar();
                // Si detecta separador de cierre y el ultimp elemento no es de apertura, es incorrecto
                if ((c == ')' && ultimo != '(') || (c == ']' && ultimo != '[') || (c == '}' && ultimo != '{')) {
                    return false;
                }
            }
        }
        /* Si la expresion tiene colocado correctamente los separadores, la pila quedará vacia.
        Si estan mal colocados, entonces en la pila quedara el separador de apertura que no se cerro*/
        return pila.estaVacia();
    }

    public static void main(String[] args) {
        String expresion = Console.readString("Ingrese la expresion aritmetica: ");

        boolean resultado = verificarSeparadores(expresion);
        if (resultado) {
            System.out.println("La expresion aritmetica es correcta");
        } else {
            System.out.println("Error. La expresion aritmetica es incorrecta");
        }
    }
}

