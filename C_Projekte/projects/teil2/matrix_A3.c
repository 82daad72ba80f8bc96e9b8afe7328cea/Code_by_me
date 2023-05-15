#include <stdio.h>
#include <stdlib.h>

void print_matrix()  //matrix generieren
{
char matrix[5][5];
    for (int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 5 ; j++)
        {
            matrix[i][j] = '+';
        }
    }
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++)
        {
            printf("%c ",matrix[i][j]);
        }
     printf("\n");
    }
}


void print_refresh()
{
    print_matrix();
}


void print_zero()       //ganze Matrix in als 0 darstellen 
{
    char matrix[5][5];
    for (int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 5 ; j++)
        {
            matrix[i][j] = '0';
        }
    }
    for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 5; j++)
        {
            printf("%c ",matrix[i][j]);
        }
     printf("\n");
    }
}



void print_diagonal()        //print diagonal
{
    char matrix[5][5];
    for (int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 5 ; j++)
        {
            matrix [i][j] = '+';
            matrix[0][0]= '0';
            matrix[0][4]= '0';
            matrix[1][1]= '0';
            matrix[1][3]= '0';
            matrix[2][2]= '0';
            matrix[3][1]= '0';
            matrix[3][3]= '0';
            matrix[4][0]= '0';
            matrix[4][4]= '0';
        }
    }
    for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 5; j++)
        {
            printf("%c ",matrix[i][j]);
        }
     printf("\n");
    }
}



void print_specific() {
  char matrix[5][5];
    char wahl;
  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      matrix[i][j] = '+';
    }
  }
  printf("Willst du einen array mit 0 füllen ? (j/n)\n");
  scanf(" %c",&wahl);
while( wahl == 'j'){
  int row, column;
  printf("Gebe 2 zahlen als index 0-4 z.B \"0,0 oder 1,4\": ");
  scanf("%d,%d", &row, &column);

  if(row < 0 || column < 0){
    printf("INVALID INDEX");
  }

  matrix[row][column] = '0';

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      printf("%c ", matrix[i][j]);
    }
    printf("\n");
  }
  printf("Willst du noch einen array mit 0 füllen ? (j/n)\n");
  scanf(" %c",&wahl);
}
}

void print_menu(){      //Menü zum auswählen
printf("\n");
printf("1. Fuelle alle Felder mit 0\n");
printf("2. Fuelle die beiden Diagonalen mit 0\n");
printf("3. Fuelle ein spezielles Feld mit 0\n");
printf("4. Refresh\n");
printf("5. Exit\n");
printf("\n");
printf("Waehle aus 1-5:\n");
}





int main ()
{
    print_matrix();
  
  int choice;
  do
  {
    print_menu();
    scanf("%d",&choice);
     switch (choice)
   {
    case 1:         print_zero();
        break;
    case 2:         print_diagonal();
        break;      
    case 3:         print_specific();
        break;
    case 4:         print_refresh();
        break;
    case 5:         printf("!!! Good Bye !!!"); exit(0);
        break; 
   
     default:       printf("\n!!! INVALID INPUT !!!\n");
        break;
   } 
  } while (choice != 5);
  

  return 0;  
}



