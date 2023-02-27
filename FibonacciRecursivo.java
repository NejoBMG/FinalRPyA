package finalrpa;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        
        System.out.println();
        System.out.println("Solucion 2");

        int dim = Console.readInt("Ingresar cantidad de numeros de la serie: ");
   
        int []vector= new int[dim];
        vector[0] = 0;
        vector[1] = 1;
        int num, A = 0, B = 1;
        for(int i = 2; i < dim; i++){
           num= A+B;
           A = B;
           B = num;
           vector[i] = num;
        }
        for(int i = 0; i < dim; i++){
           System.out.print(vector[i]+ " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
