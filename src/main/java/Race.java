public class Race {
    private static Automobile winner;
    public final static int Duration = 24;

    public static void CheckWinner(Automobile automobile) {
        if (winner == null) {
            winner = automobile;
            return;
        }
        if (automobile.getDistance() > winner.getDistance()) {
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