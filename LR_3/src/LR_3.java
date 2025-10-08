import java.util.Scanner;

public class LR_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, S;
        int n, N;
        System.out.print("Введите x и количество членов ряда N: ");
        x = sc.nextDouble();
        N = sc.nextInt();

        S = 0;
        for (n = 1; n <= N; n++)
            S += Math.pow(-1, n) * Math.pow(x, 2 * n - 1) / factorial(2 * n + 1);
        System.out.println("1) S = " + S);

        S = 0;
        for (n = 1; n <= N; n++)
            S += Math.pow(-1, n) * Math.pow(x, 4 * n + 1) / (4 * n + 1);
        System.out.println("3) S = " + S);

        S = 1;
        for (n = 1; n <= N; n++)
            S += Math.pow(-1, n + 1) * Math.pow(n, 2) * Math.pow(x, n) / factorial(n);
        System.out.println("6) S = " + S);

        S = 0;
        for (n = 1; n <= N; n++)
            S += Math.pow(1 + 1.0 / n, Math.pow(x, 2 * n + 1));
        S *= 2;
        System.out.println("9) S = " + S);

        S = 0;
        for (n = 1; n <= N; n++)
            S += ((2 * n + 1) * Math.pow(x, 2 * n + 1)) / factorial(2 * n + 1);
        S += Math.atan(2);
        System.out.println("11) S = " + S);

        S = 0;
        for (n = 1; n <= N; n++)
            S += Math.pow(-1, n) * Math.pow(x, 2 * n + 1) * (1 + Math.pow(x, 2)) / (2 * n + 1);
        System.out.println("14) S = " + S);
    }

    static double factorial(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}