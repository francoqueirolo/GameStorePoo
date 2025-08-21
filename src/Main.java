import models.*;
import utils.Category;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        Customer customer = new Customer("Franco Queirolo", 500.0);
        int choice;

        VideoGame game1 = new DigitalGame("001", "Doom Eternal", Category.ACTION.getDescription(), 29.99, 45.0);
        VideoGame game2 = new PhysicalGame("002", "Devil May Cry 5", Category.ACTION.getDescription(), 19.99, "PlayStation 4");
        VideoGame game3 = new DigitalGame("003", "The Legend of Zelda: Breath of the Wild", Category.ADVENTURE.getDescription(), 59.99, 14.4);
        VideoGame game4 = new PhysicalGame("004", "Uncharted 4: A Thief's End", Category.ADVENTURE.getDescription(), 9.99, "PlayStation 4");
        VideoGame game5 = new DigitalGame("005", "The Witcher 3: Wild Hunt", Category.RPG.getDescription(), 39.99, 50.0);
        VideoGame game6 = new PhysicalGame("006", "Final Fantasy VII Remake", Category.RPG.getDescription(), 49.99, "PlayStation 5");
        VideoGame game7 = new DigitalGame("007", "Civilization VI", Category.STRATEGY.getDescription(), 15.00, 12.0);
        VideoGame game8 = new PhysicalGame("008", "XCOM 2", Category.STRATEGY.getDescription(), 25.00, "Xbox One");

        //Agregar jeugos al catalogo
        store.addGame(game1);
        store.addGame(game2);
        store.addGame(game3);
        store.addGame(game4);
        store.addGame(game5);
        store.addGame(game6);
        store.addGame(game7);
        store.addGame(game8);

        System.out.println("\nBienvenido a GameStoreOOP, " + customer.getName());

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Ver Catálogo");
            System.out.println("2. Comprar un juego");
            System.out.println("3. Ver mi biblioteca");
            System.out.println("4. Verificar saldo");
            System.out.println("5. salir");
            System.out.print("Ingresa una opción: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Selecciona un valor valido.");
                sc.nextLine();
                choice = 0;
            }

            switch (choice) {
                case 1:
                    store.showCatalog();
                    break;
                case 2:
                    System.out.print("Ingresa el código del video juego: ");
                    String gameToBuy = sc.nextLine();
                    VideoGame game = store.findGame(gameToBuy);
                    if (game != null) {
                        customer.buyGame(game);
                    } else {
                        System.out.println("Juego no encontrado.");
                    }
                    break;
                case 3:
                    customer.showMyGames();
                    break;
                case 4:
                    System.out.println("\n--- TU SALDO ---");
                    System.out.println("Tu saldo es: $" + customer.getBalance());
                    break;
                case 5:
                    System.out.println("Gracias por tu visita, adios!");
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Opción no existe, intenta nuevamente.");
                    }
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}