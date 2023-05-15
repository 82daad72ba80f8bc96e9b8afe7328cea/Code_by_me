#include <stdio.h>
#include <string.h>
#include "charfunction.h"

int main()
{

char wahl;
char name[50]; int vc,cc;

        printf("\nWort eingeben: ");
        scanf("%[^\n]",name);


      vokale_konsonante(name,vc,cc);

    printf("Willst du einen zeichen in deinem string suchen ? (j/n)\n");
    scanf("%s",&wahl);
        while(wahl=='j'){
        
            char zeichen;
            int anzahl;

           
            
            
            printf("\nBitte Zeichen eingeben: ");
            scanf(" %c", &zeichen);

            anzahl = suche_zeichen(name, zeichen);

            printf("\nIn %s kommt %c %i-mal vor.\n", name,zeichen, anzahl);

            printf("Soll ein bestimmter Buchstabe gesucht werden (j/n) ? ");
            scanf("%s", &wahl);

        } if(wahl=='n')
            {
                printf("\nAuf Wiedersehen.");
            }
           
   return 0;
}