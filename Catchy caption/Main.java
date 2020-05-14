#include <cstring>
#include <iostream>
using namespace std;
int main()
{
 char str[100];
  cin.getline(str,100);
  int len=strlen(str);
  //cout<<len;
  if(len<50)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}