

public class Artikel {
	//Attribute //Eigenschaften
    private String name;
    private int anzahl;
	
    //Konstruktor 
    public Artikel(String name, int anzahl){
        this.name = name;
        this.anzahl = anzahl;
    }

    
    
    public String getName() {
        return this.name;
    }

    public int getAnzahl() {
        return this.anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

   
   
}
