#include <stdio.h>

int faktor(int n){
if(n == 1){return 1;} 
else{ return (n*faktor(n-1));}
}


int main(){

printf("%d ", faktor(8));
return 0; 

}