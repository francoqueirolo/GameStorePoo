package utils;

public enum Category {
    ACTION("Juego de acción", 1),
    ADVENTURE("Juego de aventura", 2),
    RPG("Juego tipo RPG", 3),
    STRATEGY("Juego de estrategia", 4);

    private final String description;
    private final int code;

    Category(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
