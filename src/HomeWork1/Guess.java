package HomeWork1;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {
        int number = new Random().nextInt(10); // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        Scanner sc = new Scanner(System.in);
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");
        int Attem = 0;
        for (int i = 0; i < maxAttempts; i++) {

            int myNumber = sc.nextInt(); 
            if(number > myNumber){
                Attem++;
                System.out.printf("Моё число больше! Осталось %s  попыток", maxAttempts-Attem);
                System.out.println();
            } else if (number < myNumber) {
                Attem++;
                System.out.printf("Моё число меньше! Осталось %s  попыток", maxAttempts-Attem);
                System.out.println();
            } else {
                System.out.printf("Ты угадал с %s попытки", Attem+1);
                break;
            }
            if(i==maxAttempts-1){
                System.out.println("Ты не угадал!");
            }


        }

    }
}
