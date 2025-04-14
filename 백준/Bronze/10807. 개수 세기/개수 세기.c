#include <stdio.h>

int main(void){
    int n; // 정수 개수
    scanf("%d\n", &n);
    int ary[100]; // 배열 선언
    
    int i; // 반복 제어 변수
    for(i = 0; i < n; i++){
        scanf("%d ", &ary[i]);
    }
    int v; // 찾으려고 하는 정수
    scanf("%d", &v);
    int count = 0;
    for(i = 0; i < n; i++){
        if (v==ary[i]){
            count ++;
        }
    }
    
    printf("%d", count);
    
    return 0;
}
