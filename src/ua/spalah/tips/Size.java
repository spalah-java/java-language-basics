package ua.spalah.tips;

public enum Size {
    SMALL("S", 28) , // значение "S" передается в конструктор
    MEDIUM("M", 30), // значение "M" передается в конструктор
    LARGE("L", 32), // значение "L" передается в конструктор
    EXTRA_LARGE("XL", 34); // значение "XL" передается в конструктор

    // Поле, где хрантся аббревиатура, может быть не одно поле
    private final String abbreviation;
    private final int numberEquivalent;

    // Конструктор без модификатора доступа
    Size(String abbreviation, int numberEquivalent) {
        this.abbreviation = abbreviation;
        this.numberEquivalent = numberEquivalent;
    }

    // Метод для получения аббревиатуры размера
    public String getAbbreviation() {
        return abbreviation;
    }

    public int getNumberEquivalent() {
        return numberEquivalent;
    }
}
