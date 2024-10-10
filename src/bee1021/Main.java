package bee1021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = sc.nextLine();

        double valorTotal = Double.parseDouble(valor.replace(",", "."));

        double resto = valorTotal;

        int notas100 = (int) resto / 100;
        resto %= 100;
        int notas50 = (int) resto / 50;
        resto %= 50;
        int notas20 = (int) resto / 20;
        resto %= 20;
        int notas10 = (int) resto / 10;
        resto %= 10;
        int notas5 = (int) resto / 5;
        resto %= 5;
        int notas2 = (int) resto / 2;
        resto %= 2;

        resto = resto * 100.0;

        int moedas1 = (int) resto / 100;
        resto %= 100;
        int moedas50 = (int)(resto / 50);
        resto %= 50;
        int moedas25 = (int) (resto / 25);
        resto %= 25;
        int moedas10 = (int)(resto / 10);
        resto %= 10;
        int moedas05 = (int) (resto / 5);
        resto %= 5;
        int moedas01 = (int)(resto / 1);

        System.out.println("NOTAS:\n" +
                            notas100 + " nota(s) de R$ 100.00\n"+
                            notas50 + " nota(s) de R$ 50.00\n" +
                            notas20 + " nota(s) de R$ 20.00\n" +
                            notas10 + " nota(s) de R$ 10.00\n" +
                            notas5 + " nota(s) de R$ 5.00\n" +
                            notas2 + " nota(s) de R$ 2.00\n" +
                            "MOEDAS:\n" +
                            moedas1 + " moeda(s) de R$ 1.00\n" +
                            moedas50 + " moeda(s) de R$ 0.50\n" +
                            moedas25 + " moeda(s) de R$ 0.25\n" +
                            moedas10 + " moeda(s) de R$ 0.10\n" +
                            moedas05 + " moeda(s) de R$ 0.05\n" +
                            moedas01 + " moeda(s) de R$ 0.01\n");
        sc.close();

    }
}
