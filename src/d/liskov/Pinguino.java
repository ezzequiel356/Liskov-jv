package d.liskov;

public class Pinguino implements AveNadar {
    @Override
    public void comer() {
        System.out.println("El pingüino está comiendo peces.");
    }

    @Override
    public void nadar() {
        System.out.println("El pingüino nada en aguas frías.");
    }
}
