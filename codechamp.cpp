#include<stdio.h>
int main()
{
	long long int n,fact=1,t,f=0;
	scanf("%lld",&n);
	t=n;
	int s=10;
	while(n)
	fact*=n--;
	printf("%lld\n",fact);
	printf("%d\n",t);
	int m=t/2,i,j;
for(i=m;i<(n+m);i++)
	{
		for(j=2;j<i;j++)
		{
			if(j*j==i)
			{
			f=1;
		    break;
		    }
		}
		if(f==1)
		break;
	
	}
	printf("%d",i);
}

