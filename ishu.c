#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *concat(char *s1, char *s2) {
    char *result;
    result = malloc(strlen(s1) + strlen(s2) + 1);
    if (result == NULL)
        return NULL;
    strcpy(result, s1);
    strcat(result, s2);
    return result;
}

int main() {
    char *p;
    p = concat("abc", "def");
    if (p != NULL) {
        printf("%s", p);
        free(p);
    } else {
        printf("Memory allocation for concat failed.\n");
    }

    struct point {
        int x;
        int y;
    };

    struct point *arr;
    arr = calloc(5, sizeof(struct point));
    if (arr == NULL) {
        printf("Memory allocation for arr failed.\n");
        return 1;
    }

    printf("\n");
    for (int i = 0; i < 5; i++) {
        printf("%d\n", arr[i].x);
    }

    // Reallocate memory to hold 10 'struct point' elements instead of 5.
    struct point *arr1;
    arr1 = realloc(arr, 10 * sizeof(struct point));
    if (arr1 == NULL) {
        printf("Memory reallocation failed.\n");
        free(arr);  // Free the original array in case of realloc failure
        return 1;
    }

    printf("\n");
    for (int i = 0; i < 10; i++) {
        printf("%d\n", arr1[i].x);
    }

    // Free the reallocated memory
    free(arr1);

    return 0;
}
