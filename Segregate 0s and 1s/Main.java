#include<iostream>
using namespace std;
 
void segregate(int n, int a[])
{
  int count=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]==0)
    {
      count++;
    }
  }
  for (int i=0;i<count;i++)
  {
    a[i]=0;
  }
  for(int i=count;i<n;i++)
  {
    a[i]=1;
  }
  
}
void display(int n,int a[])
{
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<" ";
  }
 
}

int main()
{
  int n;
  int a[100];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  segregate(n,a);
  display(n,a);
  return 0;
}