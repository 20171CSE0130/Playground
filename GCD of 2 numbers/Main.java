#include <iostream>
using namespace std;
int GCD(int n, int m);
int main() 
{
   int n,m;
  cin>>n>>m;
 
    cout << GCD(n,m);
    return 0;
}
int GCD(int n,int m)
{
  if(m!=0)
  {
    return GCD(m,n%m);
  }
  else
    return n;
}