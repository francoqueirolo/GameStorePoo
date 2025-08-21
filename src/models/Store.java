package models;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private Map<String, VideoGame> inventory;

    public Store() {
        inventory = new HashMap<>();
    }

    public void addGame(VideoGame item) {
        inventory.put(item.getCode(), item);
        System.out.println("➕ Item agregado al catálogo: " + item.getTitle());
    }

    public void showCatalog() {
        System.out.println("\n--- LISTA COMPLETA DEL INVENTARIO ---");

        for (VideoGame game : inventory.values()) {
            game.showDetails();
            System.out.println("---------------------------------");
        }
    }

    public VideoGame findGame(String code) {
        return inventory.get(code);
    }
}