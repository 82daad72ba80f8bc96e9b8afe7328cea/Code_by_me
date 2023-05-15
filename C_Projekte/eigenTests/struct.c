#include <stdio.h>

struct mensch
{
   int alter; 
   char geschlecht;
   const char name[50];
};



int main (){

struct mensch mehmet = {20,'M',"memo"};



printf("%s, %d", mehmet.geschlecht,mehmet.alter);
return 0;

}