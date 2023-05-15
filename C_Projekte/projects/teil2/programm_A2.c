#include <stdio.h>
#include <string.h>

int sucheZeichen(const char s[], char c)
{
    int i = 0;
    int zaehler = 0;
    while (!s[i] == '\0')
    {
        if(s[i] == c) zaehler++;
        i++;
    }
    return zaehler;
}

int main()
{

            char name[50];
            int i, vc=0, cc=0;
            char wahl; 
            const int laenge = 10;
            char string[laenge];
            char zeichen;
            int anzahl;
            
    printf("\nWort eingeben: ");
    scanf("%s", name);
    
    for(i=0; i<strlen(name); i++)
    {
        if(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u'||name[i]=='A'||name[i]=='E'||name[i]=='I'||name[i]=='O'||name[i]=='U')
            vc=vc+1;
        else
            cc=cc+1;
    }
        printf("%s hat %d Konsonanten und %d Vokale.\n", name, cc, vc);

        printf("Soll ein bestimmter Buchstabe gesucht werden (j/n) ? ");
        scanf("%s", &wahl);
  
        if(wahl=='j')
        {
           

            printf("\nBitte String eingeben: ");
            fflush(stdin);
            scanf("%s", &string);
            printf("\nBitte Zeichen eingeben: ");
            scanf("%s", &zeichen);

            anzahl = sucheZeichen(string, zeichen);

            printf("\nIn %s kommt %c %i-mal vor.\n", string, zeichen, anzahl);
         } else if(wahl=='n')
            {
                printf("\nAuf Wiedersehen.");
            }
  
   
        }
  
