import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коллчество дней: ");
        int d = scanner.nextInt();
        System.out.println("Введите температуру в эти дни: ");
        int max = 0;
        for (int i = 0; i < d; i++) {
            int u = scanner.nextInt();
            int j = 0; // точка отчёта отрицактельности
            if (j < u) {
                j++;// счётчик оттепели
            }else{
            max=j;//к
            j=0;
            }
        }
        System.out.println("Протяжённость оттепели наибольшая: " + max);
    }
}
//Создал функцию протяжённости оттепели
//TODO
// настроить вывод максимальной протяжённости
//осознать написаное, что я хотел этим добиться