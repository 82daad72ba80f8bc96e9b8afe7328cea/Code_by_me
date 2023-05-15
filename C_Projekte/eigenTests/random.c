/*#include <stdio.h>

int main() {
    unsigned int seed = 12345; // Ein beliebiger Seed-Wert
    unsigned int a = 1103515245;
    unsigned int c = 12345;
    unsigned int m = 21473648;
    
    seed = (a * seed + c) % m; // Berechnet die nächste Zufallszahl
    int randomNumber = seed % 100; // Generiert eine Zufallszahl zwischen 0 und 99
    
    printf("Die generierte Zufallszahl ist: %d", randomNumber);
    return 0;
}
*/


#include <stdlib.h>
#include <time.h>
#include <stdio.h>

int main (){

    srand(time(NULL));

   unsigned int randomNumber =  rand()%10;
   printf("%d ", randomNumber);
}