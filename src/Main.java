import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, N;
        double S;

        Scanner input = new Scanner(System.in);

        System.out.print("N = ");
        N = input.nextInt();

        S = 0;
        i = N;

        while (i <= 22) {
            S += Math.sqrt(i * i + N * N) / i;
            i++;
        }
        System.out.println("S = " + S + " (while)");

        S = 0;
        i = N;

        do {
            S += Math.sqrt(i * i + N * N) / i;
            i++;
        } while (i <= 22);
        System.out.println("S = " + S + " (do ... while)");

        S = 0;

        for (int j = N; j <= 22; j++) {
            S += Math.sqrt(j * j + N * N) / j;
        }
        System.out.println("S = " + S + " (for i++)");

        S = 0;

        for (int j = 22; j >= N; j--) {
            S += Math.sqrt(j * j + N * N) / j;
        }
        System.out.println("S = " + S + " (for i--)");
    }
}
