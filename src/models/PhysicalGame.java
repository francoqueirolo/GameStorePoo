package models;

import interfaces.Shippable;

public class PhysicalGame extends VideoGame implements Shippable {
    private String platform;

    public PhysicalGame(String code, String title, String category, double price, String platform) {
        super(code, title, category, price);
        this.platform = platform;
    }

    @Override
    public void showDetails() {
        System.out.println("Plataforma: "+ platform);
        System.out.println("Nombre: " + getTitle());
        System.out.println("Genero: " + getCategory());
        System.out.println("Costo: $" + getPrice());
        System.out.println("Envio: $" + calculatingFee());

        double updatePrice = getPrice() + calculatingFee();
        setPrice(updatePrice);

        System.out.println("Total: $" + getPrice());
    }

    @Override
    public double calculatingFee() {
        return 0.99;
    }
}
