package d.liskov;


public class DLiskov {

    
    public static void main(String[] args) {
        // A la variable AveVolar se le asigna un objeto de la clase Gorrion,
        // por lo que ave1 solo puede usar los metodos de AveVolar.
        // Viceversa con la variable AveNadar que se le asigna el Pinguino.
        
        AveVolar ave1 = new Gorrion();
        AveNadar ave2 = new Pinguino();

        ave1.comer();
        ave1.volar();

        ave2.comer();
        ave2.nadar();
    }
    
}
