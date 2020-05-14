#include <iostream>
using namespace std;

int main()
{
  int n, i;
  int c=0;
  cin >> n;
   if(n==1)
   { cout<<"Not eligible";
  goto x;}

  for(i = 2; i <= n / 2; ++i)
  {
      if(n % i == 0)
      {
          c=1;
          break;
      }
  }

  if (c==1)
      cout << "Not eligible";
  else
      cout << "Eligible";
x:
  return 0;
}