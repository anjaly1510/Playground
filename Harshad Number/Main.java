#include<iostream>
using namespace std;
int main()
{
int n,s=0,r;
  cin>>n;
  int t=n;
  while(n!=0)
  {
    r=n%10;
    s=s+r;
    n=n/10;
  }
  if(t%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}