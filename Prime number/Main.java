#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
   int n;
     int flag=0;
  float sq;
  cin>>n;
  for (int i=2;i<n;i++)
  {
    if(n%i==0)
      flag=flag+1;
  }
  if(flag==0)
  {
    sq=sqrt((float)n);
   printf("%0.2f",sq);
  }
  else
    cout<<"0.00";
    return 0;
}