import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1.1
        int[] weights1 = new int[3];
        weights1[0] = 1;
        weights1[1] = 2;
        weights1[2] = 3;
        System.out.println("K задаче 1.1:");
        System.out.println(weights1[0]);
        System.out.println(weights1[1]);
        System.out.println(weights1[2]);
        for (int i = 0; i < weights1.length; i++) {
            System.out.print(weights1[i] + " ");
        }
        System.out.println();
        // Задача 1.2, 2 вариант
        double[] weights3 = {1.57, 7.654, 9.986};
        System.out.println("K задаче 1.2:");
        for (int j = 0; j < weights3.length; j++) {
            System.out.print(weights3[j] + " ");
        }
        System.out.println();
        //Задача 1.3
        int[] weights4 = {1, 10, 100, 1000, 10000};
        System.out.println("K задаче 1.3:");
        for (int k = 0; k < weights4.length; k++) {
            System.out.print(weights4[k] + " ");
        }
        System.out.println();
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        //Задача 2.1
        for (int i = 0; i < weights1.length; i++) {
            System.out.print(weights1[i]);
            if (i != weights1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 2.2
        for (int i = 0; i < weights3.length; i++) {
            System.out.print(weights3[i]);
            if (i != weights3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 2.3
        for (int i = 0; i < weights4.length; i++) {
            System.out.print(weights4[i]);
            if (i != weights4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Или так еще проще записать:
        System.out.println(Arrays.toString(weights1));
        System.out.println(Arrays.toString(weights3));
        System.out.println(Arrays.toString(weights4));
        //Задача 3
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        //Задача 3.1
        for (int i = weights1.length-1; i >= 0; i--) {
            System.out.print(weights1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 3.2
        for (int i = weights3.length-1; i >= 0; i--) {
            System.out.print(weights3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 3.3
        for (int i = weights4.length-1; i >= 0; i--) {
            System.out.print(weights4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 4
        for (int i = 0; i < weights1.length; i++) {
            if (weights1[i] % 2 != 0) {
                weights1[i] = weights1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weights1));
        System.out.println();
        //Попробую с плавающей точкой
        double[] weights5 = {2.785, 3.459, 6.982, 5.961, 6.853};
        for (int i = 0; i < weights5.length; i++) {
            if (weights5[(int) i] % 2 != 0) {
                weights5[(int) i] = weights5[(int) i] + 1;
            }
        }
        System.out.println(Arrays.toString(weights5));
    }
}