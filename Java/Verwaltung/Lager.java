

public class Lager {

    private Artikel[] artikelListe;

    public Lager(int groeße){
    this.artikelListe = new Artikel[groeße];
    }


    public Artikel[] getArtikelListe(){
    return  this.artikelListe;
    }

  

   
    
     // METHODE: Artikel Suchen
    public boolean findArtikel(String name){
        for (Artikel a: artikelListe)
             {
        	if(a != null) {
            if(a.getName().equals(name)) {
                System.out.println("Name: " + a.getName()+ " Gibt es: "+ a.getAnzahl());
                return true;}
            }
        }

        return false;
    }



    
    // METHODE: Artikel anzahl verringern
    public void delArtikel(String name, int anzahl) {
    		for (Artikel a: artikelListe) {
    		
    		
    		if(a.getName().equals(name)) {
    			if(a.getAnzahl() < anzahl) {
    			System.out.println("Fehler: So viele sind nicht im Lager!");
    			
    			break;
       		}   		
    		else {
    			a.setAnzahl(a.getAnzahl() - anzahl);
    			break;
    		}
    		
    		
    			
    		}
    	    }


 

    }
    	// METHODE: Artikel hinzufügen oder vermehren
    	public void hinzufuegen(Artikel artikel) {
    		
    	boolean ArtikelSuche = false;
    	for (int i =0; i < this.artikelListe.length;i++) {
    		if(this.artikelListe[i] != null) {
    			if(this.artikelListe[i].getName().equals(artikel.getName())) {
    				
    				this.artikelListe[i].setAnzahl(this.artikelListe[i].getAnzahl() + artikel.getAnzahl());
    				ArtikelSuche = true;
    				break;
    			}
    		} else {
    			if(this.artikelListe[i] == null) {
    				this.artikelListe[i] = artikel;
    				ArtikelSuche = true;
    				break;
    			}
    			
    			}
    		}
    	if(ArtikelSuche == false) {
    	System.out.println("FEHLER: Lager ist voll ! ");
    	}
    		
    	}
    	
    	
    	
    	
 }
		
		
			
		
	    







	
		
		
	
   



