#include<iostream>
using namespace std;
int main()
{
  int n,i;
  cin>>n;
  int a[n],esum=0,osum=0;
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      esum=esum+a[i];
    else
    osum=osum+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<esum;
  cout<<"\nThe sum of the odd numbers in the array is "<<osum;
}