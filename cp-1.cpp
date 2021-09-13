#include<stdio.h>
int main()
{
	const int *p;
	int a=10;
	p=&a;
	printf("%d",*p);
}
