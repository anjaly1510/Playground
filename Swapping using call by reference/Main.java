#include<iostream>
using namespace std;
void swap(int &x,int &y)
{
int t=x;
x=y;
y=t;
}
int main()
{
int a,b;
cin>>a>>b;
cout<<"Before swapping a= "<<a<<" and b="<<b;
swap(a,b);
cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}