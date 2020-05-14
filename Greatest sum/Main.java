#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c];
  int rsum[r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {rsum[i]=0;
   for(j=0;j<c;j++)
   {  rsum[i]+=a[i][j];
   }  
   cout<<rsum[i]<<" ";
  }
  int rmax=rsum[0],pos=0;
  for(i=0;i<r;i++)
   if(rmax<rsum[i])
    {
      rmax=rsum[i];
      pos=i;
    }
  cout<<"\nRow "<<pos+1<<" has maximum sum";

  cout<<"\nSum of columns is ";
  for(i=0;i<c;i++)
  {rsum[i]=0;
   for(j=0;j<r;j++)
   {  rsum[i]+=a[j][i];
   }  
   cout<<rsum[i]<<" ";
  }
  rmax=rsum[0];
  pos=0;
  for(i=0;i<r;i++)
   if(rmax<rsum[i])
    {
      rmax=rsum[i];
      pos=i;
    }
  cout<<"\nColumn "<<pos+1<<" has maximum sum";
  
}

  
  