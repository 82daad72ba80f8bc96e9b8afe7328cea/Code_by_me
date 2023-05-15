#include<stdio.h>
 

int main()
{
    int x; 

    printf("Gib eine Zahl ein:", x);
    scanf("%d",&x);
    
    printf("Deine Zahl ist: %d \n", x);
 
    int mod = x % 7; // 7/2= 6 rest 1
   
if (mod == 0)
{
    printf("%d", x/2);
}
else 
{
    printf("4711");
}



return 0;
}



