#include<iostream>
using namespace std;
int gcd(int n1,int n2)
{
  if(n2==0)
  return n1;
 else 
   return gcd(n2,n1%n2);
   
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}