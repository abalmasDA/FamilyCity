import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Програма визначає, яка сім'я (прізвище) живе у місті:
 * Приклад введення:
 * · Москва
 * · Іванови
 * · Київ
 * · Петрови
 * · Лондон
 * · Абрамовичі
 * Приклад введення:
 * · Лондон
 * Приклад виведення:
 * · Абрамовичі
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> families = new HashMap<>();

        System.out.print("Enter the number of families that will be on the list:");
        int numberFamilies = scanner.nextInt();

        for (int i = 0; i < numberFamilies; i++) {
            System.out.println("Enter the city:");
            String city = scanner.next();
            System.out.println("Enter the family:");
            String family = scanner.next();
            families.put(city, family);
        }

        System.out.print("Enter city where family lives:");
        String cityToSearch = scanner.next();

        System.out.println("family: " + families.get(cityToSearch));


    }


}
