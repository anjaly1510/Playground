#include<iostream>
using namespace std;
int main(){
  int n,i;
  cin>>n;
  int fact=1;
  for(i=1;i<=n;i++)
    fact=fact*i;
    cout<<fact;
    
}