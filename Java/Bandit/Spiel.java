public class Spiel {

    private final Zeichen[] zeichenpool;

    private final Zeichen[] spielArray;

    private int punkte;

    public Spiel(Zeichen[] zeichenpool) {
        this.zeichenpool = zeichenpool;
        this.spielArray = new Zeichen[3];
        this.punkte = 0;
    }

    public Zeichen[] getSpielArray() {

        return spielArray;
    }

    public void zieheZeichen(){

        for (int i = 0; i < spielArray.length; i++) {
            int rand = randomInRange(0, this.zeichenpool.length);
            Zeichen tmp = zeichenpool[rand];
            spielArray[i]=tmp;
        }

    }

    public static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public int berechnePunkte(){
        int summe = 0;
        for (Zeichen z: this.spielArray
             ) {
            summe += z.getWert();
        }

        this.punkte = summe;
     return  this.punkte;
    }

}
