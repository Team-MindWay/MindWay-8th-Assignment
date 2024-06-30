#include <stdio.h>
#include <string.h>

//mindway homework

void organize(char str[][51], int compare);

int main(void) {
    int n;
    scanf("%d", &n); //입력횟수를 받는 코드
    char book_name[1000][51];
    int counting[1000] = { 0 }; 

    for (int i = 0; i < n; i++) {
        scanf("%s", book_name[i]); 
    }

    organize(book_name, n);

    for (int i = 0; i < n; i++) {
        for (int j = i; j <= n; j++) {
            if (strcmp(book_name[i], book_name[j]) == 0) { 
                counting[i]++;
            }
        }
    }

    int max = 0;
    for (int i = 1; i < n; i++) {
        if (counting[i] > counting[max]) {
            max = i;
        }
    }

    printf("%s\n", book_name[max]);
    return 0;
}

void organize(char str[][51], int compare) {
    char temp[51];
    for (int i = 0; i < compare; i++) {
        for (int j = i+1; j < compare; j++) {
            if (strcmp(str[i], str[j]) > 0) {
                strcpy(temp, str[i]);
                strcpy(str[i], str[j]);
                strcpy(str[j], temp);
            }
        }
    }
}