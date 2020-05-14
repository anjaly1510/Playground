#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int i,j;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    { if(j<i)
      cout<<i<<"*";
    else 
     cout<<i;
    }
  cout<<"\n";
  }
 for(i=n;i>=1;--i)
  {
    for(j=1;j<=i;j++)
    { if(j<i)
      cout<<i<<"*";
    else 
     cout<<i;
    }
  cout<<"\n";
  }
}