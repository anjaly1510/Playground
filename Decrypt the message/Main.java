#include<iostream>
using namespace std;
int main()
{
  int n1,n2,sum;
  cin>>n1>>n2;
  int s=n1+n2;
  for(int i=1;i<=(s/2);i++)
  {
    if((s%i)==0)
      sum+=i;
      
  }
  if(sum==s)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  
}