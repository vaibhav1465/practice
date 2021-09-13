#include<stdio.h>
#include<math.h>
int main()
{
	int num,num1,count=0,rev=0,i,n,n1,rev2,org_num;long int sqr;
	
	scanf("%d",&num);
	org_num=num;
	num1=num;
	while(num!=0)
	{
		n=num%10;
		num=num/10;
		count++;
}
	sqr=pow(num1,2);

	for(i=1;i<=count;i++)
	{
		n1=sqr%10;
		rev=rev*10+n1;
		sqr=sqr/10;
	}


	while(rev!=0)
	{   
	n1=rev%10;
	rev2=rev2*10+n1;
	rev=rev/10;
} 
if(org_num==rev2)
printf("automorfic numbr");
else
printf("not automorfic");
return 0;
}
