#include<iostream>
using namespace std;
int dig(int n)
{ int sum=0;
 while(n>0)
 {
   sum=sum+n%10;
   n/=10;
 }
 if(sum>9)
   sum=dig(sum);
 else 
   return sum;
 }

int main()
{int n;
 cin>>n;
 cout<<dig(n);
}