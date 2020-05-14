#include<iostream>
#include<cstring>
using namespace std;
struct College 
{ 
  char name[100]; 
  char city[100]; 
  int ey; 
  float pp; }c[50],t;
int main()
{
  int n,i,j;
  cout<<"Enter the number of colleges";
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    cout<<"\nEnter year of establishment";
    cin>>c[i].ey;
    cout<<"\nEnter pass percentage";
    cin>>c[i].pp;
  }
  for(i=0;i<n;i++)
  for(j=i+1;j<n;j++)
  {if(strcmp(c[i].name,c[j].name)>0)
   {t=c[i];
    c[i]=c[j];
    c[j]=t;}
  }
  
  cout<<"\nDetails of colleges";
  for(i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].ey;
    cout<<"\nPass percentage:"<<c[i].pp;
      
  }
}