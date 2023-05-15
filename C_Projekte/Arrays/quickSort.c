#include <stdio.h>

void quick_sort(int array[], int low, int high);
int partition(int array[], int low, int high);

int main() {
    int array[] = {10, 7, 8, 9, 1, 5, 2, 4, 3, 6};
    int n = sizeof(array)/sizeof(array[0]);
    quick_sort(array, 0, n-1);
    printf("Sorted array: \n");
    for (int i=0; i < n; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
    return 0;
}

void quick_sort(int array[], int low, int high) {
    if (low < high) {
        int p_index = partition(array, low, high);
        quick_sort(array, low, p_index-1);
        quick_sort(array, p_index+1, high);
    }
}

int partition(int array[], int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for (int j=low; j<=high-1; j++) {
        if (array[j] < pivot) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    int temp = array[i+1];
    array[i+1] = array[high];
    array[high] = temp;
    return i+1;
}
