#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int i,k=0,j=0,c,*number;
  cin>>c;
 number =(int *) malloc(sizeof(int)*c);

  for(i=0;i<c;i++)
  { cin>>*(number+i);
    if (*(number+i)% 2 ==0){
      j++;}
   else{
        k++;}
  
  }
   cout<<k<<"\n"<<j;
}