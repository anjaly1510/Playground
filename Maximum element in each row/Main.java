#include<iostream>
using namespace std;
int main()
{
 int r,c,max=0,i,j;
  cin>>r>>c;
  int ar[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>ar[i][j];
  
  for(i=0;i<r;i++)
  { max=ar[i][0];
    for(j=0;j<c;j++)
    {if(max<ar[i][j])
       max=ar[i][j];
    }
   cout<<max<<"\n";
  }
  
}