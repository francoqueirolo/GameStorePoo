package models;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private ArrayList<VideoGame> myGames;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.myGames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void buyGame(VideoGame game) {
        if (balance >= game.getPrice()) {
            balance -= game.getPrice();
            myGames.add(game);
            System.out.println("Compra exitosa! " + game.getTitle() + " fue agregado a tu biblioteca.");
        } else {
            System.out.println("No tienes saldo para comprar " + game.getTitle());
        }
    }

    public void showMyGames() {
        if (myGames.isEmpty()) {
            System.out.println("No tienes juegos en tu biblioteca...");
        } else {
            System.out.println("");
            System.out.println("--- MI BIBLIOTECA DE JUEGOS ---");

            for (VideoGame game : myGames) {
                game.showDetails();
                System.out.println("------------------");
            }
        }
    }
}