#include<iostream>
using namespace std;
struct emp
{
char name[25];
int id;
int age;
char desig[25];
int sal;
}e;
int main()
{
  cout<<"Enter name:";
 cin>>e.name;
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.desig;
  cout<<"\nEnter Salary:";
  cin>>e.sal;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.desig;
  cout<<"\nSalary of the Employee : "<<e.sal;
  
  
}