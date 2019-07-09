#include<stdio.h>
int main()
{ float r,a;
scanf("%f%f",&r,&a);
 float arc;
 arc=2*3.14*r*(a/360);
printf("%.2f",arc);
  return 0;
}