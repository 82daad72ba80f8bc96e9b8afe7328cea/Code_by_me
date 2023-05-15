#include<stdio.h>


int i;
int n;
int num, sum = 0;
float ds;

int main ()
{

    printf("Wie viele Elemente? : ");
    scanf("%d", &n);                    //eingegebene zahl

    for (i = 0;i < n; i++)             //i startet bei 0 ; i ist kleiner als n; addiert bis eingegebene zahl n;
    {
        printf("%d. Gib deine Zahl ein : ", i + 1);//addiert die anzahl von zahlen %d;
        scanf(" %d", &num);               //eingabe von nummer, als [i] in der Schleife
        sum += num;                  //sum speichert daten von num[i]; sum startet bei 0;
    }
    ds = sum /(float)n;                       // sum geteilt durch anzahl von n
    printf("Mittelwert = %g", ds);


return 0; 




}

















/* int sum = i + zahlen/ anzahl ; 
    printf("Durschnitt ist: %d", sum);*/