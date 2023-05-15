#include <stdio.h>

void vergleich(int *n1, int *n2){
    if(n1 < n2){
    printf("%d ist kleiner als %d",n1,n2);
    }else if (n1 > n2){
        printf("%d ist kleiner als %d",n2,n1);
    }else{
        printf("%d und %d sind gleich groß",n1,n2);
    }

    
}

int main (){
int a,b;char choice;
do{
    printf("Gib eine Zahl ein:\n");
    scanf("%i",&a);
    printf("Gib deine Zweite zahl ein\n");
    scanf("%i",&b);
    vergleich(a,b); 
    printf("\nWillst du nochmal 2 Zahlen vergleichen?(j/n)\n");
    scanf("%s",&choice);
    }while(choice == 'j');
        if(choice == 'n'){
            printf("Bis bald !");
            return 0;
        }
       
    }
