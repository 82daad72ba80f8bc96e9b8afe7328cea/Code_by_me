#include <stdio.h>
#include <stdlib.h>

int main(void) {
  // Pfad zu Google Chrome auf dem System
  char *path = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
  
  // Aufruf von Google Chrome
  execl(path,"chrome", "https://web.whatsapp.com",(char *)0);
  execl(path,"chrome", "https://chat.openai.com/chat",(char *)0);

  // Fehlermeldung, falls der Aufruf fehlschlägt
  perror("Fehler beim Öffnen von Google Chrome");

  return 1;
}
