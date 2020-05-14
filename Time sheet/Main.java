#include<iostream>
using namespace std;
int main()
{
  int a1,a2,a3,a4,a5,a6,a7;
  int r1,r3,r2,r4,r5,r6,r7,r8=0,b,br,ex;
cin>>a1>>a2>>a3>>a4>>a5>>a6>>a7;
  r1=a1*150;
  r7=a7*125;
   if(a2<=8)
      r2=a2*100;
  else if(a2>8)
  {
    b=a2-8;
    br=b*115;
    r2=br+800;
    }
  if(a3<=8)
      r3=a3*100;
  else if(a3>8)
  {
    b=a3-8;
    br=b*115;
    r3=br+800;
   }
  if(a4<=8)
      r4=a4*100;
  else if(a4>8)
  {
    b=a4-8;
    br=b*115;
    r4=br+800;
     }
  if(a5<=8)
      r5=a5*100;
  else if(a5>8)
  {
    b=a5-8;
    br=b*115;
    r5=br+800;
     }
  if(a6<=8)
      r6=a6*100;
  else if(a6>8)
  {
    b=a6-8;
    br=b*115;
    r6=br+800;
     }
    
 int t=a2+a3+a4+a5+a6;
  if(t>=40)
  {
    ex=t-40;
    r8=ex*25;
  }
  int tr=r1+r2+r3+r4+r5+r6+r7+r8;
  cout<<tr;
}