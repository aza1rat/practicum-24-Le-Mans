public class Race {
    private Automobile winner;
    public final static int DURATION = 24;

    public void checkWinner(Automobile automobile) {
        if (winner == null || automobile.distance > winner.distance) {
            winner = automobile;
        }
    }

    public String getWinnerName() {
        String winnerName = "(не найдена)";
        if (winner != null) {
            winnerName = winner.name;
        }
        return winnerName;
    }


}