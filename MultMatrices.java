package finalrpa;

public class MultMatrices {
    public static void cargarMatrices(int n,int[][] MATRIZ){
      // Asigna valores a la matriz, unicamente al triangular inferior
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               MATRIZ[i][j] = i+j;
            }
         }
     }
     public static int[][] multiplicacionMatricesTriangulares(int n,int[][] A, int[][] B) {
         // Nueva matriz que contendra los resultados
         int[][] C = new int[n][n];

         for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int RESULTADO = 0;
                for (int k = 0; k <= j; k++) {
                    RESULTADO += A[i][k] * B[k][j];
                }
                C[i][j] = RESULTADO;
            }
        }
        return C;
    }
    public static void cargarMatricesSup(int n,int[][] MATRIZ){
      // Asigna valores a la matriz, unicamente al triangular inferior
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               MATRIZ[i][j] = i+j;
            }
         }
     }
     public static int[][] multiplicacionMatricesTriangularesSup(int n,int[][] A, int[][] B) {
         // Nueva matriz que contendra los resultados
         int[][] C = new int[n][n];

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int RESULTADO = 0;
                for (int k = 0; k <= j; k++) {
                    RESULTADO += A[i][k] * B[k][j];
                }
                C[i][j] = RESULTADO;
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int dim=Console.readInt("Ingrese dimension de la matriz");
        int A[][] = new int [dim][dim];
        int B[][] = new int [dim][dim];
        cargarMatrices(dim,A);
        cargarMatrices(dim,B);
      //   Imprime los valores de las dos matrices
        System.out.println("Matriz A:");
        for(int i=0;i<dim;i++){
            for(int j=0;j<=dim-1;j++){
               System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
         }
         System.out.println("\nMatriz B:");
         for(int i=0;i<dim;i++){
            for(int j=0;j<=dim-1;j++){
               System.out.print(B[i][j]+ "\t");
            }
            System.out.println();
         }

         int resultados[][]= multiplicacionMatricesTriangulares(dim,A,B);
         System.out.println("\nResultado de multiplicaciones:");
         for(int i=0;i<dim;i++){
            for(int j=0;j<dim;j++){
               System.out.print(resultados[i][j]+ "\t");
            }
            System.out.println();
         }
    }
}
