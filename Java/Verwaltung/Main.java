



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        Lager lg1 = new Lager(2);
       
        

    


  

        /*comment*/

        boolean end = false;
        while (end != true){
            System.out.println(" ");
        System.out.println("+---------[MENÜ]--------+");
        System.out.println("|(1) Artikel hinzufuegen|");
        System.out.println("|(2) Artikel entfernen  |");
        System.out.println("|(3) Artikel suchen     |");
        System.out.println("|(4) Lager ausgeben     |");
        System.out.println("|(5) Programm beenden   |");
        System.out.println("+-----------------------+");



        int awahl ;
        awahl = in.nextInt();

        switch (awahl) {
            case 1: //Artikel hinzufügen
                String name;
                int anzahl;
                System.out.println("Geben den Name der Artikel ein:");
                name = in.next();
                System.out.println("Geben die Anzahl der Artikel ein:");
                anzahl = in.nextInt();
                lg1.hinzufuegen(new Artikel(name,anzahl) );
               break;
             
               
               
            case 2: //Artikel entnehmen

            	
            	System.out.println("Geben den Name der Artikel ein:");
                name = in.next();
                System.out.println("Wie viele wollen sie entfernen:");
                anzahl = in.nextInt();
                
                lg1.delArtikel(name, anzahl);
                break;
            	
               
            case 3: // Eintrag suchen
            	 
               System.out.println("Gebe den Namen des Artikels ein:");
               name=in.next();
               lg1.findArtikel(name);
               break;
             
               
            case 4: //Lager als Tabelle ausgeben
            	 for (Artikel tmpA: lg1.getArtikelListe()
                         ) {
                             if (tmpA != null)
                                 System.out.println("[Name: " + tmpA.getName() + " Anzahl: " + tmpA.getAnzahl()+ "]");
                         }	
            	 
                break;
                
                
            case 5://Programm beenden
            	
            	System.out.println("Auf Wiedersehen");
                end = true;

                break;



        }
        }
    }

    }