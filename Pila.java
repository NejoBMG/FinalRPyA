package finalrpa;

public class Pila{
    private final int maxpila=100; //cantidad de elementos de la pila
    private char[] elementos; //arreglo que representa a la pila
    private final int cima=0; //la cima: último elemento
    //constructor de la pila
    public Pila(){
        elementos=new char[maxpila];
        elementos[cima]=0;
    }
    //verifica si la pila está o no vacía
    public boolean estaVacia(){
        return (elementos[cima] == 0);
    }
    //verifica si la pila está o no llena
    public boolean estaLlena(){
        return (elementos[cima] == maxpila - 1);
    }
    //mete un elemento en la pila
    //precondición: pila no llena y elemento caracter
    //postcondición: elemento caracter metido en la pila si no está llena
    public void meter(char elem){
        elementos[cima]++;
        elementos[elementos[cima]]=elem;
    }
    //saca un elemento del tope de la pila
    //precondición: pila no vacía
    //postcondición: elemento caracter sacado de la pila si no está vacía
    public char sacar(){
        char aux=elementos[elementos[cima]];
        elementos[cima]--;
        return aux;
    }
    // Mientras no se cumpla estaVacia se borra cada elemento hasta vaciar la pila
    public void vaciar() {
        while (!estaVacia()) {
            sacar();
        }
    }
}

