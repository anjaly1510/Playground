#include<iostream>
using namespace std;
int main()
{
  int n;
 cin>>n;
  int a=0,b=1,c,i;
   if(n==1)
      cout<<0;
    else if(n==2)
      cout<<1;
  else{
    for(i=2;i<n;i++)
    {
      c=a+b;
      a=b;
      b=c;
    }
    cout<<c;
  }
}