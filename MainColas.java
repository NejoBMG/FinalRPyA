package finalrpa;

public class MainColas {
    public static void main(String[] args) {
        // Inicializar las colas
        CompararColas cola1 = new CompararColas();
        CompararColas cola2 = new CompararColas();
        // Inserto valores iguales a las colas
        for(int i = 1; i<5; i++){
            cola1.insertar(i);
            cola2.insertar(i);
        }

        // Imprimir si las dos colas son iguales, en este caso debe ser True
        System.out.println("Las dos colas son iguales: " + cola1.comparar(cola2));
        // Inserto un valor más a la cola 2, en este caso el resultado debe arrojar False
        cola2.insertar(5);
        System.out.println("Las dos colas son iguales: " + cola1.comparar(cola2));
        // Vacio las dos colas, en este caso el resultado debe arrojar True
        cola1.vaciar();
        cola2.vaciar();
        System.out.println("Las dos colas son iguales: " + cola1.comparar(cola2));
        // Inserto un valor a cola 2 y la asigno a la cola 1, en este caso el resultado debe arrojar True
        cola2.insertar(1);
        cola1 = cola2;
        System.out.println("Las dos colas son iguales: " + cola1.comparar(cola2));

    }
}
