#include<iostream>
using namespace std;
int main()
{int n;
 cin>>n;
 int c=1;
 int k=0,j;
 
     for (int i=1; i<=n; i++) 
    { 
        if (i%2 != 0) 
        { 
            for (j=k+1; j<k+i; j++) 
                cout << j << "*"; 
            cout << j++ << "\n"; 
            k = j;     
        } 
        else
        {
            k = k+i-1; 
            for (j=k; j>k-i+1; j--) 
                cout << j << "*"; 
            cout << j <<"\n";     
        } 
    } 
    
  }
 
