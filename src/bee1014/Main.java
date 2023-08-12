package bee1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();
        double consumoMedio = distancia / combustivel;
        System.out.println(String.format("%.3f km/l", consumoMedio));

        sc.close();

    }
}