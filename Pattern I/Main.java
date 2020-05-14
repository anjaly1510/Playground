 #include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int t=n;
  for(int i=0;i<4;i++)
  {
    for(int j=0;j<=i;j++)
      cout<<t;
    t++;
     cout<<"\n";
  }
  t--;
  for(int i=4;i>0;i--)
  {
    for(int j=i;j>0;j--)
      cout<<t;
    t--;
     cout<<"\n";
  }
}