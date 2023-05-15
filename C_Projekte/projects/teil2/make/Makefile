program: main.o charfunction.o
	gcc -o Aufgabe_2 main.o charfunction.o

main.o: main.c charfunction.h  
	gcc -c main.c 

charfunction.o: charfunction.c charfunction.h
	gcc -c charfunction.c

clean:
		rm -rf *.o