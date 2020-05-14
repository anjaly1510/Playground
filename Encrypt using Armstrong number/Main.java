#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int nr, digits=0, i, rem, s=0, m=1;
           nr=n;
           while(nr>0){
           nr = nr / 10;
           digits +=1;
           }
           nr=n;
           while(nr!=0){
           rem = nr % 10;
           nr = nr / 10;
             m=power(rem,digits);
             s+=m;
           }
  return s;
  
}
int main()
{
    int n,t;
  
    std::cin>>n;
  t=n;
    if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}