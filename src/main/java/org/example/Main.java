package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Массив животных и цветов
        String[] animals = {
                "крысы", "коровы", "тигра", "зайца", "дракона", "змеи",
                "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"
        };

        String[] colors = {
                "зеленой", "красной", "желтой", "белой", "черной"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int cyclePosition = (year - 1984) % 60;

        if (cyclePosition < 0) {
            cyclePosition += 60;
        }

        String animal = animals[cyclePosition % 12];

        String color = colors[(cyclePosition / 12) % 5];

        System.out.println("Это год " + color + " " + animal + ".");
    }
}
