public class Race {
    private static Automobile winner;
    private final static int duration = 24;

    public static int GetDuration()
    {
        return duration;
    }

    public static void CheckWinner(Automobile automobile) {
        if (winner == null || automobile.getDistance() > winner.getDistance()) {
            winner = automobile;
        }
    }

    public static String GetWinnerName() {
        String winnerName = "(не найдена)";
        if (winner != null) {
            winnerName = winner.getName();
        }
        return winnerName;
    }


}