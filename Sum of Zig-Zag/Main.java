#include<iostream>
using namespace std;
int main()
{
   int r,c,i,j,rsum=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  
  for(i=0;i<=0;i++)
    for(j=0;j<c-1;j++)
       rsum+=a[i][j];
 // cout<<rsum;
  int csum=0;
  for(j=c-1;j==c-1;j--)
    for(i=1;i<r;i++)
      csum+=a[j][i];
    // cout<<csum; 
  int diag=0;
   for(i=0;i<r;i++)
     for(j=0;j<c;j++)
       if(i+j==r-1)
         diag+=a[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<diag+csum+rsum;
}