package finalrpa;

public class Vector {
    int [] elementos;
    int dim, actual;

    public Vector(int TAMAÑO){
        if(TAMAÑO<=0){
            dim = 10;
        }
        else{
            dim = TAMAÑO;
        }
        actual = 0;
        elementos = new int[dim];
    }

    public void agregarElemento(int VALOR){
        if(actual<dim){
            elementos[actual] = VALOR;
            actual = actual+1;
            return;
        }
    }

    public void mostrarVector(){
        for(int i = 0;i<actual; i++){
            System.out.println(elementos[i]);
        }
    }
}
