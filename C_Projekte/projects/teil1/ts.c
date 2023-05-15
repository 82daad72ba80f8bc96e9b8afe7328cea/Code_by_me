#include <stdio.h>



int main()
{   
    char answer;
    int dump;
    
       
    do{
        printf("\t\t------------------Dein Taschenrechner-----------------\n");
        float no1, no2, sum;
        char operand;

        printf("Gib eine Zahl ein:\n");
        scanf("%f", &no1);

        printf("Gib einen Operanden ein[+,-,*,/]: \n");
        scanf("%s", &operand);

        printf("Gib noch eine Zahl ein:\n");
        scanf("%f", &no2);

        switch(operand)
        {

        case '+': 
            sum = no1+no2;
        break;

        case '-':
           sum = no1-no2;
        break;


        case '*': 
            sum = no1 * no2;
        break;

        case '/': 
            sum = no1 / no2;
        break;

        default: printf("Try another operand!\n",sum);
       }

        printf("Dein ergebnis ist : %g\n",sum);

        printf("\nWillst du eine neue Rechnung  durchfuehren?Type (y/n)\n", answer);
        scanf("%d", &dump);
        scanf("%c", &answer);
       
       

     } while (answer == 'y');
     
    

return 0;
    
}