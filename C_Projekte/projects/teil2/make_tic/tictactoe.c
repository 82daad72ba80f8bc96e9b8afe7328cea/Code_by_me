#include <stdio.h>
#include "tictactoe.h"
 
        
int main(){
       
       spiel();
       int  choice; 
do{

printf("\nWAEHLE AUS\n");
printf("(1)Starte das Spiel neu\n");
printf("(2)Exit\n");
scanf("%d",&choice);
       switch (choice)
       {
       case 1:  system("cls"); spiel();
        break;
        case 2: printf("Tschüssi");  return 0;
       break;
       default: printf("Ungueltige eingabe");
        break;
       }
       
    }while(choice != 2);
}