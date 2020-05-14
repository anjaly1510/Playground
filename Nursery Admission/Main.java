#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  str.shrink_to_fit();
  cout<<"The number of letters in the name is "<<str.capacity();
}
