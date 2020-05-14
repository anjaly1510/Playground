#include<iostream>
using namespace std;
int main()
{
 int n,r,s=0;
  cin>>n;
  do
  {
    n=n/10;
    s++;
  }while(n!=0);
  cout<<s;
}