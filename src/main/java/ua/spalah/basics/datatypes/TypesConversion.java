package ua.spalah.basics.datatypes;

public class TypesConversion {

    public static void main(String[] args) {
        conversion();
        cast();
    }

    private static void conversion() {
        // Конвертация при присваивании
        int i = 10;
        long l = i; // расширяющее преобразование
        // short s = i; // Ошибка компиляции, попытка сужающего преобразования!

        // По умолчанию все числовые литералы имеют тип int и double.
        // float f = 1.234; // Ошибка
        float f = 1.234F; // Ошибка

        // Но следующее возможно:
        byte b = 1;
        short s = 2;
        char c = 3;
        // Java допускает инициализацию byte, short и char строковыми литералами.
        // Компилятор проводит проверку литерала, и, если он попадает в диапазон допустимых значений типа, разрешает присваивание.

        // Для унарных операторов (кроме ++ и --), если операнд типа byte, short и char, он конвертируется в int перед выполнением операции.
        byte b1 = 5;
        // byte b2 = -b1; //Ошибка, попытка привести int к byte
    }

    private static void cast() {
        // Cast - явное приведение типов
        double d = 9.997;
        int i = (int) d; // i = 9
        System.out.println(i);

        short s = 257;
        byte b = (byte) s; // b = 1
        System.out.println(b);
    }
}
