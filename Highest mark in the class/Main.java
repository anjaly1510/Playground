#include<iostream>
using namespace std;
int main()
{
  int ar[100];
  int high=0;
  int n;
  cin>>n;
  for(int i=0;i<n;i++)
    cin>>ar[i];
  for(int i=0;i<n;i++)
    if(ar[i]>=high)
      high=ar[i];
  cout<<high;
}