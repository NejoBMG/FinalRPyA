package finalrpa;

public class Matriz {
    int [][] elementos;
    int dim1,dim2, actualFila, actualCol;

    public Matriz(int FILA, int COLUMNA){
        if(FILA<=0 && COLUMNA <=0){
            dim1 = 5;
            dim2 = 5;
        }
        else{
            dim1 = FILA;
            dim2 = COLUMNA;
        }
        actualFila = 0;
        actualCol = 0;
        elementos = new int[dim1][dim2];
    }

    // public void agregarElemento(int VALOR){
    //     if(actualFila<dim1 && actualCol<dim2){
    //         // elementos[actual] = VALOR;
    //         for (int i = 0; i < dim1; i++) {
    //             for (int j = 0; j < dim2; j++) {
    //                 int valor = Console.readInt("Ingrese un valor en la posicion MATRIZ["+i+"]["+j+"]");
    //                 elementos[i][j]=valor;
    //             }                
    //         }
    //         actualFila+=1;
    //         actualCol+=1;
    //         return;
    //     }
        /*
        for(int i=0;i<fila;i++){
         for(int j=0;j<col;j++){
            int valor = Console.readInt("Ingrese un valor en la posicion MATRIZ["+i+"]["+j+"]");
            MATRIZ[i][j] = valor;
            }
        }
         
    }
*/
    // public void mostrarVector(){
    //     for(int i = 0;i<actual; i++){
    //         System.out.println(elementos[i]);
    //     }
    // }
}
