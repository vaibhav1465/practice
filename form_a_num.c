#include<stdio.h>
int main()
{
	printf("%d",evenDigits(571319));
}
int evenDigits(int n)
{
  static int s;
 if(n<10)
 {
   if(n%2==0)
     s=s*10+n;
   s=rev(s);
   return s;
 }
  else
  {
    int n1=n%10;
    if(n1%2==0)
    {
      s=s*10+n1;
    }
    evenDigits(n/10);
  }
  
}
int rev(int n)
{
	static int r;
	if(n<10)
	{
		return (r*10+n);
	}
	else
	{
		r=r*10+n%10;
		rev(n/10);
	}
	
}

