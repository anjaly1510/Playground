#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s1;
  cin.getline(s1.name,50);
  cin>>s1.roll;
  cin>>s1.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s1.name<<"\n";
  cout<<"Roll: "<<s1.roll<<"\n"<<"Marks: "<<s1.marks;
}