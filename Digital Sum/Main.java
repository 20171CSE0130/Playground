#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int temp=n;
  int rem,nsum=0;
  int sum=0;
    
  while(temp!=0)
  {
    rem=temp%10;
    sum=sum+rem;
    temp=temp/10;
  }
  if(sum>9)
  {
  for(int i=1;sum!=0;i++)
  {
    rem=sum%10;
    nsum=nsum+rem;
    sum=sum/10;
  }
    cout<< nsum;
    return 0;
  }
      
    cout << sum;
    return 0;
}