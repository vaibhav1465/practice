#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i,j;
	int **p=(int**)malloc(sizeof(int*)*3);
	*(p+0)=(int*)malloc(sizeof(int)*3);
	*(p+1)=(int*)malloc(sizeof(int)*3);
	*(p+2)=(int*)malloc(sizeof(int)*3);
	for(i=0;i<3;i++)
	for(j=0;j<3;j++)
	scanf("%d",&p[i][j]);
	for(i=0;i<3;i++)
	{
	    for(j=0;j<3;j++)
	    {
	        printf("%d",p[i][j]);
        }
        printf("\n");
   }
	
	
}
