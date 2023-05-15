#include <stdio.h>


float g; // grundseite
float h; //höhe
float A; //flächeinhalt



                                                    //printf ==> nur variable 
                                                    //scanf ==> mit &+variable
int main (){
    printf("Grundseite in cm:\n");
    scanf("%f", &g); 

    printf("Hoehe in cm:\n");
    scanf("%f", &h);
    
    float A = 0.5; 
    printf("\n\t*********************************************Ergebnis*********************************************\n");
    printf("\n");
    printf("\n");
    printf("\n");
    printf("                                                 A = %g cm^2\n", A *g *h);
    printf("                                                 A = %g mm^2\n", A *g *h *100);



    return 0;
}
   