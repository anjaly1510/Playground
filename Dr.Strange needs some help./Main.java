#include<iostream>
#include<cmath>
using namespace std;
int bac(int ,int);
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int b=bac(m,n);
  if(b>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int bac(int m,int n)
{
return pow(m,n);
}