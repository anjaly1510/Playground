#include<iostream>
using namespace std;
int small(int a1,int a2,int a3)
{ if(a1<a2&&a1<a3)
    return a1;
    else if(a2<a3)
          return a2;
          else 
          return a3;
}
int gcd(int a,int b ,int c)
{
int s=small(a,b,c);
for(int i=s;s>0;i--)
{
if(a%i==0&&b%i==0&&c%i==0)
 { return i;
 break;}
}
}
int main()
{
int a,b,c;
int ans;
cin>>a>>b>>c>>ans;
if(gcd(a,b,c)==ans)
cout<<"Answer is correct.";
else
cout<<"Answer is wrong.";

}