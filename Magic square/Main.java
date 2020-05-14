#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  int s1=0,s2=0;
  for(i=0;i<n;i++)
    s1=s1+a[i][i];
  for(i=0;i<n;i++)
    s2=s2+a[i][n-1-i];
  if(s1==s2)
    cout<<"Yes";
  else cout<<"No";
}