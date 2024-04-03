import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коллчество дней: ");
        int d = scanner.nextInt();
        System.out.println("Введите температуру в эти дни: ");
        int max = 0;
        for (int i = 0; i < d; i++) {
            int u = scanner.nextInt();
            for (int j = 0; j < u; j++) {
                max = j;
                if (u < 0) {
                    int v=max;
                    j = 0;
                    max = j;
                    if (v>max){
                        max=v;
                    }
                }
            }
        }
        System.out.println("Протяжённость оттепели наибольшая: " + max);
    }
}
//Создал функцию протяжённости оттепели
//TODO
// настроить вывод максимальной протяжённости
//осознать написаное