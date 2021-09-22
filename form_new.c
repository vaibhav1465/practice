#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	printf("%d",evenDigits(n));
	
}
int evenDigits(int n)
{
  int s=0;
  if(n<10)
  {
    if(n%2==0)
      s=s*10+n;
    return s;
  }
  else
  {
    s=evenDigits(n/10);
    if((n%10)%2==0)
      s=s*10+n%10;
    return s;
  
}

}
