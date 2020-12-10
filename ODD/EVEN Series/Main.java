#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
  int n;
  cin >> n;
  if(n%2==1)
    {
      int a=0;
      int d=2;
      int terms=(n+1)/2;
      int gs=a+(terms-1)*d;
      cout<<gs;
    }
	else
    {
      	int a=0;
      int d=1;
      int terms=(n/2);
      int gs=a+(terms-1)*d;
      cout<<gs;
    }
    return 0;
}

