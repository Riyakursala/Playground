#include<stdio.h>
int main()
{
  //Type your code here
  int r;
  scanf("%d",&r);
  float rad,ar;
  rad=(float)r/2;
  ar=3.14*rad*rad;
  printf("%.2f",ar);
  return 0;
}