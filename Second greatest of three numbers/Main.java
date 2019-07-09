#include<stdio.h>
int main()
{long int a,b,c;
 scanf("%ld%ld%ld",&a,&b,&c);
// printf("%ld %ld %ld",a,b,c);
 if((a>b &&a<c)||(a>c && a<b))
   printf("%ld",a);
 else if((b>a && b<c) || (b<a && b>c))
   printf("%ld",b);
 else
   printf("%ld",c);
  // Type your code here
}