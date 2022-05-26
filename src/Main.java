public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // 1) if (i >= j) {
                // 2) if (i <= j) {
                // 3) if (j == mas.length - 1 - i) {
                // 4) if (j >= mas.length - 1 -i) {
                // 5) if (j <= mas.length - 1 -i) {
                // 6) if (j == 2) {
                // 7) if (i == 2) {
                // 8) if (i == 2 | j == 2) {
                // 9) if (j % 2 == 0) {
                // 10) if (i % 2 == 0) {
                // 11) if (i == j | j == mas.length - 1 - i) {
                if ((i % 2 == 0 & j % 2 == 0) | (i % 2 == 1 & j % 2 == 1)) {
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}