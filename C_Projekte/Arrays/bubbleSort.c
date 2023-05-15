#include <stdio.h>

//BUBBLESORT IST FÜR GROßE DATEN SCHLECHT; BIG O NOTATION = O(N^2)
/*
 *  Hier ist eine Beschreibung der Schleifen: sort (BUBBLE SORT)
 *  Die äußere Schleife (mit dem Index i) geht das Array einmal von Anfang 
 *  bis Ende durch. Wir müssen nur bis zum vorletzten Element gehen (size-1)
 *  ,da das letzte Element bereits das größte Element sein muss, wenn das Array
 *  vollständig sortiert ist.
 *  Die innere Schleife (mit dem Index j) vergleicht jedes Element mit seinem 
 *  rechten Nachbarn. Wenn das linke Element größer als das rechte ist, tauscht
 *  die Schleife die beiden Elemente aus.
 *  Nach jeder Durchführung der inneren Schleife ist das größte Element am Ende des Arrays.
 *  Das bedeutet, dass wir uns bei der nächsten Durchführung der äußeren Schleife nicht mehr
 *  um dieses Element kümmern müssen.
 *  Nachdem die äußere Schleife abgeschlossen ist, sind alle Elemente des Arrays in aufsteigender
 *  Reihenfolge sortiert.
 */

void sortInt(int array[], int size)
{
    for(int i = 0; i < size - 1; i++)
    {
        for(int j = 0; j < size - 1; j++)
        {
            if(array[j] > array[j+1])   // < BIG TO SMALL / > SMALL TO BIG
            {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] =  temp;
            }
        }
    }
}

void sortChar(char array[], int size)
{
    for(int i = 0; i < size - 1; i++)
    {
        for(int j = 0; j < size - 1; j++)
        {
            if(array[j] > array[j+1])   // < BIG TO SMALL / > SMALL TO BIG
            {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] =  temp;
            }
        }
    }
}

void printInt(int array[], int size)
{   
    for(int i = 0; i < size; i++)
    {
        printf("%d ", array[i]);
    }

}

void printChar(char array[], int size)
{   
    for(int i = 0; i < size; i++)
    {
        printf("%c ", array[i]);
    }

}

int main(){
int array[]= {5,7,2,6,8,9,0,3,1,4,99,54};
char array1[]= {'H','B','R','A','I'};       
 
int size = sizeof(array)/sizeof(array[0]);
int size1 = sizeof(array1)/sizeof(array1[0]);

   
sortInt(array,size);
printInt(array,size);
printf("\n");
sortChar(array1,size1);
printChar(array1,size1); 

return 0; 

}