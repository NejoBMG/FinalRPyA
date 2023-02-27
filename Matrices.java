package finalrpa;

public class Matrices{
   public static void sumaMatrices(int n,int[][] MATRIZ, int[] arr, int[] arr2){
      for(int i=0;i<=n-1;i++){
         for(int j=0;j<=n-1;j++){
               arr[i]+=MATRIZ[i][j];
               arr2[j]+=MATRIZ[i][j];
            }
      }
   }

   public static void main(String[] args){
      int dim;
      dim= Console.readInt("Ingrese dimension de la matriz");
      int MATRIZ[][] = new int [dim][dim];
      
      //Obteniendo valores de matriz
      for(int i=0;i<dim;i++){
         for(int j=0;j<dim;j++){
            int valor = Console.readInt("Ingrese un valor en la posicion MATRIZ["+i+"]["+j+"]");
            MATRIZ[i][j] = valor;
         }
      }
      
      //Vectores de resultados
      int[] SUMAFILA= new int [dim];
      int[] SUMACOL= new int [dim];

      sumaMatrices(dim,MATRIZ, SUMAFILA, SUMACOL);

      for(int i=0;i<SUMAFILA.length;i++){
         System.out.println("RESULTADO FILA NRO:"+i+"= "+SUMAFILA[i]);
        }
        for(int i=0;i<SUMACOL.length;i++){
         System.out.println("RESULTADO COLUMNA NRO:"+i+"= "+SUMACOL[i]);
        }
   }
}