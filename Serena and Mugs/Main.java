#include<iostream>
using namespace std;
int printresult(int* ar,int n,int s)
{
  int sum=0;
  for(int i=0;i<n;i++)
    sum+=ar[i];
  if(sum<=s)
    return 1;
  else return 0;
  
}
using namespace std;
int main()
{
int n,s,i;
  cin>>n>>s;
  int a[10];
  for(i=0;i<n;i++)
   cin>>a[i];
  
 int p=printresult(a,n,s);
 if(p==1)
   cout<<"YES";
  else 
    cout<<"NO";
}