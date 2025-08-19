package models;

import interfaces.Downloadable;

public class DigitalGame extends VideoGame implements Downloadable {
    private double sizeGB;

    public DigitalGame(String code, String title, String category, double price, double sizeGB) {
        super(code, title, category, price);
        this.sizeGB = sizeGB;
    }

    @Override
    public void showDetails() {
        System.out.println("Tipo: Juego Digital");
        System.out.println("Nombre: " + getTitle());
        System.out.println("Genero: " + getCategory());
        System.out.println("Costo: $" + getPrice());
        downloadFile();
    }

    @Override
    public void downloadFile() {
        System.out.println("Tamaño: " + sizeGB + " GB");
    }
}
