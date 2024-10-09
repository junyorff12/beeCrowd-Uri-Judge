package bee1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEmSegundos = sc.nextInt();
        int hours = totalEmSegundos / 3600;
        int mins = (totalEmSegundos % 3600) / 60;
        int segundos = totalEmSegundos % 60;

        System.out.println(hours + ":" + mins + ":" + segundos);
    }
}
