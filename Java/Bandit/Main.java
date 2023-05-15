public class Main {
    public static void main(String[] args) {

      Zeichen[] zTmp = new Zeichen[3];
      zTmp[0] = new Zeichen(15,"Kirsche",'k');
      zTmp[1] = new Zeichen(9,"9",'9');
      zTmp[2] = new Zeichen(100,"Batman",'B');

      Spiel sp = new Spiel(zTmp);

      sp.zieheZeichen();

        for (Zeichen z: sp.getSpielArray()
             ) {
            System.out.println(z.getSymbol());
        }

        System.out.println(sp.berechnePunkte());


    }
}