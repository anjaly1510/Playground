#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  getline(cin,s1);
  getline(cin,s2);
 // string s3=strrev(s1)
   int j = 0, i = 0;
 while(s1[j+1]!='\0')
   j++;
 while(i < j) 
{
  char temp = s1[i];
  s1[i] = s1[j];
  s1[j] = temp;
  i++;
  j--;
 }
if(s1==s2)
  cout<<"It is correct";
  else
    cout<<"It is wrong";}