#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  float s=0.0f;
do
{
  cin>>n;
  if(n<0)
  {s=s-1.0;
  c++;}
  else if(n%2==1)
    { s=s+1.0;
    c++;}
    else 
    s=s-0.5;
}while(c!=3&&n>0);
  cout<<s;
}