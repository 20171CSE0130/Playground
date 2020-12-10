#include <iostream>
using namespace std;

int main() 
{
   int n;
  int a;
  cin>>n;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
    {
      a=a+i;
    } 
  }
  if(a==n)
    cout << "Yes";
  else
    cout << "No";
    return 0;
}