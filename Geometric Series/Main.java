#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
  int n;
  cin >> n;
  if(n%2==0)
  {
    int a=1;
    int r=3;
    
    int gs= a * pow(r,(n-1)/2);
    cout<< gs;
  }
  else
   {
    int a=1;
    int r=2;
    int gs= a * pow(r,(n-1)/2);
    cout<< gs;
  }
    return 0;
}

