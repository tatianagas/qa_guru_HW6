import java.util.List;

public class FirstJavaHomework {

    public static void main(String... args) {
        // Целочисленные типы
        byte aByte = 0; // 8b   -128 + 127
        short aShort = 0; // 16b -32768 +32767
        int aInt = 0; // 32b   (-2^32) .. (+2^32 -1)
        Integer intWrapper = 0;
        long aLong = 0L; // 64b
        // Типы с плавающей точкой
        float aFloat = 0.0F; // -3.4E+38 до 3.4E+38
        double aDouble = 0.0; // -1.7E+308 до 1.7E+308
        Double doubleWrapper = 9.1;
        // Символьный
        char aChar = 'a';
        Character charWrapper = 'a';
        // Логически тип
        boolean aBoolean = true;
        Boolean booleanWrapper = true;
        // Строка (и бесконечность других объектных/ссылочных типов)
        String toBePrint = "Hello world!";
        List<Integer> teachers = List.of(10, 20);

        float minValueFloat = Float.MIN_VALUE;
        float maxValueFloat = Float.MAX_VALUE;
        double minValueDouble = Double.MIN_VALUE;
        double maxValueDouble = Double.MAX_VALUE;

        System.out.println("");
        System.out.println("Границы для чисел с плавающей точкой");
        System.out.println("min float: " + minValueFloat);
        System.out.println("max float: " + maxValueFloat);
        System.out.println("min double: " + minValueDouble);
        System.out.println("max double: " + maxValueDouble);


        int a = 1;
        int b = 2;

        System.out.println("");
        System.out.println("Арифметические операции");
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Остаток от деления: " + (a % b));
        System.out.println("Инкремент: " + (++ a));
        System.out.println("Декремент: " + (-- b));

        System.out.println("");
        System.out.println("Операции сравнения");
        System.out.println("a == b : " + (a == b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a != b));


        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        int redundant = 1;

        System.out.println("");
        System.out.println("Пересечение нижней границы: " + (minValue - redundant));
        System.out.println("Пересечение верхней границы: " + (maxValue + redundant));


        float f = 0.12F;
        double d = 0.12;
        int i = 12;

        System.out.println("");
        System.out.println("Комбинация типов данных");
        System.out.println("Арифметическая операция (f + d): " + (f + d));
        System.out.println("Логическая операция (f == d): " + (f == d));
        System.out.println("(i + d): " + (i + d));


    }
}
