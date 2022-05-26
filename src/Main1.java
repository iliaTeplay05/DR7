import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();

        int column = 5;
        int line = 5;

        int[][] mas = new int[column][line];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                mas[i][j] = random.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int count = mas.length / 2;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < count; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[i][mas.length - 1 - j];
                mas[i][mas.length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < mas.length; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[mas.length - 1 - i][j];
                mas[mas.length - 1 - i][j] = temp;
            }
        }
        System.out.println();

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
