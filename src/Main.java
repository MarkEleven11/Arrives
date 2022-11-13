import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /// Task 1 $ Task 2
        ///1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("Task 1 & Task 2");

        int [] numbers = new int[3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        float [] fraction = {1.57f, 7.654f, 9.986f};
        for (int j = 0; j < fraction.length; j++) {
            System.out.print(fraction[j]);
            if (j != fraction.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] days = new int [7];
        days [0] = 23;
        days [1] = 24;
        days [2] = 43;
        days [3] = 34;
        days [4] = 28;
        days [5] = 41;
        days [6] = 11;
        for (int k = 0; k < days.length; k++) {
            System.out.print(days[k]);
            if (k != days.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        ///Task 3
        System.out.println("Task 3");
        int[] number = new int[3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        for (int a = number.length- 1; a >= 0; a--) {
            System.out.print(number[a]);
                if (a != 0) {
                    System.out.print(", ");
                }
        }
        System.out.println();
        float [] frac = {1.57f, 7.654f, 9.986f};
        for (int b = frac.length - 1; b >= 0; b--) {
            System.out.print(frac[b]);
                if (b != 0) {
                    System.out.print(", ");
                }
        }
        System.out.println();
        int [] day = new int [7];
        day [0] = 23;
        day [1] = 24;
        day [2] = 43;
        day [3] = 34;
        day [4] = 28;
        day [5] = 41;
        day [6] = 11;
        for (int c = day.length - 1; c >= 0; c--) {
            System.out.print(day[c]);
            if (c != 0) {
                System.out.print(", ");
            }
        }
        ///Task 3.
        System.out.println("Task 3");
        int [] numb = {1, 2, 3};
        for (int d = 0; d < numb.length; d++) {
            if (numb[d] % 2 != 0) {
                numb[d] += 1;
            }   System.out.println(Arrays.toString(numb));

        }
    }
}