#include<iostream>
using namespace std;
int expo(int b,int c)
{
  if(c==1)
    return b;
  else 
  { int y=b*expo(b,c-1);
   return y;
}
}
int main()
{
 int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<expo(a,n);
  
}