import java.util.Scanner;

public class Main {
    private final static int AUTOMOBILE_COUNT= 3;
    private final static int MAX_SPEED = 250;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < automobileCount; i++) {
            String name;
            int speed;
            do {
                System.out.printf("— Введите название машины №%s:\n", i + 1);
                name = scanner.nextLine().trim();
            } while (!validateAutomobileName(name));

            do {
                System.out.printf("— Введите скорость машины №%s (%s):\n", i + 1, name);
                speed = parseSpeed(scanner.nextLine().trim());
            } while (speed == -1 || !validateAutomobileSpeed(speed));
            Automobile automobile = new Automobile(name, speed);
            Race.CheckWinner(automobile);
        }
        scanner.close();
        System.out.printf("— Самая быстрая машина: %s\n", Race.GetWinnerName());
    }

    static int parseSpeed(String input) {
        int speed = -1;
        try {
            speed = Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            System.out.println("— Введите целое число");
        }
        return speed;
    }

    static boolean validateAutomobileName(String automobileName) {
        return !automobileName.isEmpty();
    }

    static boolean validateAutomobileSpeed(int speed) {
        if (speed < 0 || speed > maxSpeed) {
            System.out.println("— Неправильная скорость");
            return false;
        }
        return true;
    }
}