#include<stdio.h>
int main()
{
	int arr[10],i,n,p;
	printf("size?");
	scanf("%d",&n);
	printf("elements");
	for(i=0;i<n;i++)
	scanf("%d",&arr[i]);
	
	printf("pos");
	scanf("%d",&p);
	if(p>=n)
	printf("poss cant be deleated");
	else
{
	for(i=p;i<n;i++)
	arr[i]=arr[i+1];
	
	printf("new elments\n");
	for(i=0;i<n-1;i++)
	printf("%d\n",arr[i]);
}
	return 0;
}
