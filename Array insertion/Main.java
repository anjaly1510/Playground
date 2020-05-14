#include<iostream>
using namespace std;
int main()
{
  int n,pos,val,i;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int s[n+1];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>s[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos>n)
    cout<<"Invalid Input";
  else
  {
  cout<<"Enter the value to insert\n";
  cin>>val;
  for (i=n;i>=pos;i--) 
        s[i]=s[i-1];
  s[pos-1]=val;
  cout<<"Array after insertion is\n";
  for(i=0;i<n+1;i++)
    cout<<s[i]<<"\n";
      }
}