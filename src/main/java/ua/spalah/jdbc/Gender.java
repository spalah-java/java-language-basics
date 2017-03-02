package ua.spalah.jdbc;

public enum Gender {
    MALE("Male"), FEMALE("Female");

    private final String display;

    Gender(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
