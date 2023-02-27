package finalrpa;

class Cola{
    private final int maxcola=50; //cantidad de elementos de la cola
    protected int[] elementos; //arreglo que representa a la cola
    protected int frente, ultimo; //índices para insertar y borrar
    // Constructor de la cola
    public Cola(){
        elementos=new int[maxcola];
        frente=0;
        ultimo=0;
    }
    //verifica si la cola está o no vacía
    public boolean estaVacia(){
        return (ultimo == frente);
    }
    //verifica si la cola está o no llena
    public boolean estaLlena(){
        int sigultimo=siguiente(ultimo);
        return (sigultimo == frente);
    }
    //establece cuál es el siguiente elemento
    protected int siguiente(int subind){
        if(subind == maxcola - 1)
        return 0;
        else
        return ++subind;
    }
    //inserta un elemento en la cola
    //precondición: cola no llena y elemento entero
    //postcondición: elemento entero insertado en cola si no está llena
    public void insertar(int elem){
        ultimo=siguiente(ultimo);
        elementos[ultimo]=elem;
    }
    //borra un elemento de la cola
    //precondición: cola no vacía
    //postcondición: elemento entero borrado de la cola si no está vacía
    public int borrar(){
        int elemento = elementos[frente];
        frente=siguiente(frente);
        return elemento;
    }
    // Mientras no se cumpla estaVacia se borra cada elemento hasta vaciar la cola
    public void vaciar() {
        while (!estaVacia()) {
            borrar();
        }
    }
}
