#include<iostream>
using namespace std;
int main()
{
  int n1,n2,s;
  cin>>n1>>n2;
  for(int i=n1;i<=n2;i++)
  {
   s=0;
    for(int j=1;j<i;j++)
    { if(i%j==0)
       s+=j;}
     if(s==i)
       cout<<i<<" ";
  }  
  
}