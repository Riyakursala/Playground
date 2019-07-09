#include<stdio.h>
#include<math.h>
int main()
{
  float b,h,hp;
  scanf("%f%f",&b,&h);
  b=pow(b,2);
  h=pow(h,2);
  hp=sqrt(b+h);
  printf("%.2f",hp);
  //Type your code here
  return 0;
}