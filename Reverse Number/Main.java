#include <iostream>
using namespace std;
int main() 
{
	int r,s=0,n;
  cin>>n;
  while(n!=0)
  {
    r=n%10;
    s=s*10+r;
    n/=10;
  }
  cout<<s;
}