#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(void) {
  char ordnername[100];

  printf("Möchten Sie einen neuen Ordner anlegen? (j/n) ");
  char antwort = getchar();

  if (antwort == 'j') {
    printf("Bitte geben Sie den Namen des Ordners ein: ");
    scanf("%s", ordnername);

    int erfolg = mkdir(ordnername);

    if (erfolg == 0) {
      printf("Der Ordner wurde erfolgreich erstellt.\n");
    } else {
      printf("Beim Erstellen des Ordners ist ein Fehler aufgetreten.\n");
    }
  } else {
    printf("Ok, kein neuer Ordner wird angelegt.\n");
  }

  return 0;
}
