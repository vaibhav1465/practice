#include <stdio.h>
int main()
{
  int a,b;
   scanf("%d %d",&a,&b);
  if(b<0)
    printf("%d",-1*a);
  else
    printf("%d",hcf(a,b));
    return 0;
}
int hcf(int a,int b)
{
  if(a==b)
    return a;
  else if(a>b)
    hcf(a-b,b);
  else
    hcf(a,b-a);
}n
