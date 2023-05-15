#include <stdio.h>
//SELECTION SORT FÜR GROßE DATEN SCHLECHT BIG O = O(N^2)
int main ()
{

int arr[] = {5,9,7,6,4,0,2,3,8,1};
int length = sizeof(arr)/sizeof(arr[0]);

printf("VORHER\n");
 for(int i = 0; i < length; i++)
    {
        printf("Position [%d] => %d \n", i,arr[i]);
    }

    for(int i = 0; i < length; i++)
    {
    int min_pos = i;
    for(int j = i+1; j < length; j++)
        if(arr[j] < arr[min_pos])
        min_pos = j;

        if(min_pos != i)
        {
        int temp = arr[i];
        arr[i] = arr[min_pos];
        arr[min_pos] = temp;
        }
    }
    printf("\nNACHHER");
    printf("\n");
    for(int i = 0; i < length; i++)
    {
        printf("Position [%d] => %d \n", i,arr[i]);
    }
    return 0;
}

/*
Selection Sort ist ein einfacher Sortieralgorithmus,
 der nach dem "Divide and Conquer" - Ansatz arbeitet.
  Er sortiert ein Array, indem er das kleinste Element im 
  unsortierten Teil des Arrays findet und es an den Anfang 
  des unsortierten Teils verschiebt. Dies wird wiederholt, 
  bis das gesamte Array sortiert ist.
*/