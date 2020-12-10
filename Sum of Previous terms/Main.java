#include <iostream>

using namespace std;

int main() 
{
  int n;
  cin >> n;
  if(n>=30)
  {
    cout << "Invalid Input";
    return 0;
  }
  else
  {
  if(n<=2)
  {
      cout<<n;
    }
	else
    {
      int a=1;
      int b=2;
      int c=0;
      for(int i=3;i<=n;i++)
      {
        c=a+b;
        a=b;
        b=c;
      }
      cout<<c;
    }
  }
    return 0;
}

