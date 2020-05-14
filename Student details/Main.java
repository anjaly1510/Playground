#include<iostream>
#include<cstring>
using namespace std;
struct Student 
{ char name[30]; 
 char department[20]; 
 int yearOfStudy;
 float cgpa; 
}s1[10],t;
int main()
{
  int n,i,j;
  cout<<"Enter the number of students";
  cin>>n;
 for(i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    cin>>s1[i].name;
    cout<<"\nEnter department";
    cin>>s1[i].department;
    cout<<"\nEnter year of study";
    cin>>s1[i].yearOfStudy;
    cout<<"\nEnter cgpa";
    cin>>s1[i].cgpa;
  }
  for(i=0;i<n;i++)
    for(j=i+1;j<n;j++)
    { if(strcmp(s1[i].name,s1[j].name)>0)
       { t=s1[i];
      s1[i]=s1[j];
      s1[j]=t;
       }
   }    
  cout<<"\nDetails of students";
  for(int i=0;i<n;i++)
   {
    cout<<"\nStudent "<<i+1;
    cout<<"\nName:"<<s1[i].name;
    cout<<"\nDepartment:"<<s1[i].department;
    cout<<"\nYear of study:"<<s1[i].yearOfStudy;
    cout<<"\nCGPA:"<<s1[i].cgpa;
  }
}