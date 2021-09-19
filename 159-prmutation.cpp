#include<stdio.h>
#include<string.h>
int main()
{
	int l,i,j;
	char s[100];
	scanf("%s",s);
	l=strlen(s);
	for(i=0;i<l;i++)
	{
			printf("%c",s[i]);
		for(j=i+1;j<l;j++)
		{
	  printf("%c",s[j]);
        }
        printf("\n");
	}
}
