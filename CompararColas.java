package finalrpa;

public class CompararColas extends Cola{
    public boolean comparar(Cola otraCola) {
        // Si a la cola 1 le fue instanciada la cola 2 retorna True
        if (this == otraCola) {
            return true;
        }
        // En caso que la cola 2 no tenga valores, retorna False
        if (otraCola == null || otraCola.ultimo - otraCola.frente != ultimo - frente) {
            return false;
        }
    
        int frente1 = frente;
        int frente2 = otraCola.frente;
        // Mientras ambas colas no estén vacías
        while (frente1 != ultimo && frente2 != otraCola.ultimo) {
            // Si los elementos en la misma posicion no son iguales retorna False
            if (elementos[frente1] != otraCola.elementos[frente2]) {
                return false; // Los elementos de las dos colas no son iguales
            }
            frente1 = siguiente(frente1);
            frente2 = otraCola.siguiente(frente2);
        }
        return true; // Las dos colas son iguales
    }
}
