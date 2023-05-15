#include <stdio.h>
#include <string.h>
#include "charfunction.h"

void vokale_konsonante(char name[50],int vc,int cc){
 

 vc=0 , cc=0;

    for(int i=0; i<strlen(name); i++)
    {
        if(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u'||name[i]=='A'||name[i]=='E'||name[i]=='I'||name[i]=='O'||name[i]=='U')
            vc++;
        else
            cc++;
    }
        printf("%s hat %d Konsonanten und %d Vokale.\n", name, cc, vc);
}


  int suche_zeichen(char string[100], char character)
{
    int i = 0;
    int zaehler = 0;
    while (string[i] != '\0')
    {
        if(string[i] == character) zaehler++;
        i++;
    }
    return zaehler;
}
