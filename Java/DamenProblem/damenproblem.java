
public class damenproblem {
    static int N = 4;
    static int queens[] = new int[N];

    static boolean isFeasible(int r, int c) {
        for (int i = 0; i < r; i++) {
            if (queens[i] == c || (i - r) == (queens[i] - c) ||
                    (i - r) == (c - queens[i])) {
                return false;
            }
        }
        return true;
    }

    static void printQueens() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (queens[i] == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void placeQueens(int r) {
        if (r == N) {
            printQueens();
        } else {
            for (int c = 0; c < N; c++) {
                if (isFeasible(r, c)) {
                    queens[r] = c;
                    placeQueens(r + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        placeQueens(0);
    }
}
