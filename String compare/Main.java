#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[50];
  char s1[50];
  cin>>s>>s1;
  int i=strcmp(s,s1);
    if(i==0)
    {
      cout<<"Strings are same";
    }
  else
  {
    cout<<"Strings are not same";
  }
}