#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
 
  for(int i=1;i<=x;i++)
  {if(i%2==0)
    cout<<i*i-2<<" ";
   else 
     cout<<i*i-1<<" ";
    
  }
  
}