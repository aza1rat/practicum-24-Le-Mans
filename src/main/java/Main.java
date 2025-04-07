import java.util.Scanner;

public class Main {
    private final static int automobileCount = 3;
    private final static int maxSpeed = 250;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < automobileCount; i++)
        {
            String name = "";
            int speed = -1;
            do {

                System.out.printf("— Введите название машины №%s:\n",i + 1);
                name = scanner.nextLine().trim();
            }
            while (!validateAutomobileName(name));

            do {
                System.out.printf("— Введите скорость машины №%s (%s):\n",i + 1,name);
                try {
                    //TODO: Лучше тоже через nextLine
                    speed = scanner.nextInt();
                }
                catch (Exception exception) {
                    System.out.println("— Неправильная скорость");
                    continue;
                }
            }
            while (!validateAutomobileSpeed(speed));
            Automobile automobile = new Automobile(name,speed);
            Race.CheckWinner(automobile);
            scanner.nextLine();
        }
        scanner.close();
        System.out.printf("— Самая быстрая машина: %s\n",Race.GetWinnerName());
    }

    static boolean validateAutomobileName(String automobileName) {
        if (automobileName.isEmpty()) {
            return false;
        }
        return true;
    }

    static boolean validateAutomobileSpeed(int speed)
    {
        if (speed < 0 || speed > maxSpeed) {
            System.out.println("— Неправильная скорость");
            return false;
        }
        return true;
    }
}