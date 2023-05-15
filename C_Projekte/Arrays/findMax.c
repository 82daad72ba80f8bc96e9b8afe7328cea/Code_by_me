#include <stdio.h>

int main ()
{

int array[] = {9,7,4,87,44,66,24,67,12,34,77,99,45};
int size = sizeof(array)/sizeof(array[0]);
int max = array[0];

for(int i=0;i<size;i++){

    printf("array[%d]= %d\n",i,array[i]);

    if(array[i] > max)          // array[i] > max = biggest int, array[i] < max = smallest int
    {
        max = array[i];
        printf("max array[%d] = %d \n",i,array[i]);
    }

}
return 0;
}