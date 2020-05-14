#include<iostream>
using namespace std;
int main()
{
 string line;
  getline(cin,line);
  int j=0;
  while(line[j+1]!='\0')
    j++;
 // cout<<j;
  int v=0,c=0,d=0,s=0,sym=0;
  for (int i = 0; i<j+1; ++i) 
  {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U') 
            ++v;
        else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) 
            ++c;
         else if (line[i] >= '0' && line[i] <= '9') 
            ++d;
        else if (line[i] == ' ') 
            ++s;
          else if (line[i]>='!'||line[i]<='/')
            ++sym;
    }
  cout<<"Vowels:"<<v;
  cout<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<s;
  cout<<"\nDigits:"<<d;
  cout<<"\nSymbols:"<<sym;
  
}