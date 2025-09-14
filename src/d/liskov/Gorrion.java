package d.liskov;

public class Gorrion implements AveVolar {
    @Override
    public void comer() {
        System.out.println("El gorrión está comiendo semillas.");
    }

    @Override
    public void volar() {
        System.out.println("El gorrión vuela ágilmente.");
    }
}
