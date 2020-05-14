#include<iostream>
using namespace std;
struct Time
{  
  int h,m,s; 
}a,b,c;
int main()
{
 cin>>a.h>>a.m>>a.s;
 cin>>b.h>>b.m>>b.s;
 if(b.s>a.s)
 {
   --a.m;
   a.s+=60;
 }
  c.s=a.s-b.s;
  if(b.m>a.m)
  {
    --a.h;
    a.m+=60;
  }
  c.m=a.m-b.m;
  c.h=a.h-b.h;
  cout<<c.h<<":"<<c.m<<":"<<c.s;
}