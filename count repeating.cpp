#include<stdio.h>
int main()
{
	int a[100],i,n,a1,j,b[100],k,c[100],t;
	scanf("%d",&n);
	
	
		for(i=0;i<n;i++)
   {
   	scanf("%d",&a[i]);
   	b[i]=0;
   }
   
   
   for(i=1;i<n;i++)
   {
   	for(j=0;j<n-1;j++)
   	{
   		if(a[j]>a[j+1])
   		{
   			t=a[j];
   			a[j]=a[j+1];
   			a[j+1]=t;
		   }
	   }
   }
for(i=0;i<n;i++)
{
	for(j=i;j<n;j++)
	{
		if(a[i]==a[j])
	{
		b[k]++;
		c[k]=a[i];
    }  
	else  
	break;
   }

if(b[k]>0)
k++;
i=j-1;

}
//if(k>0)
//{
	printf("yes");
	for(i=0;i<k;i++)
	{
//	b[i]++;
	printf("\n%d-%d",c[i],b[i]);
    }
//}
//	else
//	printf("no");
}


