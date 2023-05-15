public class Zeichen {

    private final int wert;
    private final char symbol;

    public Zeichen(int wert, String name, char symbol){
        this.wert = wert;
        this.symbol = symbol;
    }

    public int getWert() {
        return wert;
    }

    public char getSymbol() {
        return symbol;
    }
}
