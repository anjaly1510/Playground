#include<iostream>
using namespace std;
int main()
{
 int n,r,esum=0,osum=0;
  cin>>n;
  while(n!=0)
  {
    r=n%10;
    if(r%2==0)
      esum=esum+r;
    else
      osum=osum+r;
     n=n/10; 
  }
  if(esum==osum)
    cout<<"Yes";
  else
    cout<<"No";
}
