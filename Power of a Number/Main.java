#include <stdio.h>
#include<math.h>
int main()
{long int b,e,p;
 scanf("%ld%ld",&b,&e);
 if(e<0)
   printf("Wrong input");
 else
 { 
   p=pow(b,e);
   printf("%ld",p);
 }
  	//Your code here       
    return 0;
}