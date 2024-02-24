#include<stdio.h>

int main(){

int num = 0, N;

printf("Enter a non-negative integer N=: ");
scanf("%d", &N);

for(int i = 0; i<N; i++)
{
	printf("%d ",num);
	num+=2;
}

for(int j = N; j<N*2;j++)
{
	printf("%d ",j);
}
printf("\n");
return 0;
}
