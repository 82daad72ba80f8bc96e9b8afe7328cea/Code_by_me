#include <stdio.h>
#include "tictactoe.h"

int spiel()
{
    
    char spielfeld[10] = {'0','1','2','3','4','5','6','7','8','9','\0'};
    int durchlauf, wahl,gewonnen = 0;  

    printf("\nSpieler 1 mit einem X und Spieler 2 mit einem O\n");

    printf("\nDas Spielfeld\n\n");

    printf("%c \t %c \t %c\n", spielfeld[1],spielfeld[2],spielfeld[3]);
    printf("\n----+--------+------\n");
    printf("%c \t %c \t %c\n", spielfeld[4],spielfeld[5],spielfeld[6]);
    printf("\n----+--------+------\n");
    printf("%c \t %c \t %c\n", spielfeld[7],spielfeld[8],spielfeld[9]);

    for(durchlauf=1;durchlauf<10&&gewonnen==0;durchlauf++)
    {
        if(durchlauf%2==1)
        {
            do
            {
                printf("Spieler 1 ist an der Reihe, bitte druecken Sie die entsprechende Zahl\n");
                scanf("%i",&wahl);
               

                if((spielfeld[wahl]=='X')||(spielfeld[wahl]=='O'))
                {
                    printf("Das eingegebene Feld ist schon besetzt\n");

                    wahl = 10;
                }
            }

            while((wahl<1)||(wahl>9));

            spielfeld[wahl]='X';
        }
        else
        {
            do
            {
                printf("Spieler 2 ist an der Reihe, bitte druecken Sie die entsprechende Zahl\n");
                scanf("%i",&wahl);
                

                if((spielfeld[wahl]=='O')||(spielfeld[wahl]=='X'))
                {
                    printf("Das eingegebene Feld ist schon besetzt\n");

                    wahl = 10;
                }
            }

             while((wahl<1)||(wahl>9));

            spielfeld[wahl]='O';
        }
    system("cls");
    printf("%c \t %c \t %c\n", spielfeld[1],spielfeld[2],spielfeld[3]);
    printf("\n----+--------+------\n");
    printf("%c \t %c \t %c\n", spielfeld[4],spielfeld[5],spielfeld[6]);
    printf("\n----+--------+------\n");
    printf("%c \t %c \t %c\n", spielfeld[7],spielfeld[8],spielfeld[9]);

        if (((spielfeld[1]=='O')&&(spielfeld[2]=='O')&&(spielfeld[3]=='O'))||((spielfeld[4]=='O')&&(spielfeld[5]=='O')&&(spielfeld[6]=='O'))||((spielfeld[7]=='O')&&(spielfeld[8]=='O')&&(spielfeld[9]=='O'))||
            ((spielfeld[1]=='O')&&(spielfeld[5]=='O')&&(spielfeld[9]=='O'))||((spielfeld[3]=='O')&&(spielfeld[5]=='O')&&(spielfeld[7]=='O'))||((spielfeld[2]=='O')&&(spielfeld[5]=='O')&&(spielfeld[8]=='O'))||
            ((spielfeld[3]=='O')&&(spielfeld[6]=='O')&&(spielfeld[9]=='O'))||((spielfeld[1]=='O')&&(spielfeld[4]=='O')&&(spielfeld[7]=='O')))
        {
            printf("\nSpieler 2 hat gewonnen!");
            gewonnen = 2;
        }
        if (((spielfeld[1]=='X')&&(spielfeld[2]=='X')&&(spielfeld[3]=='X'))||((spielfeld[4]=='X')&&(spielfeld[5]=='X')&&(spielfeld[6]=='X'))||((spielfeld[7]=='X')&&(spielfeld[8]=='X')&&(spielfeld[9]=='X'))||
            ((spielfeld[1]=='X')&&(spielfeld[5]=='X')&&(spielfeld[9]=='X'))||((spielfeld[3]=='X')&&(spielfeld[5]=='X')&&(spielfeld[7]=='X'))||((spielfeld[2]=='X')&&(spielfeld[5]=='X')&&(spielfeld[8]=='X'))||
            ((spielfeld[3]=='X')&&(spielfeld[6]=='X')&&(spielfeld[9]=='X'))||((spielfeld[1]=='X')&&(spielfeld[4]=='X')&&(spielfeld[7]=='X')))
            {
            printf("\nSpieler 1 hat gewonnen!");
            gewonnen = 1;
            }
        }

        printf("\n");
}