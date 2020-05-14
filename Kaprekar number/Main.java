#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int k,n=0,sn,c=0,temp,rev=0,r;
  cin>>k;
  sn=k*k;
  temp=sn;
  int t=sn;
  while(temp)
  {
    c++;
    temp/=10;
  }
  int x;
  if(c%2==0)
   x=(c/2);
  else
    x=(c/2)+1;
 int B=sn/(pow(10,x));
  while(t!=0&&(x--))
  { r=t%10;
  rev=(rev*10)+r;
  t/=10;}
  r=0;
  int A=0;
  while(rev!=0)
  {
    r=rev%10;
    A=(A*10)+r;
    rev=rev/10;
  }
  if((A+B)==k)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
    
  
  
}