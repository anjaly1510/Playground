#include<iostream>
using namespace std;
int main()
{int ar[50],size,n,j=0;
 cin>>size;
 int i;
 for( i=0;i<size;i++)
   cin>>ar[i];
 cin>>n;
 for( i=0;i<size;i++)
 {
   if(ar[i]==n)
   {   cout<<"She passed her exam";
    break;
   }
 }
 if(i==size)
   cout<<"She failed";
 
}