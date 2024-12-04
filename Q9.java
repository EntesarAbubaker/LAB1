class GameEntry{
    int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

public class Q9 {
    public static void main(String[] args) {

        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 100);
        }
        GameEntry[] B = A;
        A[4].setScore(550);
        System.out.println("Score in A[4]: " + A[4].getScore());
        System.out.println("Score in B[4]: " + B[4].getScore());
    }
}
