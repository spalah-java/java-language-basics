package ua.spalah.tips;

public enum Size {
    SMALL("S") , // значение "S" передается в конструктор
    MEDIUM("M"), // значение "M" передается в конструктор
    LARGE("L"), // значение "L" передается в конструктор
    EXTRA_LARGE("XL"); // значение "XL" передается в конструктор

    // Поле, где хрантся аббревиатура, может быть не одно поле
    private final String abbreviation;

    // Конструктор без модификатора доступа
    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // Метод для получения аббревиатуры размера
    public String getAbbreviation() {
        return abbreviation;
    }
}
