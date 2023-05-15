#include <stdio.h>
#include <math.h>  //für pow
#include <string.h>  //für strlen

int binary2int( char *binary) {
  long long result;  // Ergebnisvariable

  // - 1 fängt von rechts an letztes array als startwert
  for (int i = strlen(binary) - 1, j = 0; i >= 0; i--, j++) {
    if (binary[i] == '1') {
      result += pow(2, j);  // Fügt die entsprechende Dezimalexponentiation hinzu
    }
  }

  return result; 
}
  
  void main() {
  char input[30];  // Array für die Benutzereingabe
  char wahl; 
 do{
  printf("Gib eine Binärzahl ein: ");
  scanf("%s", &input); 

  printf("Deine eingabe lautet : %s \nDies entspricht im  Dezimalsystem der Zahl: %lld \n",input, binary2int(input));  // Wandelt die Binärzahl in eine ganzahl
  printf("Willst du nochmal ? (j/n)");
  scanf(" %c",&wahl);
 }while(wahl == 'j');
 if(wahl != 'j'){
  printf("\nbye bye\n");
 }

return 0;
}


