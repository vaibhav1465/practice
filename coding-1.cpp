#include<stdio.h>
int main()
{
	int n,a,b,h1,c=0,d=0;
	scanf("%d\n%d\n%d",&n,&a,&b);
	int t=n;
	if(a<b)
	{
		h1=a;
		a=b;
		b=h1;
	}
	while(1)
	{
		if(n>=a)
		{
		  c+=n/a;
		  n=n%a;
	   }
		else
		{
			if(n>=b)
			{
				d+=n/b;
				n=n%b;
			}
			else
			break;
		}
	}
	int e=t-((a*c)+(b*d));
	printf("empty spaces =%d\n",e);
	printf("use of %d is %d\n",a,c);
	printf("use of %d is %d\n",b,d);
	
	
	
	
}
