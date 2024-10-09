package bee1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEmDias = sc.nextInt();

        int anos = totalEmDias / 365;
        int meses = (totalEmDias % 365) / 30;
        int dias = (totalEmDias % 365) % 30;

        System.out.println(anos + " ano(s)\n"
                + meses +" mes(es)\n"
                + dias + " dia(s)");
    }
}